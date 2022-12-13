package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.PaymentItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PaymentItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long payment;
    public double getSubTotal;

    public PaymentItemDTO(PaymentItem paymentItem) {
        id = paymentItem.getId();
        quantity = paymentItem.getQuantity();
        price = paymentItem.getPrice();
        product = paymentItem.getProduct().getName();
        payment = paymentItem.getPayment().getId();
        getSubTotal = paymentItem.getSubTotal();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Long getPayment() {
		return payment;
	}

	public void setPayment(Long payment) {
		this.payment = payment;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
