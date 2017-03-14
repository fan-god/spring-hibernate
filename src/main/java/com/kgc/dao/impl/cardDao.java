package com.kgc.dao.impl;

import com.kgc.dao.IcardDao;
import com.kgc.entity.Card;
import com.kgc.entity.Problem;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 陈心航 on 2017/3/7.
 * sss
 */
public class cardDao extends BaseDao<Card,Serializable> implements IcardDao {
    private HibernateTemplate hibernateTemplate;
    private Session session;

    @Override
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Override
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

        public List<Long> cardCount() {
        session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("select count(id) from Card ");
        return query.list();
    }

    public int getTotalPages(int count, int pageSize) {
        int totalPages = (count % pageSize == 0) ? (count / pageSize) : (count / pageSize + 1);
        return totalPages;
    }

    public List<Card> limitProblem(int pageSize, int page) {
        session = hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createQuery("from Card ");
        query.setFirstResult((page - 1) * pageSize);
        query.setMaxResults(pageSize);
        return query.list();
    }


//   @SuppressWarnings("unchecked")
//    public List<Card> queryForPage(String hql, int offset, int length) {
//       session = hibernateTemplate.getSessionFactory().openSession();
//       Query q = session.createQuery(hql);
//        q.setFirstResult(offset);
//        q.setMaxResults(length);
//        return q.list();
//    }
//
//    public int getCount(String hql) {
//        session = hibernateTemplate.getSessionFactory().openSession();
//        Query q = session.createQuery("select  count (*) from Card ");
//        return Integer.parseInt(q.list().get(0).toString());
//    }
}
//