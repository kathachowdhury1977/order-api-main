package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.DiscountItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DiscountItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long discount;
    public double getSubTotal;

    public DiscountItemDTO(DiscountItem discountItem) {
        id = discountItem.getId();
        quantity = discountItem.getQuantity();
        price = discountItem.getPrice();
        product = discountItem.getProduct().getName();
        discount = discountItem.getDiscount().getId();
        getSubTotal = discountItem.getSubTotal();
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

	public Long getDiscount() {
		return discount;
	}

	public void setDiscount(Long discount) {
		this.discount = discount;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
