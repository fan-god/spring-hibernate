<%--
  Created by IntelliJ IDEA.
  User: 王帆
  Date: 2017/3/2
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>首页头部</title>
    <link rel="stylesheet" href="../css/homePage.css"/>
    <link rel="stylesheet" href="../css/common-top.css"/>
    <script type="text/javascript" src="../js/GameGo.js"></script>
    <script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="../js/common-top.js"></script>
</head>
<body>
<div class="one" id="one">
    <div class="one1" id="one1">
        <ul class="one1Float1">
            <li><span>您好！请</span><a href="#" title="登录" target="_blank">登录</a></li>
            <li><a href="#"><img src="../image/QQ.png" width="74" height="28" alt="QQ登录"></a></li>
            <li><a href="#">免费登录</a></li>
        </ul>

        <ul class="one1Float2" id="one1Flat2">
            <li><a href="#">官方微博</a><img src="../image/134.png" width="16" height="10"></li>
            <li><img src="../image/133.png" width="3" height="12"></li>
            <li onMouseOver="showInfo(this)" onMouseOut="hideInfo(this)"><a href="#">网址导航</a><img src="../image/134.png" width="16" height="10">
                <dl style="display:none; position:absolute; border:1px solid #CCC; width:180px; height:200px; z-index:999;" id="one1Flat2_dl1" class="one1Flat2_dl1">
                    <dt>服务类</dt>
                    <dd><a href="#">资料修改</a>&nbsp;<a href="#">网游助手</a></dd>
                    <dd><a href="#">投诉建议</a>&nbsp;<a href="#">咨询中心</a></dd>
                    <dd><a href="#">安全中心</a>&nbsp;<a href="#">推广联盟</a></dd>
                    <dd><a href="#">短信服务</a>&nbsp;<a href="#">Game助理</a></dd>
                </dl>
            </li>
            <li><img src="../image/133.png" width="3" height="12"></li>
            <li onMouseOver="showInfo(this)" onMouseOut="hideInfo(this)"><a href="#">客服中心</a><img src="../image/134.png" width="16" height="10">
                <dl style="display:none; position:absolute; border:1px solid #CCC; height:130px; width:100px;z-index: 1;" id="one1Flat2_dl2" class="one1Flat2_dl2">
                    <dt></dt>
                    <dd><a href="#">咨询中心</a></dd>
                    <dd><a href="#">安全中心</a></dd>
                    <dd><a href="#">帮助中心</a></dd>
                </dl>
            </li>
            <li><img src="../image/133.png" width="3" height="12"></li>
            <li><a href="#">我的收藏</a><img src="../image/134.png" width="16" height="10"></li>
            <li><img src="../image/133.png" width="3" height="12"></li>
            <li id="deposit"><a href="#">提现</a>
            <li><img src="../image/133.png" width="3" height="12"></li>
            <li><a href="#">我的GameGo</a><img src="../image/134.png" width="16" height="10"></li>
        </ul>
    </div>
</div>

<!--首页-->
<div class="threen" id="threen">

    <div class="threen1" id="threen1">
        <ul>
            <li><img src="../image/129.png" width="4" height="14"></li>
            <a href="#">
                <li>首页</li>
            </a>
            <li><img src="../image/129.png" width="4" height="14"></li>
            <a href="#">
                <li>账号租赁</li>
            </a>
            <li><img src="../image/129.png" width="4" height="14"></li>
            <a href="#">
                <li>积分充值</li>
            </a>
            <li><img src="../image/129.png" width="4" height="14"></li>
            <a href="#">
                <li>手游交易</li>
            </a>
            <li><img src="../image/129.png" width="4" height="14"></li>
            <a href="#">
                <li>网游交易</li>
            </a>
            <li><img src="../image/129.png" width="4" height="14"></li>
            <a href="#">
                <li>代练服务</li>
            </a>
            <li><img src="../image/129.png" width="4" height="14"></li>
            <a href="#">
                <li>美女陪玩</li>
            </a>
            <li><img src="../image/129.png" width="4" height="14"></li>
        </ul>
    </div>
