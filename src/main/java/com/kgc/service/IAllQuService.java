package com.kgc.service;

import com.kgc.entity.Allqu;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/4.
 */
public interface IAllQuService extends IBaseService<Allqu,Serializable> {
    public List<String> listAllQuByGameName(String gameName);
}
