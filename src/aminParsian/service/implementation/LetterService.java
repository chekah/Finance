package aminParsian.service.implementation;

import aminParsian.service.ILetterService;
import javax.transaction.Transactional;
import aminParsian.DAO.*;
import java.util.*;
import java.math.*;
import aminParsian.viewModel.*;
import aminParsian.model.*;
import java.io.*;

@Transactional
public class LetterService implements ILetterService {

    private PersonDAO personDAO;
    private PolicyDAO policyDao;
    private InvoiceDAO invoiceDAO;
    private PolicyPrmDAO policyPrmDAO;
    private InvoiceCredebitDAO invoiceCredebitDAO;
    private SarresidElamBedehkarDAO sarresidElamBedehkarDAO;

    public aminParsian.DAO.PolicyPrmDAO getPolicyPrmDAO () {
        return policyPrmDAO;
    }

    public void setPolicyPrmDAO (aminParsian.DAO.PolicyPrmDAO policyPrmDAO) {
        this.policyPrmDAO = policyPrmDAO;
    }

    public aminParsian.DAO.InvoiceCredebitDAO getInvoiceCredebitDAO () {
        return invoiceCredebitDAO;
    }

    public void setInvoiceCredebitDAO (aminParsian.DAO.InvoiceCredebitDAO invoiceCredebitDAO) {
        this.invoiceCredebitDAO = invoiceCredebitDAO;
    }

    public aminParsian.DAO.InvoiceDAO getInvoiceDAO () {
        return invoiceDAO;
    }

    public void setInvoiceDAO (aminParsian.DAO.InvoiceDAO invoiceDAO) {
        this.invoiceDAO = invoiceDAO;
    }

    public aminParsian.DAO.PolicyDAO getPolicyDao () {
        return policyDao;
    }

    public void setPolicyDao (aminParsian.DAO.PolicyDAO policyDao) {
        this.policyDao = policyDao;
    }

    public aminParsian.DAO.PersonDAO getPersonDAO () {
        return personDAO;
    }

