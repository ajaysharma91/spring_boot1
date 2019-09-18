package com.parashar.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.parashar.model.StudentMaster;

public interface StudentDAO extends JpaRepository<StudentMaster,Long>{

}
