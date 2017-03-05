package com.kgc.dao.impl;

import com.kgc.dao.IBaseDao;
import org.springframework.orm.hibernate4.HibernateTemplate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/2/25.
 */
public class BaseDao<Model, PrimaryKey extends Serializable> implements IBaseDao<Model, Serializable> {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public Serializable addModel(Model model) {
        return hibernateTemplate.save(model);
    }

    public void deleteModel(Model model) {
        hibernateTemplate.delete(model);
    }

    public void updateModel(Model model) {
        hibernateTemplate.update(model);
    }

    public void saveOrUpdateModel(Model model) {
        hibernateTemplate.saveOrUpdate(model);
    }

    public Model getModel(Class<Model> modelClass, Serializable pk) {
        return hibernateTemplate.get(modelClass, pk);
    }

    public List<Model> listAll(Class<Model> modelClass) {
        return hibernateTemplate.loadAll(modelClass);
    }
}
