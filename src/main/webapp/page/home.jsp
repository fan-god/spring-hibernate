<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: 王帆
  Date: 2017/3/4
  Time: 12:46
  To change this template use File | Settings | File Templates.
  ss
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <title>首页</title>
</head>
<link rel="stylesheet" href="../css/home.css">
<link rel="stylesheet" href="../css/card.css">
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../js/home.js"></script>
<body>
<a class="z-a" href="tencent://message/?uin=1129984165&Site=450167645&Menu=yes">
    <img border="0" src="http://wpa.qq.com/pa?p=2:1129984165:4">
</a>
<jsp:include page="../common/common-top.jsp"></jsp:include>
<!-- 轮播图   中间部分-->
<div class="all-control">
    <div class="all-control">
        <div id="content" onclick="changeImg()">

            <div class="scroll_mid">
                <ul id="scroll_img">
                    <li><img src="../image/1.png"/></li>
                    <li><img src="../image/2.png"/></li>
                    <li><img src="../image/3.png"/></li>
                    <li><img src="../image/4.png"/></li>
                    <li><img src="../image/5.png"/></li>

                </ul>
                <ul id="scroll_number">
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>

            <%--点卡区--%>
            <span style="font-size: 30px;font-weight: bold">5173点卡</span>
            <div class="Card_all">
                <div>
                    <img src="../image/card_left.png"/>
                </div>
                <div class="inner_tab_box " id="cardInnerTab1" >
                    <ul class="goods_list">
                        <c:forEach items="${requestScope.cardList}" var="card">
                            <li>
                                <p class="img_box"><a  href="" onclick=""><img width="110" height="70" src="../pic/${card.pic}" ></a></p>
                                <p><a title="永恒之塔100元"  href="" onclick="">${card.pname}</a></p>
                                <p><span class="price">￥<b>${card.price}</b></span></p>
                                <p><a class="buy_btn" href="" onclick="">立即购买</a></p>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            <ul class="lunbo">
                <li>共${requestScope.iList[0]}条记录&nbsp;&nbsp;${requestScope.pageIndex}/${requestScope.totalPages}页</li>
                <li>
                     <c:if test="${requestScope.pageIndex>1}">
                        <a href="<%=basePath%>home/card?pageIndex=1">首页</a>
                        <a href="<%=basePath%>home/card?pageIndex=${requestScope.pageIndex-1}">上一页</a>
                     </c:if>
                     <c:if test="${requestScope.pageIndex<requestScope.totalPages}">
                        <a href="<%=basePath%>home/card?pageIndex=${requestScope.pageIndex+1}">下一页</a>
                        <a href="<%=basePath%>home/card?pageIndex=${requestScope.totalPages}">最后一页</a>
                     </c:if>
                </li>
            </ul>

        </div>


        <!------------------------------------------------右边上部--------------------------------------------------------------->
        <div class="book_new123">
            <div class="buy"><a href="#"> <img src="../image/woyaomai1.png" height="38" width="135"></a></div>
            <div class="sell"><a href="#"> <img src="../image/woyaomai2.png" width="135" height="38"></a></div>

            <div id="bookTab" class="book_sort">
                <div class="book_new">
                    <div class="book_type" id="history">游戏币</div>
                    <div class="book_type" id="family">QQ</div>
                    <div class="book_type" id="culture">点卡</div>
                    <div class="book_type" id="novel">话费</div>
                </div>
                <div class="book_class" style="height:250px;">
                    <dl id="book_history">
                        <dd>
                            <form class="dianKaBusiness">
                                游戏名称:<input type="text"/><br>
                                &nbsp;游戏区:<input type="text"/><br>
                                &nbsp;游戏服:<input type="text"/><br>
                                购买比例:<br>
                                <input type="button" value="立即购买" class="load">
                            </form>
                        </dd>
                    </dl>
                    <dl id="book_family" class="book_none">
                        <dd>
                            <form class="dianKaBusiness">
                                QQ号码:<input type="text"><br>
                                &nbsp;类型:<input type="text"><br>
                                &nbsp;面值:<input type="text"><br>
                                价格:<br>
                                <input type="button" value="立即购买" class="load">
                            </form>
                        </dd>
                    </dl>
                    <dl id="book_culture" class="book_none">
                        <dd>
                            <form class="dianKaBusiness">
                                游戏名称:<input type="text"><br>
                                &nbsp;&nbsp;面值:<input type="text"><br>
                                价格:<input type="radio">客服快充<br>
                                <input type="button" value="立即购买" class="load">
                            </form>
                        </dd>
                    </dl>
                    <dl id="book_novel" class="book_none">
                        <dd>
                            <form action="" method="post" class="dianKaBusiness">
                                游戏名称:<input type="text"><br>
                                &nbsp;游戏区:<input type="text"><br>
                                &nbsp;游戏服:<input type="text"><br>
                                购买比例:<br>
                                <input type="submit" value="立即购买" class="load">
                            </form>
                        </dd>
                    </dl>
                </div>
            </div>
            <!--------------------------------------------------右边中部-------------------------------------------------------->
            <div class="consultOrAdvise">
                <div class="zx-jy-ts"><strong>咨询/建议/投诉</strong></div>
                <div class="more"><a href="<%=basePath%>home/problemAndAnswer" target="_blank">更多</a></div>
                <marquee direction="up" scrolldelay="0" onmouseover="this.stop();" onmouseout="this.start()">
                            <ul class="answer">
                                <s:forEach items="${requestScope.proList}" var="problem">
                                    <s:if test="${problem.state=='已解决'}">
                                        <li><img src="../image/？.png" class="questions"><a href="<%=basePath%>home/goProblemContent?question=${problem.question}">${problem.question}</a></li>
                                        <li><img src="../image/a.png"><a href="<%=basePath%>home/goProblemContent?question=${problem.question}">${problem.answer}</a></li>
                                        <li><hr/></li>
                                    </s:if>
                                </s:forEach>
                    </ul>
                </marquee>
            </div>
            <button class="ziXun"><a>我要咨询</a></button>
            <button class="jianYi"><a>我要建议</a></button>
            <button class="touShu"><a>我要投诉</a></button>
        </div>
    </div>
</div>
</body>
</html>
