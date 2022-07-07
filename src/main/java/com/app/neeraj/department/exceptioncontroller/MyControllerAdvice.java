package com.app.neeraj.department.exceptioncontroller;

import com.app.neeraj.department.exception.DepartmentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<String> handlerDepartmentNotFound(DepartmentNotFoundException departmentNotFoundException){
        return new ResponseEntity<String>(departmentNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<String> handlerException(Exception exception){
        return new ResponseEntity<String>("Something went wrong!", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
