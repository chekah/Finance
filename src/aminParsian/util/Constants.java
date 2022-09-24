
package aminParsian.util;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by s-talebi on 4/25/2016.
 */
public class Constants {
    public static BigDecimal ERROR_SHEBA_NOT_VALID = new BigDecimal(1);
    public static BigDecimal ERROR_DATE_NOT_VALID = new BigDecimal(2);
    public static BigDecimal ERROR_POSTALCODE_NOT_VALID = new BigDecimal(3);
    public static BigDecimal ERROR_VALUE_NOT_VALID = new BigDecimal(4);
    public static BigDecimal ERROR_MOBILENUMBER_NOT_VALID = new BigDecimal(5);
    public static BigDecimal ERROR_TELEPHONENUMBER_NOT_VALID = new BigDecimal(6);
    public static BigDecimal ERROR_AMOUNT_NOT_VALID = new BigDecimal(8);
    public static BigDecimal ERROR_EMAIL_NOT_VALID = new BigDecimal(9);
    public static BigDecimal ERROR_PERSIANNAME_NOT_VALID = new BigDecimal(10);
    public static BigDecimal ERROR_NATIONALCODE_NOT_VALID = new BigDecimal(11);
    public static BigDecimal ERROR_PASSWORED_NOT_VALID = new BigDecimal(12);
    public static BigDecimal ERROR_MORE_THAN = new BigDecimal(25);
    public static BigDecimal ERROR_DATA_IS_NULL = new BigDecimal(26);
    public static BigDecimal ERROR_MORE_THAN_CURRENTDATE = new BigDecimal(27);
    public static BigDecimal ERROR_REQ_MABLAGHTAEEDSHODEH= new BigDecimal(36);
    public static BigDecimal ERROR_REPEATED = new BigDecimal(34);


    public static Integer ERROR_name             = new Integer(0);
    public static Integer ERROR_surname          = new Integer(1);
    public static Integer ERROR_father           = new Integer(2);
    public static Integer ERROR_shomareshenasname = new Integer(4);
    public static Integer ERROR_nationalID       = new Integer(5);
    public static Integer ERROR_personeli        = new Integer(10);
    public static Integer ERROR_sheba            = new Integer(11);
    public static Integer ERROR_mobile           = new Integer(15);
    public static Integer ERROR_mainInsuredPerson= new Integer(7);

    public static BigDecimal ERROR_TAAREFEPRICE_NOTCOUNTABLE = new BigDecimal(22);
    public static BigDecimal ERROR_TAAREFEPRICE_DONTHAVE_RELATEDHSERVICE =new BigDecimal(23);
    public static BigDecimal ERROR_TAAREFEPRICE_HAVERELATEDSERVICE = new BigDecimal(24);
    public static BigDecimal ERROR_MABLAGHEZHARI = new BigDecimal(30);


    public static BigDecimal ERROR_CredebitMahdoudiatSaghf = new BigDecimal(31);
    public static BigDecimal ERROR_CredebitMahdoudiatDate= new BigDecimal(32);
    public static BigDecimal  ERROR_SANAM= new BigDecimal(33);


    //public static Long MAJMOOKHANEVADEH = new Long(6);

    // az mahale
    public static Integer Cover = new Integer(1);
    public static Integer Bazyafti = new Integer(2);
    public static Integer Mozaaf = new Integer(3);
    public static Integer Modiriati = new Integer(4);
    public static Integer DarEkhtiar = new Integer(5);

    // Noe Saghf
    public static Long NAFAR = new Long(30);
    public static Long ZOJEYN= new Long(31);
    public static Long KHANEVADEH= new Long(32);
    public static Long GHARARDAD = new Long(33);
    public static Long GOROOH= new Long(34);
    public static Long MAJMOOEKHANEVADEH = new Long(39);


    public static Long SaghfMosbat= new Long(1);
    public static Long SaghfManfi= new Long(2);


    public static Long RECEPTION_TAEEDNASHODEH = new Long(1);
    public static Long RECEPTION_TAEEDNAHAEE = new Long(2);
    public static Long RECEPTION_NOTAAHOD = new Long(3);
    public static Long RECEPTION_NAGHES = new Long(4);
    public static Long RECEPTION_ELAMBEMALI= new Long(5);
    public  static Long RECEPTION_DARKHADTMOJAVEZ = new Long(10);
    public  static Long RECEPTION_HAZFSHODEH = new Long(100);


    public static Long COVER_BIMARESTANI = new Long(1);
    public static Long COVER_PARAKLINIKI = new Long(2);
    public static Long COVER_DANDANPEZESHKI = new Long(3);
    public static Long COVER_SAGHFMOZAAF= new Long(4);


