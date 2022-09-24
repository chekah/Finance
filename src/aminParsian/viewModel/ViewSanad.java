package aminParsian.viewModel;

import java.math.BigInteger;

/**
 * Created by ach on 12/16/2017.
 */
public class ViewSanad {
    String ameleNaghdinegi;
    String sanadNo;
    String sanadDate;
    String sanadRow;
    String sharheGhalam;
    String codeMoein;
    String codeTafsil4;
    String codeTafsil5;
    String codeTafsil6;
    BigInteger mablaghBedehkar;
    BigInteger mablaghBestankar;
    Integer nerkhArz;
    Integer nerkhArzMabna;
    Integer mablaghBedehkarArz;
    Integer mablaghBestankarArz;
    String onvanArz;
    String onvanArzMabna;
    String shomarePeigiri;
    String tarikhPeigiri;

    String tahvilGirande;
    String shomareFeri;
    String sandoogh;
    String sharhPardakht;
    String sharhdovom;
    String tarafeMoghabel;
    String hesabtarafeMoghabel;
    String codeAmaliat;
    String AmeleNaghdinegi;
    String elamieBardasht;
    String tarikhBardasht;
    String bankname;
    String codeshobe;
    String shomareHesab;
    Integer mablaghArzAmaliati;
    Integer nerkhtabdil;
    String sharbezabanDovom;

    public ViewSanad() {
    }

    public ViewSanad(String sanadNo, String sanadDate, String sanadRow, String sharheGhalam, String codeMoein, String codeTafsil4, String codeTafsil5, String codeTafsil6, BigInteger mablaghBedehkar, BigInteger mablaghBestankar, Integer nerkhArz, Integer nerkhArzMabna, Integer mablaghBedehkarArz, Integer mablaghBestankarArz, String onvanArz, String onvanArzMabna, String shomarePeigiri, String tarikhPeigiri) {
        this.sanadNo = sanadNo;
        this.sanadDate = sanadDate;
        this.sanadRow = sanadRow;
        this.sharheGhalam = sharheGhalam;
        this.codeMoein = codeMoein;
        this.codeTafsil4 = codeTafsil4;
        this.codeTafsil5 = codeTafsil5;
        this.codeTafsil6 = codeTafsil6;
        this.mablaghBedehkar = mablaghBedehkar;
        this.mablaghBestankar = mablaghBestankar;
        this.nerkhArz = nerkhArz;
        this.nerkhArzMabna = nerkhArzMabna;
        this.mablaghBedehkarArz = mablaghBedehkarArz;
        this.mablaghBestankarArz = mablaghBestankarArz;
        this.onvanArz = onvanArz;
        this.onvanArzMabna = onvanArzMabna;
        this.shomarePeigiri = shomarePeigiri;
        this.tarikhPeigiri = tarikhPeigiri;
    }

    public ViewSanad(String sanadNo, String sanadDate, String sanadRow, String tahvilGirande, String shomareFeri, String sandoogh, String sharhPardakht,
                     String sharhdovom, String tarafeMoghabel, String hesabtarafeMoghabel, String codeAmaliat, String ameleNaghdinegi, String elamieBardasht,
                     String tarikhBardasht, String bankname, String codeshobe, String shomareHesab, BigInteger mablaghBedehkar, Integer nerkhArz,
                     Integer mablaghArzAmaliati, Integer nerkhArzMabna, Integer nerkhtabdil, Integer mablaghBedehkarArz, String sharheGhalam, String sharbezabanDovom) {
        this.sanadNo=sanadNo;
        this.sanadDate=sanadDate;
        this.sanadRow=sanadRow;
        this.tahvilGirande=tahvilGirande;
        this.shomareFeri=shomareFeri;
        this.sandoogh=sandoogh;
        this.sharhPardakht=sharhPardakht;
        this.sharhdovom=sharhdovom;
        this.tarafeMoghabel=tarafeMoghabel;
        this.hesabtarafeMoghabel=hesabtarafeMoghabel;
        this.codeAmaliat =codeAmaliat;
        this.ameleNaghdinegi=ameleNaghdinegi;
        this.elamieBardasht=elamieBardasht;
        this.tarikhBardasht=tarikhBardasht;
        this.bankname=bankname;
        this.codeshobe=codeshobe;
        this.shomareHesab=shomareHesab;
        this.mablaghBedehkar=mablaghBedehkar;
        this.nerkhArz=nerkhArz;
        this.mablaghArzAmaliati=mablaghArzAmaliati;
        this.nerkhArzMabna=nerkhArzMabna;
        this.nerkhtabdil=nerkhtabdil;
        this.mablaghBedehkarArz=mablaghBedehkarArz;
        this.sharheGhalam=sharheGhalam;
        this.sharbezabanDovom=sharbezabanDovom;

    }


    ///////////////////////////////////////////////////////////

    public String getSanadNo() {
        return sanadNo;
    }

    public void setSanadNo(String sanadNo) {
        this.sanadNo = sanadNo;
    }

    public String getSanadDate() {
        return sanadDate;
    }

    public void setSanadDate(String sanadDate) {
        this.sanadDate = sanadDate;
    }

    public String getSanadRow() {
        return sanadRow;
    }

    public void setSanadRow(String sanadRow) {
        this.sanadRow = sanadRow;
    }

    public String getSharheGhalam() {
        return sharheGhalam;
    }

    public void setSharheGhalam(String sharheGhalam) {
        this.sharheGhalam = sharheGhalam;
    }

    public String getCodeMoein() {
        return codeMoein;
    }

    public void setCodeMoein(String codeMoein) {
        this.codeMoein = codeMoein;
    }

    public String getCodeTafsil4() {
        return codeTafsil4;
    }

