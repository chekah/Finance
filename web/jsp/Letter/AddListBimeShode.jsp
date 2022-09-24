<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<div class="flip">آپلود فايل</div>
<s:form id="pazireshForm" enctype="multipart/form-data" method="post">
    <table id=table1 class="table ">
        <tbody>
        <tr>
            <td width=""></td>
            <td class="texttd"><span class="required">*</span>
                آپلود فایل
            </td>
            <td class="rightAlign">
                <input type="file" name="upload" id="fileUpload" value="${upload}"/>
<%--                <s:file name="file" id="file" />--%>
                <div id='pazireshForm_file_errorloc' class="message"></div>
            </td>

            <td  class="rightAlign">
                    <%--ستون های سبز الزامی هستند--%>
<%--                <a href="ModiriatSystemDownloadSampleSabteBimehShode" class="submitButton">دانلود فايل نمونه </a>--%>
            </td>

            <td>
                <sec:authorize access="hasRole('LetterSavePerson')">
                    <s:submit type="button" class="submitButton" action="LetterInsertBimeShode"
                              theme="simple" label="ارسال "></s:submit>
                </sec:authorize>
            </td>
        </tr>
        </tbody>
    </table>
</s:form>
<%--<script>pazireshFormFormValidation('pazireshForm')</script>--%>

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
