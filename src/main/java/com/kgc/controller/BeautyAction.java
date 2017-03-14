package com.kgc.controller;

import com.kgc.entity.Beauty;
import com.kgc.service.IBeautyService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 陈心航 on 2017/3/13.
 */
public class BeautyAction extends ActionSupport {
    private Beauty beauty;
    @Autowired
    private IBeautyService beautyService;

    public Beauty getBeauty() {
        return beauty;
    }

    public void setBeauty(Beauty beauty) {
        this.beauty = beauty;
    }

    public IBeautyService getBeautyService() {
        return beautyService;
    }

    public void setBeautyService(IBeautyService beautyService) {
        this.beautyService = beautyService;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("进入这个方法");
        List<Beauty> beautyList=beautyService.listAll(Beauty.class);
        HttpServletRequest request= ServletActionContext.getRequest();
        request.setAttribute("beauty",beautyList);
        return SUCCESS;
    }
}
