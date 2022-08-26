package com.example.departmentservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentservices.entity.DepartmentEntity;
import com.example.departmentservices.repository.DeptRepository;

@RestController
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	DeptRepository deptRepo;
	
	@GetMapping
	public List<DepartmentEntity> getAll(){
		return deptRepo.findAll();
	}
	
	@PostMapping
	public DepartmentEntity add(@RequestBody DepartmentEntity department) {
		return deptRepo.save(department);
	}
	
}