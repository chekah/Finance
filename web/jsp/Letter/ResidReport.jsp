<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<script src="/js/ResidReport.js"></script>


<s:form  method="post" >
    <div class="flip">
        گزارش رسیدهای پرداختی
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
                <input type="hidden" id="queryinfopolicy" name="queryinfo" value="6"/>
                <input type="hidden" id="policyNo" name="policyNo" value="${policyNo}"  />
                <s:textfield id="policy" name="policy" class="form-control" theme="simple" onchange="makeEmpty('policy','policy');"></s:textfield>
            </td>
        </tr>
        <tr>
            <td>
                شماره صورتحساب
            </td>
            <td>
                <input type="text" name="invoiceNo" id="invoiceNo" class="form-control"/>
            </td>
            <td>
                <span class="required">*</span>
                ماه گزارش
            </td>
            <td>
                <input type="text" name="date" id="date" class="form-control"/>
            </td>
        </tr>
        <tr>
            <td>
                شعبه
            </td>
            <td>
                <input type="text" name="shobe" id="shobe" class="form-control"/>
            </td>
            <td>شناسه پرداخت</td>
            <td>
                <input type="text" name="shenase" id="shenase" class="form-control">
            </td>
        </tr>
        <tr>
            <td>وضعیت وصول</td>
            <td>
                <input type="hidden" id="queryinfovosoul" name="queryinfo" value="7"/>
                <input type="hidden" id="isVosoul" name="isVosoul" value="${isVosul}"  />
                <s:textfield id="vosoul" name="vosoul" class="form-control" theme="simple" onchange="makeEmpty('vosoul','vosoul');"></s:textfield>
            </td>
        </tr>

        <tr>
            <td>
                <sec:authorize access="hasRole('LetterGenerateResid')">
                    <input class="submitButton" theme="simple" formaction="LetterGenerateResid" align="center" type="submit"  value="جستجو"/>
                </sec:authorize>
            </td>
            <td>
                <sec:authorize access="hasRole('LetterPrintResidAll')">
                    <input class="submitButton" theme="simple" formaction="LetterPrintResidAll" align="center" type="submit"  value="چاپ گروهی"/>
                </sec:authorize>
            </td>
        </tr>
    </table>
</s:form>
<display:table export="true" name="residList" id="residList" uid="resid" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/LetterGenerateResid">
    <display:column property="invoiceNo" title="شماره صورتحساب"/>
    <display:column property="policyNo" title="شماره بیمه نامه"/>
    <display:column property="bimeGozar" title="بیمه گذار"/>
    <display:column property="shobe" title="شعبه"/>
    <display:column property="sarresid" title="ماه صورتحساب"/>
    <display:column property="prm" title="حق بیمه کل"/>
    <display:column property="count" title="تعداد بیمه شده"/>
    <display:column property="mablagh" title="مبلغ واریزی"/>
    <display:column property="shenase" title="شناسه"/>
    <display:column property="shenaseBank" title="شناسه بانک"/>
    <display:column property="vosoulDate" title="تاریخ وصول"/>
    <display:column property="createDate" title="تاریخ ایجاد"/>
    <display:column property="createUser" title="کاربر ایجاد کننده"/>
    <display:column media="html">
        <form method="post" action="LetterPrintResid" target="_blank">
            <input type="hidden" name="invoiceNo" value="${resid.invoiceNo}"/>
            <input type="submit" class="submitButton" theme="simple"  value="چاپ"/>
        </form>
    </display:column>
</display:table>