package com.kgc.service.impl;

import com.kgc.dao.IBaseDao;
import com.kgc.service.IBaseService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/2/25.
 */
public class BaseService<Model, PrimaryKey extends Serializable> implements IBaseService<Model, Serializable> {
    private IBaseDao baseDao;

    public IBaseDao getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(IBaseDao baseDao) {
        this.baseDao = baseDao;
    }

    public Serializable addModel(Model model) {

        return baseDao.addModel(model);
    }

    public void deleteModel(Model model) {
        baseDao.deleteModel(model);
    }

    public void updateModel(Model model) {
        baseDao.updateModel(model);
    }

    public void saveOrUpdateModel(Model model) {
        baseDao.saveOrUpdateModel(model);
    }

    public Model getModel(Class<Model> modelClass, Serializable pk) {
        return (Model) baseDao.getModel(modelClass, pk);
    }

    public List<Model> listAll(Class<Model> modelClass) {
        return baseDao.listAll(modelClass);
    }
}