    public void setPersonDAO (aminParsian.DAO.PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public aminParsian.DAO.SarresidElamBedehkarDAO getSarresidElamBedehkarDAO () {
        return sarresidElamBedehkarDAO;
    }

    public void setSarresidElamBedehkarDAO (aminParsian.DAO.SarresidElamBedehkarDAO sarresidElamBedehkarDAO) {
        this.sarresidElamBedehkarDAO = sarresidElamBedehkarDAO;
    }

    @Override
    public List<aminParsian.viewModel.ViewSarresidElamBedehi> getListSarresidElamBedehkar (String date, String policyNo, String insured) {
        return sarresidElamBedehkarDAO.getListSarresidElamBedehkar(date, policyNo, insured);
    }

    @Override
    public List<ViewBimeShodeElamBedehkar> getListBimeShodeElamBedehkar (String date, String insured, String tarh, String policyNo, String shobe) {
        return sarresidElamBedehkarDAO.getListBimeShodeElamBedehkar(date, insured, tarh, policyNo, shobe);
    }

    @Override
    public String savePersons (Users user, List<BimeShodeElamBedehkar> bimeShodeList){
        try {
           for(BimeShodeElamBedehkar bimeShodeElamBedehkar : bimeShodeList){
               sarresidElamBedehkarDAO.saveOrUpdate(bimeShodeElamBedehkar);
           }

        } catch (Throwable e) {
            return null;
        }
        return "success";
    }


    @Override
    public List<BimeShodeElamBedehkar> validatePersonExcel (File fileUpload, Map<Integer, Map<Integer, String>> errorMap) {

        FileInputStream fis = null;

        BigDecimal radif = null;
        String policyNo = null;
        String bimeGozar = null;
        String tarh = null;
        String name = null;
        Long prm = null;
        String elatPayan = null;
        String personelID = null;
        String familyRelation = null;
        String nationalID = null;
        String beginDate = null;
        String endDate = null;

        BimeShodeElamBedehkar bimeShodeElamBedehkar = null;


        List<BimeShodeElamBedehkar> bimeShodeElamBedehkarArrayList = new ArrayList<>();
        Map<Integer, String> rowError = null;
        org.apache.poi.ss.usermodel.Row row = null;

        Map<String, Integer> mapping = new HashMap<>();


        mapping.put("radif", 0);
        mapping.put("policyNo", 1);
        mapping.put("bimeGozar",2);
        mapping.put("personelID", 7);
        mapping.put("tarh", 9);
        mapping.put("name", 12);
        mapping.put("familyRelation", 15);
        mapping.put("nationalID", 22);
        mapping.put("beginDate", 24);
        mapping.put("endDate", 25);
        mapping.put("prm", 30);
        mapping.put("elatPayan", 33);

        try {
            fis = new FileInputStream(fileUpload);
            org.apache.poi.xssf.usermodel.XSSFWorkbook myWorkBook = new org.apache.poi.xssf.usermodel.XSSFWorkbook(fis);
            org.apache.poi.xssf.usermodel.XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            org.apache.poi.ss.usermodel.Cell cell = null;

            while (rowIterator.hasNext()) {
                rowError = new HashMap<Integer, String>();
                String error = null;
                row = (org.apache.poi.ss.usermodel.Row) rowIterator.next();
                if (row == null)
                    continue;

                cell = row.getCell(mapping.get("radif"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "ردیف الزامي است";
                    rowError.put(mapping.get("radif"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    radif = new java.math.BigDecimal(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("policyNo"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "شماره بيمه نامه الزامي است";
                    rowError.put(mapping.get("policyNo"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    policyNo = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("bimeGozar"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "بیمه گذار الزامی است";
                    rowError.put(mapping.get("bimeGozar"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    bimeGozar = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("personelID"));
                cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                personelID = cell.getStringCellValue();

                cell = row.getCell(mapping.get("tarh"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "طرح الزامی است";
                    rowError.put(mapping.get("tarh"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    tarh = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("name"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "نام بیمه شده الزامی است";
                    rowError.put(mapping.get("name"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    name = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("familyRelation"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "نسبت بیمه شده الزامی است";
                    rowError.put(mapping.get("familyRelation"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    familyRelation = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("nationalID"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "کدملی بیمه شده الزامی است";
                    rowError.put(mapping.get("nationalID"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    nationalID = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("beginDate"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "تاریخ شروع پوشش بیمه شده الزامی است";
                    rowError.put(mapping.get("beginDate"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    beginDate = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("endDate"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "تاریخ پایان پوشش بیمه شده الزامی است";
                    rowError.put(mapping.get("endDate"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    endDate = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("prm"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "حق بیمه الزامی است";
                    rowError.put(mapping.get("prm"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    prm = new Long(cell.getStringCellValue());
                }

                cell = row.getCell(mapping.get("elatPayan"));

                if(cell == null){
                    elatPayan="";
                }
                else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    elatPayan = cell.getStringCellValue();
                }


                bimeShodeElamBedehkar = new BimeShodeElamBedehkar();

                bimeShodeElamBedehkar.setBimegozar(bimeGozar);
                bimeShodeElamBedehkar.setBegindate(beginDate);
                bimeShodeElamBedehkar.setElatpayan(elatPayan);
                bimeShodeElamBedehkar.setEnddate(endDate);
                bimeShodeElamBedehkar.setName(name);
                bimeShodeElamBedehkar.setNationalcode(nationalID);
                bimeShodeElamBedehkar.setNesbat(familyRelation);
                bimeShodeElamBedehkar.setPersonelcode(personelID);
                bimeShodeElamBedehkar.setPolicyno(policyNo);
                bimeShodeElamBedehkar.setPrm(prm);
                bimeShodeElamBedehkar.setRadif(radif);
                bimeShodeElamBedehkar.setTarh(tarh);

                bimeShodeElamBedehkarArrayList.add(bimeShodeElamBedehkar);


                if (rowError.size() > 0) {
                    errorMap.put(row.getRowNum(), rowError);
                }
            }

        } catch (Exception e) {
            if (rowError.size() > 0) {
                errorMap.put(row.getRowNum(), rowError);
            }
            if (errorMap.size() > 0) {
                return null;
            }
            return null;
        }

        return bimeShodeElamBedehkarArrayList;
    }

    @Override
    public List<BimeShodeElamBedehkar> getInsuredPersonFromFile (List<BimeShodeElamBedehkar> bimeShodeElamBedehkarList, Users user) {
        return null;
    }

    @Override
    public List<Invoice> createInvoices (List<ViewBimeShodeElamBedehkar> sarresidElamBedehkars, Users user, List<Errors> errors) {
        List<Invoice> invoiceList = new ArrayList<>();
        for(ViewBimeShodeElamBedehkar bimeShodeElamBedehkar:sarresidElamBedehkars){

            Invoice inv = invoiceDAO.findByInvoiceNO(bimeShodeElamBedehkar.getLetterNo());
            if(inv != null){
                Errors errors1 = new aminParsian.model.Errors();
                errors1.setMsg("صورتحساب بیمه نامه شماره "+bimeShodeElamBedehkar.getPolicyno()+" قبلا صادر شده است");
                errors.add(errors1);
                continue;
            }

            Invoice invoice = new Invoice();
            String invoiceNo = bimeShodeElamBedehkar.getLetterNo();



            invoice.setState(1l);
            invoice.setCreatetime(aminParsian.util.DateUtil.getCurrentTime());
            invoice.setCreatedate(aminParsian.util.DateUtil.getCurrentDate());
            invoice.setPolicyNo(bimeShodeElamBedehkar.getPolicyno());
            invoice.setInvoiceNo(invoiceNo);
            invoice.setUsers(user);
            invoice.setPrm(bimeShodeElamBedehkar.getPrm());
            invoice.setBimegozar(bimeShodeElamBedehkar.getBimeGozar());
            invoice.setCount(bimeShodeElamBedehkar.getCount());
            invoice.setShenase(bimeShodeElamBedehkar.getShenase());
            invoice.setSarresid(bimeShodeElamBedehkar.getSarresid().substring(0,7));
            invoice = invoiceDAO.saveOrUpdate(invoice);
            invoiceList.add(invoice);
        }
        return invoiceList;

    }

    @Override
    public List<ViewInvoice> searchInvoices (String insured, String policyNo, String date, String invoiceNo, String tarh, String shobe) {

        return invoiceDAO.searchInvoices (insured, policyNo, date, invoiceNo, tarh, shobe) ;
    }

    @Override
    public boolean letterDeleteInvoice (String invoiceNo) {
        Invoice inv = invoiceDAO.deleteByInvoiceNo(invoiceNo);
        if(inv != null){
            return true;
        }
        return false;
    }

    @Override
    public aminParsian.model.Invoice findInvoiceByInvoiceNo (String invoiceNo) {
        return invoiceDAO.findByInvoiceNO(invoiceNo);
    }

    @Override
    public boolean letterEditInvoice (String invoiceNo) {
        Invoice inv = invoiceDAO.deleteByInvoiceNo(invoiceNo);
        if(inv != null){
            return true;
        }
        return false;
    }

    @Override
    public List<ViewResid> searchResids (String insured, String policyNo, String date, String invoiceNo, String tarh, String shobe, String shenase, Long isVosoul) {
        return invoiceDAO.searchResids (insured, policyNo, date, invoiceNo, tarh, shobe, shenase, isVosoul) ;
    }

    @Override
    public List<ViewFileBank> validateFileBankExcel (File fileUpload, Map<Integer, Map<Integer, String>> errorMap) {
        FileInputStream fis = null;

        String sharh = null;//B_1
        String date = null;//C_2
        String time = null;//D_3
        String shenase = null;//G_6
        String codeMarja = null;//I_8
        Long mablagh = null;//K_10

        ViewFileBank viewFileBank = null;


        List<ViewFileBank> viewFileBankList = new ArrayList<>();
        Map<Integer, String> rowError = null;
        org.apache.poi.ss.usermodel.Row row = null;

        Map<String, Integer> mapping = new HashMap<>();


        mapping.put("sharh", 1);
        mapping.put("date", 2);
        mapping.put("time",3);
        mapping.put("shenase", 6);
        mapping.put("codeMarja", 8);
        mapping.put("mablagh", 10);

        try {
            fis = new FileInputStream(fileUpload);
            org.apache.poi.xssf.usermodel.XSSFWorkbook myWorkBook = new org.apache.poi.xssf.usermodel.XSSFWorkbook(fis);
            org.apache.poi.xssf.usermodel.XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            org.apache.poi.ss.usermodel.Cell cell = null;

            while (rowIterator.hasNext()) {
                rowError = new HashMap<Integer, String>();
                String error = null;
                row = (org.apache.poi.ss.usermodel.Row) rowIterator.next();
                if (row == null)
                    continue;

                cell = row.getCell(mapping.get("sharh"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "شرح الزامي است";
                    rowError.put(mapping.get("sharh"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    sharh = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("date"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "تاریخ الزامي است";
                    rowError.put(mapping.get("date"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    date = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("time"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "تاریخ الزامی است";
                    rowError.put(mapping.get("time"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    time = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("shenase"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "شناسه الزامی است";
                    rowError.put(mapping.get("shenase"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    shenase = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("codeMarja"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "کد مرجع الزامی است";
                    rowError.put(mapping.get("codeMarja"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    codeMarja = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("mablagh"));
                if (aminParsian.util.DataValidation.isCellEmpty(cell)) {
                    error = "مبلغ الزامی است";
                    rowError.put(mapping.get("mablagh"), error);
                } else {
                    cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
                    mablagh = new Long(cell.getStringCellValue());
                }

                viewFileBank = new ViewFileBank();

                viewFileBank.setSharh(sharh);
                viewFileBank.setDate(date);
                viewFileBank.setTime(time);
                viewFileBank.setShenase(shenase);
                viewFileBank.setCodeMarja(codeMarja);
                viewFileBank.setMablagh(mablagh);

                viewFileBankList.add(viewFileBank);


                if (rowError.size() > 0) {
                    errorMap.put(row.getRowNum(), rowError);
                }
            }

        } catch (Exception e) {
            if (rowError.size() > 0) {
                errorMap.put(row.getRowNum(), rowError);
            }
            if (errorMap.size() > 0) {
                return null;
            }
            return null;
        }

        return viewFileBankList;
    }

    @Override
    public String saveBankReceords (Users user, List<ViewFileBank> fileBankList) {
        try {
            int i=1;
            for(ViewFileBank viewFileBank : fileBankList){

                InvoiceCredebit invoiceCredebit = new aminParsian.model.InvoiceCredebit();
//                invoiceCredebit.setId(new java.math.BigDecimal(i+1));
                invoiceCredebit.setCreateDate(aminParsian.util.DateUtil.getCurrentDate());
                invoiceCredebit.setCreateTime(aminParsian.util.DateUtil.getCurrentTime());
                invoiceCredebit.setShenase(viewFileBank.getShenase());
                invoiceCredebit.setShenaseBank(viewFileBank.getCodeMarja());
                invoiceCredebit.setVosoulDate(viewFileBank.getDate());
                invoiceCredebit.setMablagh(viewFileBank.getMablagh());
                invoiceCredebit.setUsers(user);

                invoiceCredebitDAO.saveOrUpdate(invoiceCredebit);
            }

        } catch (Throwable e) {
            return null;
        }
        return "success";
    }

    @Override
    public List<PolicyPrm> getListBimeGozar (String policyNo) {
        return policyPrmDAO.searchBimeGozar(policyNo);
    }

    @Override
    public PolicyPrm savePolicyPrmData (String policyNo, String bimeGozar, String shobe) {
        PolicyPrm policyPrm = policyPrmDAO.findByPolicyNo(policyNo);
        if(policyPrm == null){
            return null;
        }
        policyPrm.setBimeGozar(bimeGozar);
        policyPrm.setShobe(shobe);
        return (PolicyPrm)policyPrmDAO.saveOrUpdate(policyPrm);
    }
}
