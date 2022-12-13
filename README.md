# order-api-main



#3 Often times external systems submit orders via REST API to ABCD, example payload below is for submitting an order.
An outletId is the id of the physical location that sells ABCD products.

It’s possible that the client caller from external systems could fail to the get the response due to network issues. 
That is the calling external system receives a socket exception and the receiving ABCD system creates the order. 
This is problematic because the calling external system will retry, and subsequent calls to ABCD system create a duplicate order in ABCD systems.
You can see how this would create a problem for ABCD customers when their delivery arrives, and the delivery is for double their order, or triple (because there were 3 retries)
Assume you are writing an API that has to process 1,000,000 orders a day and you are facing this problem.
How would you write an API to prevent duplicates, (it must support the payload below)?

Write a simple java main that demonstrates you can the parse the payload below, and apply the key programming concepts needed to prevent duplicate orders.
Assume that the same outlet would not intentionally place the same order for all the same products and quantities twice in one day.
Tax, outlet, coupon, delivery fee, adjustments, user, userprofile, 


{
	"totalOrderValue": "5.00", 
	"totalDiscount": "0.0", 
	"totalOrderValuePostDiscount", "5.00", 
	"totalCouponDiscount", "5.00", 
	"totalTax", "0.25", 
	"movFee", "15.00", 
	"deliveryFee", "10.00", 
	"netInvoice", "30.25", 
	“outletId”: “001234567”,
	"item": [
        {
          "product": "12345678901234",
          "desc": " ABCD 12 pack",
          "qty": "1",
          "basePrice": "5.00",
          "itemPrice": "5.00",
          "adjustments": [
            {
              "adjustment": "",
              "amount": "0.00",
              "desc": ""
            },
	        {
          "product": "12345678901235",
          "desc": "Aha 12 pack",
          "qty": "1",
          "basePrice": "5.00",
          "itemPrice": "0.00", >>> Quantity* Base price – sum(Adjustments)
          "adjustments": [
            {
              "adjustment": "Buy one get one",
              "amount": "-5.00",
              "desc": ""
            }
          ]
}

Method 1:  Validation


Keep a payments table as below 

CREATE TABLE `payments` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `order_id` varchar(50) NOT NULL DEFAULT '',
  `status` varchar(10) NOT NULL DEFAULT '',
  `amount` decimal DEFAULT NULL,
  `transaction_id` varchar(50) DEFAULT NULL,
  `gateway_response` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



Each time get a response or callback from the payment gateway, query the DB to check if there is an existing transaction for the same user with similar order_id
SELECT * from payments where user_id = ? and order_id = ?;
Pseudocode for the payment validation:
var payment = getPayment(userId, orderId);
if (payment) {
  print 'Payment already exists!. Must be duplicate payment'
  throw Error('duplicate') or return;
}

// else

var newPayment = createPayment(userId, reqParams)
The problem with this method is that, when we are swamped with concurrent requests with the same payload in a matter of seconds, we still can not avoid duplication. Because it takes time to query and get the response from DB and during that period, we could have created multiple payment records already.


It is a very interesting mechanism that certainly could be applied in many cases not just dealing with concurrent requests. Implementation is quite similar to the above method, however, instead of DB, we could choose to implement this in in-memory data stores such as Redis.
Pseudocode for the payment validation:
// make a unique reference key for each payment transaction
var paymentKey = 'PAYMENT' + user_id + order_id
var payment = getPayment(paymentKey) // assume that this method calls redis or any other in-memory store to get the key
if (payment) {
  print 'Payment already exists!. Must be duplicate payment'
  throw Error('duplicate') or return;
}

setPayment(paymentKey) // assume that this methods sets the new payment reference in in-memory
var newPayment = createPayment(userId, reqParams)
From the above pseudocode, when we get the first request, we set the reference in in-memory and create the payment record. And for the subsequent payment records for the same transaction we ignore them.
Unfortunately, even with this method, a query to in-memory was slow enough to record multiple payment records and still could not avoid duplicates
Here are a few interesting articles regarding locking mechanisms to explore.
Method 3: Queuing
I did not try this approach since I did not have any queues implemented in the application. However, this could be a more reliable method and gives more flexibility for the application to deal with concurrent requests.
The idea here is to queue all the incoming requests into a queue and deal with them slowly using a consumer and validate each incoming request to make sure we capture only one request.

Method 4: Database table with composite UNIQUE constrain
In this method, we design the payments table with a composite unique key that ensures us to have a unique record for each payment. The table design as follows
CREATE TABLE `payments` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `order_id` varchar(50) NOT NULL DEFAULT '',
  `status` varchar(10) NOT NULL DEFAULT '',
  `amount` decimal DEFAULT NULL,
  `transaction_id` varchar(50) DEFAULT NULL,
  `gateway_response` json DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_payment_transaction` (`user_id`,`order_id`,`status`),
  KEY `user_id` (`user_id`),
  KEY `order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
Note: The DB structure I'm using here is MySQL, the structure may differ from other RDBS systems
From the above table schema, I made a composite key out of (user_id, order_id, status)
If we get the same payment request for the same order for a user, In MySQL we would only have one row recorded, and for the subsequent insertion, MySQL throws a Duplicate entry error. In the application, we can either throw the error or explicitly capture the error from the DB engine and show a meaningful error message to the user.
I chose to go with this approach since its more efficient than the method 1 and 2 and it guarantees that there will not be duplicates and does not require to implement extra validation nor requires to use any in-memory datastores.
Those who are resorting to NoSQL systems might need to look to the first three methods. Method 1 and 2 are not so efficient and queuing methods be the best option if your infrastructure supports. I personally do not prefer to go with NoSQL databases as my primary data stores :-) but they are preferable choices as secondary storage.



 
