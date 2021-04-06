package br.edu.infnet.teste.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CostumerDTO {
	@Id
	@GeneratedValue
	private Long id;
	private String primeiro_nome;
	private String nome_meio;
	private String nome_final;

	public CostumerDTO() {

	}

	public CostumerDTO(String primeiro_nome, String nome_meio, String nome_final) {
		this.primeiro_nome = primeiro_nome;
		this.nome_meio = nome_meio;
		this.nome_final = nome_final;
	}

	public String getPrimeiro_nome() {
		return primeiro_nome;
	}

	public String getNome_meio() {
		return nome_meio;
	}

	public String getNome_final() {
		return nome_final;
	}


}