    public static Long FINANCIALTYPE_SHEBABIMEHGOZAR = new Long(1);
    public static Long FINANCIALTYPE_SHEBABIMEHSHODEH= new Long(2);
    public static Long FINANCIALTYPE_ZIRESHERKAT = new Long(3);
    public static Long FINANCIALTYPE_TEJARATELECTRONIC = new Long(4);
    public  static Long FINANCIALTYPE_CHECK = new Long(5);


    public static Long LETTER_MOVAGHAT = new Long(1);
    public static Long  LETTER_TAEEDNAHAEESHODEH = new Long(2);
    public static Long LETTER_ELAMBEMALI = new Long(3);
    public static Long LETTER_HAZFSHODEH= new Long(100);


    public   static Long    CREDEBIT_MOVAGHAT = new Long(6);
    public   static Long    CREDEBIT_DAEM =new Long(7);
    public   static Long    CREDEBIT_LAGHVDARMANMALI =new Long(8);
    public   static Long    CREDEBIT_ELAMBESANAM =new Long(9);
    public   static Long    CREDEBIT_LAGHVDARSANAM =new Long(10);
    public   static Long    CREDEBIT_KHATAYDARGAHPARDAKHT =new Long(11);
    public   static Long    CREDEBIT_PARDAKHTSHODEH =new Long(12);
    public   static Long    CREDEBIT_HAZFSHODEH =new Long(100);

    public   static Long    KASRSHAVANDHE_FRANCHISE= new Long(0);
    public   static Long    KASRSHAVANDHE_SAHMBIMEHGARAVAL =new Long(1);
    public   static Long    KASRSHAVANDHE_HICHKODAM =new Long(2);




    public   static  String    SANAMRESPONSE_CREDEBIT_NOTVALIDNATIONALCODE = new String ("-2");
    public   static  String     SANAMRESPONSE_CREDEBIT_NOTVALIDSHEBACODE = new String ("-1");
    public   static  String     SANAMRESPONSE_CREDEBIT_NOTVALIDCODERESHTE_HAPPERNEXCEPTION  = new String ("-3");
    public   static  Long      DEACTIVE_POLICYPACK = new Long("90");

    public   static  Long      SODOUR_PACK = new Long("1101");
    public   static  Long      KHESARAT_PACK = new Long("1102");

    public   static  Long      USER_VIEW       = new Long("1");
    public   static  Long      PACK_VIEW       = new Long("2");
    public   static  Long      POLICY_VIEW    = new Long("3");


    public static Long  CALC_TYPE_ZARIBAZDIGAR = new Long("3");
    public static Long  CALC_TYPE_KARBAR = new Long("1");
    public static Long  CALC_TYPE_SYSTEM = new Long("2");
    public static Long  CALC_TYPE_KPARA_78 = new Long("4");
    public static Long  CALC_TYPE_KBIMARESTANI = new Long("5");
    public static Long  CALC_TYPE_KPARA_9 = new Long("6");


    public static BigInteger    HSERVICE_CALCTYPE_ZARIBAZDIGAR = new BigInteger  ("3");
    public static BigInteger    HSERVICE_TYPE_KARBAR = new BigInteger  ("1");
    public static BigInteger    HSERVICE_TYPE_SYSTEM = new BigInteger  ("2");
    public static BigInteger    HSERVICE_TYPE_KPARA = new BigInteger  ("4");
    public static BigInteger    HSERVICE_TYPE_KBIMARESTANI = new BigInteger  ("5");

    public static Long  SUBCOVER_NO_REQ = new Long   ("1");
    public static Long  SUBCOVER_HEALTHCENTER_REQ = new Long ("2");
    public static Long  SUBCOVER_MEDICIALSYSNUM_REG= new Long ("3");
    public static Long  SUBCOVER_HEALTHCENTERORMEDICIALSYSNUM_REQ = new Long("4");


    public static  BigDecimal Hservice_Daroo = new BigDecimal("215");


    public static BigDecimal   Saghf_Pooshesh = new BigDecimal("2");

    public static Long  TREATMENT_K78 = new Long("4");
    public static Long  TREATMENT_K_BIMARESTANI = new Long("5");
    public static Long  TREATMENT_K_9 = new Long("6");
    public static Long  TREATMENT_K_BIHOOSHI = new Long("7");
    public static Long  TREATMENTK_VISIT = new Long("8");
    public static Long  TREATMENT_K_FIZIOTROPY = new Long("9");

}