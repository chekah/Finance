/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminParsian.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "TAB")
@NamedQueries({
    @NamedQuery(name = "Tab.findAll", query = "SELECT t FROM Tab t")})
public class Tab implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "SEQUENCNUM")
    private Long sequencnum;
    @Column(name = "TABNAME")
    private String tabname;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "TYPE")
    private Long type;


    @OneToMany(mappedBy = "sideTab", fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    private  Collection<TabRelation> tabRelationCollection;

    @OneToMany(mappedBy = "topTab", fetch = FetchType.LAZY)
    private transient Collection<TabRelation> tabRelationCollection1;

    public Tab() {
    }

    public Tab(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Long getSequencnum() {
        return sequencnum;
    }

    public void setSequencnum(Long sequencnum) {
        this.sequencnum = sequencnum;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }


    public Collection<TabRelation> getTabRelationCollection() {
        return tabRelationCollection;
    }

    public void setTabRelationCollection(Collection<TabRelation> tabRelationCollection) {
        this.tabRelationCollection = tabRelationCollection;
    }

    public Collection<TabRelation> getTabRelationCollection1() {
        return tabRelationCollection1;
    }

    public void setTabRelationCollection1(Collection<TabRelation> tabRelationCollection1) {
        this.tabRelationCollection1 = tabRelationCollection1;
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
        if (!(object instanceof Tab)) {
            return false;
        }
        Tab other = (Tab) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tab[ id=" + id + " ]";
    }
    
}
