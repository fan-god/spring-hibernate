package com.kgc.controller;

import com.kgc.entity.Student;
import com.kgc.service.IStudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by  王帆 on 2017/2/25.
 */
public class StudentActionJson extends ActionSupport {
    private int sid;
    private IStudentService studentService;
    private Student student;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public IStudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(IStudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String execute() throws Exception {
        student = studentService.getStudentBySid(sid);
        System.out.println(student.toString());
        return SUCCESS;
    }
}
