package com.example.springcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcrud.model.Customer;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@PostMapping
	public Customer addCustomer(Customer customer) {
		
		return service.addCustomer(customer);
	}
	
	@GetMapping
    public List<Customer> getCustomers() {
		
        return service.getCustomers();
    }
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable("id") int id) {
		
		return service.getCustomerById(id);
		
	}
		
	@DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) int id) {
        service.delete(id);
    }
	
}
