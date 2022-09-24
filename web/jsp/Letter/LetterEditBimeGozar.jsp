<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<script src="/js/LetterReport.js"></script>


<s:form  method="post" >
    <div class="flip">
ویرایش بیمه گذار
    </div>
    <table class="table">
        <tr >
            <td>
                <span class="required">*</span>
                شماره بیمه نامه
            </td>
            <td>
                <input type="hidden" id="queryinfopolicy" name="queryinfo" value="6"/>
                <input type="hidden" id="policyNo" name="policyNo" value="${policyNo}"  />
                <s:textfield id="policy" name="policy" class="form-control" theme="simple" onchange="makeEmpty('policy','policy');"></s:textfield>
            </td>
        </tr>

        <tr>
            <td>
<%--                <sec:authorize access="hasRole('LetterSearchBimeGozar')">--%>
                    <input class="submitButton" theme="simple" formaction="LetterSearchBimeGozar" align="center" type="submit"  value="جستجو"/>
<%--                </sec:authorize>--%>
            </td>
        </tr>
    </table>
</s:form>
<div style="text-align: center; font-weight: bold" class="errorMessage">${errorMessage}</div>
<div style="text-align: center; font-weight: bold" class="actionMessage">${message}</div>

<display:table export="true" name="bimeGozarList" id="bimeGozarList" uid="bimeGozars" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/LetterSearchBimeGozar">
    <display:column property="policyno" title="شماره بیمه نامه"/>
    <display:column property="bimeGozar" title="بیمه گذار"/>
    <display:column property="shobe" title="شعبه"/>

    <display:column media="html">
        <form method="post" action="LetterShowPolicyForEdit" target="_blank">
            <input type="hidden" name="policyNo" value="${bimeGozars.policyno}"/>
            <input type="submit" class="submitButton" theme="simple"  value="مشاهده بیمه گذار"/>
        </form>
    </display:column>
</display:table>
