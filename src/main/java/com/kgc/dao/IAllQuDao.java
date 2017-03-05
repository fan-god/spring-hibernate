package com.kgc.dao;

import com.kgc.entity.Allqu;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/4.
 */
public interface IAllQuDao extends IBaseDao<Allqu,Serializable> {
    public List<String> listAllQuByGameName(String gameName);
}
