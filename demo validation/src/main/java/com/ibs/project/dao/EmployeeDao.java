package com.ibs.project.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.project.entity.EmployeeSkill;
import com.ibs.project.entity.Skill;
import com.ibs.project.model.EmployeeSkillModel;
import com.ibs.project.model.SkillModel;
import com.ibs.project.model.SkillUpdateModel;
import com.ibs.project.repository.EmployeeRepository;
import com.ibs.project.repository.SkillRepository;

@Component
public class EmployeeDao {

	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private SkillRepository skillRepo;

	public List<EmployeeSkillModel> getEmployeeList(String empid) {
		List<EmployeeSkillModel> empModel = new ArrayList<>();
		List<EmployeeSkill> emplist = repo.findByEmpId(empid);
		//emplist = null;
		Iterator<EmployeeSkill> itr = emplist.iterator();
		while (itr.hasNext()) {
			empModel.add(itr.next().fetchModel());
		}
		return empModel;
	}

	public void delete(int empskillid) {
		repo.deleteById((int) empskillid);
	}

	public EmployeeSkillModel add(EmployeeSkillModel empAddModel) {
		EmployeeSkill empAddSkill = empAddModel.addEntity();
		repo.save(empAddSkill);
		return empAddModel;
	}

	@Transactional
	public boolean updatelevel(SkillUpdateModel updatemodel) {
		System.out.println(updatemodel.toString());
		repo.updateLevel(updatemodel.getLevel(), updatemodel.getEmpSkillId());
		
		return repo.existsById(updatemodel.getEmpSkillId());
		/*if (repo.existsById(updatemodel.getEmpSkillId())) {
			return true;
		}
		return false;*/
	}
	
	public List<SkillModel> getSkillList(SkillModel skillModel) {
		List<SkillModel> skillListModel = new ArrayList<>();
		List<Skill> skilllist = skillRepo.findAll();

		Iterator<Skill> itr = skilllist.iterator();
		while (itr.hasNext()) {
			skillListModel.add(itr.next().fetchSkillModel());
		}
		return skillListModel;
	}



}