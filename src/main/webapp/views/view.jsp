<%--
  Created by IntelliJ IDEA.
  User: gaslandie
  Date: 26/02/2023
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String name=(String)request.getAttribute("model"); %>
<!Doctype html>
<html>
<head>
    <title>page Jsp</title>
</head>
<body>
 <h2>Hello <%=name%> from jsp</h2>
</body>
</html>
