package com.alamine.sprintbootdemoproject.service;

import com.alamine.sprintbootdemoproject.entity.Department;

import java.util.List;

public interface DepartmentService {

    // Save operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department, Long departmentId);

    // Delete operation
    void deleteDepartment(Long department);

}
