<%--
  Created by IntelliJ IDEA.
  User: ach
  Date: 10/28/2020
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="/js/reports.js"></script>
<script src="/js/project.js"></script>

<div id="flip" class="flip" name="">جستجو</div>
<form id="suspendForm" name="suspendForm">
    <table class="table">
        <tbody>

        <tr>

            <td class="texttd">
            <td class="texttd"><span class="required">*</span>
                شماره بیمه نامه

            </td>

            <td class="rightAlign">
                <div>
                    <input type="hidden" id="queryinfopolicyNo" name="queryinfo" value="1"/>
                    <input type="hidden" id="policyID" name="policyID" value="${policyID}"/>
                    <s:textfield id="policyNo" name="policyNo" class="form-control" theme="simple"
                                 onchange="makeEmpty('policyNo','policyID');"></s:textfield>
                    <div id='suspendForm_policyID_errorloc' class="message"></div>


                </div>
            </td>

        </tr>


        <tr>
            <td></td>
            <td></td>
            <td>
                <input type="submit" class="submitButton" name="submit0" value=" جستجو"
                       formaction="ModiriatSystemSearchPolicy"/>
            </td>

        </tr>
        </tbody>
    </table>
</form>


<div id="response" align="center">
    <div class="div_errormessage" dir="rtl" style="color: red;">
        <strong>
            <s:actionerror/>
            <s:property value="errormessage"/>
        </strong>
    </div>
    <div class="div_message" dir="rtl">
        <strong>
            <s:property value="message"/>
        </strong>
    </div>
</div>
<c:if test="${policy != null}">
    <s:include value="/jsp/modiriatSystem/PolicyData.jsp"></s:include>
</c:if>






