package com.ibs.project.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ibs.project.model.EmployeeSkillModel;

@Entity
@Table(name = "EMPLOYEE_SKILL", schema = "gracephilip")
public class EmployeeSkill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_skill_id")
	private int empSkillId;
	

	 @ManyToOne
     @JoinColumn(name="emp_id")
     private Employee employee;
       	
     @ManyToOne
     @JoinColumn(name="skill_id")
     private Skill skill;

	@Column(name = "level")
	private String level;

	@Column(name = "status")
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

	
	@Override
	public String toString() {
		return "EmployeeSkill [empSkillId=" + empSkillId + ", employee=" + employee + ", skill=" + skill + ", level="
				+ level + ", status=" + status + "]";
	}
	
	public EmployeeSkillModel fetchModel() {
		
		EmployeeSkillModel model=new EmployeeSkillModel();
	
		model.setEmpSkillId(this.empSkillId);
		model.setEmployee(this.employee);
		model.setSkill(this.skill);
		model.setLevel(this.level);
		model.setStatus(this.status);
		
		return model;
	}
	
}
