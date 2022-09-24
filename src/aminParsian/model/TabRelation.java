/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminParsian.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "TABRELATION")
@NamedQueries({
    @NamedQuery(name = "Tabrelation.findAll", query = "SELECT t FROM TabRelation t")})
public class TabRelation implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "ModuleName")
    private String moduleName;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "CLASSNAME")
    private String classname;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SEQUENCENUM")
    private Long sequencenum;
    @Column(name = "SYSTEMNAME")
    private String systemname;
    @Column(name = "ENABLE")
    private Long enable;
    @Column(name = "STATE")
    private Long state;
    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;
    @JoinColumn(name = "SIDETAB", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Tab sideTab;
    @JoinColumn(name = "TOPTAB", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Tab topTab;
    @JoinColumn(name = "ACTIONID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.EAGER)
    private ActionReq actionReq;

    public TabRelation() {
    }

    public TabRelation(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getSequencenum() {
        return sequencenum;
    }

    public void setSequencenum(Long sequencenum) {
        this.sequencenum = sequencenum;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }

    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Tab getSideTab() {
        return sideTab;
    }

    public void setSideTab(Tab sideTab) {
        this.sideTab = sideTab;
    }

    public Tab getTopTab() {
        return topTab;
    }

    public void setTopTab(Tab topTab) {
        this.topTab = topTab;
    }

    public ActionReq getActionReq() {
        return actionReq;
    }

    public void setActionReq(ActionReq actionReq) {
        this.actionReq = actionReq;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabRelation)) {
            return false;
        }
        TabRelation other = (TabRelation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tabrelation[ id=" + id + " ]";
    }
    
}
