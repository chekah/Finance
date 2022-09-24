<%--
  Created by IntelliJ IDEA.
  User: a-naderi
  Date: 7/25/2017
  Time: 8:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>



<%-----------------------------------------------------------------------------------------------------------------------------------------------------------%>

<%--جستجو --%>
<div id="flip" class="flip" name="">جستجو</div>
<form >
    <table class="table">
        <tbody>
        <tr>
            <td class="texttd">شماره بيمه نامه</td>
            <td class="rightAlign">
                <input type="text" class="form-control Policy lefttoright" id="policyNO" name="policyNO"/>
            </td>
            <td class="texttd">شماره صورتحساب</td>
            <td class="rightAlign">
                <input type="text" class="form-control internalLetterNo lefttoright" id="invoiceNo" name="invoiceNo"/>
            </td>
        </tr>

        <tr>
            <td class="texttd">کد ملي</td>
            <td class="rightAlign">
                <input type="text" class="form-control nationalID lefttoright" id="nationalNO" name="nationalNO"/>
            </td>
            <td class="texttd">وضعيت</td>
            <td class="rightAlign">
                <select name="state" id="state" class="form-control">
                    <option  value="" >انتخاب كنيد</option>
                    <option  value="1">ثبت شده</option>
                    <option  value="2">تاييد معاون فني</option>
                    <option  value="3">تاييد معاون مالي</option>
                    <option  value="4">ارسال به بانک</option>
                    <option  value="5">پرداخت شده</option>
                    <option  value="6">خطاي درگاه</option>
                    <option  value="9">بلاتکلیف</option>

                </select>
            </td>
        </tr>

        <tr>
            <td class="texttd">تاريخ ثبت از</td>
            <td class="rightAlign">
                <input type="text" class=" date form-control lefttoright  " id="createDateFrom"name="createDateFrom" value="${createDateFrom}"></input>
            </td>
            <td class="texttd">تاريخ ثبت تا</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="createDateTo" name="createDateTo" value="${createDateTo}"></input>
            </td>
        </tr>

        <tr>
            <td class="texttd">تاريخ اعلام به مالي پارسيان از</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="elamBeMaliDateFrom" name="elamBeMaliDateFrom" value="${elamBeMaliDateFrom}"></input>
            </td>
            <td class="texttd">تاريخ اعلام به مالي پارسيان تا</td>
            <td class="rightAlign">
                <input type="text"  class=" date form-control lefttoright  " id="elamBeMaliDateTo"  name="elamBeMaliDateTo" value="${elamBeMaliDateTo}"></input>
            </td>
        </tr>

        <tr>
            <td colspan="4">

                    <%--
                <c:if test="${user.getSemat().getId().intValue()==1 }">
                    <input type="submit" class="submitButton" name="submit" value="مدیریت سیستم" formaction="SystemManagment"/>
                </c:if>
                --%>


                <c:if test="${user.getSemat().getId().intValue()==2 || user.getSemat().getId().intValue()==1 || user.getSemat().getId().intValue()==6 || user.getSemat().getId().intValue()==7}">
                        <input type="submit" class="submitButton" name="submit" value=" جستجو مدير فني" formaction="searchFanniManager"/>
                </c:if>

                <c:if test="${user.getSemat().getId().intValue()==3 || user.getSemat().getId().intValue()==1}">
                    <input type="submit" class="submitButton" name="submit"  value="جستجو مدير مالي" formaction="searchMaliManager"/>
                </c:if>

                <c:if test="${user.getSemat().getId().intValue()==4 || user.getSemat().getId().intValue()==1}">
                    <input type="submit" class="submitButton" name="submit"  value=" جستجو معاون فني" formaction="searchFanniSubManager"/>
                </c:if>

                <c:if test="${user.getSemat().getId().intValue()==5 || user.getSemat().getId().intValue()==1}">
                         <input type="submit" class="submitButton" name="submit"  value="جستجو معاون مالي" formaction="searchMaliSubManager"/>
                </c:if>
            </td>
        </tr>
        </tbody>
    </table>
</form>


<%-----------------------------------------------------------------------------------------------------------------------------------------------------------%>

<%--مدير فني يا ادمين--%>

<c:if test="${user.getSemat().getId().intValue() == 1 || user.getSemat().getId().intValue() == 2 || user.getSemat().getId().intValue()==6}">
<display:table export="true" name="credebitList" id="credebitList" uid="credebit" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/searchFanniManager">

    <display:column title="رديف ">${credebit_rowNum}</display:column>
    <display:column property="policyNo" title="شماره بيمه نامه"/>
    <display:column property="orgName" title="نام بيمه گذار"/>
    <display:column property="nationalID" title="کد ملي"/>
    <display:column property="personName" title="نام شخص"/>
    <display:column property="invoiceNo" title="شماره صورتحساب"/>
    <display:column title="مبلغ(ريال)"><fmt:formatNumber type="number" maxFractionDigits="3">${credebit.mablagh}</fmt:formatNumber></display:column>
    <display:column property="state" title="وضعيت"/>
    <display:column property="entryDate" title="تاريخ ثبت"/>
    <display:column property="entryUser" title="کاربر ثبت کننده"/>
    <display:column property="elamBeMaliDate" title="تاريخ اعلام به مالي"/>
    <display:column property="receptionDate" title="تاريخ ثبت هزينه"/>
    <display:column property="secretariatDate" title="تاريخ ورود به دبيرخانه"/>
    <display:column property="sheba" title="شماره شبا"/>
    <display:column property="sanamCredebitId" title="کد رهگیری بانک"/>
    <display:column property="cs2CreateDate" title="تاریخ امضای اول"/>
    <display:column property="cs3CreateDate" title="تاریخ امضای دوم"/>

    <display:column media="html">
        <form method="post" action="viewCharkhe" target="_blank">
            <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
            <input type="submit" class="submitButton" theme="simple"  value="مشاهده چرخه"/>
        </form>
    </display:column>

