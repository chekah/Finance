package aminParsian.action;

import aminParsian.model.*;
import aminParsian.viewModel.*;
import java.util.*;
import aminParsian.service.*;
import aminParsian.displaytag.*;

public class LetterAction extends aminParsian.util.BaseAction implements org.apache.struts2.util.ServletContextAware {

    private IUserService userService;
    private javax.servlet.ServletContext servletContext;
    private ILetterService letterService;

    private List<ViewInvoice> invoiceList;

    private IACHService achService;

    private String destFileDIR;
    private String realPath;
    private ViewLetter viewLetter;
    private String policyNo;
    private String date;
    private String insured;
    private String tarh;
    private String shobe;
    private String shenase;

    private java.io.File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String errormessage;
    private java.io.InputStream inputStream;
    private String message;
    private PaginatedListImpl<ViewInsuredPerson> paginatedViewInsuredPersonList;
    private String invoiceNo;
    private List<ViewResid> residList;
    private List<PolicyPrm> bimeGozarList;
    private String bimeGozar;
    private Long isVosoul;

    public Long getIsVosoul () {
        return isVosoul;
    }

    public void setIsVosoul (Long isVosoul) {
        this.isVosoul = isVosoul;
    }

    public aminParsian.displaytag.PaginatedListImpl<aminParsian.viewModel.ViewInsuredPerson> getPaginatedViewInsuredPersonList () {
        return paginatedViewInsuredPersonList;
    }

    public void setPaginatedViewInsuredPersonList (aminParsian.displaytag.PaginatedListImpl<aminParsian.viewModel.ViewInsuredPerson> paginatedViewInsuredPersonList) {
        this.paginatedViewInsuredPersonList = paginatedViewInsuredPersonList;
    }

    public java.util.List<aminParsian.model.PolicyPrm> getBimeGozarList () {
        return bimeGozarList;
    }

    public void setBimeGozarList (java.util.List<aminParsian.model.PolicyPrm> bimeGozarList) {
        this.bimeGozarList = bimeGozarList;
    }

    public String getBimeGozar () {
        return bimeGozar;
    }

    public void setBimeGozar (String bimeGozar) {
        this.bimeGozar = bimeGozar;
    }

    public java.io.File getUpload () {
        return upload;
    }

    public void setUpload (java.io.File upload) {
        this.upload = upload;
    }

    public String getUploadContentType () {
        return uploadContentType;
    }

