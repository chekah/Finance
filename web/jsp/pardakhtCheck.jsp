<%--
  Created by IntelliJ IDEA.
  User: a-naderi
  Date: 9/26/2017
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>



<%-----------------------------------------------------------------------------------------------------------------------------------------------------------%>

<%--جستجو --%>
<div id="flip" class="flip" name="">جستجو</div>
<form >
    <table class="table">
        <tbody>
        <tr>
            <td class="texttd">شماره بیمه نامه</td>
            <td class="rightAlign">
                <input type="text" class="form-control Policy lefttoright" id="policyNO" name="policyNO"/>
            </td>
            <td class="texttd">شماره صورتحساب</td>
            <td class="rightAlign">
                <input type="text" class="form-control internalLetterNo lefttoright" id="invoiceNo" name="invoiceNo"/>
            </td>
        </tr>

        <tr>
            <td class="texttd">کد ملی</td>
            <td class="rightAlign">
                <input type="text" class="form-control nationalID lefttoright" id="nationalNO" name="nationalNO"/>
            </td>
            <td class="texttd">وضعیت</td>
            <td class="rightAlign">
                <select name="state" id="state" class="form-control">
                    <option  value="" >انتخاب كنيد</option>
                    <option  value="1">ثبت شده</option>
                    <option  value="2">تایید معاون فنی</option>
                    <option  value="3">تایید معاون مالی</option>
                    <option  value="4">حذف بانک</option>
                    <option  value="5">پرداخت شده</option>
                    <option  value="6">خطای درگاه</option>
                </select>
            </td>
        </tr>

        <tr>
            <td class="texttd">تاریخ ثبت از</td>
            <td class="rightAlign">
                <input type="text" class=" date form-control lefttoright  " id="createDateFrom"name="createDateFrom" value="${createDateFrom}"></input>
            </td>
            <td class="texttd">تاریخ ثبت تا</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="createDateTo" name="createDateTo" value="${createDateTo}"></input>
            </td>
        </tr>

        <tr>
            <td class="texttd">تاریخ اعلام به مالی پارسیان از</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="elamBeMaliDateFrom" name="elamBeMaliDateFrom" value="${elamBeMaliDateFrom}"></input>
            </td>
            <td class="texttd">تاریخ اعلام به مالی پارسیان تا</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="elamBeMaliDateTo"  name="elamBeMaliDateTo" value="${elamBeMaliDateTo}"></input>
            </td>
        </tr>

        <tr>
            <td colspan="4">
                    <input type="submit" class="submitButton" name="submit"  value="جستجو مدیر مالی" formaction="searchMaliManagerForPardakhtCheck"/>
            </td>
        </tr>
        </tbody>
    </table>
</form>

<%----------------------------------------------------------------------------------------------------------------------------------------------------------%>


<%--2مدیر مالی--%>
    <display:table export="true" name="credebitList" id="credebitList" uid="credebit" class="table table-bordered displaytable"
                   sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/searchMaliManagerForPardakhtCheck">

        <display:column title="رديف ">${credebit_rowNum}</display:column>
        <display:column property="policyNo" title="شماره بیمه نامه"/>
        <display:column property="orgName" title="نام بیمه گذار"/>
        <display:column property="nationalID" title="کد ملی"/>
        <display:column property="personName" title="نام شخص"/>
        <display:column property="invoiceNo" title="شماره صورتحساب"/>
        <display:column title="مبلغ(ریال)"><fmt:formatNumber type="number" maxFractionDigits="3">${credebit.mablagh}</fmt:formatNumber></display:column>
        <display:column property="state" title="وضعیت"/>
        <display:column property="entryDate" title="تاریخ ثبت"/>
        <display:column property="entryUser" title="کاربر ثبت کننده"/>
        <display:column property="elamBeMaliDate" title="تاریخ اعلام به مالی"/>
        <display:column property="receptionDate" title="تاریخ ثبت هزینه"/>
        <display:column property="secretariatDate" title="تاریخ ورود به دبیرخانه"/>
        <display:column property="sheba" title="شماره شبا"/>

        <display:column media="html">
            <form method="post" action="pardakhtBaCheck">
                <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
                <input type="submit" class="submitButton" theme="simple" value="پرداخت با چک"/>
            </form>
        </display:column>
        <display:column media="html">
            <form method="post" action="ersalBeBank">
                <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
                <input type="submit" class="submitButton" theme="simple" value="پرداخت با شبا"/>
            </form>
        </display:column>

        <display:column media="html">
            <form method="post" action="viewCharkhe" target="_blank">
                <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
                <input type="submit" class="submitButton" theme="simple"  value="مشاهده چرخه"/>
            </form>
        </display:column>

    </display:table>

<%----------------------------------------------------------------------------------------------------------------------------------------------------------%>


<div style="text-align: center; color: red; font-weight: bold ">${errorMessage}</div>
<div style="text-align: center; color: green; font-weight: bold ">${actionMessage}</div>