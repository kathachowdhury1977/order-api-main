package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.Adjustment;
import com.newproduct.orderapi.enums.AdjustmentStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AdjustmentDTO {

    private Long id;
    private Instant moment;
    private AdjustmentStatus status;
    private ClientResponseDTO client;
    private List<AdjustmentItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public AdjustmentDTO(Adjustment adjustment) {
        id = adjustment.getId();
        moment = adjustment.getMoment();
        status = adjustment.getStatus();
        client = new ClientResponseDTO(adjustment.getClient());
        adjustment.getItems().forEach(item -> this.items.add(new AdjustmentItemDTO(item)));
        getTotal = adjustment.getTotal();
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

	public AdjustmentStatus getStatus() {
		return status;
	}

	public void setStatus(AdjustmentStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<AdjustmentItemDTO> getItems() {
		return items;
	}

	public void setItems(List<AdjustmentItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

