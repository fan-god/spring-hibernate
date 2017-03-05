package com.kgc.dao;

import com.kgc.entity.Student;

import java.io.Serializable;

/**
 * Created by  王帆 on 2017/2/25.
 */
public interface IStudentDao extends IBaseDao<Student, Serializable> {
    public Student getStudentBySid(int sid);
}
