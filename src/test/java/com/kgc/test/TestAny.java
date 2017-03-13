package com.kgc.test;

import com.kgc.entity.Allgames;
import com.kgc.entity.Card;
import com.kgc.entity.Problem;
import com.kgc.service.*;
import com.kgc.service.impl.cardService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by  王帆 on 2017/2/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
public class TestAny {
    @Autowired
    private IAllGamesService allGamesService;
    @Autowired
    private IAllQuService allQuService;
    @Autowired
    private IAllServerService allServerService;
    @Autowired
    private IProblemService problemService;

    @Autowired
    private ICardService cardService;

    public void setCardService(ICardService cardService) {
        this.cardService = cardService;
    }

    public void setAllServerService(IAllServerService allServerService) {
        this.allServerService = allServerService;
    }

    public void setAllQuService(IAllQuService allQuService) {
        this.allQuService = allQuService;
    }

    public void setAllGamesService(IAllGamesService allGamesService) {
        this.allGamesService = allGamesService;
    }

    public void setProblemService(IProblemService problemService) {
        this.problemService = problemService;
    }

    @Test
    public void test1() {
        List<Allgames> allGamesList = allGamesService.listAll(Allgames.class);
        for (Allgames games:allGamesList) {
            System.out.println(games.getCname());
        }
    }

    @Test
    public void test2() {
        List<Allgames> allGamesList = allGamesService.listByInitial("A");
        for (Allgames games:allGamesList) {
            System.out.println(games);
        }
    }

    @Test
    public void test3() {
        List<Allgames> allGamesList = allGamesService.listByHot("S");
        for (Allgames games : allGamesList) {
            System.out.println(games.getCname());
        }
    }

    @Test
    public void test4() {
        List<Allgames> allGamesList = allGamesService.listByType("网络游戏");
        for (Allgames games : allGamesList) {
            System.out.println(games.getCname());
        }
    }

    @Test
    public void test5() {
        List<String> allqus = allQuService.listAllQuByGameName("暗黑破坏神");
        for (String allqu:allqus) {
            System.out.println(allqu);
        }
    }

    @Test
    public void test6() {
        List<String> allservers = allServerService.getServerByQu("电信");
        for (String servers:allservers) {
            System.out.println(servers);
        }

    }
    //测试提问表
    /*获得问题条数*/
    @Test
    public void test7() {
        List<Long> i = problemService.problemCount();
        List<Problem> problems = problemService.limitProblem(8, 3);
        for (Problem problem:problems) {
            System.out.println(problem.getId()+"-----"+problem.getQuestion());
        }
    }
    @Test
    public void test10(){
        List<Long> i=cardService.cardCount();
        List<Card> cardList=cardService.limitProblem(3,2);
        for (Card card:cardList) {
            System.out.println(card.getId()+"--"+card.getPname());
        }
    }

    //读取数据表card
    @Test
    public void test8(){
        List<Card> cardList= cardService.listAll(Card.class);
        System.out.println(cardList.toString());
        for (Card card:cardList) {
            System.out.println(card.getId());
        }
    }

}
