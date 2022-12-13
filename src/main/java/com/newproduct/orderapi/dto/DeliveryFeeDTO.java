package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.DeliveryFee;
import com.newproduct.orderapi.enums.DeliveryFeeStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class DeliveryFeeDTO {

    private Long id;
    private Instant moment;
    private DeliveryFeeStatus status;
    private ClientResponseDTO client;
    private List<DeliveryFeeItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public DeliveryFeeDTO(DeliveryFee deliveryfee) {
        id = deliveryfee.getId();
        moment = deliveryfee.getMoment();
        status = deliveryfee.getStatus();
        client = new ClientResponseDTO(deliveryfee.getClient());
        deliveryfee.getItems().forEach(item -> this.items.add(new DeliveryFeeItemDTO(item)));
        getTotal = deliveryfee.getTotal();
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

	public DeliveryFeeStatus getStatus() {
		return status;
	}

	public void setStatus(DeliveryFeeStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<DeliveryFeeItemDTO> getItems() {
		return items;
	}

	public void setItems(List<DeliveryFeeItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

