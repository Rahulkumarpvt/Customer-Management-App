package com.example.rahul.SunBaseApiClient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rahul.SunBaseApiClient.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
