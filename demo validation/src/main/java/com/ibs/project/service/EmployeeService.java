package com.ibs.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibs.project.dao.EmployeeDao;
import com.ibs.project.model.EmployeeSkillModel;
import com.ibs.project.model.SkillModel;
import com.ibs.project.model.StatusModel;
import com.ibs.project.model.SkillUpdateModel;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;//ctrl+shift+F

	public List<EmployeeSkillModel> getEmployees(String empid) {
		return empDao.getEmployeeList(empid);
	}

	public void deleteEmployee(int empskillid) {
		empDao.delete(empskillid);
	}

	public EmployeeSkillModel addEmployee(EmployeeSkillModel empAddModel) {
		return empDao.add(empAddModel);
	}

	public StatusModel update(SkillUpdateModel updatemodel) {
		StatusModel status = new StatusModel();
		if (empDao.updatelevel(updatemodel)) {
			status.setStatus("Success!");
		} else {
			status.setStatus("Fail!");
		}
		return status;
	}

	public List<SkillModel> getSkills(SkillModel skillModel){
		return empDao.getSkillList(skillModel);
	}

}
