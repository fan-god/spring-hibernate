<%--
  Created by IntelliJ IDEA.
  User: 王帆
  Date: 2017/3/5
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>首页</title>
</head>
<body>
<jsp:include page="../common/homeTop.jsp"/>
</body>
</html>
