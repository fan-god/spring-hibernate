<%--
  Created by IntelliJ IDEA.
  User: 王帆
  Date: 2017/2/26
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>文件上传成功页面</title>
</head>
<body>
<h1><s:actionmessage/></h1>
<h1>文件名;<s:property value="picFileName"/> </h1>
<h1>文件类型:<s:property value="picContentType"/></h1>
<img src="upload/<s:property value="randomName"/><s:property value="picFileName"/>" alt="图片" height="300px" width="300px"/>
</body>
</html>
