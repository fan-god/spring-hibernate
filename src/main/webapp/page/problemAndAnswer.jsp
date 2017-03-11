<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 王帆
  Date: 2017/3/7
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>咨询和解答页面</title>
    <script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
    <script src="../js/problemAndAnswer.js" type="text/javascript"></script>
    <link href="../css/problemAndAnswer.css" rel="stylesheet">
</head>
<body>
<jsp:include page="../common/common-top.jsp"></jsp:include>
<div class="all-controller">
    <ul class="top-pic">
        <li><a href=""><img src="../pic/我要咨询.png"></a></li>
        <li><a href=""><img src="../pic/我要投诉.png"></a></li>
        <li><a href=""><img src="../pic/我要建议.png"></a></li>
    </ul>
    <dl class="navigation">
        <dd onclick="choose(0)">咨询总量：${requestScope.iList[0]}</dd>
        <dd onclick="choose(1)">投诉率：0.10%</dd>
        <dd onclick="choose(2)">建议总量：256</dd>
            <ul class="problemType">
                <c:forEach items="${requestScope.qTypes}" var="qType" varStatus="vs">
                    <li>${qType}:<span>${requestScope.qTypeCounts[vs.index]}</span></li>
                </c:forEach>
            </ul>
    </dl>

    <dl class="center-bar">
        <dd onclick="get(0)">全部</dd>
        <dd onclick="get(1)">解决中</dd>
        <dd onclick="get(2)">已解决</dd>
    </dl>
        <table border="0" cellpadding="0" cellspacing="30" width="1000px">
            <ul class="problemTable">
                <div>问题描述</div>
                <li>问题类型</li>
                <li>提问时间</li>
                <li>回答时间</li>
                <li id="state">状态</li>
            </ul>

            <c:forEach items="${requestScope.proList}" var="problem">
                <tr>
                    <td>
                        <div class="problemContent">
                            <a href="<%=basePath%>home/goProblemContent?question=${problem.question}">【咨询】${problem.question}</a>
                        </div>
                    </td>
                    <td width="70px">${problem.qType}</td>
                    <td width="150px">${problem.qTime}</td>
                    <td width="80px">-</td>
                    <td width="150px">${problem.state}</td>
                </tr>
            </c:forEach>
        </table>
        <ul class="jump">
            <li>共${requestScope.iList[0]}条记录&nbsp;&nbsp; ${requestScope.pageIndex}/${requestScope.totalPages}页</li>
            <li>
                <c:if test="${requestScope.pageIndex>1}">
                    <a href="<%=basePath%>home/problemAndAnswer?pageIndex=1">首页</a>
                    <a href="<%=basePath%>home/problemAndAnswer?pageIndex=${requestScope.pageIndex-1}">上一页</a>
                </c:if>
                <c:if test="${requestScope.pageIndex<requestScope.totalPages}">
                    <a href="<%=basePath%>home/problemAndAnswer?pageIndex=${requestScope.pageIndex+1}">下一页</a>
                    <a href="<%=basePath%>home/problemAndAnswer?pageIndex=${requestScope.totalPages}">最后一页</a>
                </c:if>
            </li>
            <li>
                <form action="" method="post" onsubmit="return goNo()">
             <span class="page-go-form">
                <label>跳转至</label>
                <input type="text" name="inputPage" id="inputPage" class="page-key"/>页
                <button type="submit" class="page-btn" onClick='jump_to()'>GO</button>
            </span>
                    <input type="hidden" id="totalPage" value="${requestScope.totalPages}"/>
                </form>
            </li>
        </ul>
</div>
</body>
</html>
