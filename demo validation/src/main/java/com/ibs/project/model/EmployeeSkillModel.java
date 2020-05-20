package com.ibs.project.model;


import com.ibs.project.entity.Employee;
import com.ibs.project.entity.EmployeeSkill;
import com.ibs.project.entity.Skill;

public class EmployeeSkillModel {
	
	private int empSkillId;
	private Employee employee;
	private Skill skill;
	private String level;
	private int status;
	
	public int getEmpSkillId() {
		return empSkillId;
	}
	public void setEmpSkillId(int empSkillId) {
		this.empSkillId = empSkillId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	public EmployeeSkill addEntity(){
		EmployeeSkill empAdd=new EmployeeSkill();
		
		empAdd.setEmpSkillId(this.empSkillId);
		empAdd.setEmployee(this.employee);
		empAdd.setSkill(this.skill);
		empAdd.setLevel(this.level);
		empAdd.setStatus(this.status);

		return empAdd;
		
	}

}
