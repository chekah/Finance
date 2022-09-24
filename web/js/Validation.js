var row = 1;
var result = 5;
var res = 5;

function RequiredField(thisFeild, label, type){
	var error = "";
	var id = thisFeild.id;
	var value = document.getElementById(id).value;
	if((value == "" || value == null || value == '____/__/__') && type == 0){
		alert("لطفا " + label + " را وارد کنيد.");
		thisFeild.style.background = 'red';
	}
	/*else if((value == "" || value == null) && type == 1){
		error = "لطفا " + label + " را وارد کنيد.";
		return error;
	}*/
	else if(value != "" && value != null){
		thisFeild.style.background = 'white';
	}
	switch(type){
		case 1://FirstName, LastName, FatherName
			output = FarsiStringValidation(thisFeild.value, label);
			if(output == 1){
				alert(label + " بايد فقط از حروف فارسي تشکيل شده باشد.");
				thisFeild.style.background = 'red';
			}
			break;
		case 2://National Code
			output = ctype_digit(thisFeild.value);
			if(output == 1){
				alert(label + " بايد فقط از اعداد تشکيل شده باشد.");
				thisFeild.style.background = 'red';
			}
			else{
				output = DigitsValidation(thisFeild.value, 10, label);
				if(output == 1){
					alert(label + " بايد " + 10 + " رقم باشد.");
					thisFeild.style.background = 'red';
				}
				else{
					output = NationalIDValidation(thisFeild.value, label);
					if(output == 1){
						alert(label + " معتبر نمي باشد.");
						thisFeild.style.background = 'red';
					}
				}
			}
			break;
		case 3://ID Number
			output = ctype_digit(thisFeild.value);
			if(output == 1){
				alert(label + " بايد فقط از اعداد تشکيل شده باشد.");
				thisFeild.style.background = 'red';
			}
			break;
		case 4://BirthDate
			break;
		case 5://Phone Number
			output = ctype_digit(thisFeild.value);
			if(output == 1){
				alert(label + " بايد فقط از اعداد تشکيل شده باشد.");
				thisFeild.style.background = 'red';
			}
			else{
				output = DigitsValidation(thisFeild.value, 11, label);
				if(output == 1){
					alert(label + " بايد " + 11 + " رقم باشد.");
					thisFeild.style.background = 'red';
				}
			}
			break;
		case 6://Postal Code
			output = ctype_digit(thisFeild.value);
			if(output == 1){
				alert(label + " بايد فقط از اعداد تشکيل شده باشد.");
				thisFeild.style.background = 'red';
			}
			else{
				output = DigitsValidation(thisFeild.value, 10, label);
				if(output == 1){
					alert(label + " بايد " + 10 + " رقم باشد.");
					thisFeild.style.background = 'red';
				}
			}
			break;
		case 7://address
			output = ctype_digit(thisFeild.value);
			if(output=="" || output==null){
			alert(label + " نمي تواند خالي باشد.");
				thisFeild.style.background = 'red';
			}	
			break;
		case 8://sheba
			output = ctype_digit(thisFeild.value);
			if(output == 1){
				alert(label + " بايد فقط از اعداد تشکيل شده باشد.");
				thisFeild.style.background = 'red';
			}
			else{
				output = DigitsValidation(thisFeild.value, 24, label);
				if(output == 1){
					alert(label + " بايد " + 24 + " رقم باشد.");
					thisFeild.style.background = 'red';
				}
			}
			break;
		case 9://mail
			output = MailValidation(thisFeild);
			if(output == 1){
				alert(label + " وارد شده اشتباه مي باشد.");
				thisFeild.style.background = 'red';
			}
			break;
	}
}

