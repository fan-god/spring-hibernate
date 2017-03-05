package com.kgc.dao.impl;

import com.kgc.dao.IStudentDao;
import com.kgc.entity.Student;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;

/**
 * Created by  王帆 on 2017/2/25.
 */
public class StudentDao extends BaseDao<Student, Serializable> implements IStudentDao {
    private HibernateTemplate hibernateTemplate;

    @Override
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Override
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public Student getStudentBySid(int sid) {
        return hibernateTemplate.get(Student.class,sid);
    }
}
