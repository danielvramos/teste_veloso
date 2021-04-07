package br.edu.infnet.teste.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class OrderDTO {
	@Id
	@GeneratedValue
	private Long id;
	private Long costumer_id;
	private String status;
	private Timestamp date_order_placed;
	private Double total;
	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	@JoinColumn(name="costumer_id", referencedColumnName="id", insertable=false, updatable=false)
	private CostumerDTO costumer;


	public OrderDTO() {

	}

	public OrderDTO(String status, Double total, Timestamp date_order_placed, Long costumer_id) {
		this.status = status;
		this.total = total;
		this.costumer_id = costumer_id;
		this.date_order_placed = date_order_placed;
	}

	public Long getId() {
		return id;
	}

	public Long getCostumer_id() {
		return costumer_id;
	}

	public String getStatus() {
		return status;
	}

	public Timestamp getDate_order_placed() {
		return date_order_placed;
	}

	public Double getTotal() {
		return total;
	}

}