function RequiredForm(thisForm, titles, rows){
	var id = thisForm.id;

	for(i=0; i<= 0; i++){
		for(j=0; j < titles[0].length; j++){
			if(document.forms[id].elements[titles[0][j][0]+i].value == null || document.forms[id].elements[titles[0][j][0]+i].value == ""){
				alert("لطفا " + titles[0][j][1] + " را وارد کنيد.");
				document.forms[id].elements[titles[0][j][0]+i].style.background = 'red';
				document.forms[id].elements[titles[0][j][0]+i].focus();
				return false;
			}
		}
	}
	
	for(i=1; i <= rows; i++){
		for(j=0; j < titles[1].length; j++){
			if((document.forms[id].elements[titles[1][j][0]+i].value == null || document.forms[id].elements[titles[1][j][0]+i].value == "") && document.forms[id].elements[titles[1][j][0]+i].disabled != true){
				alert("لطفا " + titles[1][j][1] + " را وارد کنيد.");
				document.forms[id].elements[titles[1][j][0]+i].style.background = 'red';
				document.forms[id].elements[titles[1][j][0]+i].focus();
				return false;
			}
		}
	}
	
	var output = RelationSexValidation(thisForm, rows);
	if(output == 1){
		alert("نسبت خانوادگي با جنسيت مطابقت ندارد.");
		return false;
	}

	return true;
}

function checkToday(form){
	with(form){
		if(jalali_today() > form.dateFrom.value){
			alert("امکان صدور بيمه نامه به تاريخ قبل وجود ندارد");
			form.dateFrom.focus();
		}
	}
}

function isJalaliYearLeap(year){
	var mod33 = year % 33;
	if(mod33 < 21)
		var isLeap = (mod33%4 == 1);
	else
		var isLeap = (mod33%4 == 2);
	return isLeap;
}

function getStrGregorianToday(){
	var date = new Date();
	var y = date.getFullYear();
	var m = date.getMonth() + 1;
	var d = date.getDate();

	m = '' + m;
	d = '' + d;

	if(m.length == 1)
		m = '0' + m;
	if(d.length == 1)
		d = '0' + d;

	return y + '/' + m + '/' + d;
}

function getToday(){
	var date = getStrToday();
	var y = date.substring(0, 4);
	var m = date.substring(5, 7);
	var d = date.substring(8);
	date = y + m + d;
	return parseInt(date);
}

function getStrToday(){
	var date = getStrGregorianToday();
	return gregorian_to_jalali(date);
}

function gregorian_to_jalali(gregorian_date){
	var g_y = parseInt(gregorian_date.substring(0, 4), 10);
	var g_m = parseInt(gregorian_date.substring(5, 7), 10);
	var g_d = parseInt(gregorian_date.substring(8)   , 10);
		
	var j_days_in_month = new Array(31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29);
	var g_days_in_month = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

	var gy = g_y - 1600;
	var gm = g_m - 1;
	var gd = g_d - 1;

	var g_day_no = 365 * gy + div(gy + 3, 4) - div(gy + 99, 100) + div(gy + 399, 400);

	for(i = 0; i < gm; i++)
		g_day_no += g_days_in_month[i];
	if (gm > 1 && ((gy % 4 == 0 && gy % 100 != 0) || (gy % 400 == 0)))
		g_day_no++;
	g_day_no += gd;

	var j_day_no = g_day_no - 79;

	var j_np = div(j_day_no, 12053);
	j_day_no %= 12053;

	var jy = 979 + 33 * j_np + 4 * div(j_day_no, 1461);

	j_day_no %= 1461;

	if (j_day_no >= 366){
		jy += div(j_day_no - 1, 365);
		j_day_no = (j_day_no - 1) % 365;
	}
	for (i = 0; i < 11 && j_day_no >= j_days_in_month[i]; i++){
		j_day_no -= j_days_in_month[i];
	}
	var jm = i + 1;
	var jd = j_day_no + 1;
	
	jm = '' + jm;
	jd = '' + jd;
	
	var jy_str = '' + jy;
	
	if(jd.length == 1)
		var jd_str = '0' + jd;
	else
		var jd_str = '' + jd;
	if(jm.length == 1)
		var jm_str = '0' + jm;
	else
		var jm_str = '' + jm;
	
	var date = jy + '/' + jm_str + '/' + jd_str;
	
	return date;
}

