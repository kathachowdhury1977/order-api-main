package com.newproduct.orderapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.newproduct.orderapi.enums.OutletStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_outlet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Outlet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Instant moment;

    @Column(nullable = false)
    private OutletStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "outlet", cascade = CascadeType.REMOVE)
    private List<OutletItem> items = new ArrayList<>();

     public double getTotal() {
        double sum = 0.0;
        for (OutletItem item : items) {
            sum += item.getSubTotal();
        }
        return sum;
    }

    public List<OutletItem> getItems() {
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

	public OutletStatus getStatus() {
		return status;
	}

	public void setStatus(OutletStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void setItems(List<OutletItem> items) {
		this.items = items;
	}
    
    
    
}
