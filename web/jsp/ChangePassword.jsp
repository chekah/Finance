<%--
  Created by IntelliJ IDEA.
  User: a-naderi
  Date: 6/10/2017
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>


<html>
<body>


<div style="text-align: center; font-weight: bold" class="errorMessage">${errorMessage}</div>
<div style="text-align: center; font-weight: bold" class="actionMessage">${message}</div>


<s:if test="hasActionErrors()">
    <div class="alert alert-danger alert-dismissable fade in righttoleft">
        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        <strong class="righttoleft"> پیغام خطا :</strong >      <s:actionerror theme="simple"/>
    </div>
</s:if>

<s:if test="hasActionMessage()">
    <div class="alert alert-danger alert-dismissable fade in righttoleft">
        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        <strong class="righttoleft"> پیغام  :</strong ><s:actionmessage theme="simple"/>
    </div>
</s:if>

<script>userManagementChangePasswordValidation('userManagementChangePassword')</script>



<%--------------------------------------------------------------------------------------------------------------------------------------------------%>

<div id="flip1" class="flip" >تغییر رمزعبور</div>
<form id="userManagementChangePassword" action="userManagementChangePassword">

    <table class="table">
        <tr>
            <td class="texttd"><span class="required">*</span>رمز عبور</td>
            <td class="rightAlign"><input type="password" class="form-control" id="password" name="password" /></td>
            <div  id='userManagementChangePassword_password_errorloc' class="message"></div>
        </tr>
        <tr>
            <td class="texttd"><span class="required">*</span>رمز عبور جدید</td>
            <td class="rightAlign"><s:password key="password1" class="form-control" theme="simple" /></td>
            <div  id='userManagementChangePassword_password1_errorloc' class="message"></div>
        </tr>
        <tr>
            <td class="texttd"><span class="required">*</span>تکرار رمز عبور جدید</td>
            <td class="rightAlign"><s:password key="password2" class="form-control" theme="simple" /></td>
            <div  id='userManagementChangePassword_password2_errorloc' class="message"></div>
        </tr>
        <tr>
            <td></td>
            <td class="rightAlign">
                <input type="submit" class="submitButton"  value="ثبت"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>