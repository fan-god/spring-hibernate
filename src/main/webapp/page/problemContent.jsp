<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%--
  Created by IntelliJ IDEA.
  User: 王帆
  Date: 2017/3/10
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="../css/answerContent.css">
</head>
<body>
<jsp:include page="../common/common-top.jsp"></jsp:include>
<div class="all-controller">
    <c:forEach items="${requestScope.problems}" var="problem">

        <div class="top">
            <h1>分类:${problem.qType}</h1>
            <hr/>
            <div>提问时间:${problem.qTime}</div>
            <hr class="line"/>
            <div><strong>提问内容:</strong><span class="content">${problem.question}</span></div>
        </div>
    </c:forEach>

    <div class="center">
        <div class="Customer">客服回复</div>
        <hr/>
        <c:forEach items="${requestScope.problems}" var="problem">
            <ul class="answerContent">
                <div class="title">尊敬的用户：</div>
                <li>
                    <div>您好！欢迎来到5173客服中心，<a>${problem.mangerName}</a>很荣幸为您服务！</div>
                    <div>我的手机： <span>130-4077-8085</span></div>
                    <div style="color: red;">手机号码仅限接听，不能拨打</div>
                </li>
                <c:if test="${problem.answer==null}">
                    <li>客服在忙，暂无回复</li>
                </c:if>
                <li>${problem.answer}</li>
                <li>感谢您对5173的关注与支持，预祝您有一个愉快的5173之旅！<a href="http://www.5173.com">http://www.5173.com</a></li>
                <li class="keHuPic">
                    <div><img src="../pic/${problem.mangerPic}" height="147" width="147"></div>
                    <div>${fn:substring(problem.mangerPic,0,7)}</div>
                    <div>${problem.mangerName}</div>
                </li>
            </ul>
        </c:forEach>
    </div>

</div>
</body>
</html>
