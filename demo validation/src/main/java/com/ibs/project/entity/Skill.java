package com.ibs.project.entity;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.ibs.project.model.SkillModel;

@Entity
@Table(name="MA_SKILL", schema ="gracephilip")
public class Skill {
    @Id
    @Column(name="skill_id",nullable=false)
    private int skillId;
    
    @Column(name="skill_name",nullable=false)
    private String skillName;
    
    @Column(name="skill_category",nullable=false)
    private  String category;
    
    @OneToMany(mappedBy="skill",fetch = FetchType.EAGER)
   	Set<EmployeeSkill> employeeskills;

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + ", category=" + category + "]";

}
	
public SkillModel fetchSkillModel() {
		
	SkillModel skillmodel=new SkillModel();
	
	skillmodel.setSkillId(this.skillId);
	skillmodel.setSkillName(this.skillName);
	skillmodel.setCategory(this.category);
		
		
		return skillmodel;
	}

}

