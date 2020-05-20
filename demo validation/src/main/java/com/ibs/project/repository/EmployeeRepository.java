package com.ibs.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ibs.project.entity.EmployeeSkill;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeSkill, Integer> {
	
	@Query("Select a from EmployeeSkill a where emp_id=:empid " )
    List<EmployeeSkill> findByEmpId(@Param("empid")String empid);

	
	@Modifying()
	@Query("update EmployeeSkill e set e.level=:level where e.empSkillId=:empSkillId ")
	int updateLevel(@Param("level") String level, @Param("empSkillId") int empSkillId);
	
}
