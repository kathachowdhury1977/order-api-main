package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.Coupon;
import com.newproduct.orderapi.enums.CouponStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CouponDTO {

    private Long id;
    private Instant moment;
    private CouponStatus status;
    private ClientResponseDTO client;
    private List<CouponItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public CouponDTO(Coupon coupon) {
        id = coupon.getId();
        moment = coupon.getMoment();
        status = coupon.getStatus();
        client = new ClientResponseDTO(coupon.getClient());
        coupon.getItems().forEach(item -> this.items.add(new CouponItemDTO(item)));
        getTotal = coupon.getTotal();
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

	public CouponStatus getStatus() {
		return status;
	}

	public void setStatus(CouponStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<CouponItemDTO> getItems() {
		return items;
	}

	public void setItems(List<CouponItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

