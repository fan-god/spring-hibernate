<%@ taglib prefix="S" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/5
  Time:  9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../css/homePage.css"/>
    <title>尾部</title>
</head>
<body>
<div class="brand">
    <ul class="brand_ull">
        <li><a href="#"><img src="../image/无货.png" width="320px" height="60px"></a></li>
        <li><a href="#"><img src="../image/防盗.png" width="320px" height="60px"></a></li>
        <li><a href="#"><img src="../image/客服.png" width="320px" height="60px"></a></li>
    </ul>
</div>
<div class="hot" id="hot">
    <ul class="hot-ull">
        <li>5173通行证专线：0579-83225173 请按1</li>
        <li>寄售交易专线：0579-83225173 请按2</li>
        <li>担保交易专线：0579-83225173 请按3</li>
    </ul>
    <ul class="hot-ull1">
        <li>帐号交易专线：0579-83225173 请按4</li>
        <li>点卡交易专线：0579-83225173 请按5</li>
        <li>手游交易专线：0579-83225173 请按6</li>
    </ul>
    <ul class="hot-ull2">
        <li>代练交易专线：0579-83225173 请按7</li>
        <li>人工服务：0579-83225173 请按0</li>
    </ul>
    <p class="hot-p">
        <span>注意：以上电话只能接听，如接到以上电话号码来电均为诈骗</span>
    </p>
    <p class="seven">
        -----------------------------------------------------------------------------------------------------------------------------------------</p>
</div>
<div class="six" id="six">
    <p><a href="#">关于我们</a>|<a href="#">合作伙伴</a>|<a href="#">合作联系</a>|<a href="#">隐私保护</a>|<a href="#">投诉建议</a>|<a
            href="#">免责声明</a>|<a href="#">诚聘英才</a></p>
    <p><a href="#">Copyright &copy; 2002-2016 5173.com</a> <a href="#">版权所有ICP证：浙B2-20090127 （金华比奇网络技术有限公司）</a><a
            href="#">【网络文化经营许可证】浙网文[2016]0181-081号</a></p>
    <ul class="six_ul1">
        <li><img src="../image/31.png" width="39" height="20"></li>
        <li><a href="#">亚洲中小私营企业100强</a></li>
        <li class="six_ul1_li"><img src="../image/32.png" width="26" height="25"></li>
        <li><a href="#">中国电子商务诚信单位</a></li>
        <li><img src="../image/33.png" width="25" height="22"></li>
        <li><a href="#">反盗号绿色联盟</a></li>
        <li><img src="../image/39.png" width="53" height="21"></li>
        <li><a href="#">诚信网站</a></li>
        <li class="six_ul1_li"><img src="../image/41.png" width="34" height="27"></li>
        <li><a href="#">金华网上市场监管局</a></li>
    </ul>
    <ul class="six_ul2">
        <li class="six_ul2_li"><img src="../image/36.png" width="28" height="25"></li>
        <li><a href="#">工信部域名备案管理系统</a></li>
        <li class="six_ul2_li"><img src="../image/42.png" width="20" height="23"></li>
        <li><a href="#">网上交易保障中心</a></li>
        <li><img src="../image/38.png" width="19" height="22"></li>
        <li><a href="#">企业法人营业执照</a></li>
        <li class="six_ul2_li"><img src="../image/40.png" width="28" height="27"></li>
        <li><a href="#">诚信在线</a></li>
        <li class="six_ul2_li"><img src="../image/43.png" width="19" height="22"></li>
        <li><a href="#">浙公网安备 33070202100008号</a></li>
    </ul>
</div>
<!--结束合作官方-->
</div>
<!--结束all标签-->
</body>
</html>
