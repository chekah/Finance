package aminParsian.util;

import org.apache.poi.ss.usermodel.Cell;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 * User: a-sajadian
 * Date: 12/7/15
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataValidation {

    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Long.parseLong(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public static boolean stringContainsItemFromList(String inputString, String items)
    {
        for(int i =0; i < inputString.length(); i++)
        {
            if(!items.contains(inputString.substring(i,i+1)))         //at first till end
            {
                return false;
            }
        }
        return true;
    }

    public static int isFarsiString(String input){
        String acceptableFarsiChars = "ييآابپتثجچحخدذرزژسشصضطظعغفقکگلمنوهيءؤئ‌أإيكَُِّ() ي ي  ی "; // includes "virtual space" (ZWNJ: Zero-Width Non-Joiner) between ئ and أ

        if(stringContainsItemFromList(input , acceptableFarsiChars)){
            return 1;
        }
       return -1;   //faghat horoofe farsi vared shavad
    }


//    public static boolean ValidateMobileNumber(String[] argv) {
//
//        String sPhoneNumber = "912-8889999";
//        //String sPhoneNumber = "605-88899991";
//        //String sPhoneNumber = "605-888999A";
//
//        Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
//        Matcher matcher = pattern.matcher(sPhoneNumber);
//
//        if (matcher.matches()) {
//            //System.out.println("Phone Number Valid");
//            return true;
//        }
//        else
//        {
//            //System.out.println("Phone Number must be in the form XXX-XXXXXXX");
//            return false;
//        }
//    }

    public static int ValidateMobileNumber(String input) {
        if(!isNumeric(input))     return -1;   //adadi nist
        if(input.length() != 11)  return -2;   //11 raghami nist
        if(Integer.parseInt(input.substring(0, 1)) != 0 && Integer.parseInt(input.substring(1, 2)) != 9)    return -3;  //2 raghame aval 09 nist!
        return 1;
    }

    public static int ValidatePhoneNumber(String input) {
        if(!isNumeric(input))     return -1;   //adadi nist
        if(input.length() != 11)  return -2;   //11 raghami nist
        if(Integer.parseInt(input.substring(0, 1)) != 0)    return -3;  //avalin ragham 0 nist!
        return 1;
    }

    public static int isValidNationalID(String input){
        if(!isNumeric(input))     return -1;   //adad nist
        if(input.length() != 10)  return -2;   //10 raghami nist
        if(input == "0000000000" || input == "1111111111" || input == "2222222222" || input == "3333333333" || input == "4444444444" || input == "5555555555" || input == "6666666666" || input == "7777777777" || input == "8888888888" || input == "9999999999"){
            return -3;                         //code e meli naamotabar
        }
        double lastNum = Integer.parseInt(input.substring(9)) + 0;      //A
        double B = Integer.parseInt(input.substring(0,1)) * 10 + Integer.parseInt(input.substring(1,2)) * 9 + Integer.parseInt(input.substring(2,3)) * 8 + Integer.parseInt(input.substring(3,4)) * 7 + Integer.parseInt(input.substring(4,5)) * 6 + Integer.parseInt(input.substring(5,6)) * 5 + Integer.parseInt(input.substring(6,7)) *4 + Integer.parseInt(input.substring(7,8))* 3 + Integer.parseInt(input.substring(8,9)) * 2;
        //double C = B - Math.floor(B / 11) * 11;
        double Remaining = B % 11;                                 //C
        if(Remaining < 2 && Remaining == lastNum) return 1;
        else if(Remaining >= 2 && lastNum == (11 - Remaining)) return 1;
        return -4;  // sayere mavarede gheire mojaz
    }


    public static boolean isJalaliYearLeap(String year){    //sale kabise
        boolean  isLeap = false;
        int mod33 = Integer.parseInt(year) % 33;
        if(mod33 < 21)
            if(mod33 % 4 == 1)    isLeap = true;
        else
            if(mod33 % 4 == 2)    isLeap = true;
        return isLeap;
    }


    public static int isValidJalaliDate(String date){
        if(!date.contains("/")) {
  	      date= date.substring(0, 4)+"/"+ date.substring(4,6)+"/"+ date.substring(6,8);
        }
        String year  = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day   = date.substring(8);
        //date = IntDateToDate(date);
        //Date date = new Date(yourNumber);
        //$todayStringWithoutSlashes = getToday();
        //$today = substr($todayStringWithoutSlashes, 0, 4).'/'.substr($todayStringWithoutSlashes, 4, 2).'/'.substr($todayStringWithoutSlashes, 6, 2);

        //$formatErrorNotice = 'قالب '.$label.' وارد شده اشتباه است. تاريخ بايد به صورت'.$today.' وارد شود.';
        if(date.length() < 10){
            return -1;  // toole tarikh < 10
        }
        else{


             if(!"/".equals(date.substring(4,5)) || !"/".equals(date.substring(7,8)) || !isNumeric(year) || !isNumeric(month) || !isNumeric(day))
                return -2;                 //formate tarikh eshtebas
            else if(Integer.parseInt(month) > 12 || Integer.parseInt(month) < 1){
                return -3;                 // error mah
            }
            else if(((Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 6) && Integer.parseInt(day) < 1) || ((Integer.parseInt(month) >= 1 && Integer.parseInt(month) <= 6) && Integer.parseInt(day) > 31)){
                return -4;                  // 1 < rooz < 31 bayad bashad
            }
            else if(((Integer.parseInt(month) >= 7 && Integer.parseInt(month) <= 11) && Integer.parseInt(day) < 1) || ((Integer.parseInt(month) >= 7 && Integer.parseInt(month) <= 11) && Integer.parseInt(day) > 30)){
                return -5;                  //1 < rooz < 30 bayad bashad
            }
            else if(((Integer.parseInt(month) == 12 && isJalaliYearLeap(year)) && (Integer.parseInt(day) > 30) || (((Integer.parseInt(month) == 12 && isJalaliYearLeap(year)) && (Integer.parseInt(day) < 1))))){
                return -6;                  // 1 < rooz <30 bayad bashad
            }
            else if(((Integer.parseInt(month) == 12 && !(isJalaliYearLeap(year))) && Integer.parseInt(day) > 29) || ((Integer.parseInt(month) == 12 && !(isJalaliYearLeap(year))) && Integer.parseInt(day) < 1)){
                return -7;                  // 1 < rooz < 29 bayad bashad
            }

        }
        return 1;
    }

    public static boolean isValidSheba(String input){


        String ir = input.substring(0, 2);
        String twoFirstDigits = input.substring(2, 4);
        String  others = input.substring(4);

        input = others+"1827"+twoFirstDigits;

        String part1 = input.substring(0 , 4);
        String part2 = input.substring(4 , 12);
        String part3 = input.substring(12, 20);
        String part4 = input.substring(20);

        int mod1 = (Integer.parseInt(part1) % 97) * 81 * 81 * 81;
        int mod2 = (Integer.parseInt(part2) % 97) * 81 * 81;
        int mod3 = (Integer.parseInt(part3) % 97) * 81;
        int mod4 = (Integer.parseInt(part4) % 97) * 1 ;

        int mod = (mod1 + mod2 + mod3 + mod4) % 97;

        if(mod == 1)
            return true;
        else
            return false;
    }

    public static int ShebaValidation(String input){
        if(input.length() != 26){
            return -1;  // toole sheba < 26 nabayad bashad
        }
        else{
            String ir = input.substring(0, 2);
            if(!ir.equals("IR") && !ir.equals("ir")  && !ir.equals("iR")  && !ir.equals("Ir")  )
                return -2;  // ir eshtebah vared shode
            for(int i = 2; i < 26; ++i){
                String digit = input.substring(i, i+1);
                //if(!is_numeric($digit))
                if(!isNumeric(digit))
                   return -2;      //bad az IR 24 ragham bayad bashad
            }
            if(!isValidSheba(input))
                return -3;         // shomare sheba motabar nist
        }
        return  1;
    }

    public int PostalCodeValidation(String PostalCode){

        if(!isNumeric(PostalCode)) return -1;      //code posti bayad adadi bashad
        else {
            if((PostalCode).length() != 10){
              return -2;                // toole code posti nabayad kamtar az 10 bashad
            }
        }
        return 1;
    }

    public static int CodesValidation(String str , int substr){        // substr = 5  : shomare elhaghie ast

        String substr1 = str.substring(0  , 4);
        String substr2 = str.substring(5  , 11);
        String substr3 = str.substring(12 , 14);
        String substr4 = str.substring(15 , 21);
        String substr5 = "";
        if(substr == 5)
             substr5 = str.substring(22);

//        if(str.length() < 10){
//            return -1;  // toole tarikh < 10
//        }
//        else{

            if(!"/".equals(str.substring(4,5)) || !"/".equals(str.substring(11,12)) || !"/".equals(str.substring(14,15)) ||!"/".equals(str.substring(21,22)) || !isNumeric(substr1) || !isNumeric(substr2) || !isNumeric(substr3) || !isNumeric(substr4) || ((!isNumeric(substr5))&& substr5 != ""))
                return -2;                 //formate voroodi eshtebas
            else if(Integer.parseInt(substr1) > 4){
                return -3;                 // error substr1
            }
            else if(Integer.parseInt(substr2) > 6){
                return -4;                 // error substr2
            }
            else if(Integer.parseInt(substr3) > 2){
                return -5;                 // error substr3
            }
            else if(Integer.parseInt(substr4) > 6){
                return -6;                 // error substr4
            }
            else if(substr5 != "" &&  Integer.parseInt(substr5) > 3){
                return -7;                 // error substr5
            }

        return 1;
     // }
    }

    public  static int beingInRange(String str, int lowRange, int highRange){
        if(Integer.parseInt(str) >=  lowRange &&  Integer.parseInt(str) <=  highRange)
            return 1;
        else return -1; //voroudi dar bazeye mojazash nist
    }

    public static int percentage(String input){
        if(!isNumeric(input))     return -1;

        double d = Long.parseLong(input);
        if(d>100 || d<0) return -2;

        return 1;
    }

    public static boolean checkNesbat(String input){
        return true;
    }

    public static boolean validateDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try {
            sdf.parse(date);
            return true;
        }
        catch(ParseException ex) {
                return false;


        }
    }


    public static boolean isCellEmpty(Cell cell) {
        if (cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK) {
            return true;
        }
        return false;
    }
}
