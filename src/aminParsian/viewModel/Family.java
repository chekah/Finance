package aminParsian.viewModel;

import aminParsian.model.InsuredPerson;
import org.springframework.web.servlet.View;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Family implements Serializable {

    ViewInsuredPerson sarparast;
    ArrayList<ViewInsuredPerson> familyMembers = new ArrayList<ViewInsuredPerson>();
    String familyNO;
    Boolean hasCapacity = true;
    BigDecimal policyID;
    String familyKey;

    InsuredPerson sarparastIsInDB;


    public Family() {
    }

    public String getFamilyKey() {
        return familyKey;
    }

    public void setFamilyKey(String familyKey) {
        this.familyKey = familyKey;
    }

    public InsuredPerson getSarparastIsInDB() {
        return sarparastIsInDB;
    }

    public void setSarparastIsInDB(InsuredPerson sarparastIsInDB) {
        this.sarparastIsInDB = sarparastIsInDB;
    }

    public BigDecimal getPolicyID() {
        return policyID;
    }

    public void setPolicyID(BigDecimal policyID) {
        this.policyID = policyID;
    }

    public ViewInsuredPerson getSarparast() {
        return sarparast;
    }

    public void setSarparast(ViewInsuredPerson sarparast) {
        this.sarparast = sarparast;
    }

    public ArrayList<ViewInsuredPerson> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(ArrayList<ViewInsuredPerson> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String getFamilyNO() {
        return familyNO;
    }

    public void setFamilyNO(String familyNO) {
        this.familyNO = familyNO;
    }

    public Boolean getHasCapacity() {
        return hasCapacity;
    }

    public void setHasCapacity(Boolean hasCapacity) {
        this.hasCapacity = hasCapacity;
    }
}
