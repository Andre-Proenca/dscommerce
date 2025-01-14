package com.softcraft.dscommerce.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softcraft.dscommerce.dto.OrderDTO;
import com.softcraft.dscommerce.entities.Order;
import com.softcraft.dscommerce.repositories.OrderRepository;
import com.softcraft.dscommerce.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
            Order order = repository.findById(id).orElseThrow(
                    () -> new ResourceNotFoundException("RECURSO NAO ENCONTRADO!"));
            return new OrderDTO(order);
    }
	
}
