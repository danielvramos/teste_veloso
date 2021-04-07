package br.edu.infnet.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.teste.dto.OrderDTO;
import br.edu.infnet.teste.dto.ProductDTO;
import br.edu.infnet.teste.service.OrderService;
import br.edu.infnet.teste.service.ProductService;


@RestController
@RequestMapping("/order")
public class OrderController {



    @Autowired
    private OrderService orderService;

    @GetMapping	
    public List<OrderDTO> getCostumers() {
    	return orderService.getAll();
    }
    
    @PostMapping
    public OrderDTO storeUser(@RequestBody OrderDTO order) {
    	return orderService.save(order);
    }
}