function ctype_digit(text){
	var output = 0;
	if(typeof text !== 'string') {
		return output;
	}
	var isNumber = isNaN(text) === false;
	if(isNumber){
		text = text.substring(0, 1);
		isNumber = isNaN(text) === false;
		if(isNumber)
			return output;
	}
	
	output = 1;
	return output;
}

function DigitsValidation(input, size, label){
	var output = 0;
	if(input.length != size){
		output = 1;
	}
	return output;
}

function FarsiStringValidation(input, label){
	var output = 0;
	var acceptableFarsiChars = 'يآابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهيءؤئ‌أإيك()ي ';
	var len = acceptableFarsiChars.length;
	if(input.length != strspn(input, acceptableFarsiChars, 0, len)){
		output = 1;
	}
	
	return output;
}

function EnglishStringValidation(input, label){
	var acceptableEnglishChars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.-() ';
	var len = acceptableEnglishChars.length;
	if(input.length != strspn(input, acceptableEnglishChars, 0, len)){
		alert(label + " بايد فقط از حروف انگليسي تشکيل شده باشد.");
	}
}

function AgeValidation(input, label){
	today = getStrToday();
	
	var birthYear  = input.substring(0, 4);
	var birthMonth = input.substring(5, 7);
	var birthDay   = input.substring(8);
	
	var todayYear  = today.substring(0, 4);
	var todayMonth = today.substring(5, 7);
	var todayDay   = today.substring(8);
	
	if(todayMonth > birthMonth){
		ageYear = todayYear - birthYear;
	}
	else if(todayMonth == birthMonth){
		if(todayDay >= birthDay){
			var ageYear = todayYear - birthYear;
		}
		else{
			var ageYear = todayYear - birthYear - 1;
		}
	}
	else{
		var ageYear = todayYear - birthYear - 1;
	}
	
	var year = todayYear - 80;
	var date = year + "/" + todayMonth + "/" + todayDay;
	
	if(ageYear >= 80){
		alert(label + " بايد بزرگتر از " + date + " باشد.");
		return false;
	}
}

//function NationalIDValidation(input, label){
function NationalIDValidation(input){
	var output = 0;
	input = input.value;
	if(input == '0000000000' || input == '1111111111' || input == '2222222222' || input == '3333333333' || input == '4444444444' || input == '5555555555' || input == '6666666666' || input == '7777777777' || input == '8888888888' || input == '9999999999'){
		//alert(label + " معتبر نمي باشد.");
		return output;
	}
	A = input.substring(9);
	B = input.substring(0, 1) * 10 + input.substring(1, 2) * 9 + input.substring(2, 3) * 8 + input.substring(3, 4) * 7 + input.substring(4, 5) * 6 + input.substring(5, 6) * 5 + input.substring(6, 7) *4 + input.substring(7, 8) * 3 + input.substring(8, 9) * 2;
	C = B - Math.floor(B / 11) * 11;
	
	if(!(A == 0 && C == 0) && !(A == 1 && C == 1) && !(C > 1 && (11 - C) == A)){
		//alert(label + " معتبر نمي باشد.");
		//alert("output");
		//alert(output);
		return output;
	}
	//alert(output);
	output = 1;
	return output;
}

//بررسي نسبت در صدور بيمه نامه (اکسل)
function RelationSexValidation(thisForm, rows){
	var id = thisForm.id;
	var output = 0;
	
	for(i=1; i <= rows; i++){
		if(((document.forms[id].elements["relation" + i].value == 2 || document.forms[id].elements["relation" + i].value == 4 || document.forms[id].elements["relation" + i].value == 6 || document.forms[id].elements["relation" + i].value == 9) && (document.forms[id].elements["sex" + i].value == 1)) || 
		   ((document.forms[id].elements["relation" + i].value == 3 || document.forms[id].elements["relation" + i].value == 5 || document.forms[id].elements["relation" + i].value == 7 || document.forms[id].elements["relation" + i].value == 8) && (document.forms[id].elements["sex" + i].value == 0))){
			//alert("نسبت خانوادگي با جنسيت مطابقت ندارد.");
			output = 1;
		}
	}
	
	return output;
}

