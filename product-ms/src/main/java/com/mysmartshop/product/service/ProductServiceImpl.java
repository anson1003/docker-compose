package com.mysmartshop.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysmartshop.product.model.Product;
import com.mysmartshop.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAvailableProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductDetails(String productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId).get();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void removeProduct(String productId) {
		productRepository.deleteById(productId);
		
	}
	
	

}
