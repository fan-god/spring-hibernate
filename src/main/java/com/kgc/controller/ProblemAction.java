package com.kgc.controller;

import com.kgc.entity.Problem;
import com.kgc.service.IProblemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.security.PublicKey;
import java.util.List;
import java.util.Map;

/**
 * Created by  王帆 on 2017/3/7.
 */
public class ProblemAction extends ActionSupport {
    @Autowired
    private IProblemService problemService;
    private ActionContext actionContext;
    private Map<String, Object> request;
    private Map<String, Integer> request2;
    private int pageIndex;
    private HttpServletRequest req;
    public void setProblemService(IProblemService problemService) {
        this.problemService = problemService;
    }


    {
        actionContext = ActionContext.getContext();
        request= (Map<String, Object>) actionContext.get("request");
        request2= (Map<String, Integer>) actionContext.get("request");
    }

    //获得所有的提问详情
    @Override
    public String execute() throws Exception {
        List<Problem> problems = problemService.listAll(Problem.class);
        request.put("proList", problems);
        return SUCCESS;
    }

    //实现分页
    public String toProblemAndAnswer() throws Exception {
        req = ServletActionContext.getRequest();
        if(req.getParameter("pageIndex")==null){
            pageIndex=1;
        }else{
            pageIndex = Integer.parseInt(req.getParameter("pageIndex"));
        }
        /*获得所有提问条数*/
        List<Long> integers = problemService.problemCount();
        request.put("iList", integers);

//        获得提问所有类型
//        List<String> qTypes = problemService.getQType();
//        request.put("qTypes",qTypes);

//        获得提问每个类型的个数
//        List<Long> qTypeCounts = problemService.getQTypeCount();
//        request.put("qTypeCounts",qTypeCounts);

        /*分页*/
        List<Problem> problems = problemService.limitProblem(8, pageIndex);
        request2.put("totalPages",problemService.getTotalPages(Integer.parseInt(integers.get(0).toString()),8));
        request2.put("pageIndex",pageIndex);
        request.put("proList",problems);

        return SUCCESS;
    }

    public String goProblemContent(){
        req = ServletActionContext.getRequest();
        List<Problem> problems = problemService.getProblemByContent(req.getParameter("question"));
        request.put("problems",problems);
        return SUCCESS;
    }
}