</display:table>

</c:if>


<%----------------------------------------------------------------------------------------------------------------------------------------------------------%>


<%--مدير مالي--%>
<c:if test="${user.getSemat().getId().intValue()==3}">
<display:table export="true" name="credebitList" id="credebitList" uid="credebit" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/searchMaliManager">

    <display:column title="رديف ">${credebit_rowNum}</display:column>
    <display:column property="policyNo" title="شماره بيمه نامه"/>
    <display:column property="orgName" title="نام بيمه گذار"/>
    <display:column property="nationalID" title="کد ملي"/>
    <display:column property="personName" title="نام شخص"/>
    <display:column property="invoiceNo" title="شماره صورتحساب"/>
    <display:column title="مبلغ(ريال)"><fmt:formatNumber type="number" maxFractionDigits="3">${credebit.mablagh}</fmt:formatNumber></display:column>
    <display:column property="state" title="وضعيت"/>
    <display:column property="entryDate" title="تاريخ ثبت"/>
    <display:column property="entryUser" title="کاربر ثبت کننده"/>
    <display:column property="elamBeMaliDate" title="تاريخ اعلام به مالي"/>
    <display:column property="receptionDate" title="تاريخ ثبت هزينه"/>
    <display:column property="secretariatDate" title="تاريخ ورود به دبيرخانه"/>
    <display:column property="sheba" title="شماره شبا"/>
    <display:column property="sanamCredebitId" title="کد رهگیری بانک"/>
    <display:column property="cs2CreateDate" title="تاریخ امضای اول"/>
    <display:column property="cs3CreateDate" title="تاریخ امضای دوم"/>

    <display:column media="html">
             <form method="post" action="ersalBeBank">
                <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
                <input type="submit" class="submitButton" theme="simple" value="تاييد"/>
            </form>
     </display:column>

    <display:column media="html">
        <form method="post" action="pardakhtBaCheck">
            <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
            <input type="submit" class="submitButton" theme="simple" value="پرداخت با چک"/>
        </form>
    </display:column>

    <display:column media="html">
        <form method="post" action="viewCharkhe" target="_blank">
            <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
            <input type="submit" class="submitButton" theme="simple"  value="مشاهده چرخه"/>
        </form>
    </display:column>

</display:table>


    <br/>
    <form method="post">
        <input type="hidden" name="policyNO" value="${policyNO}">
        <input type="hidden" name="invoiceNo" value="${invoiceNo}">
        <input type="hidden" name="nationalNO" value="${nationalNO}">
        <input type="hidden" name="state" value="${state}">
        <input type="hidden" name="createDateFrom" value="${createDateFrom}">
        <input type="hidden" name="createDateTo" value="${createDateTo}">
        <input type="hidden" name="elamBeMaliDateFrom" value="${elamBeMaliDateFrom}">
        <input type="hidden" name="elamBeMaliDateTo" value="${elamBeMaliDateTo}">
        <input formaction="teedGrouhiErsalBeBank"  type="submit"  value="تأييد همه"/>
    </form>

</c:if>

<%----------------------------------------------------------------------------------------------------------------------------------------------------------%>

<!--معاون فني3-->

<c:if test="${user.getSemat().getId().intValue()==4}">
<display:table export="true" name="credebitList" id="credebitList" uid="credebit" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/searchFanniSubManager">

    <display:column title="رديف ">${credebit_rowNum}</display:column>
    <display:column property="policyNo" title="شماره بيمه نامه"/>
    <display:column property="orgName" title="نام بيمه گذار"/>
    <display:column property="nationalID" title="کد ملي"/>
    <display:column property="personName" title="نام شخص"/>
    <display:column property="invoiceNo" title="شماره صورتحساب"/>
    <display:column title="مبلغ(ريال)"><fmt:formatNumber type="number" maxFractionDigits="3">${credebit.mablagh}</fmt:formatNumber></display:column>
    <display:column property="state" title="وضعيت"/>
    <display:column property="entryDate" title="تاريخ ثبت"/>
    <display:column property="entryUser" title="کاربر ثبت کننده"/>
    <display:column property="elamBeMaliDate" title="تاريخ اعلام به مالي"/>
    <display:column property="receptionDate" title="تاريخ ثبت هزينه"/>
    <display:column property="secretariatDate" title="تاريخ ورود به دبيرخانه"/>
    <display:column property="sheba" title="شماره شبا"/>
    <display:column property="sanamCredebitId" title="کد رهگیری بانک"/>
    <display:column property="cs2CreateDate" title="تاریخ امضای اول"/>
    <display:column property="cs3CreateDate" title="تاریخ امضای دوم"/>

     <display:column media="html">
            <form method="post" action="teedMoavenFani">
                <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
                <input type="submit" class="submitButton" theme="simple" value="تاييد"/>
            </form>
      </display:column>

    <display:column media="html">
        <form method="post" action="viewCharkhe" target="_blank">
            <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
            <input type="submit" class="submitButton" theme="simple"  value="مشاهده چرخه"/>
        </form>
    </display:column>

