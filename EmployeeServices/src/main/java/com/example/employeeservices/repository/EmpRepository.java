package com.example.employeeservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeservices.entity.EmployeeEntity;

public interface EmpRepository extends JpaRepository<EmployeeEntity, Long> {
}