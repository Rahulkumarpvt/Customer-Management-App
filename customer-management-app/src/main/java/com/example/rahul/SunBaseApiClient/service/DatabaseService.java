package com.example.rahul.SunBaseApiClient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rahul.SunBaseApiClient.entity.Customer;
import com.example.rahul.SunBaseApiClient.repository.CustomerRepository;

@Service
public class DatabaseService {
	@Autowired
	CustomerRepository customerRepo;
	
	public void create(Customer customer) {
		customerRepo.save(customer);
	}
	
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
	
	public Customer getCustomerById(Long id) {
		return customerRepo.findById(id).get();
	}
	public void update(Customer customer, Long id) {
		// TODO Auto-generated method stub
		Customer toBeUpdated = getCustomerById(id);
		toBeUpdated.setFirstName(customer.getFirstName());
		toBeUpdated.setLastName(customer.getLastName());
		toBeUpdated.setStreet(customer.getStreet());
		toBeUpdated.setAddress(customer.getAddress());
		toBeUpdated.setCity(customer.getCity());
		toBeUpdated.setState(customer.getState());
		toBeUpdated.setEmail(customer.getEmail());
		toBeUpdated.setPhone(customer.getPhone());
		
		customerRepo.save(toBeUpdated);
	}
	
	public void deleteCustomer(Long id) {
        //  delete the customer
        customerRepo.deleteById(id);
    }

}
