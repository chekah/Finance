

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<script src="/js/printLetter.js"></script>


<s:form  method="post" >
    <div class="flip">
        چاپ گزارش
    </div>
    <table class="table">
        <tr >
            <td>
                <span class="required">*</span>
                نام بیمه گذار
            </td>
            <td>
                <input type="hidden" id="queryinfoinsuredName" name="queryinfo" value="5"/>
                <input type="hidden" id="insured" name="insured" value="${insured}"  />
                <s:textfield id="insuredName" name="insuredName" class="form-control" theme="simple" onchange="makeEmpty('insuredName','insuredName');"></s:textfield>

            </td>
            <td>
                <span class="required">*</span>
                شماره بیمه نامه
            </td>
            <td>
                <input type="text" name="policyNo" id="policyNo" class="policy"/>
            </td>
            <td>
                <span class="required">*</span>
                ماه گزارش
            </td>
            <td>
                <input type="text" name="date" id="date"/>
            </td>
        </tr>
        <tr>
            <td>
                <sec:authorize access="hasRole('LetterPrint')">
                    <input class="submitButton" theme="simple" formaction="LetterGenerateLetter" align="center" type="submit"  value="چاپ"/>
                </sec:authorize>
                <sec:authorize access="hasRole('LetterPrint')">
                    <input class="submitButton" theme="simple" formaction="LetterGenerateLetterWithoutBack" align="center" type="submit"  value="چاپ بدون سربرگ"/>
                </sec:authorize>
            </td>
        </tr>
    </table>
</s:form>
