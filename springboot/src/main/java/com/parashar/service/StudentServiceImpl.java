package com.parashar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parashar.dao.StudentDAO;
import com.parashar.model.StudentMaster;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public StudentMaster add(StudentMaster student) {
		// TODO Auto-generated method stub
		return  studentDAO.save(student);
		
	}

	@Override
	public List<StudentMaster> findAll() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

	@Override
	public StudentMaster findSingle(Long id) {
		// TODO Auto-generated method stub
		return studentDAO.findOne(id);
	}

	@Override
	public StudentMaster update(StudentMaster student) {
		// TODO Auto-generated method stub
		return studentDAO.saveAndFlush(student);
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		studentDAO.delete(id);
		
	}

}
