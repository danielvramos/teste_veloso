package br.edu.infnet.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.teste.dto.CostumerDTO;

public interface CostumerRepository extends CrudRepository<CostumerDTO,Long>{
	

}
