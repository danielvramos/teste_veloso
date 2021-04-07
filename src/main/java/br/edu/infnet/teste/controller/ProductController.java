package br.edu.infnet.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.teste.dto.ProductDTO;

import br.edu.infnet.teste.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {



    @Autowired
    private ProductService productService;

    @GetMapping	
    public List<ProductDTO> getCostumers() {
    	return productService.getAll();
    }
    
    @PostMapping
    public ProductDTO storeUser(@RequestBody ProductDTO costumer) {
    	return productService.save(costumer);
    }
}





