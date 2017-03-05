<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 王帆
  Date: 2017/2/25
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>呵呵呵</title>
</head>
<body>
<h1>学生信息页面！！！</h1>
<%--通过EL表达式--%>
<%--<div>${requestScope.student.sname}</div>
<div>${sessionScope.student.sage}</div>
<div>${applicationScope.student.sname}</div>--%>
<s:form action="upload" method="POST" enctype="multipart/form-data">
    <s:file name="pic" label="图片"></s:file>
    <s:submit label="upload" value="提交"></s:submit>
</s:form>
</body>
</html>
