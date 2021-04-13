package com.example.springcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springcrud.model.Customer;

import java.util.*;

@Component
public class CustomerService {
	
	@Autowired
	CustomerRepo repo;
	
	

	@GetMapping
	public List<Customer> getCustomers() {
		
		List<Customer> customers = repo.findAll();

		return customers;
	}
	
	
	@GetMapping
	public Customer getCustomerById(int id)
	{
		Customer c = repo.findById(id).orElse(new Customer(0, ""));
		
		return c;
	}


	@PostMapping
	public Customer addCustomer(Customer c) {
		
		repo.save(c);
		return c;
	}


	@DeleteMapping
	public void delete(int id) {
		
		repo.deleteById(id);
	}



}
