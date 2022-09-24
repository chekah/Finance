<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 3/1/2021
  Time: 12:59 PM
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
<form id="movingForm" name="movingForm">
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
                    <div id='movingForm_policyID_errorloc' class="message"></div>


                </div>
            </td>
            <td class="texttd">
            <td class="texttd"><span class="required">*</span>
                کد ملی بیمه شده
            </td>
            <td class="rightAlign">
                <input type="text" class="form-control" id="nationalID" name="nationalID"
                       value="${nationalID}"/>
                <div id='movingForm_nationalID_errorloc' class="message"></div>
            </td>

        </tr>


        <tr>
            <td></td>
            <td></td>
            <td>
                <input type="submit" class="submitButton" name="submit0" value=" جست و جو"
                       formaction="ModiriatSystemSearchInsuredPerson"/>
            </td>

        </tr>
        </tbody>
    </table>
</form>
<script>searchInsuredPersonFormValidation('movingForm')</script>

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


<s:div id="flip3" class="flip">اطلاعات بیمه شده</s:div>

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
        <%--        <display:column property="mainInsuredPersonCode" title="کد بیمه شده اصلی"> </display:column>--%>
        <display:column property="nationalIDAsli" title="کد ملی بیمه شده اصلی"> </display:column>
        <display:column property="fullNameAsli" title="نام و نام خانوادگی بیمه شده اصلی"></display:column>
        <display:column property="beginDate" title="تاریخ شروع بیمه شده"> </display:column>
        <display:column property="endDate" title="تاریخ پایان بیمه شده"> </display:column>
        <display:column property="sheba" title="شماره شبا"> </display:column>
        <display:column property="mobile" title="موبایل"> </display:column>
        <%--        <display:column property="stateStr" title="وضعیت"> </display:column>--%>

        <display:column title="جا به جایی بیمه شده">
            <input type="button" class="submitButton" theme="simple" value="جا به جایی بیمه شده"
                   onclick="$('#showMovingForm').show();addDataToMovingForm({
                           'insuredPersonCode':'${viewPerson.insuredPersonCode}'
                           })"/>
        </display:column>


        <display:column title="جا به جایی خانواده">
            <c:choose>
                <c:when test="${viewPerson.insuredPersonCode==viewPerson.mainInsuredPersonCode}">
                    <input type="button" class="submitButton" theme="simple" value="جا به جایی خانواده"
                           onclick="$('#showMovingFamilyForm').show();addDataToMovingFamilyForm({
                                   'mainInsuredPersonID':'${viewPerson.mainInsuredPersonCode}'
                                   })"/>
                </c:when>
                <c:otherwise>
                    <div>
                        برای جا به جایی خانواده بیمه شده اصلی را انتخاب نمایید.
                    </div>

                </c:otherwise>
            </c:choose>
        </display:column>


    </display:table>


</div>


<div id="showMovingForm" class="hiddendiv">
    <div class="flip" name="">انجام عملیات جابه جایی بیمه شده</div>
    <div>
        <s:form method="post">

            <table id=table1 class="table ">

                <tr>
                    <td>
                        <s:hidden name="insuredPersonCode" id="insuredPersonCode"></s:hidden>
                    </td>

                </tr>
                <tr>

                    <td class="texttd">
                    <td class="texttd"><span class="required">*</span>
                        شماره بيمه نامه

                    </td>

                    <td class="rightAlign">
                        <div>
                            <input type="hidden" id="queryinfopolicyNo2" name="queryinfo" value="1"/>
                            <input type="hidden" id="policyID2" name="policyID" value="${policyID}"/>
                            <s:textfield id="policyNo2" name="policyNo2" class="form-control" theme="simple"
                                         onchange="makeEmpty('policyNo2','policyID');"></s:textfield>
                            <div id='showMovingForm_policyID_errorloc' class="message"></div>
                        </div>
                    </td>
                    <td class="texttd">
                    <td class="texttd"><span class="required">*</span>
                        کد ملی بیمه شده اصلی
                    </td>
                    <td class="rightAlign">
                        <input type="text" class="form-control" id="mainNationalID" name="mainNationalID"
                               value="${mainNationalID}"/>
                        <div id='showMovingForm_mainNationalID_errorloc' class="message"></div>
                    </td>

                </tr>
                <tr>
                    <td colspan="3"></td>
                    <td>
                        <sec:authorize access="hasRole('ModiriatSystemMoveInsuredPerson')">
                            <s:submit type="button" class="submitButton" theme="simple" label="ثبت"
                                      action="ModiriatSystemMoveInsuredPerson"/>
                        </sec:authorize>
                    </td>

            </table>
        </s:form>
    </div>


</div>


<div id="showMovingFamilyForm" class="hiddendiv">
    <div class="flip" name="">انجام عملیات جابه جایی خانواده</div>
    <div>
        <s:form method="post">

            <table id=table1 class="table ">

                <tr>
                    <td>
                        <s:hidden name="mainInsuredPersonID" id="mainInsuredPersonID"></s:hidden>
                    </td>

                </tr>
                <tr>

                    <td class="texttd">
                    <td class="texttd"><span class="required">*</span>
                        شماره بيمه نامه مقصد

                    </td>

                    <td class="rightAlign">
                        <div>
                            <input type="hidden" id="queryinfopolicyNo3" name="queryinfo" value="1"/>
                            <input type="hidden" id="policyID3" name="policyID" value="${policyID}"/>
                            <s:textfield id="policyNo3" name="policyNo3" class="form-control" theme="simple"
                                         onchange="makeEmpty('policyNo3','policyID');"></s:textfield>
                        </div>
                    </td>
                    <td class="texttd">
                    <td class="texttd"><span class="required">*</span>
                        کد پرسنلی جدید
                    </td>
                    <td class="rightAlign">
                        <input type="text" class="form-control" id="personelID" name="personelID"
                               value="${personelID}"/>
                    </td>

                </tr>

                <tr>
                    <td colspan="3"></td>
                    <td>
                        <sec:authorize access="hasRole('ModiriatSystemMoveFamily')">
                            <s:submit type="button" class="submitButton" theme="simple" label="ثبت"
                                      action="ModiriatSystemMoveFamily"/>
                        </sec:authorize>
                    </td>

            </table>
        </s:form>
    </div>


</div>


