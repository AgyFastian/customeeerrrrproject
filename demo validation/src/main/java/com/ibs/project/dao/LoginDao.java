package com.ibs.project.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.project.entity.Employee;
import com.ibs.project.repository.LoginRepository;

@Component
public class LoginDao {
	@Autowired
	LoginRepository repo;
	
	public Optional<Employee> getUser(Employee employee){
	
		return repo.findById(employee.getEmpId());
	}
}
