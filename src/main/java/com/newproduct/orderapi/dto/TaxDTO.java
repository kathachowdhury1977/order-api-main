package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.Tax;
import com.newproduct.orderapi.enums.TaxStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TaxDTO {

    private Long id;
    private Instant moment;
    private TaxStatus status;
    private ClientResponseDTO client;
    private List<TaxItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public TaxDTO(Tax tax) {
        id = tax.getId();
        moment = tax.getMoment();
        status = tax.getStatus();
        client = new ClientResponseDTO(tax.getClient());
        tax.getItems().forEach(item -> this.items.add(new TaxItemDTO(item)));
        getTotal = tax.getTotal();
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

	public TaxStatus getStatus() {
		return status;
	}

	public void setStatus(TaxStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<TaxItemDTO> getItems() {
		return items;
	}

	public void setItems(List<TaxItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

