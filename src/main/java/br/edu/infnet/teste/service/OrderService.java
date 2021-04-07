package br.edu.infnet.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.teste.dto.OrderDTO;
import br.edu.infnet.teste.repository.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
    public OrderRepository orderRepository;

	   public List<OrderDTO> getAll() {
	        return (List<OrderDTO>) orderRepository.findAll();
	    }
	   public OrderDTO save(OrderDTO order) {
		  return orderRepository.save(order);
	   }
}
