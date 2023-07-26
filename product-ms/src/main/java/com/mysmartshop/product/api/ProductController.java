package com.mysmartshop.product.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysmartshop.product.model.Product;
import com.mysmartshop.product.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
//	@GetMapping
//	public String greet() {
//		return "Message from product service";
//	}
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);
	}
	
	@GetMapping("/{id}")
	public Product getProductDetails(@PathVariable String id) {
		return productService.getProductDetails(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable String id) {
		productService.removeProduct(id);
	}
	
	@GetMapping("/getall")
	public List<Product> getAllProduct(){
		return productService.getAvailableProducts();
	}
	
	

}
