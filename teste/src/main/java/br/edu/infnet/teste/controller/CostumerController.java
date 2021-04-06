package br.edu.infnet.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.teste.dto.CostumerDTO;
import br.edu.infnet.teste.service.CostumerService;


@RestController
@RequestMapping("/costumers")
public class CostumerController {



    @Autowired
    private CostumerService costumerService;

    @GetMapping	
    public List<CostumerDTO> getCostumers() {
    	return costumerService.getAll();
    }
    
    @PostMapping
    public CostumerDTO storeUser(@RequestBody CostumerDTO costumer) {
    	return costumerService.save(costumer);
    }
}





