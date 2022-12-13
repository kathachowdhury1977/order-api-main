package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.entities.TaxItem;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TaxItemDTO {

    private Long id;
    private Integer quantity;
    private Double price;
    private String product;
    private Long tax;
    public double getSubTotal;

    public TaxItemDTO(TaxItem taxItem) {
        id = taxItem.getId();
        quantity = taxItem.getQuantity();
        price = taxItem.getPrice();
        product = taxItem.getProduct().getName();
        tax = taxItem.getTax().getId();
        getSubTotal = taxItem.getSubTotal();
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

	public Long getTax() {
		return tax;
	}

	public void setTax(Long tax) {
		this.tax = tax;
	}

	public double getGetSubTotal() {
		return getSubTotal;
	}

	public void setGetSubTotal(double getSubTotal) {
		this.getSubTotal = getSubTotal;
	}
    
    
    
    
}
