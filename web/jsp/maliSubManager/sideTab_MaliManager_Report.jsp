<%--
  Created by IntelliJ IDEA.
  User: ach
  Date: 12/16/2017
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="flip" class="flip" name="">جستجو</div>
<form action = "">
    <table class="table">
        <tbody>
        <tr>
            <td class="texttd">تاريخ از</td>
            <td class="rightAlign">
                <input type="text" class=" date form-control lefttoright  " id="createDateFrom"name="createDateFrom" value="${createDateFrom}"/>
            </td>
            <td class="texttd">تاريخ تا</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="createDateTo" name="createDateTo" value="${createDateTo}"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" class="submitButton" name="submit0" value=" گزارش اولیه" formaction="mali_report_first"/>
            </td>
            <td>
                <input type="submit" class="submitButton" name="submit1" value=" گزارش سند پرداخت 1" formaction="mali_report_pardakht1"/>
            </td>
            <td>
                <input type="submit" class="submitButton" name="submit2" value=" گزارش سند پرداخت 2" formaction="mali_report_pardakht2"/>
            </td>
        </tr>
        </tbody>
    </table>
</form>

<display:table export="true" name="viewSanadList" id="viewSanadList" uid="viewSanad" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="">

    <display:column title="رديف ">${viewSanad_rowNum}</display:column>
    <display:column property="sanadNo" title="شماره سند"/>
    <display:column property="sanadDate" title="تاریخ سند"/>
    <display:column property="sanadRow" title="ردیف سند"/>
    <display:column property="sharheGhalam" title="شرح قلم"/>
    <display:column property="codeMoein" title="کد معین"/>
    <display:column property="codeTafsil4" title="کد تفصیلی 4"/>
    <display:column property="codeTafsil5" title="کد تفصیلی 5"/>
    <display:column property="codeTafsil6" title="کد تفصیلی 6"/>
    <display:column title="مبلغ بدهکار">${viewSanad.mablaghBedehkar}</display:column>
    <display:column title="مبلغ بستانکار">${viewSanad.mablaghBestankar}</display:column>
    <display:column property="nerkhArz" title="نرخ ارز"/>
    <display:column property="nerkhArzMabna" title="نرخ ارز مبنا"/>
    <display:column property="mablaghBedehkarArz" title="مبلغ بدهکار ارز"/>
    <display:column property="mablaghBestankarArz" title="مبلغ بستانکار ارز"/>
    <display:column property="onvanArz" title="عنوان ارز"/>
    <display:column property="onvanArzMabna" title="عنوان ارز مبنا"/>
    <display:column property="shomarePeigiri" title="شماره پیگیری"/>
    <display:column property="tarikhPeigiri" title="تاریخ پیگیری"/>

</display:table>

<display:table export="true" name="viewSanadListPardakht2" id="viewSanadList" uid="viewSanadPardakht" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="">

    <display:column title="رديف ">${viewSanad_rowNum}</display:column>
    <display:column property="sanadNo" title="شماره سند"/>
    <display:column property="sanadDate" title="تاریخ سند"/>
    <display:column property="sanadRow" title="ردیف سند"/>
    <display:column property="tahvilGirande" title="تحویل گیرنده"/>
    <display:column property="shomareFeri" title="شماره فرعی"/>
    <display:column property="sandoogh" title="صندوق"/>
    <display:column property="sharhPardakht" title="شرح پرداخت"/>
    <display:column property="sharhdovom" title="شرح دوم"/>
    <display:column property="tarafeMoghabel" title="طرف مقابل"/>
    <display:column property="hesabtarafeMoghabel" title="حساب طرف مقابل"/>
    <display:column property="codeAmaliat" title="کد عملیات"/>
    <display:column property="ameleNaghdinegi" title="عامل نقدینگی"/>
    <display:column property="elamieBardasht" title="شر ح اعلامیه برداشت"/>
    <display:column property="tarikhBardasht" title="تاریخ برداشت"/>
    <display:column property="bankname" title="نام بانک"/>
    <display:column property="codeshobe" title="کد شعبه"/>
    <display:column property="shomareHesab" title="شماره حساب"/>
    <display:column property="mablaghBedehkar" title="مبلغ"/>
    <display:column property="nerkhArz" title="نرخ ارز"/>
    <display:column property="mablaghArzAmaliati" title="مبلغ ارز عملیاتی"/>
    <display:column property="nerkhArzMabna" title="ارز مبنا"/>
    <display:column property="nerkhtabdil" title="نرخ تبدیل"/>
    <display:column property="mablaghBedehkarArz" title="مبلغ به ارز مبنا"/>
    <display:column property="sharheGhalam" title="شرح قلم"/>
    <display:column property="sharbezabanDovom" title="شرح به زبان دوم"/>

</display:table>

<div style="text-align: center; color: red; font-weight: bold ">${errorMessage}</div>
<div style="text-align: center; color: green; font-weight: bold ">${actionMessage}</div>