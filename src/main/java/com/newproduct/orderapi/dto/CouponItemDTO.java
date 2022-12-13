package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.CouponItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CouponItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long coupon;
    public double getSubTotal;

    public CouponItemDTO(CouponItem couponItem) {
        id = couponItem.getId();
        quantity = couponItem.getQuantity();
        price = couponItem.getPrice();
        product = couponItem.getProduct().getName();
        coupon = couponItem.getCoupon().getId();
        getSubTotal = couponItem.getSubTotal();
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

	public Long getCoupon() {
		return coupon;
	}

	public void setCoupon(Long coupon) {
		this.coupon = coupon;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
