<%--
  Created by IntelliJ IDEA.
  User: a-naderi
  Date: 7/25/2017
  Time: 8:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<%-----------------------------------------------------------------------------------------------------------------------------------------------------------%>

<%--جستجو --%>
<div id="flip" class="flip" name="">جستجو</div>
<form >
    <table class="table">
        <tbody>
        <tr>
            <td class="texttd">شماره بیمه نامه</td>
            <td class="rightAlign">
                <input type="text" class="form-control" id="policyNO" name="policyNO"/>
            </td>
            <td class="texttd">شماره صورتحساب</td>
            <td class="rightAlign" style="width:60%;">
                <input type="text" class="form-control" id="invoiceNo" name="invoiceNo"/>
            </td>
        </tr>

        <tr>
            <td class="texttd">کد ملی</td>
            <td class="rightAlign">
                <input type="text" class="form-control" id="nationalNO" name="nationalNO"/>
            </td>
            <td>وضعیت</td>
            <td>
            </td>
        </tr>
        <tr>
        <c:if test="${user.getSemat().getId().intValue()==4 || user.getSemat().getId().intValue()==1}">
            <td colspan="2">
                <input type="submit" class="submitButton" name="submit"  value=" جستجو معاون فنی" formaction="searchFanniSubManager"/>
            </td>
        </c:if>
        <c:if test="${user.getSemat().getId().intValue()==2 || user.getSemat().getId().intValue()==1 || user.getSemat().getId().intValue()==6}">
                <td colspan="2">
                    <input type="submit" class="submitButton" name="submit" value=" جستجو مدیر فنی" formaction="searchFanniManager"/>
                </td>
        </c:if>
        <c:if test="${user.getSemat().getId().intValue()==5 || user.getSemat().getId().intValue()==1}">
                <td colspan="2">
                    <input type="submit" class="submitButton" name="submit"  value=" جستجو معاون مالی" formaction="searchMaliSubManager"/>
                </td>
        </c:if>
        <c:if test="${user.getSemat().getId().intValue()==3 || user.getSemat().getId().intValue()==1}">
                <td colspan="2">
                    <input type="submit" class="submitButton" name="submit"  value="جستجو مدیر مالی" formaction="searchMaliManager"/>
                </td>
        </c:if>
        </tr>
        </tbody>
    </table>
</form>


<%-----------------------------------------------------------------------------------------------------------------------------------------------------------%>

<display:table export="true" name="credebitList" id="credebitList" uid="credebit" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/">

    <display:column title="رديف ">${credebit_rowNum}</display:column>
    <display:column property="policyNo" title="شماره بیمه نامه"/>
    <display:column property="orgName" title="نام بیمه گذار"/>
    <display:column property="nationalID" title="کد ملی"/>
    <display:column property="personName" title="نام شخص"/>
    <display:column property="invoiceNo" title="شماره صورتحساب"/>
    <display:column property="mablagh" title="مبلغ"/>
    <display:column property="state" title="وضعیت"/>
    <display:column property="entryDate" title="تاریخ ثبت"/>
    <display:column property="entryUser" title="کاربر ثبت کننده"/>

    <display:column media="html">
            <form method="post" action="teedMoavenFani">
                <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
                <input type="submit" class="submitButton" theme="simple" value="تایید"/>
            </form>
    </display:column>

</display:table>

<%----------------------------------------------------------------------------------------------------------------------------------------------------------%>

<div style="text-align: center; color: red; font-weight: bold ">${errorMessage}</div>
<div style="text-align: center; color: green; font-weight: bold ">${actionMessage}</div>