package com.kgc.controller;

import com.kgc.entity.Card;
import com.kgc.entity.Problem;
import com.kgc.service.ICardService;
import com.kgc.service.IProblemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by 陈心航 on 2017/3/7.
 */
public class CardAction extends ActionSupport {
    private Card card;
    @Autowired
    private ICardService cardService;
    @Autowired
    private IProblemService problemService;
    private  int pageIndex;
    private Map<String, Object> request;
    private Map<String, Integer> request2;
    private ActionContext actionContext;


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public ICardService getCardService() {
        return cardService;
    }

    public void setCardService(ICardService cardService) {
        this.cardService = cardService;
    }
    {
        actionContext = ActionContext.getContext();
        request = (Map<String, Object>) actionContext.get("request");
        request2 = (Map<String, Integer>) actionContext.get("request");
    }
    @Override
    public String execute() throws Exception {
        List<Problem> problems = problemService.listAll(Problem.class);
        request.put("proList", problems);
//        System.out.println("进入这个方法");
//        List<Card> cards = cardService.listAll(Card.class);
//        HttpServletRequest request = ServletActionContext.getRequest();
//        request.setAttribute("card1",cards);
        return SUCCESS;
    }

    public String toCard(){
        HttpServletRequest req=ServletActionContext.getRequest();
        if(req.getParameter("pageIndex")==null){
            pageIndex=1;
        }else {
            pageIndex= Integer.parseInt(req.getParameter("pageIndex"));
        }
        //获得所有的条数
        List<Long> integers=cardService.cardCount();
        request.put("iList",integers);
       //分页
        List<Card> cardList=cardService.limitProblem(9,pageIndex);
        request2.put("totalPages",cardService.getTotalPages(Integer.parseInt(integers.get(0).toString()),9));
        request2.put("pageIndex",pageIndex);
        request.put("cardList",cardList);

        return SUCCESS;
    }

    public String goProblemContent() {
        HttpServletRequest req = ServletActionContext.getRequest();
        List<Problem> problems = problemService.getProblemByContent(req.getParameter("question"));
        request.put("problems", problems);
        return SUCCESS;
    }
}
