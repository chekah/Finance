/**
 * Created by ach on 8/19/2020.
 */



jQuery(document).ready(function(){
    $( "#policyNo" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'policyname','width':'50','label':'نام  بیمه نامه'},{'columnName':'policyno','width':'50','label':'شماره بیمه نامه'}],
        select: function(event, ui){
            $("#policyNo").val(ui.item.policyno+" "+ui.item.policyname);
            $("#policyID").val(ui.item.id);
            return false;
        }
    });
});


jQuery(document).ready(function(){
    $( "#hasSheba" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'namefarsi','width':'100','label':'شبا'}],
        select: function(event, ui){
            $("#hasSheba").val(ui.item.namefarsi);
            $("#hasShebaID").val(ui.item.code);
            return false;
        }
    });
});


jQuery(document).ready(function(){
    $( "#hasMobile" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'namefarsi','width':'100','label':'موبایل'}],
        select: function(event, ui){
            $("#hasMobile").val(ui.item.namefarsi);
            $("#hasMobileID").val(ui.item.code);
            return false;
        }
    });
});

jQuery(document).ready(function(){
    $( "#susState" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'namefarsi','width':'100','label':'وضعیت'}],
        select: function(event, ui){
            $("#susState").val(ui.item.namefarsi);
            $("#stateCode").val(ui.item.code);
            return false;
        }
    });
});


function searchMainInsuredPersonFormValidation(thisform)
{
    var frmvalidator = new Validator(thisform);
    frmvalidator.EnableOnPageErrorDisplay();
    frmvalidator.EnableMsgsTogether();
    frmvalidator.addValidation("mainNationalID","req","کد ملی بیمه شده اصلی الزامی است");
    frmvalidator.addValidation("policyID","req","انتخاب بیمه نامه الزامی است");
}

function searchInsuredPersonFormValidation(thisform)
{
    var frmvalidator = new Validator(thisform);
    frmvalidator.EnableOnPageErrorDisplay();
    frmvalidator.EnableMsgsTogether();
    frmvalidator.addValidation("nationalID","req","کد ملی بیمه شده الزامی است");
    frmvalidator.addValidation("policyID","req","انتخاب بیمه نامه الزامی است");
}

function addDataToMovingForm(info) {
    document.getElementById("insuredPersonCode").value=info['insuredPersonCode'];
}

jQuery(document).ready(function(){
    $( "#policyNo2" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'policyname','width':'50','label':'نام  بیمه نامه'},{'columnName':'policyno','width':'50','label':'شماره بیمه نامه'}],
        select: function(event, ui){
            $("#policyNo2").val(ui.item.policyno+" "+ui.item.policyname);
            $("#policyID2").val(ui.item.id);
            return false;
        }
    });
});

function addDataToMovingFamilyForm(info) {
    document.getElementById("mainInsuredPersonID").value=info['mainInsuredPersonID'];
}

jQuery(document).ready(function(){
    $( "#policyNo3" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'policyname','width':'50','label':'نام  بیمه نامه'},{'columnName':'policyno','width':'50','label':'شماره بیمه نامه'}],
        select: function(event, ui){
            $("#policyNo3").val(ui.item.policyno+" "+ui.item.policyname);
            $("#policyID3").val(ui.item.id);
            return false;
        }
    });
});