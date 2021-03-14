package com.mauromelo1.myfirstproject.services;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauromelo1.myfirstproject.entities.Product;
import com.mauromelo1.myfirstproject.repositories.ProductRepository;

@Service
public class ProductService {	

	@Autowired
	private ProductRepository productRepository;

	public Product findById(Long id) {
		return productRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("Id not found " + id));		
	}	
}
