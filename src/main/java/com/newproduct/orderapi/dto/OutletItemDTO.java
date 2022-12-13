package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.OutletItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OutletItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long outlet;
    public double getSubTotal;

    public OutletItemDTO(OutletItem outletItem) {
        id = outletItem.getId();
        quantity = outletItem.getQuantity();
        price = outletItem.getPrice();
        product = outletItem.getProduct().getName();
        outlet = outletItem.getOutlet().getId();
        getSubTotal = outletItem.getSubTotal();
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

	public Long getOutlet() {
		return outlet;
	}

	public void setOutlet(Long outlet) {
		this.outlet = outlet;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
