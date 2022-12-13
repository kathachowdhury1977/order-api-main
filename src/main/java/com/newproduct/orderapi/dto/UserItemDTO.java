package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.UserItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long user;
    public double getSubTotal;

    public UserItemDTO(UserItem userItem) {
        id = userItem.getId();
        quantity = userItem.getQuantity();
        price = userItem.getPrice();
        product = userItem.getProduct().getName();
        user = userItem.getUser().getId();
        getSubTotal = userItem.getSubTotal();
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

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
