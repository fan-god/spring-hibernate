package com.kgc.service.impl;

import com.kgc.dao.IcardDao;
import com.kgc.entity.Card;
import com.kgc.service.ICardService;
import com.kgc.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 陈心航 on 2017/3/7.
 * ss
 */
public class cardService extends BaseService<Card,Serializable> implements ICardService {

    private IcardDao cardDao;

    public IcardDao getCardDao() {
        return cardDao;
    }

    public void setCardDao(IcardDao cardDao) {
        this.cardDao = cardDao;
    }



    public List<Long> cardCount() {
        return cardDao.cardCount();
    }

    public List<Card> limitProblem(int pageSize, int page) {
        return cardDao.limitProblem(pageSize,page);
    }
//
    public int getTotalPages(int count, int pageSize) {
        return cardDao.getTotalPages(count,pageSize);
    }

//    public PageBean queryForPage(int pageSize, int page) {
//        String hql="select count(id) from Card";
//        int count=cardDao.getCount(hql);      // 总记录数
//        int totalPage=PageBean.countTotalPage(pageSize,count);// 总页数
//        int offset=PageBean.countOffset(pageSize,page);     // 当前页开始记录
//        int length=pageSize;// 每页记录数
//        int currentPage=PageBean.countCurrentPage(page);
//        List<Card> list=cardDao.queryForPage("from Card",offset,length);// 该分页的记录
//        // 把分页信息保存到Bean中
//        PageBean pageBean=new PageBean();
//        pageBean.setPageSize(pageSize);
//        pageBean.setCurrentPage(currentPage);
//        pageBean.setAllRow(count);
//        pageBean.setTotalPage(totalPage);
//        pageBean.setList(list);
//        pageBean.init();
//        return pageBean;
//    }
}
