package com.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.model.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
 
}
