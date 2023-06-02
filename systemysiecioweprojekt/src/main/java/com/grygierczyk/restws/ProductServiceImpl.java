package com.grygierczyk.restws;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grygierczyk.restws.entities.Product;
import com.grygierczyk.restws.repos.ProductRepository;

import jakarta.ws.rs.core.Response;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;
	
	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Response createProduct(Product product) {
		Product saveProduct = repository.save(product);
		return Response.ok(saveProduct).build();
	}

	@Override
	public Response updateProduct(Product product) {
		Product saveProduct = repository.save(product);
		return Response.ok(saveProduct).build();
	}

	@Override
	public Response deleteProduct(Product product) {
		repository.delete(product);
		return Response.ok().build();
	}

	@Override
	public Response deleteProduct(int id) {
		repository.deleteById(id);
		return Response.ok().build();
	}

}