function checkCauseDateForReception(thisField){
	var date = thisField.value.substring(0, 4) + thisField.value.substring(5, 7) + thisField.value.substring(8);
	if(getToday() < date){
		alert("امکان ثبت پذيرش براي تاريخ آينده وجود ندارد.");
		thisField.value = "";
		thisField.focus();
	}
}

function CheckForZero(thisFeild){
	if(thisFeild.value == 0){
		alert("مبلغ اظهاري بايد بزرگتر از صفر باشد.");
		thisFeild.focus();
	}
}

function validateDate(date){
	date = date.value;
	var status = true;
	if(date.length < 10){
		status = false;
		
	}else{
		//alert(date);
		var year_str = date.substring(0, 4);
		var year = parseInt(year);
		var month_str = date.substring(5, 7);
		var day_str = date.substring(8);
		var month = parseInt(month_str);
		var day   = parseInt(day_str);
		
		if(date.substring(4, 5) != '/' || date.substring(7, 8) != '/' || ctype_digit(year_str) || ctype_digit(month_str) || ctype_digit(day_str))
			status = false;
		else if(month > 13 || month < 1 || (month <= 6 && day > 31) || (month >= 7 && day > 30) || day < 1 || (month == 12 && isJalaliYearLeap(year) && day > 30) || (month == 12 && !(isJalaliYearLeap(year)) && day > 29)){
			status = false;
		}
	}
	return status;
}

function DataValidate(form,type,message,numOfIgnoredInputsBefore, numOfIgnoredInputsAfter){
	var rowSize = type.length;
	var flag = true;
	for(var i = 0 + numOfIgnoredInputsBefore; i < form.elements.length - numOfIgnoredInputsAfter; i++){
		var j = i % rowSize;
		var output = 0;
		switch(type[j]){
			case 0 : // Other 
			break;
			case 1 : // money
				var money = form[i].value.replace(/,/g,'');
				output = ctype_digit(money);
					if(form[i].value < 0 || form[i].value == ''){
						output =1;
					}
					if(form[i].value == 'بدون سقف'){
						output =0;
					}
					if( output == 1){
						alert(message[j]);
						form[i].style.background = '#FF5C5C';
						form[i].focus();
						flag = false;
					}else{
						form[i].style.background = '#FFFFFF';
					}
			break;
			case 2 : // number
				output = ctype_digit(form[i].value);
					if(output == 1){
						alert(message[j]);
						form[i].style.background ='#FF5C5C';
						form[i].focus();
						flag = false;
					}else{
						form[i].style.background = '#FFFFFF';
					}
			break;
			case 3 : // date
				if( validateDate(form[i].value) == false ){
					alert(message(j));
					form[i].style.background ='#FF5C5C';
					form[i].focus();
					flag = false;
				}else{
					form[i].style.background = '#FFFFFF';
				}
			break;
			case 4: // string 
				output = FarsiStringValidation(form[i].value);
					if(output == 1){
						alert(message[j]);
						form[i].style.background ='#FF5C5C';
						form[i].focus();
						flag = false;
					}else{
						form[i].style.background = '#FFFFFF';
					}
			break;
			case 5: // div
			break;
		}
	}
	return flag;
}

