
package aminParsian.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "ERRORS")
@NamedQueries({
    @NamedQuery(name = "Errors.findAll", query = "SELECT e FROM Errors e")})
public class Errors implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODE")
    private BigDecimal code;
    @Basic(optional = false)
    @Column(name = "ACTIONS")
    private String actions;
    @Basic(optional = false)
    @Column(name = "MSG")
    private String msg;

    public Errors() {
    }

    public Errors(Errors error) {
        this.msg = error.getMsg();
        this.actions = error.getActions();
    //    this.code = error.getCode();
    }

    public Errors(BigDecimal code) {
        this.code = code;
    }

    public Errors(BigDecimal code, String actions, String msg) {
        this.code = code;
        this.actions = actions;
        this.msg = msg;
    }

    public BigDecimal getCode() {
        return code;
    }

    public void setCode(BigDecimal code) {
        this.code = code;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Errors)) {
            return false;
        }
        Errors other = (Errors) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Errors[ code=" + code + " ]";
    }
    
}
