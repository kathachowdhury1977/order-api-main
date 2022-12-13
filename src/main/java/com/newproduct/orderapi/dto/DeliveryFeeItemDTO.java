package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.DeliveryFeeItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeliveryFeeItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long deliveryfee;
    public double getSubTotal;

    public DeliveryFeeItemDTO(DeliveryFeeItem deliveryfeeItem) {
        id = deliveryfeeItem.getId();
        quantity = deliveryfeeItem.getQuantity();
        price = deliveryfeeItem.getPrice();
        product = deliveryfeeItem.getProduct().getName();
        deliveryfee = deliveryfeeItem.getDeliveryFee().getId();
        getSubTotal = deliveryfeeItem.getSubTotal();
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

	public Long getDeliveryFee() {
		return deliveryfee;
	}

	public void setDeliveryFee(Long deliveryfee) {
		this.deliveryfee = deliveryfee;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
