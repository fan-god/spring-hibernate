package com.kgc.service.impl;

import com.kgc.dao.IAllGamesDao;
import com.kgc.entity.Allgames;
import com.kgc.service.IAllGamesService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/2.
 */
public class AllGamesService extends BaseService<Allgames,Serializable> implements IAllGamesService{
    private IAllGamesDao allGamesDao;

    public IAllGamesDao getAllGamesDao() {
        return allGamesDao;
    }

    public void setAllGamesDao(IAllGamesDao allGamesDao) {
        this.allGamesDao = allGamesDao;
    }

    public List<Allgames> listByInitial(String firstWord) {
        return allGamesDao.listByInitial(firstWord);
    }

    public List<Allgames> listByHot(String is) {
        return allGamesDao.listByHot(is);
    }

    public List<Allgames> listByType(String type) {
        return allGamesDao.listByType(type);
    }


}
