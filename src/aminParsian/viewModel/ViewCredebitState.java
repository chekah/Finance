package aminParsian.viewModel;

import java.math.BigDecimal;

/**
 * Created by a-naderi on 7/28/2017.
 */
public class ViewCredebitState {

    private BigDecimal credebitID;

    private String date;
    private String time;
    private String userName;
    private String stateStr;


//    ---------------------------------------------------------------------------------------------------------------------


    public BigDecimal getCredebitID() {
        return credebitID;
    }

    public void setCredebitID(BigDecimal credebitID) {
        this.credebitID = credebitID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStateStr() {
        return stateStr;
    }

    public void setStateStr(String stateStr) {
        this.stateStr = stateStr;
    }

//    ---------------------------------------------------------------------------------------------------------------------

    public ViewCredebitState(){

    }



}