</div>

<div style="border: 1px solid white;height: 150px;width: 1000px;margin: 0 auto;position: relative;">
    <img src="../image/log.png" height="150" width="330">
    <div id="dForReach1">普通搜索</div>
    <div id="dForReach2">简单搜索</div>
    <form method="post" action="" style="margin:-101px 10px;position: relative;">
        <dl type="text" style="border: 5px solid blue;width: 600px;height:40px;position: absolute;left: 300px;">
            <dd id="gameName" onclick="block(0)">游戏名称<img src="../image/reachSanJiao.png"/></dd>
            <div id="showGameName" name="game-index">
                <div class="close"><img src="../image/X.png"/></div>
                <dl class="gameType">
                    <dd onclick="show(0)" name="css-index">全部</dd>
                    <dd onclick="show(1)" name="css-index" class="type">网络游戏</dd>
                    <dd onclick="show(2)" name="css-index" class="type">网页游戏</dd>
                    <dd onclick="show(3)" name="css-index" class="type">手机游戏</dd>
                    <dd onclick="show(4)" name="css-index" class="type">棋牌游戏</dd>
                    <dd onclick="show(5)" name="css-index" class="type">充值和其他</dd>
                </dl>
                <div class="gameTypeDiv">
                    <ul>
                        <li><div class="reMen" style="width: 100px;">热门游戏</div></li>
                        <li><div>A</div></li>
                        <li><div>B</div></li>
                        <li><div>C</div></li>
                        <li><div>D</div></li>
                        <li><div>E</div></li>
                        <li><div>F</div></li>
                        <li><div>G</div></li>
                        <li><div>H</div></li>
                        <li><div>I</div></li>
                        <li><div>J</div></li>
                        <li><div>K</div></li>
                        <li><div>L</div></li>
                        <li><div>M</div></li>
                        <li><div>N</div></li>
                        <li><div>O</div></li>
                        <li><div>P</div></li>
                        <li><div>Q</div></li>
                        <li><div>R</div></li>
                        <li><div>S</div></li>
                        <li><div>T</div></li>
                        <li><div>U</div></li>
                        <li><div>V</div></li>
                        <li><div>W</div></li>
                        <li><div>X</div></li>
                        <li><div>Y</div></li>
                        <li><div>Z</div></li>
                    </ul>
                    <p style="clear: both;"></p>
                    <div class="showGameInfo"><ul></ul></div>
                </div>
            </div>
            <dd id="quName"  onclick="block(1)">游戏区<img src="../image/reachSanJiao.png"/></dd>
            <div id="showQuName" name="game-index">
                <div class="close"><img src="../image/X.png"/></div>
                <div class="showQu"><ul></ul></div>
            </div>
            <dd id="serverName" onclick="block(2)">游戏服务器<img src="../image/reachSanJiao.png"/></dd>
            <div id="showServerName" name="game-index">
                <div class="close"><img src="../image/X.png"/></div>
                <div class="showServer"><ul></ul></div>
            </div>
            <dd id="last" onclick="block(3)">全部分类<img src="../image/reachSanJiao.png"/></dd>
            <div id="showLast" name="game-index">
                <div class="close"><img src="../image/X.png"/></div>
                <ul>
                    <li>帐号租赁</li>
                    <li>游戏代练</li>
                    <li>点卡</li>
                    <li>账号交易</li>
                    <li>直充点券</li>
                    <li>激活码</li>
                    <li>装备交易</li>
                    <li>其他</li>
                </ul>
            </div>
            <dd><input value="请输入任意关键字" id="reach1"/></dd>
        </dl>
        <input type="text" value="关键字查找游戏、搜区服、寻商品" id="reach2"/>
        <input type="image" src="../image/reach.png" style="float: right;margin: 5px -15px;"/>
    </form>
</div>
<!--头部整体结束-->
</body>
</html>
