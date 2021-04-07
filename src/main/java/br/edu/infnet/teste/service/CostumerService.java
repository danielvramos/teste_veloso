package br.edu.infnet.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.teste.repository.CostumerRepository;
import br.edu.infnet.teste.dto.CostumerDTO;

@Service
public class CostumerService {

	
	@Autowired
    public CostumerRepository costumerRepository;

	   public List<CostumerDTO> getAll() {
	        return (List<CostumerDTO>) costumerRepository.findAll();
	    }
	   public CostumerDTO save(CostumerDTO costumer) {
		  return costumerRepository.save(costumer);
	   }
}
