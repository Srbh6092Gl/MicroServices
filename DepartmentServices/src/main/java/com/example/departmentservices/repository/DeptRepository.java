package com.example.departmentservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.departmentservices.entity.DepartmentEntity;

public interface DeptRepository extends JpaRepository<DepartmentEntity, Long>{

}