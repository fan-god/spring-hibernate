package com.kgc.dao;

import com.kgc.entity.Allgames;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/2.
 */
public interface IAllGamesDao extends IBaseDao<Allgames,Serializable> {

    public List<Allgames> listByInitial(String firstWord);

    public List<Allgames> listByHot(String is);

    public List<Allgames> listByType(String type);
}
