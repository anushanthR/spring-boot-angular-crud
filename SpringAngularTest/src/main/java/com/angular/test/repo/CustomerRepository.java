package com.angular.test.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.angular.test.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}