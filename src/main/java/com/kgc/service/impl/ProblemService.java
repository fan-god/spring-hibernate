package com.kgc.service.impl;

import com.kgc.dao.IProblemDao;
import com.kgc.entity.Problem;
import com.kgc.service.IProblemService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/7.
 */
public class ProblemService extends BaseService<Problem, Serializable> implements IProblemService {
    private IProblemDao problemDao;

    public IProblemDao getProblemDao() {
        return problemDao;
    }

    public void setProblemDao(IProblemDao problemDao) {
        this.problemDao = problemDao;
    }

    public List<Long> problemCount() {
        return problemDao.problemCount();
    }

    public List<Problem> limitProblem( int pageSize, int page) {
        return problemDao.limitProblem(pageSize,page);
    }

    public int getTotalPages(int count, int pageSize) {
        return problemDao.getTotalPages(count,pageSize);
    }

    public List<Long> getQTypeCount() {
        return problemDao.getQTypeCount();
    }

    public List<String> getQType() {
        return problemDao.getQType();
    }

    public List<Problem> getProblemByContent(String question) {
        return problemDao.getProblemByContent(question);
    }
}
