package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.OrderItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long order;
    public double getSubTotal;

    public OrderItemDTO(OrderItem orderItem) {
        id = orderItem.getId();
        quantity = orderItem.getQuantity();
        price = orderItem.getPrice();
        product = orderItem.getProduct().getName();
        order = orderItem.getOrder().getId();
        getSubTotal = orderItem.getSubTotal();
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

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
