package com.kgc.service.impl;

import com.kgc.dao.IStudentDao;
import com.kgc.entity.Student;
import com.kgc.service.IStudentService;

import java.io.Serializable;

/**
 * Created by  王帆 on 2017/2/25.
 */
public class StudentService extends BaseService<Student,Serializable> implements IStudentService {
    private IStudentDao studentDao;

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Student getStudentBySid(int sid) {
        return studentDao.getStudentBySid(sid);
    }
}
