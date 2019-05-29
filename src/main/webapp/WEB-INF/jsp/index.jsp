<%--
  Created by IntelliJ IDEA.
  User: LIU
  Date: 2019/4/6
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>students</title>
    <%@include file="../base/head.jsp"%>
</head>
<body>
<div id="div1">
    {{msg}}
</div>
</body>
<script>
    new Vue({
        el: '#div1',
        data: {
            msg: "Hello world"
        }

    })
</script>
</html>
