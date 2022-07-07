package com.app.neeraj.department.exception;

public class DepartmentNotFoundException extends RuntimeException{

    private String msg;

    public DepartmentNotFoundException(String msg){
        super(msg);
        this.msg=msg;
    }
}
