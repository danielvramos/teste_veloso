package br.edu.infnet.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.teste.dto.OrderProductDTO;

import br.edu.infnet.teste.service.OrderProductService;


@RestController
@RequestMapping("/order_product")
public class OrderProductController {



    @Autowired
    private OrderProductService orderProductService;

    @GetMapping	
    public List<OrderProductDTO> getCostumers() {
    	return orderProductService.getAll();
    }
    
    @PostMapping
    public OrderProductDTO storeUser(@RequestBody OrderProductDTO orderProduct) {
    	return orderProductService.save(orderProduct);
    }
}