    public void setCodeTafsil4(String codeTafsil4) {
        this.codeTafsil4 = codeTafsil4;
    }

    public String getCodeTafsil5() {
        return codeTafsil5;
    }

    public void setCodeTafsil5(String codeTafsil5) {
        this.codeTafsil5 = codeTafsil5;
    }

    public String getCodeTafsil6() {
        return codeTafsil6;
    }

    public void setCodeTafsil6(String codeTafsil6) {
        this.codeTafsil6 = codeTafsil6;
    }

    public BigInteger getMablaghBedehkar() {
        return mablaghBedehkar;
    }

    public void setMablaghBedehkar(BigInteger mablaghBedehkar) {
        this.mablaghBedehkar = mablaghBedehkar;
    }

    public BigInteger getMablaghBestankar() {
        return mablaghBestankar;
    }

    public void setMablaghBestankar(BigInteger mablaghBestankar) {
        this.mablaghBestankar = mablaghBestankar;
    }

    public Integer getNerkhArz() {
        return nerkhArz;
    }

    public void setNerkhArz(Integer nerkhArz) {
        this.nerkhArz = nerkhArz;
    }

    public Integer getNerkhArzMabna() {
        return nerkhArzMabna;
    }

    public void setNerkhArzMabna(Integer nerkhArzMabna) {
        this.nerkhArzMabna = nerkhArzMabna;
    }

    public Integer getMablaghBedehkarArz() {
        return mablaghBedehkarArz;
    }

    public void setMablaghBedehkarArz(Integer mablaghBedehkarArz) {
        this.mablaghBedehkarArz = mablaghBedehkarArz;
    }

    public Integer getMablaghBestankarArz() {
        return mablaghBestankarArz;
    }

    public void setMablaghBestankarArz(Integer mablaghBestankarArz) {
        this.mablaghBestankarArz = mablaghBestankarArz;
    }

    public String getOnvanArz() {
        return onvanArz;
    }

    public void setOnvanArz(String onvanArz) {
        this.onvanArz = onvanArz;
    }

    public String getOnvanArzMabna() {
        return onvanArzMabna;
    }

    public void setOnvanArzMabna(String onvanArzMabna) {
        this.onvanArzMabna = onvanArzMabna;
    }

    public String getShomarePeigiri() {
        return shomarePeigiri;
    }

    public void setShomarePeigiri(String shomarePeigiri) {
        this.shomarePeigiri = shomarePeigiri;
    }

    public String getTarikhPeigiri() {
        return tarikhPeigiri;
    }

    public void setTarikhPeigiri(String tarikhPeigiri) {
        this.tarikhPeigiri = tarikhPeigiri;
    }

    public String getTahvilGirande() {
        return tahvilGirande;
    }

    public void setTahvilGirande(String tahvilGirande) {
        this.tahvilGirande = tahvilGirande;
    }

    public String getShomareFeri() {
        return shomareFeri;
    }

    public void setShomareFeri(String shomareFeri) {
        this.shomareFeri = shomareFeri;
    }

    public String getSandoogh() {
        return sandoogh;
    }

    public void setSandoogh(String sandoogh) {
        this.sandoogh = sandoogh;
    }

    public String getSharhPardakht() {
        return sharhPardakht;
    }

    public void setSharhPardakht(String sharhPardakht) {
        this.sharhPardakht = sharhPardakht;
    }

    public String getSharhdovom() {
        return sharhdovom;
    }

    public void setSharhdovom(String sharhdovom) {
        this.sharhdovom = sharhdovom;
    }

    public String getTarafeMoghabel() {
        return tarafeMoghabel;
    }

    public void setTarafeMoghabel(String tarafeMoghabel) {
        this.tarafeMoghabel = tarafeMoghabel;
    }

    public String getHesabtarafeMoghabel() {
        return hesabtarafeMoghabel;
    }

    public void setHesabtarafeMoghabel(String hesabtarafeMoghabel) {
        this.hesabtarafeMoghabel = hesabtarafeMoghabel;
    }

    public String getCodeAmaliat() {
        return codeAmaliat;
    }

    public void setCodeAmaliat(String codeAmaliat) {
        this.codeAmaliat = codeAmaliat;
    }

    public String getAmeleNaghdinegi() {
        return AmeleNaghdinegi;
    }

    public void setAmeleNaghdinegi(String ameleNaghdinegi) {
        AmeleNaghdinegi = ameleNaghdinegi;
    }

    public String getElamieBardasht() {
        return elamieBardasht;
    }

    public void setElamieBardasht(String elamieBardasht) {
        this.elamieBardasht = elamieBardasht;
    }

    public String getTarikhBardasht() {
        return tarikhBardasht;
    }

    public void setTarikhBardasht(String tarikhBardasht) {
        this.tarikhBardasht = tarikhBardasht;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getCodeshobe() {
        return codeshobe;
    }

    public void setCodeshobe(String codeshobe) {
        this.codeshobe = codeshobe;
    }

    public String getShomareHesab() {
        return shomareHesab;
    }

    public void setShomareHesab(String shomareHesab) {
        this.shomareHesab = shomareHesab;
    }

    public Integer getMablaghArzAmaliati() {
        return mablaghArzAmaliati;
    }

    public void setMablaghArzAmaliati(Integer mablaghArzAmaliati) {
        this.mablaghArzAmaliati = mablaghArzAmaliati;
    }

    public Integer getNerkhtabdil() {
        return nerkhtabdil;
    }

    public void setNerkhtabdil(Integer nerkhtabdil) {
        this.nerkhtabdil = nerkhtabdil;
    }

    public String getSharbezabanDovom() {
        return sharbezabanDovom;
    }

    public void setSharbezabanDovom(String sharbezabanDovom) {
        this.sharbezabanDovom = sharbezabanDovom;
    }
}
