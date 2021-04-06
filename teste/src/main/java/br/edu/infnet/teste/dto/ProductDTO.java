package br.edu.infnet.teste.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductDTO {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Double preco;
	private String detalhe;



	public ProductDTO() {

	}

	public ProductDTO(String nome, Double preco, String detalhe) {
		this.nome = nome;
		this.preco = preco;
		this.detalhe = detalhe;
	}

	public Long getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

}
