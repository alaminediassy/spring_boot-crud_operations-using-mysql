package com.alamine.sprintbootdemoproject.repository;

import com.alamine.sprintbootdemoproject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
