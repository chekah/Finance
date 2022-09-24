package aminParsian.viewModel;

import aminParsian.model.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by ach on 6/16/2020.
 */
public class ViewInsuredPerson implements Serializable {


    private Policy policy ;
    private String policyNo ;
    private  BigDecimal insuredPersonCode;
    private BigInteger mobile;
    private BigDecimal mainInsuredPersonCode;
    private  String personelID;
    private  String firstName;
    private  String lastName;
    private  String fatherName;
    private  String familyRelation ;
    private  String gender ;
    private  String day;
    private  String month;
    private  String year;
    private   String idNo ;
    private   String nationalID;
    private   String beginDate ;
    private  String endDate ;
    private  String sheba ;
    private String birthDate;

    private Person person;
    private Account account;
    private InsuredPerson insuredPerson;
    private Contact contact;

    private String  nationalIDAsli;
    private String fullNameAsli;
    private String fullName;

    private String stateStr;
    private int state;

    private String policyName;
    private Long suspondState;
    private String suspondStateStr;


    public Long getSuspondState() {
        return suspondState;
    }

    public void setSuspondState(Long suspondState) {
        this.suspondState = suspondState;
    }

    public String getSuspondStateStr() {
        return suspondStateStr;
    }

    public void setSuspondStateStr(String suspondStateStr) {
        this.suspondStateStr = suspondStateStr;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateStr() {
        return stateStr;
    }

    public void setStateStr(String stateStr) {
        this.stateStr = stateStr;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalIDAsli() {
        return nationalIDAsli;
    }

    public void setNationalIDAsli(String nationalIDAsli) {
        this.nationalIDAsli = nationalIDAsli;
    }

    public String getFullNameAsli() {
        return fullNameAsli;
    }

    public void setFullNameAsli(String fullNameAsli) {
        this.fullNameAsli = fullNameAsli;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public InsuredPerson getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(InsuredPerson insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public BigDecimal getInsuredPersonCode() {
        return insuredPersonCode;
    }

    public void setInsuredPersonCode(BigDecimal insuredPersonCode) {
        this.insuredPersonCode = insuredPersonCode;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    public BigDecimal getMainInsuredPersonCode() {
        return mainInsuredPersonCode;
    }

    public void setMainInsuredPersonCode(BigDecimal mainInsuredPersonCode) {
        this.mainInsuredPersonCode = mainInsuredPersonCode;
    }

    public String getPersonelID() {
        return personelID;
    }

    public void setPersonelID(String personelID) {
        this.personelID = personelID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFamilyRelation() {
        return familyRelation;
    }

    public void setFamilyRelation(String familyRelation) {
        this.familyRelation = familyRelation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }
}
