<%--
  Created by IntelliJ IDEA.
  User: ach
  Date: 6/15/2020
  Time: 11:21 PM
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
آپلود فایل بیمه شدگان
            </td>
            <td class="rightAlign">
                <input type="file" name="fileUpload" id="fileUpload" value="${fileUpload}"/>
                <div id='pazireshForm_fileUpload_errorloc' class="message"></div>
            </td>

            <td  class="rightAlign">
                <%--ستون های سبز الزامی هستند--%>
                <a href="ModiriatSystemDownloadSampleSabteBimehShode" class="submitButton">دانلود فايل نمونه </a>
            </td>

            <td>
                    <sec:authorize access="hasRole('ModiriatSystemSavePerson')">
                <s:submit type="button" class="submitButton" action="ModiriatSystemSavePerson" name="saveFile"
                          theme="simple" label="ارسال "></s:submit>
                    </sec:authorize>
            </td>
        </tr>
        </tbody>
    </table>
</s:form>
<script>pazireshFormFormValidation('pazireshForm')</script>

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

<s:div id="flip3" class="flip">لیست بیمه شدگان ثبت شده از اکسل</s:div>
<%--<s:div id="panel3" class="searchpanel">--%>
<div style="overflow: auto;">
    <display:table export="true" name="paginatedViewInsuredPersonList" id="paginatedViewInsuredPersonList"
                   uid="viewPerson" class="table table-bordered displaytable"
                   sort="external" htmlId="dbList" excludedParams="" requestURI="/ModiriatSystemSavePersonFile.action">

        <display:column
                title="رديف">${(paginatedViewInsuredPersonList.objectsPerPage)*(paginatedViewInsuredPersonList.pageNumber-1)+viewPerson_rowNum}</display:column>

        <display:column property="policyNo" title="شماره بیمه نامه"> </display:column>
        <display:column property="firstName" title="نام"> </display:column>
        <display:column property="lastName" title="نام خانوادگی"> </display:column>
        <display:column property="idNo" title="شماره شناسنامه"> </display:column>
        <display:column property="nationalID" title="کد ملی"> </display:column>
        <display:column property="birthDate" title="تاریخ تولد"> </display:column>
        <display:column property="fatherName" title="نام پدر"> </display:column>
        <display:column property="familyRelation" title="نسبت"> </display:column>
        <display:column property="gender" title="جنسیت"> </display:column>
        <display:column property="insuredPersonCode" title="کد بیمه شده"> </display:column>
        <display:column property="personelID" title="کد پرسنلی"> </display:column>
        <display:column property="mainInsuredPersonCode" title="کد بیمه شده اصلی"> </display:column>
        <display:column property="beginDate" title="تاریخ شروع بیمه شده"> </display:column>
        <display:column property="endDate" title="تاریخ پایان بیمه شده"> </display:column>
        <display:column property="sheba" title="شماره شبا"> </display:column>
        <display:column property="mobile" title="موبایل"> </display:column>
    </display:table>

</div>


