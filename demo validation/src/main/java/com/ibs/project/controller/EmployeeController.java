package com.ibs.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibs.project.model.EmployeeSkillModel;
import com.ibs.project.model.SkillModel;
import com.ibs.project.model.StatusModel;
import com.ibs.project.model.SkillUpdateModel;
import com.ibs.project.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;
	
	@CrossOrigin
	@GetMapping("/fetch/{empid}")
	public List<EmployeeSkillModel> getEmployees(@PathVariable("empid") String empid){
		return employeeservice.getEmployees(empid);
	}
	
	@CrossOrigin
	@DeleteMapping("/delete/{empskillid}")
	public boolean deleteEmployee(@PathVariable int empskillid) {
		employeeservice.deleteEmployee(empskillid);
		return true;
	}
	
	@CrossOrigin
	@PostMapping("/add")
	public EmployeeSkillModel addEmployee(@RequestBody EmployeeSkillModel empAddModel){
		return employeeservice.addEmployee(empAddModel);
	
	}
	
	@CrossOrigin
	@PostMapping("/update")
	public StatusModel updateUser(@RequestBody SkillUpdateModel updatemodel){
		System.out.println(updatemodel);
		return employeeservice.update(updatemodel);
	}
	
	@CrossOrigin
	@GetMapping("/skills")
	public List<SkillModel> getValues(@RequestBody SkillModel skillModel){
		return employeeservice.getSkills(skillModel);
	}

	
}