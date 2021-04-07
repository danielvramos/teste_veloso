package br.edu.infnet.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.teste.dto.OrderProductDTO;
import br.edu.infnet.teste.repository.OrderProductRepository;
import br.edu.infnet.teste.repository.OrderRepository;

@Service
public class OrderProductService {

	
	@Autowired
    public OrderProductRepository orderProductRepository;

	   public List<OrderProductDTO> getAll() {
	        return (List<OrderProductDTO>) orderProductRepository.findAll();
	    }
	   public OrderProductDTO save(OrderProductDTO orderProduct) {
		  return orderProductRepository.save(orderProduct);
	   }
}