</display:table>


    <br/>
    <table>
        <tr>
            <td>
                مجموع مبلغ خسارت ها:
            </td>
            <td>
                    ${sumMablaghStr}
            </td>
        </tr>
    </table>

    <form method="post">


        <input type="hidden" name="policyNO" value="${policyNO}">
        <input type="hidden" name="invoiceNo" value="${invoiceNo}">
        <input type="hidden" name="nationalNO" value="${nationalNO}">
        <input type="hidden" name="state" value="${state}">
        <input type="hidden" name="createDateFrom" value="${createDateFrom}">
        <input type="hidden" name="createDateTo" value="${createDateTo}">
        <input type="hidden" name="elamBeMaliDateFrom" value="${elamBeMaliDateFrom}">
        <input type="hidden" name="elamBeMaliDateTo" value="${elamBeMaliDateTo}">
        <input formaction="teedGrouhiMoavenFani"  type="submit"  value="تأييد همه"/>

    </form>



</c:if>


<%----------------------------------------------------------------------------------------------------------------------------------------------------------%>

<!--معاون مالي4-->
<c:if test="${user.getSemat().getId().intValue()==5}">
<display:table export="true" name="credebitList" id="credebitList" uid="credebit" class="table table-bordered displaytable"
               sort="external" excludedParams="" style="width: 100%; margin: 0 auto;" requestURI="/searchMaliSubManager">

    <display:column title="رديف ">${credebit_rowNum}</display:column>
    <display:column property="policyNo" title="شماره بيمه نامه"/>
    <display:column property="orgName" title="نام بيمه گذار"/>
    <display:column property="nationalID" title="کد ملي"/>
    <display:column property="personName" title="نام شخص"/>
    <display:column property="invoiceNo" title="شماره صورتحساب"/>
    <display:column title="مبلغ(ريال)"><fmt:formatNumber type="number" maxFractionDigits="3">${credebit.mablagh}</fmt:formatNumber></display:column>
    <display:column property="state" title="وضعيت"/>
    <display:column property="entryDate" title="تاريخ ثبت"/>
    <display:column property="entryUser" title="کاربر ثبت کننده"/>
    <display:column property="elamBeMaliDate" title="تاريخ اعلام به مالي"/>
    <display:column property="receptionDate" title="تاريخ ثبت هزينه"/>
    <display:column property="secretariatDate" title="تاريخ ورود به دبيرخانه"/>
    <display:column property="sheba" title="شماره شبا"/>
    <display:column property="sanamCredebitId" title="کد رهگیری بانک"/>
    <display:column property="cs2CreateDate" title="تاریخ امضای اول"/>
    <display:column property="cs3CreateDate" title="تاریخ امضای دوم"/>

     <display:column media="html">
            <form method="post" action="teedMoavenMali">
                <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
                <input type="submit" class="submitButton" theme="simple" value="تاييد"/>
            </form>
      </display:column>

    <display:column media="html">
        <form method="post" action="viewCharkhe" target="_blank">
            <input type="hidden" name="credebitID" value="${credebit.credebitID}"/>
            <input type="submit" class="submitButton" theme="simple"  value="مشاهده چرخه"/>
        </form>
    </display:column>

</display:table>



    <br/>
    <form method="post">
        <input type="hidden" name="policyNO" value="${policyNO}">
        <input type="hidden" name="invoiceNo" value="${invoiceNo}">
        <input type="hidden" name="nationalNO" value="${nationalNO}">
        <input type="hidden" name="state" value="${state}">
        <input type="hidden" name="createDateFrom" value="${createDateFrom}">
        <input type="hidden" name="createDateTo" value="${createDateTo}">
        <input type="hidden" name="elamBeMaliDateFrom" value="${elamBeMaliDateFrom}">
        <input type="hidden" name="elamBeMaliDateTo" value="${elamBeMaliDateTo}">
        <input formaction="teedGrouhiMoavenMali"  type="submit"  value="تأييد همه"/>
    </form>
</c:if>



<%----------------------------------------------------------------------------------------------------------------------------------------------------------%>




<div style="text-align: center; color: red; font-weight: bold ">${errorMessage}</div>
<div style="text-align: center; color: green; font-weight: bold ">${actionMessage}</div>