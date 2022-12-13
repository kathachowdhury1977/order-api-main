package com.newproduct.orderapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.newproduct.orderapi.enums.AdjustmentStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_adjustment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adjustment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Instant moment;

    @Column(nullable = false)
    private AdjustmentStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "adjustment", cascade = CascadeType.REMOVE)
    private List<AdjustmentItem> items = new ArrayList<>();

     public double getTotal() {
        double sum = 0.0;
        for (AdjustmentItem item : items) {
            sum += item.getSubTotal();
        }
        return sum;
    }

    public List<AdjustmentItem> getItems() {
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

	public AdjustmentStatus getStatus() {
		return status;
	}

	public void setStatus(AdjustmentStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setItems(List<AdjustmentItem> items) {
		this.items = items;
	}
    
    
    
}
