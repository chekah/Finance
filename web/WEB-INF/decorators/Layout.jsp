<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="aminParsian.model.Tab" %>
<%@ page import="aminParsian.model.TabRelation" %>
<%@ page import="java.util.*" %>
<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page import="aminParsian.model.Users" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>سيستم ACH</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="/css/project.css">
    <script src="/js/jquery-2.1.4.js"></script>
    <%--<script src="/js/jquery.min.js"></script>--%>
    <script src="/js/jquery.maskedinput.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/project.js"></script>

    <link rel="stylesheet" type="text/css" media="screen" href="/css/jquery-ui-1.10.1.custom.css"/>
    <link rel="stylesheet" type="text/css" media="screen" href="/css/jquery.ui.combogrid.css"/>
    <script type="text/javascript" src="/js/jquery-ui-1.10.1.custom.min.js"></script>
    <script type="text/javascript" src="/js/jquery.ui.combogrid-1.6.3.js"></script>

    <script src="/js/jquery.validationEngine-fa.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/jquery.validationEngine.js" type="text/javascript" charset="utf-8"></script>
    <link rel="stylesheet" href="/css/validationEngine.jquery.css" type="text/css"/>
    <script src="/js/Validation.js" type="text/javascript" charset="utf-8"></script>
    <script src="/js/gen_validatorv4.js"></script>


</head>
<body>
<%!
    Map<Tab, List<TabRelation>> tabsList = null;
    Set topTabs = null;
    String topTabTitle;
    String topTabsactivationClass = "";
    int index = 0;
    String href;
    Tab topTab;

    Object[] toptabsArray =  null;
    int topTabSize = 0;


