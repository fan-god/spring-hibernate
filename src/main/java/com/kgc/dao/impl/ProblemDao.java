package com.kgc.dao.impl;

import com.kgc.dao.IProblemDao;
import com.kgc.entity.Problem;
import com.kgc.util.PageSupport;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/7.
 */
public class ProblemDao extends BaseDao<Problem, Serializable> implements IProblemDao {
    private HibernateTemplate hibernateTemplate;
    private Session session;

    @Override
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    //获得所有条数
    public List<Long> problemCount() {
        session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("select count(id) from Problem ");
        return query.list();
    }

    //获得要分的页数
    public int getTotalPages(int count, int pageSize) {
        int totalPages = (count % pageSize == 0) ? (count / pageSize) : (count / pageSize + 1);
        return totalPages;
    }

    //获得所有类型的条数
    public List<Long> getQTypeCount() {
        session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT COUNT(qType) FROM Problem GROUP BY qType");
        return query.list();
    }
    //获得所有类型
    public List<String> getQType() {
        session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT qType FROM Problem GROUP BY qType");
        return query.list();
    }

    //根据问题获得问题详情
    public List<Problem> getProblemByContent(String question) {
        session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Problem WHERE question=?");
        query.setParameter(0,question);
        return query.list();
    }

    //分页
    public List<Problem> limitProblem(int pageSize, int page) {
        session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("from Problem ");
        query.setFirstResult((page - 1) * pageSize);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
