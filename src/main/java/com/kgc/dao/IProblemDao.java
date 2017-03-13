package com.kgc.dao;

import com.kgc.entity.Problem;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/7.
 */
public interface IProblemDao extends IBaseDao<Problem,Serializable> {
    public List<Long> problemCount();

    List<Problem> limitProblem(int pageSize,int page);

//   获得页数
    int getTotalPages(int count, int pageSize);

    List<Long> getQTypeCount();

    List<String> getQType();

    List<Problem> getProblemByContent(String question);
}
