<%--
  Created by IntelliJ IDEA.
  User: f-haghighi
  Date: 2/7/16
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/taglibs.jsp" %>


<div  class="righttoleft" style="background-color: #c0a16b">
    <s:actionerror/>
</div>
<div id="response" align="center">
    <div  class="div_errormessage" dir="rtl">
        <s:property value="errormessage"/>
    </div>
    <div  class="div_message" dir="rtl">
        <s:property value="message"/>
    </div>
</div>