package com.kgc.dao.impl;

import com.kgc.dao.IAllGamesDao;
import com.kgc.entity.Allgames;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/2.
 */
public class AllGamesDao extends BaseDao<Allgames,Serializable> implements IAllGamesDao {
    private HibernateTemplate hibernateTemplate;

    @Override
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Override
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    public List<Allgames> listByInitial(String firstWord) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("from Allgames where initial = ?");
        query.setParameter(0,firstWord);
        return query.list();
    }

    public List<Allgames> listByHot(String is) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("from Allgames where isHot = ?");
        query.setParameter(0,is);
        return query.list();
    }

    public List<Allgames> listByType(String type) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("from Allgames where type = ?");
        query.setParameter(0,type);
        return query.list();
    }

}
