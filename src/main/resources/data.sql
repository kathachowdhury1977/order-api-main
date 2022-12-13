INSERT INTO tb_client (name, email) VALUES ('ABC Augusto', 'abc@gmail.com');
INSERT INTO tb_client (name, email) VALUES ('DEF Augusto', 'def@gmail.com');
INSERT INTO tb_client (name, email) VALUES ('IJK Augusto', 'ijk@gmail.com');
INSERT INTO tb_client (name, email) VALUES ('LMN Augusto', 'lmn@gmail.com');
INSERT INTO tb_client (name, email) VALUES ('OPQ Xavier', 'opq@gmail.com');
INSERT INTO tb_client (name, email) VALUES ('KLM Xavier', 'klm@gmail.com');
INSERT INTO tb_client (name, email) VALUES ('XYZ Xavier', 'xyz@gmail.com');
INSERT INTO tb_client (name, email) VALUES ('ABCED Xavier', 'abced@gmail.com');

INSERT INTO tb_order (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_order (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_order (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_order (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_order (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);

INSERT INTO tb_product (name, price) VALUES ('TV 4k 50"', 2999.0);
INSERT INTO tb_product (name, price) VALUES ('PC Gamer RGB', 7800.0);
INSERT INTO tb_product (name, price) VALUES ('Notebook i9 500gb SSD', 9999.0);
INSERT INTO tb_product (name, price) VALUES ('Gaming Chair RaceX', 999.0);
INSERT INTO tb_product (name, price) VALUES ('Mechanical Keyboard Anne Pro 2', 499.9);
INSERT INTO tb_product (name, price) VALUES ('Pizza', 29.9);

INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_order_item (quantity, price, product_id, order_id) VALUES (42, 29.9, 6, 5);


INSERT INTO tb_payment (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_payment (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_payment (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_payment (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_payment (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_payment_item (quantity, price, product_id, payment_id) VALUES (42, 29.9, 6, 5);


INSERT INTO tb_discount (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_discount (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_discount (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_discount (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_discount (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_discount_item (quantity, price, product_id, discount_id) VALUES (42, 29.9, 6, 5);

INSERT INTO tb_tax (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_tax (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_tax (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_tax (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_tax (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_tax_item (quantity, price, product_id, tax_id) VALUES (42, 29.9, 6, 5);

INSERT INTO tb_outlet (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_outlet (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_outlet (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_outlet (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_outlet (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_outlet_item (quantity, price, product_id, outlet_id) VALUES (42, 29.9, 6, 5);


INSERT INTO tb_coupon (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_coupon (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_coupon (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_coupon (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_coupon (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_coupon_item (quantity, price, product_id, coupon_id) VALUES (42, 29.9, 6, 5);


INSERT INTO tb_deliveryfee (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_deliveryfee (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_deliveryfee (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_deliveryfee (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_deliveryfee (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_deliveryfee_item (quantity, price, product_id, deliveryfee_id) VALUES (42, 29.9, 6, 5);


INSERT INTO tb_adjustment (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_adjustment (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_adjustment (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_adjustment (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_adjustment (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_adjustment_item (quantity, price, product_id, adjustment_id) VALUES (42, 29.9, 6, 5);


INSERT INTO tb_user (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_user (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_user (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_user (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_user (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_user_item (quantity, price, product_id, user_id) VALUES (42, 29.9, 6, 5);


INSERT INTO tb_userprofile (moment, status, client_id) VALUES ('2021-05-20T23:30:00Z', 1, 1);
INSERT INTO tb_userprofile (moment, status, client_id) VALUES ('2021-04-20T19:30:00Z', 1, 1);
INSERT INTO tb_userprofile (moment, status, client_id) VALUES ('2021-03-20T08:30:00Z', 0, 6);
INSERT INTO tb_userprofile (moment, status, client_id) VALUES ('2021-02-20T17:30:00Z', 2, 5);
INSERT INTO tb_userprofile (moment, status, client_id) VALUES ('2021-01-20T14:30:00Z', 3, 2);


INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (1, 2999.0, 1, 1);
INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (2, 499.9, 5, 1);
INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (1, 7800.0, 2, 2);
INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (1, 999.0, 4, 2);
INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (5, 29.9, 6, 3);
INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (2, 499.9, 5, 3);
INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (1, 9999.0, 3, 4);
INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (1, 2999.0, 1, 4);
INSERT INTO tb_userprofile_item (quantity, price, product_id, userprofile_id) VALUES (42, 29.9, 6, 5);