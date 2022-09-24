<%--
  Created by IntelliJ IDEA.
  User: ach
  Date: 7/16/2020
  Time: 2:08 AM
  To change this template use File | Settings | File Templates.
--%>

<script src="/js/SearchHealthCenter.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>



<s:form  method="post" enctype="multipart/form-data">
    <div class="flip">
ثبت شماره شبا برای بیمه شدگان
    </div>

    <table class="table">
        <tr >

            <td>
                <span class="required">*</span>
                آپلود فايل اکسل
            </td>

            <td>
                <input type="file" name="fileUpload" id="fileUpload"/>
            </td>
            <td>
                <a href="ModiriatSystemDownLoadSampleFileForSabteSheba" class="submitButton">دانلود فايل نمونه </a>
            </td>
        </tr>


        <tr>
            <td colspan="3"></td>
            <td>
                <sec:authorize access="hasRole('ModiriatSystemSaveSheba')">
                    <input class="submitButton" theme="simple" formaction="ModiriatSystemSaveSheba" align="center" type="submit"  value="ثبت"/>
                </sec:authorize>
            </td>

        </tr>

    </table>

</s:form>

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




<s:div id="flip3" class="flip">لیست ثبت شده</s:div>

<div style="overflow: auto;">
    <display:table export="true" name="paginatedViewInsuredPersonList" id="paginatedViewInsuredPersonList"
                   uid="viewPerson" class="table table-bordered displaytable"
                   sort="external" htmlId="dbList" excludedParams="" requestURI="/ModiriatSystemSaveShebaFile.action">

        <display:column
                title="رديف">${(paginatedViewInsuredPersonList.objectsPerPage)*(paginatedViewInsuredPersonList.pageNumber-1)+viewPerson_rowNum}</display:column>

        <display:column property="policyNo" title="شماره بیمه نامه"> </display:column>
        <display:column property="firstName" title="نام"> </display:column>
        <display:column property="lastName" title="نام خانوادگی"> </display:column>
        <display:column property="nationalID" title="کد ملی"> </display:column>
        <display:column property="sheba" title="شماره شبا"> </display:column>

    </display:table>



</div>