%>
<%

    if(session == null){
        response.sendRedirect("/loginUser.action");
    }

    tabsList = (Map<Tab, List<TabRelation>>) session.getAttribute("tabsList");
    if (tabsList == null) {
        response.sendRedirect("/loginUser.action");
    }

    try {
        topTabs = tabsList.keySet();
    } catch (Exception e) {
        e.printStackTrace();
    }
    TabRelation activeTabRelation = null;
    try {
        activeTabRelation = (TabRelation) session.getAttribute("activeTabRelation");
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
<div class="headers">
<div id="paneles" class="container">

    <%--top panel--%>

    <div id="top panel" class="panel-default" style="margin-left:0px; padding-left:0px">

        <button type="button" class="exit-guide-Button btn-default" href="exite">
            راهنما
        </button>
        <button type="button" class="exit-guide-Button btn-default" onclick="window.open('userManagementEnterChangePassword')" >
            تغییر رمز عبور
        </button>
        <button type="button" class="exit-guide-Button btn-default" id="exit_parsian_btn" >خروج</button>

        <div class="label label-primary" style="float: right; background: transparent;color: #ffffff">
             <% Users user = (Users) session.getAttribute("Login_User");%>
            <% if (user != null) { %>
            <%=user.getName()%>     خوش آمديد
              <%}%>

        </div>

    </div>

    <%--down  panel--%>
    <div id="down panel" class="panel-heading">

        <img src="/image/parsianlogo1.gif" class="img-rounded" alt="Cinque Terre" width="80" height="120"
             style="float: left;">

    </div>
</div>

<%--topTabs Generation--%>
<div id=toptabs class="" style="position:absolute; width:100%; ">
    <ul class="nav nav-tabs">
        <li class="">
            <a data-toggle="pill" href="" style="min-width: 70px; text-align: center">

            </a>
        </li>

        <%
            Tab topTabIterator;
            int topTabSize = 0;
            topTabSize = topTabs.size();
            Object[] toptabsArray =  topTabs.toArray();

            Tab[] sortedTopTab = new Tab[50];
            for (int i=0; i<topTabSize; i++) {
                sortedTopTab[i]=null;
            }
            for (int i=0; i<topTabSize; i++) {
                int index2 =  ((Tab)toptabsArray[i]).getSequencnum().intValue();
                sortedTopTab[index2]=(Tab)toptabsArray[i];
            }

            for (int i=0; i<50; i++) {
                if(sortedTopTab[i] == null) continue;
                topTab = (Tab)sortedTopTab[i];
                topTabTitle = topTab.getTitle();
                href = "#menu" + topTab.getId();
                index++;
                topTabsactivationClass = "";
                if (topTab.getId().longValue() == (activeTabRelation != null ? activeTabRelation.getTopTab().getId().longValue() : -1)) {
                    topTabsactivationClass = "active";
                }
        %>

        <li class="<%=topTabsactivationClass%>">
            <a data-toggle="pill" href="<%=href%>" style="min-width: 70px; text-align: center">
                <%=topTabTitle%>
            </a>
        </li>

        <% }%>

    </ul>
</div>

</div>
<div  >
<%--subTabs generation--%>
<div id=subtabs class="tab-content">

    <%!
        String id;
        int menuIndex = 0;
        String sideTabGroupActivationClass = "";
        String subTabTitle;
        TabRelation tabRelation;
        String subTabsactivationClass = "";
        String subTabsEnableClass="disabledTab";
        String sideTabActionName="";
        String  sideTabClass="";
    %>

    <%

        for (Iterator k = topTabs.iterator(); k.hasNext(); ) {

            Tab topTab = (Tab) k.next();
            id = "menu" + topTab.getId();
            menuIndex++;
            sideTabGroupActivationClass = "";
            if (topTab.getId().longValue() == (activeTabRelation != null ? activeTabRelation.getTopTab().getId().longValue() : -1)) {
                sideTabGroupActivationClass = "pill-pane fade in active";
            }
    %>

    <div id="<%=id%>" class="<%=sideTabGroupActivationClass %>" hidden="true">

        <div class="row">

            <div class="col-md-3">
                <div class="col-md-3 " style="position: absolute;top:27% ;right: -1.5%;">
                    <ul class="nav nav-pills nav-stacked ">
                        <%
                            Iterator j;
                            for (j = tabsList.get(topTab).iterator(); j.hasNext(); ) {

                                tabRelation = (TabRelation) j.next();
                                subTabTitle = tabRelation.getSideTab().getTitle();
                                subTabsactivationClass = "";
								String subTabsEnableClass="disabledTab";
								if(tabRelation.getEnable()==1) {
									subTabsEnableClass="";
									sideTabActionName = tabRelation.getActionReq().getActionname();
								}
                                if (tabRelation != null && tabRelation.getSideTab()!=null && activeTabRelation != null && activeTabRelation.getSideTab()!= null && tabRelation.getSideTab().getId().longValue() == activeTabRelation.getSideTab().getId().longValue()) {
                                    subTabsactivationClass = "active";
//                                  subTabsEnableClass="";
                                }

								sideTabClass=subTabsactivationClass+" "+subTabsEnableClass;

                        %>

                        <li class="<%=sideTabClass%>">

                            <a data-toggle="pill" href="<%=id%>" style="min-width: 181px;text-align: right"
                               onclick="window.open(action='<%=sideTabActionName%>','_self',null,null)">
                                <%=subTabTitle%>
                            </a>

                        </li>


                        <%}%>
                    </ul>
                </div>

            </div>
        </div>
    </div>

    <%}%>

</div>
<%--Content--%>
<div style="width: 85%">
            <div id="content " style="position: relative ;top:55px; right:200px; left:15px;" class="content">
        <dec:body/>

        <div id="footer" class="container" style="position:relative; bottom:15%;">
            <div class="panel-footer">
        <span class="label label-primary"
                      style="position:absolute; right:40%; background-color: transparent; color: #000000"> کليه حقوق اين وب سايت متعلق به بيمه‌ي پارسيان  مي‌باشد</span>
            </div>
        </div>

    </div>

</div>
    </div>
<script type="text/javascript">
    var dataInput = document.getElementById('exit_parsian_btn');
    $(document).ready(function ()
    {
        var username = '${user !=null ? user.username:0}';
        var password = '@password';
        if (username != '0')
        {
            if (!(username in localStorage))
            {
                localStorage.setItem(username, password);
            }
        }
    });

    dataInput.addEventListener
    (
            "click",
            function ()
            {
                var username = '<%=
            SecurityContextHolder.getContext().getAuthentication()!=null && SecurityContextHolder.getContext().getAuthentication().getName()!=null?SecurityContextHolder.getContext().getAuthentication().getName():0
            %>'
                localStorage.removeItem(username);
                window.location = '/j_spring_security_logout';
            }
    );

    window.addEventListener
    (

            'storage',
            function (event)
            {
                var username='<%=SecurityContextHolder.getContext().getAuthentication()!=null && SecurityContextHolder.getContext().getAuthentication().getName()!=null?SecurityContextHolder.getContext().getAuthentication().getName():0%>'
                if(username=='0')
                {}
                else
                {
                    if (username==event.key)
                    {
                        if(event.newValue==null)
                            window.location = '/j_spring_security_logout';
                    }
                }
            }
    );

    $(document).ajaxStart(
            function () {
                $('#main').mask('در حال بارگذاري');
            }).ajaxStop(function () {
        $('#main').unmask();
    });
    //    $(document).ajaxSetup({cache: false});
    $("#main").submit(function(){ $('#main').mask('در حال بارگذاري'); document.forms[0].submit(); })


    $(document).ready(function(){
        $('#main').unmask();
    });




</script>
</body>
</html>



