jQuery(document).ready(function(){
    $( "#insuredName" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'bimegozar','width':'100','label':'نام  بیمه نامه'}],
        select: function(event, ui){
            $("#insuredName").val(ui.item.bimegozar);
            $("#insured").val(ui.item.bimegozar);
            return false;
        }
    });
});
jQuery(document).ready(function(){
    $( "#policy" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'bimegozar','width':'50','label':'نام  بیمه نامه'},{'columnName':'policyno','width':'50','label':'شماره بیمه نامه'}],
        select: function(event, ui){
            $("#policy").val(ui.item.bimegozar+"-"+ui.item.policyno);
            $("#policyNo").val(ui.item.policyno);
            return false;
        }
    });
});

jQuery(document).ready(function(){
    $( "#vosoul" ).combogrid({
        url: 'combogridServlet.do',
        searchButton:true,
        debug:true,
        colModel: [{'columnName':'code','width':'50','label':'کد'},{'columnName':'namefarsi','width':'50','label':'وضعیت وصولی'}],
        select: function(event, ui){
            $("#vosoul").val(ui.item.code+"-"+ui.item.namefarsi);
            $("#isVosoul").val(ui.item.code);
            return false;
        }
    });
});