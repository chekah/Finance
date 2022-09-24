<%--
  Created by IntelliJ IDEA.
  User: ach
  Date: 10/27/2020
  Time: 3:10 PM
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
ثبت بیمه گذار
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
                <a href="ModiriatSystemDownLoadSampleFileForSabteBimehGozar" class="submitButton">دانلود فايل نمونه </a>
            </td>
        </tr>


        <tr>
            <td colspan="3"></td>
            <td>
                <sec:authorize access="hasRole('ModiriatSystemSaveBimehGozar')">
                    <input class="submitButton" theme="simple" formaction="ModiriatSystemSaveBimehGozar" align="center" type="submit"  value="ثبت"/>
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
    <display:table export="true" name="paginatedViewPolicyList" id="paginatedViewPolicyList"
                   uid="viewPolicy" class="table table-bordered displaytable"
                   sort="external" htmlId="dbList" excludedParams="" requestURI="/ModiriatSystemSaveBimehGozarFile.action">

        <display:column
                title="رديف">${(paginatedViewPolicyList.objectsPerPage)*(paginatedViewPolicyList.pageNumber-1)+viewPolicy_rowNum}</display:column>

        <display:column property="policyNo" title="شماره بیمه نامه"> </display:column>
        <display:column property="codeRayaneBimehNameh" title="کد رایانه بیمه نامه"> </display:column>
        <display:column property="orgName" title=" نام بیمه گذار"> </display:column>
        <display:column property="codeSodour" title=" کد صدور"> </display:column>
        <display:column property="beginDate" title="تاریخ شروع بیمه نامه "> </display:column>
        <display:column property="endDate" title="تاریخ پایان بیمه نامه"> </display:column>
    </display:table>



</div>



