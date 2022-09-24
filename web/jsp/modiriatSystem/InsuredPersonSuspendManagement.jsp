<%--
  Created by IntelliJ IDEA.
  User: ach
  Date: 10/28/2020
  Time: 12:30 PM
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
                شماره بيمه نامه

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
            <td class="texttd">
            <td class="texttd"><span class="required">*</span>
کد ملی بیمه شده اصلی
            </td>
            <td class="rightAlign">
                <input type="text" class="form-control" id="mainNationalID" name="mainNationalID"
                       value="${mainNationalID}"/>
                <div id='suspendForm_mainNationalID_errorloc' class="message"></div>
            </td>

        </tr>


        <tr>
            <td></td>
            <td></td>
            <td>
                <input type="submit" class="submitButton" name="submit0" value=" جست و جو"
                       formaction="ModiriatSystemSearchMainInsuredPerson"/>
            </td>

        </tr>
        </tbody>
    </table>
</form>
<script>searchMainInsuredPersonFormValidation('suspendForm')</script>

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


<s:div id="flip3" class="flip">اطلاعات بیمه شده اصلی</s:div>

<div style="overflow: auto;">
    <display:table export="true" name="viewInsuredPersonList" id="viewInsuredPersonList"
                   uid="viewPerson" class="table table-bordered displaytable"
                   sort="external" htmlId="dbList" excludedParams="">

        <display:column property="policyNo" title="شماره بیمه نامه"> </display:column>
        <display:column property="fullName" title="نام و نام خانوادگی"> </display:column>
        <display:column property="idNo" title="شماره شناسنامه"> </display:column>
        <display:column property="nationalID" title="کد ملی"> </display:column>
        <display:column property="birthDate" title="تاریخ تولد"> </display:column>
        <display:column property="fatherName" title="نام پدر"> </display:column>
        <display:column property="familyRelation" title="نسبت"> </display:column>
        <display:column property="gender" title="جنسیت"> </display:column>
        <display:column property="insuredPersonCode" title="کد بیمه شده"> </display:column>
        <display:column property="personelID" title="کد پرسنلی"> </display:column>
        <display:column property="beginDate" title="تاریخ شروع بیمه شده"> </display:column>
        <display:column property="endDate" title="تاریخ پایان بیمه شده"> </display:column>
        <display:column property="sheba" title="شماره شبا"> </display:column>
        <display:column property="mobile" title="موبایل"> </display:column>
        <display:column property="stateStr" title="وضعیت"> </display:column>
        <c:if test="${viewPerson.state==1}">
        <display:column media="html">
            <form method="post" action="ModiriatSystemSuspendInsuredPerson">
                <input type="hidden" name="mainInsuredPersonID" value="${viewPerson.mainInsuredPersonCode}"/>
                <input type="submit" class="submitButton" theme="simple" value="تعلیق"/>
            </form>
        </display:column>
        </c:if>
        <c:if test="${viewPerson.state==0}">
        <display:column media="html">
            <form method="post" action="ModiriatSystemFixTheSuspension">
                <input type="hidden" name="mainInsuredPersonID" value="${viewPerson.mainInsuredPersonCode}"/>
                <input type="submit" class="submitButton" theme="simple" value="رفع تعلیق"/>
            </form>
        </display:column>
        </c:if>
    </display:table>


</div>



