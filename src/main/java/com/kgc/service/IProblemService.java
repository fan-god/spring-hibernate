package com.kgc.service;

import com.kgc.entity.Problem;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/7.
 */
public interface IProblemService extends IBaseService<Problem,Serializable> {
    public List<Long> problemCount();

    List<Problem> limitProblem(int pageSize,int page);

    int getTotalPages(int count, int pageSize);

    List<Long> getQTypeCount();

    List<String> getQType();

    List<Problem> getProblemByContent(String question);
}
