package com.kgc.test;

import com.kgc.entity.Allgames;
import com.kgc.entity.Allqu;
import com.kgc.service.IAllGamesService;
import com.kgc.service.IAllQuService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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

    public void setAllQuService(IAllQuService allQuService) {
        this.allQuService = allQuService;
    }

    public void setAllGamesService(IAllGamesService allGamesService) {
        this.allGamesService = allGamesService;
    }


    @org.junit.Test
    public void test1() {
        List<Allgames> allGamesList = allGamesService.listAll(Allgames.class);
        for (Allgames games:allGamesList) {
            System.out.println(games.getCname());
        }
    }

    @org.junit.Test
    public void test2() {
        List<Allgames> allGamesList = allGamesService.listByInitial("A");
        for (Allgames games:allGamesList) {
            System.out.println(games);
        }
    }

    @org.junit.Test
    public void test3() {
        List<Allgames> allGamesList = allGamesService.listByHot("S");
        for (Allgames games : allGamesList) {
            System.out.println(games.getCname());
        }
    }

    @org.junit.Test
    public void test4() {
        List<Allgames> allGamesList = allGamesService.listByType("网络游戏");
        for (Allgames games : allGamesList) {
            System.out.println(games.getCname());
        }
    }

    @org.junit.Test
    public void test5() {
        List<String> allqus = allQuService.listAllQuByGameName("暗黑破坏神");
        for (String allqu:allqus) {
            System.out.println(allqu);
        }
    }

}
