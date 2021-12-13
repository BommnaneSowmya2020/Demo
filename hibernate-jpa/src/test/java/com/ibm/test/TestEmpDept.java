package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.repo.EmpDeptRepo;

public class TestEmpDept {
	private static EmpDeptRepo repo;
	
	@BeforeAll
	public static void init() {
		repo = new EmpDeptRepo();
	}
	
	@Test
	public void testSaverDept() {
		Department dept = new Department();
		dept.setDeptName("Sales");
		dept.setDeptNo(20);
		repo.saveDept(dept);
	}

	@Test
	public void testSaveEmp() {
		Employee emp = new Employee();
		emp.setEmpNo(201);
		emp.setEmpName("Lili");
		emp.setSalary(3500);
		repo.saveEmp(emp, 20);
	}
	
	@Test
	public void testGetDept() {
		Department dept =repo.getDept(20);
		System.out.println("Department:" + dept.getDeptNo()+ "-" + dept.getDeptName());
		dept.getEmps();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
