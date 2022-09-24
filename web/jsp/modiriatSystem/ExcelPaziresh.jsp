<%--
  Created by IntelliJ IDEA.
  User: asadi
  Date: 20/05/2020
  Time: 04:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<script src="/js/ModiriatSystem/saveExcel.js"></script>


<div class="flip">آپلود فايل</div>
<s:form id="pazireshForm" name="pazireshForm" enctype="multipart/form-data" method="post">
    <table id=table1 class="table ">
        <tbody>

        <tr>
            <td width=""></td>
            <td class="texttd"><span class="required">*</span>
                آپلود فايل خسارت
            </td>
            <td class="rightAlign">
                <input type="file" name="fileUpload" id="fileUpload" value="${fileUpload}"/>
                <div id='pazireshForm_fileUpload_errorloc' class="message"></div>
            </td>

            <td class="rightAlign">

                <input type="checkbox" id="bimarestani" name="bimarestani" value="true"/>
                <label>بیمارستانی</label>

            </td>

            <td>
                    <%--<sec:authorize access="hasRole('ModiriatSystemSabteExcelPaziresh')">--%>
                <s:submit type="button" class="submitButton" action="ModiriatSystemSabteExcelPaziresh" name="saveFile"
                          theme="simple" label="ارسال "></s:submit>
                    <%--</sec:authorize>--%>
            </td>
        </tr>
        </tbody>
    </table>
</s:form>
<script>pazireshFormFormValidation('pazireshForm')</script>

<%--<s:if test="hasActionErrors()">--%>
    <%--<div class="alert alert-danger alert-dismissable fade in righttoleft">--%>
        <%--<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>--%>
        <%--<strong class="righttoleft"> پیغام خطا :</strong> <s:actionerror theme="simple"/>--%>
    <%--</div>--%>
<%--</s:if>--%>

<%--<s:if test="hasActionMessages()">--%>
    <%--<div class="alert alert-danger alert-dismissable fade in righttoleft">--%>
        <%--<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>--%>
        <%--<strong class="righttoleft"> پیغام :</strong> <s:actionmessage theme="simple"/>--%>
    <%--</div>--%>
<%--</s:if>--%>


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


<%--</s:div>--%>

