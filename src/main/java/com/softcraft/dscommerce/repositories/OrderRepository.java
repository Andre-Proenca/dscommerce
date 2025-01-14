package com.softcraft.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softcraft.dscommerce.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
