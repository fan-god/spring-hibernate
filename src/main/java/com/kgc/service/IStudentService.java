package com.kgc.service;

import com.kgc.entity.Student;

import java.io.Serializable;

/**
 * Created by  王帆 on 2017/2/25.
 */
public interface IStudentService extends IBaseService<Student,Serializable> {
    public Student getStudentBySid(int sid);
}
