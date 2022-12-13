package com.newproduct.orderapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.newproduct.orderapi.enums.DiscountStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_discount")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Instant moment;

    @Column(nullable = false)
    private DiscountStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "discount", cascade = CascadeType.REMOVE)
    private List<DiscountItem> items = new ArrayList<>();

     public double getTotal() {
        double sum = 0.0;
        for (DiscountItem item : items) {
            sum += item.getSubTotal();
        }
        return sum;
    }

    public List<DiscountItem> getItems() {
        return items;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setItems(List<DiscountItem> items) {
		this.items = items;
	}
    
    
    
}
