package com.kgc.controller;

import com.kgc.entity.Allgames;
import com.kgc.service.IAllGamesService;
import com.kgc.service.IAllQuService;
import com.kgc.service.IAllServerService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by  王帆 on 2017/3/2.
 */
public class GameAction extends ActionSupport {
    @Autowired
    private IAllGamesService allGamesService;
    @Autowired
    private IAllQuService allQuService;
    @Autowired
    private IAllServerService allServerService;
    //响应给ajax的结果
    private String result;
    private List<String> list = new ArrayList<String>();
    private HttpServletRequest request;
////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setAllQuService(IAllQuService allQuService) {
        this.allQuService = allQuService;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setAllGamesService(IAllGamesService allGamesService) {
        this.allGamesService = allGamesService;
    }

    public void setAllServerService(IAllServerService allServerService) {
        this.allServerService = allServerService;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String execute() throws Exception {
        request = ServletActionContext.getRequest();
        if(request.getParameter("value").equals("OK")){
            List<Allgames> allgames = allGamesService.listAll(Allgames.class);
            JSONArray jsonArray = JSONArray.fromObject(allgames);
            result = jsonArray.toString();
        }
        return SUCCESS;
    }

    public String getGameByFirstWord() throws IOException {
        request = ServletActionContext.getRequest();
        List<Allgames> allgames = allGamesService.listByInitial(request.getParameter("value"));
        for (Allgames games : allgames) {
            list.add(games.getCname());
        }

        JSONArray jsonArray = JSONArray.fromObject(list);
        System.out.println(jsonArray.toString());
        result = jsonArray.toString();
        return SUCCESS;
    }

    public String getGameNameByIsHot(){
        request = ServletActionContext.getRequest();
        System.out.println(request.getParameter("value"));
        if(request.getParameter("value").equals("热门游戏")){
            List<Allgames> allgames = allGamesService.listByHot("S");
            JSONArray jsonArray = JSONArray.fromObject(allgames);
            result = jsonArray.toString();
            System.out.println(result);
        }
        return SUCCESS;
    }

    public String listByType() throws IOException {
        request = ServletActionContext.getRequest();
        List<Allgames> allgames = allGamesService.listByType(request.getParameter("value"));
        System.out.println(allgames.toString());
        JSONArray jsonArray = JSONArray.fromObject(allgames);
        result = jsonArray.toString();
        return SUCCESS;
    }

    public String listAllQuByGameName() throws IOException {
        request = ServletActionContext.getRequest();
        List<String> quList = allQuService.listAllQuByGameName(request.getParameter("value"));
        System.out.println(quList.toString());
        JSONArray jsonArray = JSONArray.fromObject(quList);
        result = jsonArray.toString();
        return SUCCESS;
    }

    public String getServerByQu() throws IOException {
        request = ServletActionContext.getRequest();
        List<String> serverList = allServerService.getServerByQu(request.getParameter("value"));
        System.out.println("服务器"+serverList.toString());
        JSONArray jsonArray = JSONArray.fromObject(serverList);
        result = jsonArray.toString();
        return SUCCESS;
    }
}
