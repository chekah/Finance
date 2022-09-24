<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>


<div style="text-align: center; font-weight: bold" class="errorMessage">${errorMessage}</div>
<div style="text-align: center; font-weight: bold" class="actionMessage">${message}</div>

<div id="flip1" class="flip" >ویرایش اطلاعات بیمه نامه</div>
<form id="LetterChangePolicyData" action="LetterChangePolicyData">
    <table class="table">
        <tr>
            <td class="texttd">شماره بیمه نامه</td>
            <td class="rightAlign">
                <input type="hidden" class="form-control" id="policyNo" name="policyNo" value="${policyNo}"/>
                ${policyNo}
            </td>
        </tr>
        <tr>
            <td class="texttd">نام بیمه گذار</td>
            <td class="rightAlign">
                <input type="text" class="form-control" id="bimeGozar" name="bimeGozar" value="${bimeGozar}"/>
            </td>
        </tr>
        <tr>
            <td class="texttd">طرح</td>
            <td class="rightAlign">
                <input type="text" class="form-control" id="shobe" name="shobe" value="${shobe}"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td class="rightAlign">
                <input type="submit" class="submitButton"  value="ثبت"/>
            </td>
        </tr>
    </table>

</form>
