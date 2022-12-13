package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.Payment;
import com.newproduct.orderapi.enums.PaymentStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PaymentDTO {

    private Long id;
    private Instant moment;
    private PaymentStatus status;
    private ClientResponseDTO client;
    private List<PaymentItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public PaymentDTO(Payment payment) {
        id = payment.getId();
        moment = payment.getMoment();
        status = payment.getStatus();
        client = new ClientResponseDTO(payment.getClient());
        payment.getItems().forEach(item -> this.items.add(new PaymentItemDTO(item)));
        getTotal = payment.getTotal();
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

	public PaymentStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<PaymentItemDTO> getItems() {
		return items;
	}

	public void setItems(List<PaymentItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

