<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<%---------------------------------------------------------------------------------------------------------------------------------------------------------------%>

<div id="flip" class="flip" name="">اطلاعات</div>
<table class="table">
    <tr class="borderBottom">
        <td width="15%"></td>
        <td class="rightAlign"  width="7%">کد یکتا:</td>
        <td class="rightAlign" ></td>
        <td class="rightAlign"  width="8%">شماره صورتحساب:</td>
        <td class="rightAlign" >${viewCredebit.invoiceNo}</td>
    </tr>

    <tr class="borderBottom">
        <td width="15%"></td>
        <td class="rightAlign" >شماره بیمه نامه:</td>
        <td class="rightAlign" >${viewCredebit.policyNo}</td>
        <td class="rightAlign" >نام بیمه گذار:</td>
        <td class="rightAlign" >${viewCredebit.orgName}</td>
    </tr>

    <tr class="borderBottom">
        <td width="15%"></td>
        <td class="rightAlign" >شماره ملی:</td>
        <td class="rightAlign" >${viewCredebit.nationalID}</td>
        <td class="rightAlign" >نام بیمه شده:</td>
        <td class="rightAlign" >${viewCredebit.personName}</td>
    </tr>

    <tr class="borderBottom">
        <td width="15%"></td>
        <td class="rightAlign" >مبلغ (ریال):</td>
        <td class="rightAlign" >${viewCredebit.mablagh}</td>
        <td class="rightAlign" >وضعیت نهایی:</td>
        <td class="rightAlign" >${viewCredebit.state}</td>
    </tr>
</table>


<%---------------------------------------------------------------------------------------------------------------------------------------------------------------%>

<display:table export="true" name="credebitStateList" id="credebitStateList" uid="credebitState" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/">

    <display:column title="رديف ">${credebitState_rowNum}</display:column>
    <display:column property="userName" title="کاربر تایید کننده"/>
    <display:column property="date" title="تاریخ تایید"/>
    <display:column property="time" title="زمان تایید"/>
    <display:column property="stateStr" title="وضعیت"/>
</display:table>