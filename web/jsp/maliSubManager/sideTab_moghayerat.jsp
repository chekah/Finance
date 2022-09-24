<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="flip" class="flip" name="">مغایرت گیری</div>
<form action = "" method="post" enctype="multipart/form-data">
    <table class="table">
        <tbody>
        <tr>
            <td class="texttd">تاريخ از</td>
            <td class="rightAlign">
                <input type="text" class=" date form-control lefttoright  " id="createDateFrom"name="createDateFrom" value="${createDateFrom}"/>
            </td>
            <td class="texttd">تاريخ تا</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="createDateTo" name="createDateTo" value="${createDateTo}"/>
            </td>
        </tr>

        <tr>

            <td class="texttd">بارگزاری فایل بانک</td>
            <td class="rightAlign">
                <input type="file" class=" textinput form-control lefttoright  " id="BankFile" name="bankFileAddress" value="${BankFileAddress}"/>
            </td>

        </tr>

        <tr>
            <td class="texttd">بارگزاری فایل درمان</td>
            <td class="rightAlign">
                <input type="file" class=" textinput form-control lefttoright  " id="DarmanFile" name="darmanFileAddress" value="${DarmanFileAddress}"/>
            </td>

        </tr>

        <tr>
            <td>
                <input type="submit" class="submitButton" name="submit2" value=" مغایرت گیری" formaction="mali_MoghaieratGiri"/>
            </td>
        </tr>
        </tbody>
    </table>
</form>

<display:table export="true" name="moghayerat" id="viewSanadList" uid="viewSanad" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="">

    <display:column title="رديف ">${viewSanad_rowNum}</display:column>
    <display:column property="sanamCredebitId" title= "کدرهگیری بانک"/>
    <display:column property="mablagh" title="مبلغ"/>
    <display:column property="nationalID" title="کدملی"/>
    <display:column property="pardakhtdate" title="تاریخ پرداخت"/>
    <display:column property="fileType" title="نوع مغایرت"/>

</display:table>

<%--
<display:table export="true" name="viewSanadListPardakht2" id="viewSanadList" uid="viewSanadPardakht" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="">

    <display:column title="رديف ">${viewSanad_rowNum}</display:column>
    <display:column property="sanamcredebitid" title= "کدرهگیری بانک"/>
    <display:column property="mablagh" title="مبلغ"/>
    <display:column property="nationalid" title="کدملی"/>
    <display:column property="pardakhtdate" title="تاریخ پرداخت"/>


</display:table>
--%>

<div style="text-align: center; color: red; font-weight: bold ">${errorMessage}</div>
<div style="text-align: center; color: green; font-weight: bold ">${actionMessage}</div>
