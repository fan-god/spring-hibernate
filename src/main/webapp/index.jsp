<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<body>
<h2>Hello World!</h2>
<a href="info.jsp">进入首页！</a>
</body>
</html>
