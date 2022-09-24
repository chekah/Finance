package aminParsian.viewModel;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by 8041 on 3/14/2016.
 */
public class ViewUser {

    private BigDecimal id;
    private String userName;
    private BigDecimal stateID;
    private BigDecimal typeID;
    private String agencyName;
    private String secondaryCodeName;
    private BigDecimal personID;
    private String name;
    private String family;
    private String nationalId;
    private BigDecimal sematID;
    private String sematName;
    private BigDecimal stationID;
    private String stationName;
    private BigDecimal secondaryCodeID;
    private BigDecimal agencyID;
    private String state;
    private String type;
    private String password;
    private BigInteger agencyNo;

    public ViewUser() {
    }

    public ViewUser(BigDecimal id, String userName, BigDecimal stateID, BigDecimal typeID, String agencyName, String secondaryCodeName, BigDecimal personID, String name, String family, String nationalId, BigDecimal sematID, String sematName, BigDecimal stationID, String stationName, BigDecimal secondaryCodeID, BigDecimal agencyID, String state, String type, String password) {
        this.id = id;
        this.userName = userName;
        this.stateID = stateID;
        this.typeID = typeID;
        this.agencyName = agencyName;
        this.secondaryCodeName = secondaryCodeName;
        this.personID = personID;
        this.name = name;
        this.family = family;
        this.nationalId = nationalId;
        this.sematID = sematID;
        this.sematName = sematName;
        this.stationID = stationID;
        this.stationName = stationName;
        this.secondaryCodeID = secondaryCodeID;
        this.agencyID = agencyID;
        this.state = state;
        this.type = type;
        this.password = password;
    }

    public BigInteger getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(BigInteger agencyNo) {
        this.agencyNo = agencyNo;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getStateID() {
        return stateID;
    }

    public void setStateID(BigDecimal stateID) {
        this.stateID = stateID;
    }

    public BigDecimal getTypeID() {
        return typeID;
    }

    public void setTypeID(BigDecimal typeID) {
        this.typeID = typeID;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getSecondaryCodeName() {
        return secondaryCodeName;
    }

    public void setSecondaryCodeName(String secondaryCodeName) {
        this.secondaryCodeName = secondaryCodeName;
    }

    public BigDecimal getPersonID() {
        return personID;
    }

    public void setPersonID(BigDecimal personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public BigDecimal getSematID() {
        return sematID;
    }

    public void setSematID(BigDecimal sematID) {
        this.sematID = sematID;
    }

    public String getSematName() {
        return sematName;
    }

    public void setSematName(String sematName) {
        this.sematName = sematName;
    }

    public BigDecimal getStationID() {
        return stationID;
    }

    public void setStationID(BigDecimal stationID) {
        this.stationID = stationID;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public BigDecimal getSecondaryCodeID() {
        return secondaryCodeID;
    }

    public void setSecondaryCodeID(BigDecimal secondaryCodeID) {
        this.secondaryCodeID = secondaryCodeID;
    }

    public BigDecimal getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(BigDecimal agencyID) {
        this.agencyID = agencyID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
