package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.UserProfileItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserProfileItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long userprofile;
    public double getSubTotal;

    public UserProfileItemDTO(UserProfileItem userprofileItem) {
        id = userprofileItem.getId();
        quantity = userprofileItem.getQuantity();
        price = userprofileItem.getPrice();
        product = userprofileItem.getProduct().getName();
        userprofile = userprofileItem.getUserProfile().getId();
        getSubTotal = userprofileItem.getSubTotal();
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

	public Long getUserProfile() {
		return userprofile;
	}

	public void setUserProfile(Long userprofile) {
		this.userprofile = userprofile;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
