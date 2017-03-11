package com.kgc.service.impl;

import com.kgc.dao.IAllServerDao;
import com.kgc.service.IAllServerService;

import java.io.Serializable;
import java.util.List;
import com.kgc.entity.Allserver;
/**
 * Created by  王帆 on 2017/3/6.
 */
public class AllServerService extends BaseService<Allserver,Serializable> implements IAllServerService{
    private IAllServerDao allServerDao;

    public IAllServerDao getAllServerDao() {
        return allServerDao;
    }

    public void setAllServerDao(IAllServerDao allServerDao) {
        this.allServerDao = allServerDao;
    }

    public List<String> getServerByQu(String qu) {
        return allServerDao.getServerByQu(qu);
    }
}
