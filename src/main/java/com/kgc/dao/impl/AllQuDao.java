package com.kgc.dao.impl;

import com.kgc.dao.IAllQuDao;
import com.kgc.entity.Allqu;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/4.
 */
public class AllQuDao extends BaseDao<Allqu,Serializable> implements IAllQuDao{
    private HibernateTemplate hibernateTemplate;

    @Override
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Override
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    public List<String> listAllQuByGameName(String gameName) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT q.name FROM Allgames AS g,Allqu AS q WHERE g.id=q.gid AND g.cname=?");
        query.setParameter(0,gameName);
        return query.list();
    }
}
