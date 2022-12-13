package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.Discount;
import com.newproduct.orderapi.enums.DiscountStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DiscountDTO {

    private Long id;
    private Instant moment;
    private DiscountStatus status;
    private ClientResponseDTO client;
    private List<DiscountItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public DiscountDTO(Discount discount) {
        id = discount.getId();
        moment = discount.getMoment();
        status = discount.getStatus();
        client = new ClientResponseDTO(discount.getClient());
        discount.getItems().forEach(item -> this.items.add(new DiscountItemDTO(item)));
        getTotal = discount.getTotal();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public DiscountStatus getStatus() {
		return status;
	}

	public void setStatus(DiscountStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<DiscountItemDTO> getItems() {
		return items;
	}

	public void setItems(List<DiscountItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