<s:div id="flip3" class="flip">لیست بیمه شده هایی از اکسل که در سیستم وجود ندارند+</s:div>
<%--<s:div id="panel3" class="searchpanel">--%>
<div style="overflow: auto;">
    <display:table export="true" name="paginatedViewReceptionExcelList" id="paginatedViewReceptionExcelList"
                   uid="viewReceptionExcel" class="table table-bordered displaytable"
                   sort="external" htmlId="dbList" excludedParams="" requestURI="/ModiriatSystemSaveReceptionExcelFile.action">

        <display:column
                title="رديف">${(paginatedViewReceptionExcelList.objectsPerPage)*(paginatedViewReceptionExcelList.pageNumber-1)+viewReceptionExcel_rowNum}</display:column>


        <display:column property="asliFullName" title="نام بيمه شده اصلی"> </display:column>
        <display:column property="noeHavale" title="نوع حواله"> </display:column>
    <display:column property="shomareHavale" title="شماره حواله"> </display:column>
        <display:column property="tarikhHavale" title=" تاريخ حواله"> </display:column>
        <display:column property="shomareParvande" title="شماره پرونده"> </display:column>
        <display:column property="vahedePardakhti" title="واحد پرداخت"> </display:column>
        <display:column property="noeTarh" title="نوع طرح"> </display:column>
        <display:column property="patientName" title="نام بيمه شده"> </display:column>
        <display:column property="bimeGozar" title="بيمه گذار"> </display:column>
        <display:column property="asliNationalID" title="کدملي بيمه شده اصلي"> </display:column>
        <display:column property="vahedeSazmani" title=" واحد سازماني"> </display:column>
        <display:column property="policyno" title="شماره بيمه نامه"> </display:column>
        <display:column property="policy.policyno" title="کد رايانه بيمه نامه"> </display:column>
        <display:column property="codeBimeShode" title="كد بيمه شده"> </display:column>
        <display:column property="patientNationalID" title="کد ملی"> </display:column>
        <display:column property="serialMoarefiName" title="سريال معرفينامه"> </display:column>
        <display:column property="personelID" title="كد پرسنلي"> </display:column>
        <display:column property="pardakhtAzMahal" title=" پرداخت از محل"> </display:column>
        <%--<display:column property="receptionExcelNotExistIP" title=" تاريخ شروع بيمه نامه"> </display:column>--%>
        <%--<display:column property="receptionExcelNotExistIP" title="تاريخ پايان بيمه نامه"> </display:column>--%>
        <display:column property="codeTarh" title="کد طرح"></display:column>
        <display:column property="policyName" title="نام طرح"></display:column>
        <display:column property="tasvieShode" title="تسويه شده"></display:column>
        <display:column property="shomareBaygani" title="شماره بایگانی"></display:column>
        <display:column property="grouhKariBimeGozar" title="گروه کاری بیمه گذار"></display:column>
        <display:column property="tarikhBimari" title="تاريخ بيماري"></display:column>
        <display:column property="tarikhElamKhesarat" title="تاريخ اعلام خسارت"></display:column>
        <display:column property="noeBimari" title="نوع بيماري"></display:column>
        <display:column property="karshenasParvande" title="كارشناس پرونده"></display:column>
        <display:column property="codeKarshenas" title="كد كارشناس"></display:column>
        <display:column property="vehedeSodour" title="واحد صدور"></display:column>
        <display:column property="vehedeMoaref" title="واحد معرف"></display:column>
        <display:column property="nameKarshenas" title="نام كارشناس"></display:column>
        <display:column property="nameMarkazDarmani" title="نام مركز درماني"></display:column>
        <display:column property="noeTahvilMadarek" title="نوع تحويل مدارك"></display:column>
        <display:column property="vazeiatParvande" title="وضعیت پرونده"></display:column>
        <display:column property="karbarSabteParvande" title="کاربر ثبت پرونده"></display:column>
        <display:column property="gruheBimari" title="گروه بیماری"></display:column>
        <display:column property="codeRayaneMoredKhesarat" title="کد رایانه مورد خسارت"></display:column>
        <display:column title="هزينه پاراكلينيكي اعلام شده"><fmt:formatNumber type="number"
                                                          maxFractionDigits="3">${viewReceptionExcel.hazineParaElami}</fmt:formatNumber></display:column>

        <display:column title="مبلغ محاسبه شده مطابق تعرفه"><fmt:formatNumber type="number"
                                                                              maxFractionDigits="3">${viewReceptionExcel.mablaghMohasebeSodeMotabeghTarefe}</fmt:formatNumber></display:column>

        <display:column title="هزينه پاراکلينيکي پرداخت شده"><fmt:formatNumber type="number"
                                                                              maxFractionDigits="3">${viewReceptionExcel.hazineParaPardakhti}</fmt:formatNumber></display:column>
        <display:column title="هزينه بیمارستانی اعلام شده"><fmt:formatNumber type="number"
                                                                              maxFractionDigits="3">${viewReceptionExcel.hazineBimarestaniElami}</fmt:formatNumber></display:column>
        <display:column title="هزينه بیمارستانی پرداخت شده"><fmt:formatNumber type="number"
                                                                              maxFractionDigits="3">${viewReceptionExcel.hazineBimarestaniPardakhti}</fmt:formatNumber></display:column>
        <display:column property="maliat" title="ماليات"></display:column>
        <display:column title="فرانشيز"><fmt:formatNumber type="number"
                                                                              maxFractionDigits="3">${viewReceptionExcel.franshiz}</fmt:formatNumber></display:column>

    </display:table>



</div>



