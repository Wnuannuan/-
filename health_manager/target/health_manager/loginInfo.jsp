<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<%=basePath%>/css/bootstrap.min.css"/>
</head>
<body>

<br/>
<br/>
<br/>
<center><h2>${message}</h2></center>
<br/>

</center>
</body>
</html>
