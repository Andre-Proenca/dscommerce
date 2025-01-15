package com.softcraft.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softcraft.dscommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
