<%--
  Created by IntelliJ IDEA.
  User: Neda
  Date: 6/9/2021
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/jsp/taglibs.jsp" %>


<div>
    <table id=showingPolicy class="table table-bordered">
        <div id="flip1" class="flip">مشخصات بیمه نامه</div>
        <thead>
        <tr>
            <th>شماره بیمه نامه</th>
            <th>نام بیمه نامه</th>
            <th>تاريخ صدور</th>
            <th>نمایندگی</th>
            <th>تاریخ شروع بیمه نامه از ساعت 24 مورخ</th>
            <th>تاریخ پایان بیمه نامه از ساعت 24 مورخ</th>
            <th>وضعیت</th>
            <c:if test="${policy.suspond == null || (policy.suspond!=null  && policy.suspond==0)}">
                <th>تعلیق</th>
            </c:if>
            <c:if test="${policy.suspond == null ||  (policy.suspond!=null  && policy.suspond==1)}">
                <th>رفع تعلیق</th>
            </c:if>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td><s:property value="policy.policyno"/></td>
            <td><s:property value="policy.policyname"/></td>
            <td><s:property value="policy.issuancedateStr"/></td>
            <td><s:property value="policy.agencyid.name"/></td>
            <td><s:property value="policy.begindateStr"/></td>
            <td><s:property value="policy.enddateStr"/></td>
            <td><s:property value="policy.stateStr"/></td>
            <c:if test="${policy.suspond == null || (policy.suspond!=null  && policy.suspond==0)}">
                <td class="texttd">
                    <s:form>
                        <%--                        <sec:authorize access="hasRole('ModiriatSystemSuspondPolicy')">--%>
                        <input type="hidden" id="policyID" name="policyID" value="${policyID}"/>
                        <input type="hidden" id="type" name="type" value="1"/>
                        <s:submit type="button" class="submitButton" theme="simple" label="تعلیق"
                                  action="ModiriatSystemSuspondPolicy"/>
                        <%--                        </sec:authorize>--%>
                    </s:form>
                </td>
            </c:if>
            <c:if test="${policy.suspond == null ||  (policy.suspond!=null  && policy.suspond==1)}">
                <td class="texttd">
                    <s:form>
                        <%--                        <sec:authorize access="hasRole('ModiriatSystemFixTheSuspensionForPolicy')">--%>
                        <input type="hidden" id="policyID" name="policyID" value="${policyID}"/>
                        <input type="hidden" id="type" name="type" value="2"/>
                        <s:submit type="button" class="submitButton" theme="simple" label="رفع تعلیق"
                                  action="ModiriatSystemFixTheSuspensionForPolicy"/>
                        <%--                        </sec:authorize>--%>
                    </s:form>
                </td>
            </c:if>

        </tr>
        </tbody>
    </table>
</div>










