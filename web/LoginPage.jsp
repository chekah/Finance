<%--
  Created by IntelliJ IDEA.
  User: a-sajadian
  Date: 2/7/16
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<sec:authorize ifAllGranted="ROLE_USER">--%>

    <%--<%response.sendRedirect("/loginUser.action"); %>--%>
<%--</sec:authorize>--%>


<html>
<head>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>--%>
    <meta name="decorator" content="no"/>
    <link type="text/css" rel="stylesheet" href="/css/project.css">
    <%--<link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">--%>
    <title>ACH</title>
</head>
<body class="loginBody">


<form name='login_form' action="<c:url value='/j_spring_security_check' />" method='POST'>
    <%--<form name='login_form' action="j_spring_security_check" method="post" id="target" >--%>
    <div class="panel-default loginPanel">

        <table class="loginTable">
            <thead>
            <tr>
                <th colspan="4">
                    به سامانه ACH شركت امين پارسيان خوش آمديد
                </th>
            </tr>

            </thead>
            <tbody>
            <tr>
                <td></td>
                <td class="texttd">
                    نام کاربري
                </td>
                <td>
                    <input name="j_username" id="j_username" type="text" class="form-control"  <c:if test="${not empty param.login_error}">value=''
                    </c:if>/>
                </td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td class="texttd">
                    رمز عبور
                </td>
                <td><input name="j_password" id="j_password" type="password" class="form-control texttd-box"></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td>
                    <input id=Enter type="submit" class="btn btn-info" value="ورود">
                </td>
                <td></td>
            </tr>

            </tbody>
        </table>
    </div>
</form>
</body>
</html>


