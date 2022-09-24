package aminParsian.model;

import java.util.List;
import java.util.Map;

public class ComboResponse {
    private int page;
    private Integer total;
    private int records;
    private List<Map> rows;
//    private String rows;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

//    public String[] getRows() {
//        return rows;
//    }
//
//    public void setRows(String[] rows) {
//        this.rows = rows;
//    }


    public List<Map> getRows() {
        return rows;
    }

    public void setRows(List<Map> rows) {
        this.rows = rows;
    }
}
