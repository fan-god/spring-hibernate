package com.kgc.dao;

import com.kgc.entity.Card;
import com.kgc.entity.Problem;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 陈心航 on 2017/3/6.
 */
public interface IcardDao extends IBaseDao<Card,Serializable> {
//    //分页查询
//     List<Card> queryForPage(String hql, int offset, int length);
//    //总记录条数
//     int getCount(String hql);



    public List<Long> cardCount();

    List<Card> limitProblem(int pageSize, int page);

    //   获得页数
    int getTotalPages(int count, int pageSize);
}
