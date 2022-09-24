<%--
  Created by IntelliJ IDEA.
  User: ach
  Date: 8/19/2020
  Time: 7:15 PM
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
<form action = "">
    <table class="table">
        <tbody>

        <tr>

            <td class="texttd">
                شماره بيمه نامه

            </td>

            <td class="rightAlign">
                <div>
                    <input type="hidden" id="queryinfopolicyNo" name="queryinfo" value="1"/>
                    <input type="hidden" id="policyID" name="policyID" value="${policyID}"  />
                    <s:textfield id="policyNo" name="policyNo" class="form-control" theme="simple" onchange="makeEmpty('policyNo','policyID');"></s:textfield>


                </div>
            </td>

            <td class="texttd">کد پرنسلی</td>
            <td class="rightAlign">
                <input type="text"   class="form-control"  id="personelID" name="personelID" value="${personelID}"/>
            </td>
        </tr>
        <tr>
            <td class="texttd"/>کد ملی بیمار</td>
            <td class="rightAlign">
                <input type="text" class="form-control"   id="nationalID" name="nationalID" value="${nationalID}"/>
            </td>
            <td class="texttd">کد ملی بیمه شده اصلی</td>
            <td class="rightAlign">
                <input type="text"   class="form-control"  id="mainNationalID" name="mainNationalID" value="${mainNationalID}"/>
            </td>
        </tr>
        <tr>
            <td class="texttd">تاريخ ثبت از</td>
            <td class="rightAlign">
                <input type="text" class=" date form-control lefttoright  " id="createDateFrom"name="createDateFrom" value="${createDateFrom}"/>
            </td>
            <td class="texttd">تاريخ ثبت تا</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="createDateTo" name="createDateTo" value="${createDateTo}"/>
            </td>
        </tr>
        <tr>

            <td class="texttd">
شماره شبا

            </td>

            <td class="rightAlign">
                <div>
                    <input type="hidden" id="queryinfohasSheba" name="queryinfo" value="2"/>
                    <input type="hidden" id="hasShebaID" name="hasShebaID" value="${hasShebaID}"  />
                    <s:textfield id="hasSheba" name="hasSheba" class="form-control" theme="simple" onchange="makeEmpty('hasSheba','hasShebaID');"></s:textfield>


                </div>
            </td>

            <td class="texttd">
                شماره موبایل

            </td>

            <td class="rightAlign">
                <div>
                    <input type="hidden" id="queryinfohasMobile" name="queryinfo" value="3"/>
                    <input type="hidden" id="hasMobileID" name="hasMobileID" value="${hasMobileID}"  />
                    <s:textfield id="hasMobile" name="hasMobile" class="form-control" theme="simple" onchange="makeEmpty('hasMobile','hasMobileID');"></s:textfield>


                </div>
            </td>
        </tr>
        <tr>
            <td class="texttd">شماره شبا</td>
            <td class="rightAlign">
                <input type="text" class="  form-control lefttoright  " id="sheba"name="sheba" value="${sheba}"/>
            </td>
            <td class="texttd">شماره موبایل</td>
            <td class="rightAlign">
                <input type="text"  class="  form-control lefttoright  " id="mobile" name="mobile" value="${mobile}"/>
            </td>
        </tr>
        <tr>
            <td class="texttd">
                وضعیت تعلیق
            </td>
            <td class="rightAlign">
                <div>
                    <input type="hidden" id="queryinfosusState" name="queryinfo" value="4"/>
                    <input type="hidden" id="stateCode" name="stateCode" value="${stateCode}"  />
                    <s:textfield id="susState" name="susState" class="form-control" theme="simple" onchange="makeEmpty('susState','stateCode');"></s:textfield>
                </div>
            </td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td>
                <input type="submit" class="submitButton" name="submit0" value=" جست و جو" formaction="ReportsSearchInsuredPersonListReport"/>
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



<s:div id="flip3" class="flip">لیست بیمه شدگان ثبت شده در سیستم</s:div>
<%--<s:div id="panel3" class="sesrchpanel">--%>
<div style="overflow: auto;">
    <display:table export="true" name="paginatedViewInsuredPersonList" id="paginatedViewInsuredPersonList"
                   uid="viewPerson" class="table table-bordered displaytable"
                   sort="external" htmlId="dbList" excludedParams="" requestURI="/ReportsSearchInsuredPersonListReport.action">

        <display:column
                title="رديف">${(paginatedViewInsuredPersonList.objectsPerPage)*(paginatedViewInsuredPersonList.pageNumber-1)+viewPerson_rowNum}</display:column>


        <display:column property="insuredPersonCode" title="شناسه یکتا"> </display:column>
        <display:column property="policyNo" title="شماره بیمه نامه"> </display:column>
        <display:column property="policyName" title="نام بیمه گذار"> </display:column>
        <display:column property="fullName" title= "نام و نام خانوادگی"> </display:column>
        <display:column property="idNo" title="شماره شناسنامه"> </display:column>
        <display:column property="nationalID" title="کد ملی"> </display:column>
        <display:column property="birthDate" title="تاریخ تولد"> </display:column>
        <display:column property="fatherName" title="نام پدر"> </display:column>
        <display:column property="familyRelation" title="نسبت"> </display:column>
        <display:column property="gender" title="جنسیت"> </display:column>
        <display:column property="insuredPersonCode" title="کد بیمه شده"> </display:column>
        <display:column property="personelID" title="کد پرسنلی"> </display:column>
        <display:column property="mainInsuredPersonCode" title="کد بیمه شده اصلی"> </display:column>
        <display:column property="nationalIDAsli" title="کد ملی بیمه شده اصلی"> </display:column>
        <display:column property="fullNameAsli" title="نام و نام خانوادگی بیمه شده اصلی"></display:column>
        <display:column property="beginDate" title="تاریخ شروع بیمه شده"> </display:column>
        <display:column property="endDate" title="تاریخ پایان بیمه شده"> </display:column>
        <display:column property="sheba" title="شماره شبا"> </display:column>
        <display:column property="mobile" title="موبایل"> </display:column>
        <display:column property="suspondStateStr" title="وضعیت تعلیق"> </display:column>
    </display:table>



</div>
