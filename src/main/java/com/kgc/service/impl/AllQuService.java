package com.kgc.service.impl;

import com.kgc.dao.IAllQuDao;
import com.kgc.entity.Allqu;
import com.kgc.service.IAllQuService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/4.
 */
public class AllQuService extends BaseService<Allqu,Serializable> implements IAllQuService {
    private IAllQuDao allQuDao;

    public IAllQuDao getAllQuDao() {
        return allQuDao;
    }

    public void setAllQuDao(IAllQuDao allQuDao) {
        this.allQuDao = allQuDao;
    }

    public List<String> listAllQuByGameName(String gameName) {
        return allQuDao.listAllQuByGameName(gameName);
    }
}
