package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.AdjustmentItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AdjustmentItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long adjustment;
    public double getSubTotal;

    public AdjustmentItemDTO(AdjustmentItem adjustmentItem) {
        id = adjustmentItem.getId();
        quantity = adjustmentItem.getQuantity();
        price = adjustmentItem.getPrice();
        product = adjustmentItem.getProduct().getName();
        adjustment = adjustmentItem.getAdjustment().getId();
        getSubTotal = adjustmentItem.getSubTotal();
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

	public Long getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(Long adjustment) {
		this.adjustment = adjustment;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
