package com.kgc.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/2/25.
 */
public interface IBaseService<Model,PrimaryKey extends Serializable> {
    public Serializable addModel(Model model);

    public void deleteModel(Model model);

    public void updateModel(Model model);

    public void saveOrUpdateModel(Model model);

    public Model getModel(Class<Model> modelClass, PrimaryKey pk);

    public List<Model> listAll(Class<Model> modelClass);
}