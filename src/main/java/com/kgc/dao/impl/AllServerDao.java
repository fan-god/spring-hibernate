package com.kgc.dao.impl;

import com.kgc.dao.IAllServerDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;
import java.util.List;
import com.kgc.entity.Allserver;
/**
 * Created by  王帆 on 2017/3/6.
 */
public class AllServerDao extends BaseDao<Allserver,Serializable> implements IAllServerDao{
    private HibernateTemplate hibernateTemplate;

    @Override
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
    public List<String> getServerByQu(String qu) {
        Session session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("SELECT distinct s.name FROM Allqu q,Allserver s WHERE q.qid=s.sid and q.name=?");
        query.setParameter(0,qu);
        return query.list();
    }
}
