package com.kgc.service;

import com.kgc.entity.Allserver;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/6.
 */
public interface IAllServerService extends IBaseService<Allserver,Serializable> {
    public List<String> getServerByQu(String qu);
}
