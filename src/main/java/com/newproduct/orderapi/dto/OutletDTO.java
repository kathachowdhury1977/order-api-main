package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.Outlet;
import com.newproduct.orderapi.enums.OutletStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OutletDTO {

    private Long id;
    private Instant moment;
    private OutletStatus status;
    private ClientResponseDTO client;
    private List<OutletItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public OutletDTO(Outlet outlet) {
        id = outlet.getId();
        moment = outlet.getMoment();
        status = outlet.getStatus();
        client = new ClientResponseDTO(outlet.getClient());
        outlet.getItems().forEach(item -> this.items.add(new OutletItemDTO(item)));
        getTotal = outlet.getTotal();
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

	public OutletStatus getStatus() {
		return status;
	}

	public void setStatus(OutletStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<OutletItemDTO> getItems() {
		return items;
	}

	public void setItems(List<OutletItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

