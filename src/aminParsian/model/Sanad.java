package aminParsian.model;

import aminParsian.util.Constants;
import aminParsian.util.DateUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="Sanad")
@NamedQueries({
        @NamedQuery(name="Sanad.findAll", query = "select s from Sanad s where s.state<100")
}
)
public class Sanad implements Serializable, Comparator, Comparable{
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "CREATEDATE")
    private String createdate;

    @Column(name = "CREATETIME")
    private String createtime;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATE")
    private Long state;

    @Column(name="sanadNo")
    private String sanadNo;

    public Sanad () {
    }

    public java.math.BigDecimal getId () {
        return id;
    }

    public void setId (java.math.BigDecimal id) {
        this.id = id;
    }

    public String getCreatedate () {
        return createdate;
    }

    public void setCreatedate (String createdate) {
        this.createdate = createdate;
    }

    public String getCreatetime () {
        return createtime;
    }

    public void setCreatetime (String createtime) {
        this.createtime = createtime;
    }

    public aminParsian.model.Users getUsers () {
        return users;
    }

    public void setUsers (aminParsian.model.Users users) {
        this.users = users;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public Long getState () {
        return state;
    }

    public void setState (Long state) {
        this.state = state;
    }

    public String getSanadNo () {
        return sanadNo;
    }

    public void setSanadNo (String sanadNo) {
        this.sanadNo = sanadNo;
    }

    @Override
    public int compareTo (Object o) {
        return 0;
    }

    @Override
    public int compare (Object o1, Object o2) {
        return 0;
    }
}
