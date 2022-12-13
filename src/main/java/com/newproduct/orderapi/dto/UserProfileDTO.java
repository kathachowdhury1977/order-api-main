package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.UserProfile;
import com.newproduct.orderapi.enums.UserProfileStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserProfileDTO {

    private Long id;
    private Instant moment;
    private UserProfileStatus status;
    private ClientResponseDTO client;
    private List<UserProfileItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public UserProfileDTO(UserProfile userprofile) {
        id = userprofile.getId();
        moment = userprofile.getMoment();
        status = userprofile.getStatus();
        client = new ClientResponseDTO(userprofile.getClient());
        userprofile.getItems().forEach(item -> this.items.add(new UserProfileItemDTO(item)));
        getTotal = userprofile.getTotal();
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

	public UserProfileStatus getStatus() {
		return status;
	}

	public void setStatus(UserProfileStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<UserProfileItemDTO> getItems() {
		return items;
	}

	public void setItems(List<UserProfileItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

