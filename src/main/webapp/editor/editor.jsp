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
    <title>编辑器插件</title>
    <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="ckeditor/ckeditor.js"></script>
</head>
<body>
<textarea rows="5" cols="50" id="editor1" name="content"></textarea>
<script type="text/javascript">var editor = CKEDITOR.replace('editor1');</script>
</body>
</html>
