package com.parashar.service;

import java.util.List;

import com.parashar.model.StudentMaster;

public interface StudentService {

	//for add details 
	public StudentMaster add(StudentMaster student);
	
	//find all student
	
	public List<StudentMaster> findAll();
	
	//find single student
	
	public StudentMaster findSingle(Long id);
	
	
	//update data
	
	public StudentMaster update(StudentMaster student);
	
	
	//delete record
	public void delete(Long id);
}
