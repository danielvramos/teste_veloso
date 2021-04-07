package br.edu.infnet.teste.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class OrderProductDTO {
	@Id
	@GeneratedValue
	private Long id;
	private Long order_id;
	private Long product_id;
	
	private Integer quantidade;
	private String comments;

	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	@JoinColumn(name="order_id", referencedColumnName="id", insertable=false, updatable=false)
	private OrderDTO order;
	@ManyToOne(optional=false, fetch=FetchType.LAZY)
	@JoinColumn(name="product_id", referencedColumnName="id", insertable=false, updatable=false)
	private ProductDTO product;

	public OrderProductDTO() {

	}

	public OrderProductDTO(Integer quantidade, String comments, Long order_id, Long product_id) {
		this.quantidade = quantidade;
		this.comments = comments;
		this.order_id = order_id;
		this.product_id = product_id;
	}

	public Long getId() {
		return id;
	}
	public Long getOrder_id() {
		return order_id;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public String getComments() {
		return comments;
	}



}
