package com.ibs.project.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MA_EMPLOYEE", schema ="gracephilip")


public class Employee {
	@Id
	@Column(name="emp_id", nullable=false)
    private String empId;
    
    @Column(name="name", nullable=false)
    private String name;
    
    @Column(name="password",nullable=false)
    private String password;
    
    @OneToOne
    @JoinColumn(name="role_id",nullable=false)
    private Role role;
    
    @Column(name="manager_id",nullable=false)
    private String managerId;
    
    @OneToMany(mappedBy="employee",fetch = FetchType.EAGER)
   	Set<EmployeeSkill> employeeskills;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", password=" + password + ", role=" + role
				+ ", managerId=" + managerId + ", employeeskills=" + employeeskills + "]";
	}
	

}

