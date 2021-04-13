package com.example.springcrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springcrud.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> 
{
	
	
}
