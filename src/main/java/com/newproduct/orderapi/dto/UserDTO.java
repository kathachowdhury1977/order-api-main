package com.newproduct.orderapi.dto;

import com.newproduct.orderapi.dto.responses.ClientResponseDTO;
import com.newproduct.orderapi.entities.User;
import com.newproduct.orderapi.enums.UserStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private Instant moment;
    private UserStatus status;
    private ClientResponseDTO client;
    private List<UserItemDTO> items = new ArrayList<>();
    private Double getTotal;

    public UserDTO(User user) {
        id = user.getId();
        moment = user.getMoment();
        status = user.getStatus();
        client = new ClientResponseDTO(user.getClient());
        user.getItems().forEach(item -> this.items.add(new UserItemDTO(item)));
        getTotal = user.getTotal();
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

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}

	public ClientResponseDTO getClient() {
		return client;
	}

	public void setClient(ClientResponseDTO client) {
		this.client = client;
	}

	public List<UserItemDTO> getItems() {
		return items;
	}

	public void setItems(List<UserItemDTO> items) {
		this.items = items;
	}

	public Double getGetTotal() {
		return getTotal;
	}

	public void setGetTotal(Double getTotal) {
		this.getTotal = getTotal;
	}
    
    
    
    
    
    
}

