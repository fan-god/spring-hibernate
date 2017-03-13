package com.kgc.dao;

import java.io.Serializable;
import java.util.List;

import com.kgc.entity.Allserver;

/**
 * Created by  王帆 on 2017/3/6.
 */
public interface IAllServerDao extends IBaseDao<Allserver, Serializable> {
    public List<String> getServerByQu(String qu);
}
