package com.kgc.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Created by 王帆 on 2017/2/13.
 */
public class HibernateSessionFactory {
    private static Configuration cfg;
    private static ServiceRegistry sr;
    private static SessionFactory sf;
    private static ThreadLocal<?> threadLocal = new ThreadLocal<Session>();

    static {
        cfg = new Configuration().configure();
        sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        sf = cfg.buildSessionFactory(sr);
    }

    public static Session getSession(){
        Session session = (Session)threadLocal.get();
        if(session==null){
            session = sf.openSession();
        }
        return session;
    }

    public static void closeSession(){
        Session session = (Session)threadLocal.get();
        if(session!=null){
            sf.close();
        }
    }
}
