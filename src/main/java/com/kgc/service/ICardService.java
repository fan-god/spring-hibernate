package com.kgc.service;

import com.kgc.entity.Card;
import com.kgc.entity.Problem;
import com.kgc.util.PageBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 陈心航 on 2017/3/7.
 * sssss
 */
public interface ICardService extends IBaseService<Card,Serializable> {
//    public PageBean queryForPage(int pageSize, int currentPage);

//

    public List<Long> cardCount();

    List<Card> limitProblem(int pageSize, int page);

    int getTotalPages(int count, int pageSize);


}
