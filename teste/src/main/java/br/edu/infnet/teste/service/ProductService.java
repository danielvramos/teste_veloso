package br.edu.infnet.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.teste.dto.ProductDTO;
import br.edu.infnet.teste.repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
    public ProductRepository productRepository;

	   public List<ProductDTO> getAll() {
	        return (List<ProductDTO>) productRepository.findAll();
	    }
	   public ProductDTO save(ProductDTO product) {
		  return productRepository.save(product);
	   }
}
