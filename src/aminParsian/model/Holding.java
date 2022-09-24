package aminParsian.model;
import javax.persistence.*;
import java.math.*;

@javax.persistence.Entity
@javax.persistence.Table(name = "Holding")
@javax.persistence.NamedQueries({
        @javax.persistence.NamedQuery(name="Holding.findAll", query = "select h from Holding h")
})

public class Holding  implements java.io.Serializable, java.util.Comparator, Comparable{
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

    @Column(name = "HoldingName")
    private String holdingName;

    public Holding () {
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

    public String getHoldingName () {
        return holdingName;
    }

    public void setHoldingName (String holdingName) {
        this.holdingName = holdingName;
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
