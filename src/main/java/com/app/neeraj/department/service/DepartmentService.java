package com.app.neeraj.department.service;

import com.app.neeraj.department.entity.Department;
import com.app.neeraj.department.exception.DepartmentNotFoundException;
import com.app.neeraj.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Integer departId) {
        log.info("Inside findDepartmentById method of DepartmentService");
        Department department  = departmentRepository.findByDepartId(departId);
        if(department != null){
            return department;
        } else {
            log.info("Department with id : "+departId+" not found !");
            throw new DepartmentNotFoundException("Department with id : "+departId+" not found !");
        }
    }
}
