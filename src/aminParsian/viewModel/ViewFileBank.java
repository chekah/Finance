package aminParsian.viewModel;

public class ViewFileBank {
    private String sharh;//B_1
    private String date;//C_2
    private String time;//D_3
    private String shenase;//G_6
    private String codeMarja;//I_8
    private Long mablagh;//K_10

    public ViewFileBank () {
    }

    public ViewFileBank (String sharh, String date, String time, String shenase, String codeMarja, Long mablagh) {
        this.sharh = sharh;
        this.date = date;
        this.time = time;
        this.shenase = shenase;
        this.codeMarja = codeMarja;
        this.mablagh = mablagh;
    }

    public String getSharh () {
        return sharh;
    }

    public void setSharh (String sharh) {
        this.sharh = sharh;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public String getTime () {
        return time;
    }

    public void setTime (String time) {
        this.time = time;
    }

    public String getShenase () {
        return shenase;
    }

    public void setShenase (String shenase) {
        this.shenase = shenase;
    }

    public String getCodeMarja () {
        return codeMarja;
    }

    public void setCodeMarja (String codeMarja) {
        this.codeMarja = codeMarja;
    }

    public Long getMablagh () {
        return mablagh;
    }

    public void setMablagh (Long mablagh) {
        this.mablagh = mablagh;
    }
}
