package com.app.neeraj.department.repository;

import com.app.neeraj.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findByDepartId(Integer departId);
}