function BusinessValidate(form,type,message,numOfIgnoredInputsBefore, numOfIgnoredInputsAfter){
	if(message.length >= 7){
		var x = 6;
	}else{
		var x = 4;
	}
	var allinput 	= form.elements.length - numOfIgnoredInputsAfter;
	var cover 		= form[allinput-x-3].value;
	var coverid 	= cover.split("-",1);
	var saghf 		= remove_coma(form[allinput-x-1].value);	
	var fran 		= form[allinput-x].value;
	
	var xmlHttp;
	var result;
	var flag = true;
	
		if(window.XMLHttpRequest){
			xmlHttp=new XMLHttpRequest();
		}else{
			xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlHttp.onreadystatechange=function()
		{
			if(xmlHttp.readyState==4 && xmlHttp.status==200){
				var index =parseInt(xmlHttp.responseText);
				if(xmlHttp.responseText < 5 ){
					alert(message[index]);
				}
			}
		}
	xmlHttp.open("get","../php/BusinessValidationCover.php?cover="+coverid+"&saghf="+saghf+"&fran="+fran,true);
	xmlHttp.send();
	return flag;
}

function validatecoverform(form,type,message,numOfIgnoredInputsBefore, numOfIgnoredInputsAfter){
	if(!DataValidate(form,type,message,numOfIgnoredInputsBefore, numOfIgnoredInputsAfter)){
		return false;
	}
	if(!BusinessValidate(form,type,message,numOfIgnoredInputsBefore, numOfIgnoredInputsAfter)){
		return false;
	}
	return true;
}

function covervalidate(thisFeild,Parent,Vabaste){
	var formtype = new Array();
	formtype[0] = 0;
	formtype[1] = 0;
	formtype[2] = 0;
	formtype[3] = 0;
	formtype[4] = 1;
	formtype[5] = 2;
	
	var messagetype = new Array();
	messagetype[0]  = "";
	messagetype[1]  = "";
	messagetype[2]  = "پوشش انتخاب شده اشتباه است";
	messagetype[3]  = "";
	messagetype[4]  = "سقف وارد شده اشتباه است";
	messagetype[5]  = "فرانشيز وارد شده اشتباه است";
	
	if( Parent == 1){
		formtype[formtype.length] = 0;
		messagetype[messagetype.length]  = "پرنت انتخاب شده اشتباه است";
	}
	if( Vabaste == 1){
		formtype[formtype.length] = 0;
		messagetype[messagetype.length]  = "پوشش وابسته  وارد شده اشتباه است";
	}
	formtype[formtype.length] = 0;
	formtype[formtype.length] = 2;
	messagetype[messagetype.length]  = "";
	messagetype[messagetype.length] 	= "تخفيف وارد شده اشتباه است";
	
	if(validatecoverform(document.forms['action'],formtype,messagetype,0, 5)){
		setCookie('ShowPolicyAction','SelectCoverDetails',365);
	}
}

function costvalidate(thisFeild){
	var xmlHttp;
	if(window.XMLHttpRequest){
		xmlHttp=new XMLHttpRequest();
	}else{
		xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlHttp.onreadystatechange=function()
	{
		if(xmlHttp.readyState==4 && xmlHttp.status==200)
		{
		}
	}
	xmlHttp.open("get","../php/CostValidate.php",true);
	xmlHttp.send();
	
	
		setCookie('ShowPolicyAction','listPolicies',365);
		setCookie('PreShowPolicyAction','InsertPolicy',365);
}

function insuredvalidate(){
	var flag = true;
	var Name = document.getElementById("NameOfInshured");
	var Tel = document.getElementById("TelOfInshured");
	var Mobile = document.getElementById("MobileOfInshured");
	var Sheba = document.getElementById("ShebaOfInshured");
	var Economic  = document.getElementById("EconomicNumber");
	var Fax = document.getElementById("FaxOfInshured");
	var Address = document.getElementById("address");
	
	if(FarsiStringValidation(Name.value, 'نام') == 1){
		flag = false;
		alert('نام' + " بايد فقط از حروف فارسي تشکيل شده باشد.");
		Name.style.background = 'red';
	}
	
	if(ctype_digit(Tel.value) == 1){	
		flag = false;
		alert('تلفن' + " بايد فقط از اعداد تشکيل شده باشد.");
		Tel.style.background = 'red';
	}
	
	if(ctype_digit(Mobile.value) == 1){
		flag = false;
		alert('موبايل' + " بايد فقط از اعداد تشکيل شده باشد.");
		Mobile.style.background = 'red';
	}
	
	if(ctype_digit(Fax.value) == 1){
		flag = false;
		alert('فکس' + " بايد فقط از اعداد تشکيل شده باشد.");
		Fax.style.background = 'red';
	}
	
	if(ctype_digit(Sheba.value) == 1){
		flag = false;
		alert('شماره شبا' + " بايد فقط از اعداد تشکيل شده باشد.");
		Sheba.style.background = 'red';
	}
	
	if(ctype_digit(Economic.value) == 1){
		flag = false;
		alert('شماره اقتصادي' + " بايد فقط از اعداد تشکيل شده باشد.");
		Sheba.style.background = 'red';
	}

	if(getCookie('showinsured') == 'new'){
		if(Name.value == '' || Name.value == null ){
			alert('نام بيمه گذار نمي تواند خالي باشد');
		}else{
			setCookie('ShowPolicyAction', 'InsertMainPolicy',365);
			setCookie('PreShowPolicyAction','InsertInsured',365);
			setCookie('NewInsuredUI', 'new',365);
		}	
	}else if(getCookie('showinsured') != 'new'){
		if( Economic.value == null || Economic.value == ' ' || Economic.value == '' ){
			alert("شماره اقتصادي" + " نمي تواند خالي باشد.");
			Address.style.background = 'red';
		}else{
			setCookie('ShowPolicyAction', 'AddDetails',365);
		}
	}
}

function DetailsValidate(){
	setCookie('ShowPolicyAction', 'listPolicies',365);
	setCookie('PreShowPolicyAction', 'UpdateStatus',365);
}

function EndorseChangeDetails(){
	setCookie('ShowPolicyAction', 'AddDetailsToBimename',365);
	setCookie('PreShowPolicyAction', 'EndorseAddDetailsToBimename',365);
}

function EndorseChangeAllDetails(){
	setCookie('ShowPolicyAction', 'listPolicies',365);
	setCookie('PreShowPolicyAction', 'EndorseDetails',365);
}

function coverdetailsvalidate(){
	setCookie('ShowPolicyAction','ShowSelectedCover',365);
}

/////new:
function isNumeric(n) {
	return !isNaN(parseFloat(n)) && isFinite(n);
}

function isValidSheba(input){

	var ir = input.substring(0, 2);
	var twoFirstDigits = input.substring(2, 4);
	var  others = input.substring(4,5);

	input = others+"1827"+twoFirstDigits;

	var part1 = input.substring(0 , 4);
	var part2 = input.substring(4 , 12);
	var part3 = input.substring(12, 20);
	var part4 = input.substring(20);

	var mod1 = (Integer.parseInt(part1) % 97) * 81 * 81 * 81;
	var mod2 = (Integer.parseInt(part2) % 97) * 81 * 81;
	var mod3 = (Integer.parseInt(part3) % 97) * 81;
	var mod4 = (Integer.parseInt(part4) % 97) * 1 ;

	var mod = (mod1 + mod2 + mod3 + mod4) % 97;
	alert(mod);
	if(mod == 1) {
		alert("trueisValidSheba")
		return true;
	}
	else {
		alert("falseisValidSheba");
		return false;
	}
}

function ShebaValidation(input){
	input = input.value;

	alert(input.length);
	if(input.length != 26){
		//alert("invalid0");
		return -1;  // toole sheba < 26 nabayad bashad
	}
	else{
		var ir = input.substring(0, 2);
		alert(ir);
		if(ir != "IR" && ir != "ir" && ir != "Ir" && ir != "iR" ) {
			//alert("invalid1");
			return -2;  // ir eshtebah vared shode
		}
		var i = 2;
		//alert(i);
		//while( i <= input.length){
		//	var digit = input.substring(i, i+1);
		for(var i = 2; i < 26; ++i){
			var digit = input.substring(i, i+1);
			if(!isNumeric(digit)){
				//alert("invalid2")
				return -2;      //bad az IR 24 ragham bayad bashad
			}
			i++;
		}
		if(!isValidSheba(input)) {
			//alert("invalid3");
			return -3;         // shomare sheba motabar nist
		}
	}
	alert("valid");
	return  1;
}



function isValidNumber(value )
{
	var result=true;
	for(var i=0;i< value.length-1;i++)
	{
		if(!isNumeric(value.substring(i,i+1)))
		{
			result=false;
			break;
		}

	}
	return result;

}

function isvalidPrice(value)
{
	var re = /,/g;
	var result =value.replace(re, "");
	return isNumber(result);

}