    public void setUploadContentType (String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName () {
        return uploadFileName;
    }

    public void setUploadFileName (String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getShenase () {
        return shenase;
    }

    public void setShenase (String shenase) {
        this.shenase = shenase;
    }

    public java.util.List<aminParsian.viewModel.ViewResid> getResidList () {
        return residList;
    }

    public void setResidList (java.util.List<aminParsian.viewModel.ViewResid> residList) {
        this.residList = residList;
    }

    public String getInvoiceNo () {
        return invoiceNo;
    }

    public void setInvoiceNo (String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public List<ViewInvoice> getInvoiceList () {
        return invoiceList;
    }

    public void setInvoiceList (List<ViewInvoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public IACHService getAchService () {
        return achService;
    }

    public void setAchService (IACHService achService) {
        this.achService = achService;
    }

    public String getErrormessage () {
        return errormessage;
    }

    public void setErrormessage (String errormessage) {
        this.errormessage = errormessage;
    }

    public java.io.InputStream getInputStream () {
        return inputStream;
    }

    public void setInputStream (java.io.InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    public String getShobe () {
        return shobe;
    }

    public void setShobe (String shobe) {
        this.shobe = shobe;
    }

    public String getInsured () {
        return insured;
    }

    public void setInsured (String insured) {
        this.insured = insured;
    }

    public String getPolicyNo () {
        return policyNo;
    }

    public void setPolicyNo (String policyNo) {
        this.policyNo = policyNo;
    }

    public String getDestFileDIR () {
        return destFileDIR;
    }

    public void setDestFileDIR (String destFileDIR) {
        this.destFileDIR = destFileDIR;
    }

    public String getRealPath () {
        return realPath;
    }

    public void setRealPath (String realPath) {
        this.realPath = realPath;
    }

    public aminParsian.viewModel.ViewLetter getViewLetter () {
        return viewLetter;
    }

    public void setViewLetter (aminParsian.viewModel.ViewLetter viewLetter) {
        this.viewLetter = viewLetter;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public String getTarh () {
        return tarh;
    }

    public void setTarh (String tarh) {
        this.tarh = tarh;
    }

    @Override
    public void setServletContext (javax.servlet.ServletContext servletContext) {
        org.springframework.web.context.WebApplicationContext wac = org.springframework.web.context.support.WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);

        realPath = servletContext.getRealPath("/").replace('\\', '/');

        this.letterService = (aminParsian.service.ILetterService) wac.getBean(aminParsian.service.ILetterService.SERVICE_NAME);
        this.achService = (aminParsian.service.IACHService) wac.getBean(aminParsian.service.IACHService.SERVICE_NAME);
        this.userService = (aminParsian.service.IUserService) wac.getBean(aminParsian.service.IUserService.SERVICE_NAME);
        this.servletContext = servletContext;
    }

    public aminParsian.service.IUserService getUserService () {
        return userService;
    }

    public void setUserService (aminParsian.service.IUserService userService) {
        this.userService = userService;
    }

    public javax.servlet.ServletContext getServletContext () {
        return servletContext;
    }

    public aminParsian.service.ILetterService getLetterService () {
        return letterService;
    }

    public void setLetterService (aminParsian.service.ILetterService letterService) {
        this.letterService = letterService;
    }

    public String letterGenerateLetter () throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        List<ViewSarresidElamBedehi> sarresidElamBedehkars = letterService.getListSarresidElamBedehkar(date, policyNo, insured);

        viewLetter = new ViewLetter();

        viewLetter.setSarresidElamBedehiArrayList((ArrayList)sarresidElamBedehkars);


        try{
            destFileDIR = realPath + "reports/soorathesabLetter.pdf";
            boolean b = (new java.io.File(realPath + destFileDIR)).mkdirs();
            java.io.File destFile = new java.io.File(destFileDIR);
            if (!destFile.exists())
                destFile.createNewFile();


            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabLetterDetail.jrxml", realPath + "reports/soorathesabLetterDetail.jasper");
            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabLetter.jrxml", destFileDIR);
//            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/report1.jrxml", destFileDIR);

            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.font.name", "Helvetica");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.encoding", "UTF-8");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.embedded", "false");

            return "successChapLetter";

        } catch (java.io.IOException e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        }
    }

    public String letterGenerateLetterWithoutBack () throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        java.util.List<ViewSarresidElamBedehi> sarresidElamBedehkars = letterService.getListSarresidElamBedehkar(date, policyNo, insured);

        viewLetter = new ViewLetter();

        viewLetter.setSarresidElamBedehiArrayList((ArrayList)sarresidElamBedehkars);


        try{
            destFileDIR = realPath + "reports/soorathesabLetterWithoutBack.pdf";
            boolean b = (new java.io.File(realPath + destFileDIR)).mkdirs();
            java.io.File destFile = new java.io.File(destFileDIR);
            if (!destFile.exists())
                destFile.createNewFile();


            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabLetterDetailWithoutBack.jrxml", realPath + "reports/soorathesabLetterDetailWithoutBack.jasper");
            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabLetterWithoutBack.jrxml", destFileDIR);

            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.font.name", "Helvetica");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.encoding", "UTF-8");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.embedded", "false");

            return "successChapLetterWithoutBack";

        } catch (java.io.IOException e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        }
    }

    public String printInvoice(){
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterPrint");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";

    }

    public String letterGenerateLetterInsured () throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

//        List<ViewBimeShodeElamBedehkar> sarresidElamBedehkars = letterService.getListBimeShodeElamBedehkar(date, insured, tarh, policyNo, shobe);

        List<ViewInvoice> invoiceList = letterService.searchInvoices(null,policyNo,date, invoiceNo, tarh, shobe);
        List<ViewBimeShodeElamBedehkar> sarresidElamBedehkars = new java.util.ArrayList<>();
        for(ViewInvoice viewInvoice:invoiceList){
            ArrayList<String> months = new java.util.ArrayList<String>();

            String date = viewInvoice.getSarresid();

            months.add("");
            months.add("فروردین");months.add("اردیبهشت");months.add("خرداد");
            months.add("تیر");months.add("مرداد");months.add("شهریور");
            months.add("مهر");months.add("آبان");months.add("آذر");
            months.add("دی");months.add("بهمن");months.add("اسفند");

            String year = date.substring(0,4);
            String month = date.substring(5,7);

            int index = new java.math.BigDecimal(month).intValue();
            String date2 = months.get(index) +" "+year;


            String bimeGozar = viewInvoice.getBimeGozar();
            String title = "مدیریت محترم شرکت " + bimeGozar.substring(0, bimeGozar.length()-11);

            ViewBimeShodeElamBedehkar viewBimeShodeElamBedehkar = new aminParsian.viewModel.ViewBimeShodeElamBedehkar();
            viewBimeShodeElamBedehkar.setLetterNo(invoiceNo);
            viewBimeShodeElamBedehkar.setPolicyno(viewInvoice.getPolicyNo());
            viewBimeShodeElamBedehkar.setBimeGozar(viewInvoice.getBimeGozar());
            viewBimeShodeElamBedehkar.setSarresid(date2);
            viewBimeShodeElamBedehkar.setShenase(viewInvoice.getShenase());
            viewBimeShodeElamBedehkar.setPrm(viewInvoice.getPrm());
            viewBimeShodeElamBedehkar.setCount(viewInvoice.getCount());
            viewBimeShodeElamBedehkar.setDate(viewInvoice.getCreateDate());
            viewBimeShodeElamBedehkar.setTitle(title);


            sarresidElamBedehkars.add(viewBimeShodeElamBedehkar);
        }

        viewLetter = new ViewLetter();

        viewLetter.setBimeShodeElamBedehkarArrayList((ArrayList)sarresidElamBedehkars);

        try{
            destFileDIR = realPath + "reports/soorathesabLetter.pdf";
            boolean b = (new java.io.File(realPath + destFileDIR)).mkdirs();
            java.io.File destFile = new java.io.File(destFileDIR);
            if (!destFile.exists())
                destFile.createNewFile();


            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabLetterInsuredDetail.jrxml", realPath + "reports/soorathesabLetterInsuredDetail.jasper");
            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabLetterInsured.jrxml", destFileDIR);
//            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/report1.jrxml", destFileDIR);

            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.font.name", "Helvetica");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.encoding", "UTF-8");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.embedded", "false");

            return "successChapLetter";

        } catch (java.io.IOException e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        }
    }

    public String letterGenerateLetterInsuredWithoutBack() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        List<ViewBimeShodeElamBedehkar> sarresidElamBedehkars = letterService.getListBimeShodeElamBedehkar(date, insured, tarh, policyNo, shobe);

        viewLetter = new ViewLetter();

        viewLetter.setBimeShodeElamBedehkarArrayList((ArrayList)sarresidElamBedehkars);


        try{
            destFileDIR = realPath + "reports/soorathesabLetterWithoutBack.pdf";
            boolean b = (new java.io.File(realPath + destFileDIR)).mkdirs();
            java.io.File destFile = new java.io.File(destFileDIR);
            if (!destFile.exists())
                destFile.createNewFile();


            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabLetterInsuredDetailWithoutBack.jrxml", realPath + "reports/soorathesabLetterInsuredDetailWithoutBack.jasper");
            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabLetterInsuredWithoutBack.jrxml", destFileDIR);
//            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/report1.jrxml", destFileDIR);

            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.font.name", "Helvetica");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.encoding", "UTF-8");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.embedded", "false");

            return "successChapLetterWithoutBack";

        } catch (java.io.IOException e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        }
    }

    public String printInvoiceForInsured() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterPrintForInsured");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";

    }

    public String letterInsertBimeShode() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        if (upload == null) {
            addActionError("بارگذاري فايل الزامي است");
            return "errorInSavePersonFile";
        }

        getSession().remove("paginatedViewInsuredPersonList");

        List<BimeShodeElamBedehkar> bimeShodeElamBedehkarList = null;
        try {
            Map<Integer, Map<Integer, String>> errorMap = new HashMap<Integer, Map<Integer, String>>();
            bimeShodeElamBedehkarList = letterService.validatePersonExcel(upload, errorMap);

            if (bimeShodeElamBedehkarList == null) {
                addActionError("خطا در اعتبارسنجي اکسل ");
            }
            if (errorMap.size() > 0) { //توليد فايل حاوي خطاهاي کنترل اوليه
                upload = achService.produceErrorExcelFile(errorMap, upload);
                if (upload != null) {
//                    fileUploadContentType = "application/octet-stream";
//                    fileUploadFileName = "ErrorFile.xlsx";
                    uploadContentType = "application/octet-stream";
                    uploadFileName = "ErrorFile.xlsx";
                    try {
                        inputStream = new java.io.FileInputStream(upload);
                        return "errorInFileUpload";
                    } catch (java.io.FileNotFoundException e) {
                        addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                        return "errorInSavePersonFile";
                    }
                }
            }

//            bimeShodeElamBedehkarList = letterService.getInsuredPersonFromFile(bimeShodeElamBedehkarList, user);

            if (!(bimeShodeElamBedehkarList != null && bimeShodeElamBedehkarList.size() > 0)) {
                errormessage = "اطلاعات ارسالی قابل پیمایش نیست.";
                return "errorInSavePersonFile";
            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در اعتبارسنجی فایل بیمه شدگان");
            return "errorInSavePersonFile";
        }
        try {
            if (bimeShodeElamBedehkarList != null) {
                int counter = 0;
                Iterator<BimeShodeElamBedehkar> bimeShodeIterator = bimeShodeElamBedehkarList.iterator();
                List<BimeShodeElamBedehkar> bimeShodeList = new ArrayList<BimeShodeElamBedehkar>();
                String result = null;
                int i = 0;
                while (bimeShodeIterator.hasNext()) {
                    if (counter <= 200) {
                        bimeShodeList.add(bimeShodeIterator.next());
                        counter += 1;
                    } else {

                        counter = 0;
                        result = letterService.savePersons(user, bimeShodeList);
                        i++;

                        if (result == null) {
                            System.out.println(i);
                            errormessage = "خطا در ذخیره ی اطلاعات در پایگاه داده";
                            return "errorInSavePersonFile";
                        }
                        bimeShodeList = new ArrayList<BimeShodeElamBedehkar>();
                    }

                }//230 tay akharu 200 tashu bala vared karde 30 tay baghysh paiin
                if (bimeShodeList.size() > 0) {
                    result = letterService.savePersons(user, bimeShodeList);
                    if (result == null) {
                        errormessage = "خطا در ذخیره ی اطلاعات در پایگاه داده";
                        return "errorInSavePersonFile";
                    }
                }

            }
        } catch (Exception e) {
            addActionError("خطا در ذخیره فایل بیمه شدگان");
            return "errorInSavePersonFile";
        }

        int page = aminParsian.displaytag.PagingUtil.getPageNumberFromContext("page");
//        paginatedViewInsuredPersonList = achService.getViewInsuredPersonPaginatedList(page, viewInsuredPersonList);
//        getSession().put("paginatedViewInsuredPersonList", paginatedViewInsuredPersonList);

        message = "عملیات با موفقیت انجام شد";

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterSavePerson");
        getSession().put("activeTabRelation", activeTabRelation);
        return "successSavePersonFile";

    }

    public String letterSavePerson() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterSavePerson");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";

    }

    public String letterSavePersonFile() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterSavePerson");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    public String letterProduce() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterProduce");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";

    }

    public String letterProduceLetterInsured() throws Exception{

        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        List<Errors> errors = new java.util.ArrayList<>();
        List<ViewBimeShodeElamBedehkar> sarresidElamBedehkars = letterService.getListBimeShodeElamBedehkar(date, insured, tarh, policyNo, shobe);

        List<Invoice> invoices = letterService.createInvoices(sarresidElamBedehkars, user, errors);
        message = "";
        if(errors != null && !errors.isEmpty()){
            for(Errors error : errors)
                message += error.getMsg()+ " ";
        }

        message += "صورتحساب ها ایجاد شد. لیست شماره صورتحساب ها: ";
        for(Invoice invoice:invoices)
            message += invoice.getInvoiceNo()+ " ";


        return "success";
    }

    public String letterReport() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterReport");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";

    }

    public String letterReportSearch() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("LetterReport");
        getSession().put("activeTabRelation", actviceTabRelation);

        invoiceList = letterService.searchInvoices(insured, policyNo, date, invoiceNo, tarh, shobe);
        if (invoiceList == null || invoiceList.size() == 0) {
            message = "رکوردی یافت نشد";
            return "error";
        }

        return "success";
    }

    public String letterDeleteInvoice() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("LetterReport");
        getSession().put("activeTabRelation", actviceTabRelation);

        letterService.letterDeleteInvoice(invoiceNo);

        return "success";
    }

    public String letterEditInvoice() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("LetterReport");
        getSession().put("activeTabRelation", actviceTabRelation);

        Invoice inv = letterService.findInvoiceByInvoiceNo(invoiceNo);


        date = inv.getSarresid();
        policyNo = inv.getPolicyNo();

        letterService.letterDeleteInvoice(invoiceNo);


        List<Errors> errors = new java.util.ArrayList<>();
        List<ViewBimeShodeElamBedehkar> sarresidElamBedehkars = letterService.getListBimeShodeElamBedehkar(date, null, null, policyNo, null);

        List<Invoice> invoices = letterService.createInvoices(sarresidElamBedehkars, user, errors);
        message = "";
        if(errors != null && !errors.isEmpty()){
            for(Errors error : errors)
                message += error.getMsg()+ " ";
        }

        message += "صورتحساب ها ایجاد شد. لیست شماره صورتحساب ها: ";
        for(Invoice invoice:invoices)
            message += invoice.getInvoiceNo()+ " ";



        return "success";
    }

    public String letterGenerateResid() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("LetterResidReport");
        getSession().put("activeTabRelation", actviceTabRelation);

        residList = letterService.searchResids(insured,policyNo,date, invoiceNo, tarh, shobe, shenase, isVosoul);

        if (residList == null || residList.size() == 0) {
            message = "رکوردی یافت نشد";
            return "error";
        }

        return "success";
    }

    public String letterResidReport() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterResidReport");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String letterPrintResid() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        residList = letterService.searchResids(insured,policyNo,date, invoiceNo, tarh, shobe, shenase, isVosoul);

        for(ViewResid viewResid:residList){
            ArrayList<String> months = new java.util.ArrayList<String>();

            String date = viewResid.getSarresid();

            months.add("");
            months.add("فروردین");months.add("اردیبهشت");months.add("خرداد");
            months.add("تیر");months.add("مرداد");months.add("شهریور");
            months.add("مهر");months.add("آبان");months.add("آذر");
            months.add("دی");months.add("بهمن");months.add("اسفند");

            String year = date.substring(0,4);
            String month = date.substring(5,7);

            int index = new java.math.BigDecimal(month).intValue();
            String date2 = months.get(index) +" "+year;


            String bimeGozar = viewResid.getBimeGozar();
            String title = "مدیریت محترم شرکت " + bimeGozar.substring(0, bimeGozar.length()-11);

            viewResid.setSarresidStr(date2);
            viewResid.setTitle(title);
        }

        viewLetter = new ViewLetter();
        viewLetter.setViewResidArrayList((ArrayList)residList);

        try{
            destFileDIR = realPath + "reports/soorathesabResid.pdf";
            boolean b = (new java.io.File(realPath + destFileDIR)).mkdirs();
            java.io.File destFile = new java.io.File(destFileDIR);
            if (!destFile.exists())
                destFile.createNewFile();


            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabResidDetail.jrxml", realPath + "reports/soorathesabResidDetail.jasper");
            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/soorathesabResid.jrxml", destFileDIR);
//            net.sf.jasperreports.engine.JasperCompileManager.compileReportToFile(realPath + "reports/report1.jrxml", destFileDIR);

            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.font.name", "Helvetica");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.encoding", "UTF-8");
            net.sf.jasperreports.engine.util.JRProperties.setProperty("net.sf.jasperreports.default.pdf.embedded", "false");

            return "successChapResid";

        } catch (java.io.IOException e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در چاپ");
            return ERROR;
        }
    }

    public String letterEnterSaveFileBank() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterUploadFileBank");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";

    }
    public String letterEditBimeGozar() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterEditBimeGozar");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String letterSearchBimeGozar() throws Exception
    {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        bimeGozarList = letterService.getListBimeGozar(policyNo);

        if (bimeGozarList == null || bimeGozarList.size() == 0) {
            message = "رکوردی یافت نشد";
            return "error";
        }

        return "success";

    }

    public String letterChangePolicyData() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        PolicyPrm policyPrm = letterService.savePolicyPrmData(policyNo, bimeGozar, shobe);
        if(policyPrm == null){
            message="خطا در ذخیره سازی دیتا";
            return "error";
        }
        message = "اطلاعات با موفقیت به روز رسانی شد";
        return "success";
    }

    public String letterSaveFileBank() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        if (upload == null) {
            addActionError("بارگذاري فايل الزامي است");
            return "errorInSaveFileBank";
        }

        List<ViewFileBank> viewFileBankList = null;
        try {
            Map<Integer, Map<Integer, String>> errorMap = new HashMap<Integer, Map<Integer, String>>();
            viewFileBankList = letterService.validateFileBankExcel(upload, errorMap);

            if (viewFileBankList == null) {
                addActionError("خطا در اعتبارسنجي اکسل ");
            }
            if (errorMap.size() > 0) { //توليد فايل حاوي خطاهاي کنترل اوليه
                upload = achService.produceErrorExcelFile(errorMap, upload);
                if (upload != null) {
                    uploadContentType = "application/octet-stream";
                    uploadFileName = "ErrorFile.xlsx";
                    try {
                        inputStream = new java.io.FileInputStream(upload);
                        return "errorInFileUpload";
                    } catch (java.io.FileNotFoundException e) {
                        addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                        return "errorInSaveFileBank";
                    }
                }
            }

            if (!(viewFileBankList != null && viewFileBankList.size() > 0)) {
                errormessage = "اطلاعات ارسالی قابل پیمایش نیست.";
                return "errorInSaveFileBank";
            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در اعتبارسنجی فایل بانک");
            return "errorInSaveFileBank";
        }
        try {
            if (viewFileBankList != null) {
                int counter = 0;
                Iterator<ViewFileBank> viewFileBankIterator = viewFileBankList.iterator();
                List<ViewFileBank> fileBankList = new ArrayList<ViewFileBank>();
                String result = null;
                int i = 0;
                while (viewFileBankIterator.hasNext()) {
                    if (counter <= 200) {
                        fileBankList.add(viewFileBankIterator.next());
                        counter += 1;
                    } else {

                        counter = 0;
                        result = letterService.saveBankReceords(user, fileBankList);
                        i++;

                        if (result == null) {
                            System.out.println(i);
                            errormessage = "خطا در ذخیره ی اطلاعات در پایگاه داده";
                            return "errorInSaveFileBank";
                        }
                        fileBankList = new ArrayList<ViewFileBank>();
                    }

                }//230 tay akharu 200 tashu bala vared karde 30 tay baghysh paiin
                if (fileBankList.size() > 0) {
                    result = letterService.saveBankReceords(user, fileBankList);
                    if (result == null) {
                        errormessage = "خطا در ذخیره ی اطلاعات در پایگاه داده";
                        return "errorInSaveFileBank";
                    }
                }

            }
        } catch (Exception e) {
            addActionError("خطا در ذخیره فایل بانک");
            return "errorInSaveFileBank";
        }

        int page = aminParsian.displaytag.PagingUtil.getPageNumberFromContext("page");

        message = "عملیات با موفقیت انجام شد";

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterUploadFileBank");
        getSession().put("activeTabRelation", activeTabRelation);
        return "successSaveFileBank";

    }

    public String letterAfterSaveFileBank() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        TabRelation activeTabRelation = userService.setCurrentTabRelation("LetterUploadFileBank");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    public String letterShowPolicyForEdit() throws Exception{
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        List<PolicyPrm> policyPrmList = letterService.getListBimeGozar(policyNo);
        if(policyPrmList == null || policyPrmList.size()==0){
            message = "بیمه نامه ای با این شماره بیمه نامه یافت نشد";
            return "error";
        }
        PolicyPrm policyPrm = policyPrmList.get(0);
        policyNo = policyPrm.getPolicyno();
        shobe = policyPrm.getShobe();
        bimeGozar = policyPrm.getBimeGozar();

        return "success";
    }

}
