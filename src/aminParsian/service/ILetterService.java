package aminParsian.service;

import aminParsian.viewModel.*;
import java.util.*;
import aminParsian.model.*;
import java.io.*;

public interface ILetterService {

    public static final String SERVICE_NAME="letterService";

    List<ViewSarresidElamBedehi> getListSarresidElamBedehkar (String date, String policyNo, String insured);

    java.util.List<ViewBimeShodeElamBedehkar> getListBimeShodeElamBedehkar (String date, String insured, String tarh, String policyNo, String shobe);



    List<BimeShodeElamBedehkar> validatePersonExcel (File fileUpload, Map<Integer,Map<Integer, String>> errorMap);

    List<BimeShodeElamBedehkar> getInsuredPersonFromFile (List<BimeShodeElamBedehkar> bimeShodeElamBedehkarList, Users user);

    String savePersons (Users user, List<BimeShodeElamBedehkar> bimeShodeList);

    List<Invoice> createInvoices (List<ViewBimeShodeElamBedehkar> sarresidElamBedehkars, Users user, List<Errors> errors);

    List<ViewInvoice> searchInvoices (String insured, String policyNo, String date, String invoiceNo, String tarh, String shobe);

    List<ViewResid> searchResids (String insured, String policyNo, String date, String invoiceNo, String tarh, String shobe, String shenase, Long isVosoul);

    boolean letterDeleteInvoice (String invoiceNo);

    List<ViewFileBank> validateFileBankExcel (File upload, Map<Integer, Map<Integer, String>> errorMap);

    String saveBankReceords (Users user, List<ViewFileBank> fileBankList);

    boolean letterEditInvoice (String invoiceNo);

    aminParsian.model.Invoice findInvoiceByInvoiceNo (String invoiceNo);

    java.util.List<aminParsian.model.PolicyPrm> getListBimeGozar (String policyNo);

    aminParsian.model.PolicyPrm savePolicyPrmData (String policyNo, String bimeGozar, String shobe);
}
