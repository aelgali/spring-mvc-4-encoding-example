<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: AmarE
  Date: 5/16/2014
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>


<form:form modelAttribute="helloForm" action="process" method="post" htmlEscape="true">
<table style="width:500px;">
    <tr>
        <td>Test</td>
        <td><form:textarea path="text"/></td>
    </tr>
    <tr>
        <td colspan="2"><button type="submit">Test</button></td>
    </tr>
</table>
</form:form>

</body>
</html>