<s:div id="flip1" class="flip">لیست خسارت هایی از اکسل که در سیستم ثبت شد+</s:div>
<%--<s:div id="panel3" class="searchpanel">--%>
<div style="overflow: auto;">
    <display:table export="true" name="paginatedViewDBReceptionExcelList" id="paginatedViewDBReceptionExcelList"
                   uid="viewDBReceptionExcel" class="table table-bordered displaytable"
                   sort="external" htmlId="dbList" excludedParams="" requestURI="/ModiriatSystemSaveReceptionExcelFile.action">

        <display:column
                title="رديف">${(paginatedViewDBReceptionExcelList.objectsPerPage)*(paginatedViewDBReceptionExcelList.pageNumber-1)+viewDBReceptionExcel_rowNum}</display:column>


        <display:column property="asliFullName" title="نام بيمه شده اصلی"> </display:column>
        <display:column property="noeHavale" title="نوع حواله"> </display:column>
        <display:column property="shomareHavale" title="شماره حواله"> </display:column>
        <display:column property="tarikhHavale" title=" تاريخ حواله"> </display:column>
        <display:column property="shomareParvande" title="شماره پرونده"> </display:column>
        <display:column property="vahedePardakhti" title="واحد پرداخت"> </display:column>
        <display:column property="noeTarh" title="نوع طرح"> </display:column>
        <display:column property="patientName" title="نام بيمه شده"> </display:column>
        <display:column property="bimeGozar" title="بيمه گذار"> </display:column>
        <display:column property="asliNationalID" title="کدملي بيمه شده اصلي"> </display:column>
        <display:column property="vahedeSazmani" title=" واحد سازماني"> </display:column>
        <display:column property="policyno" title="شماره بيمه نامه"> </display:column>
        <display:column property="policy.policyno" title="کد رايانه بيمه نامه"> </display:column>
        <display:column property="codeBimeShode" title="كد بيمه شده"> </display:column>
        <display:column property="patientNationalID" title="کد ملی"> </display:column>
        <display:column property="serialMoarefiName" title="سريال معرفينامه"> </display:column>
        <display:column property="personelID" title="كد پرسنلي"> </display:column>
        <display:column property="pardakhtAzMahal" title=" پرداخت از محل"> </display:column>
        <%--<display:column property="receptionExcelNotExistIP" title=" تاريخ شروع بيمه نامه"> </display:column>--%>
        <%--<display:column property="receptionExcelNotExistIP" title="تاريخ پايان بيمه نامه"> </display:column>--%>
        <display:column property="codeTarh" title="کد طرح"></display:column>
        <display:column property="policyName" title="نام طرح"></display:column>
        <display:column property="tasvieShode" title="تسويه شده"></display:column>
        <display:column property="shomareBaygani" title="شماره بایگانی"></display:column>
        <display:column property="grouhKariBimeGozar" title="گروه کاری بیمه گذار"></display:column>
        <display:column property="tarikhBimari" title="تاريخ بيماري"></display:column>
        <display:column property="tarikhElamKhesarat" title="تاريخ اعلام خسارت"></display:column>
        <display:column property="noeBimari" title="نوع بيماري"></display:column>
        <display:column property="karshenasParvande" title="كارشناس پرونده"></display:column>
        <display:column property="codeKarshenas" title="كد كارشناس"></display:column>
        <display:column property="vehedeSodour" title="واحد صدور"></display:column>
        <display:column property="vehedeMoaref" title="واحد معرف"></display:column>
        <display:column property="nameKarshenas" title="نام كارشناس"></display:column>
        <display:column property="nameMarkazDarmani" title="نام مركز درماني"></display:column>
        <display:column property="noeTahvilMadarek" title="نوع تحويل مدارك"></display:column>
        <display:column property="vazeiatParvande" title="وضعیت پرونده"></display:column>
        <display:column property="karbarSabteParvande" title="کاربر ثبت پرونده"></display:column>
        <display:column property="gruheBimari" title="گروه بیماری"></display:column>
        <display:column property="codeRayaneMoredKhesarat" title="کد رایانه مورد خسارت"></display:column>

        <display:column title="هزينه پاراكلينيكي اعلام شده"><fmt:formatNumber type="number"
                                                                              maxFractionDigits="3">${viewDBReceptionExcel.hazineParaElami}</fmt:formatNumber></display:column>

        <display:column title="مبلغ محاسبه شده مطابق تعرفه"><fmt:formatNumber type="number"
                                                                              maxFractionDigits="3">${viewDBReceptionExcel.mablaghMohasebeSodeMotabeghTarefe}</fmt:formatNumber></display:column>

        <display:column title="هزينه پاراکلينيکي پرداخت شده"><fmt:formatNumber type="number"
                                                                               maxFractionDigits="3">${viewDBReceptionExcel.hazineParaPardakhti}</fmt:formatNumber></display:column>
        <display:column title="هزينه بیمارستانی اعلام شده"><fmt:formatNumber type="number"
                                                                             maxFractionDigits="3">${viewDBReceptionExcel.hazineBimarestaniElami}</fmt:formatNumber></display:column>
        <display:column title="هزينه بیمارستانی پرداخت شده"><fmt:formatNumber type="number"
                                                                              maxFractionDigits="3">${viewDBReceptionExcel.hazineBimarestaniPardakhti}</fmt:formatNumber></display:column>
        <display:column property="maliat" title="ماليات"></display:column>
        <display:column title="فرانشيز"><fmt:formatNumber type="number"
                                                          maxFractionDigits="3">${viewDBReceptionExcel.franshiz}</fmt:formatNumber></display:column>

    </display:table>
</div>