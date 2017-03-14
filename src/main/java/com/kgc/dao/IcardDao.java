package com.kgc.dao;

import com.kgc.entity.Card;
import com.kgc.entity.Problem;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 陈心航 on 2017/3/6.
 * ss
 */
public interface IcardDao extends IBaseDao<Card,Serializable> {



    public List<Long> cardCount();

    List<Card> limitProblem(int pageSize, int page);

    //   获得页数
    int getTotalPages(int count, int pageSize);
}
