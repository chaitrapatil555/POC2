package com.neosoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
