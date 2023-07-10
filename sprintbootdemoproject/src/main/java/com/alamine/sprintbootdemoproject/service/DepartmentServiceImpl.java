package com.alamine.sprintbootdemoproject.service;

import com.alamine.sprintbootdemoproject.entity.Department;
import com.alamine.sprintbootdemoproject.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    // Save operation
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Read operation
    @Override
    public List<Department> fetchDepartmentList() {
        return (List<Department>) departmentRepository.findAll();
    }

    // Update operation
    @Override
    public Department updateDepartment(Department department, Long departmentId) {
        Department depDB = departmentRepository.findById(departmentId).get();
        if (Objects.nonNull(department.getDepartmentName()) && !"".equals(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentAddress()) && !"".equals(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }

        if (Objects.nonNull(department.getDepartmentCode()) && !"".equals(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }

        return departmentRepository.save(depDB);
    }


    // Delete operation
    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
