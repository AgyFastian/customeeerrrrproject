package com.ibs.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.project.dao.LoginDao;
import com.ibs.project.entity.Employee;
import com.ibs.project.model.LoginModel;



@Service
public class LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	public LoginModel validateUser(Employee employee){
		
		Optional<Employee> employeelogin=loginDao.getUser(employee);
		
		LoginModel model=new LoginModel();
		
		model.setEmpId((employeelogin.get().getEmpId()));
		model.setName((employeelogin.get().getName()));
		
		if(employeelogin.get().getPassword().equals(employee.getPassword())){
			model.setRoleId((employeelogin.get().getRole().getRoleId()));
		}
		
		return model;
			
	}
	

}
