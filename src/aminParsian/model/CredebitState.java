package aminParsian.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;

/**
 * Created by a-naderi on 7/28/2017.
 */
@Entity
@Table(name = "CREDEBITSTATE")
@NamedQueries({
        @NamedQuery(name = "CredebitState.findAll", query = "SELECT cs FROM CredebitState cs")})
public class CredebitState implements Serializable, Comparable{
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

    @JoinColumn(name = "CredebitId", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Credebit credebit;


    public CredebitState() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Credebit getCredebit() {
        return credebit;
    }

    public void setCredebit(Credebit credebit) {
        this.credebit = credebit;
    }

    @Override
    public int compareTo(Object o) {
        CredebitState cs = (CredebitState)o;
        return cs.getState().compareTo(this.getState());
    }
}
