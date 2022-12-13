package com.newproduct.orderapi.dto.responses;


import com.newproduct.orderapi.entities.Client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientResponseDTO {

    private Long id;
    private String name;
    private String email;

    public ClientResponseDTO(Client client) {
        id = client.getId();
        name = client.getName();
        email = client.getEmail();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
    
    
}
