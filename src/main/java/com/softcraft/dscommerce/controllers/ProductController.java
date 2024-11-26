package com.softcraft.dscommerce.controllers;

import com.softcraft.dscommerce.dto.ProductDTO;
import com.softcraft.dscommerce.entities.Product;
import com.softcraft.dscommerce.repositories.ProductRepository;
import com.softcraft.dscommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;
    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        ProductDTO productDTO = service.findById(id);
        return productDTO;
    }
}
