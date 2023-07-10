package com.alamine.sprintbootdemoproject.controller;

import com.alamine.sprintbootdemoproject.entity.Department;
import com.alamine.sprintbootdemoproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // Save operation
    @PostMapping("/departments")
    public Department saveDepartment(
            @Validated @RequestBody
            Department department) {
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(
            @RequestBody Department department,
            @PathVariable("id") Long departmentId) {
        return departmentService.updateDepartment(department, departmentId);
    }

    // Delete operation

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
            Long departmentId)
    {
        departmentService.deleteDepartment(departmentId);
        return "Deleted successfully";
    }
}
