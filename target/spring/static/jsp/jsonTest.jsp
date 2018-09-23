<%--
  Created by IntelliJ IDEA.
  User: meko
  Date: 18-6-23
  Time: 上午9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json交互测试</title>
    <%
        pageContext.setAttribute("APP_PATH",request.getContextPath());
    %>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.1.1.js"></script>
    <script type="text/javascript">
        function requestJson() {
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath }/requestJson.html',
                contentType:'application/json;charset=utf-8',
                data:'{"name":"手机","price":"999"}',
                success:function (data) {
                    alert(data);
                }
            });
        }

        function responseJson() {
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath}/responseJson.html',
                data:'name=手机&price=999',
                success:function (data) {
                    alert(data);
                }
            });
        }
    </script>
</head>
<body>
<button onclick="requestJson()">请求Json数据</button>
<button onclick="responseJson()">响应json数据</button>
</body>
</html>
