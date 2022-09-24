package aminParsian.util;

import java.math.BigDecimal;

/**
 * Created by neda-asadi on 6/18/2017.
 */
public class CustomeKeyForKhesarat implements Comparable<CustomeKeyForKhesarat> {
    BigDecimal id;
    BigDecimal cover;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCover() {
        return cover;
    }

    public void setCover(BigDecimal cover) {
        this.cover = cover;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + cover.intValue();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CustomeKeyForKhesarat other = (CustomeKeyForKhesarat) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (cover != other.cover)
            return false;
        return true;
    }

    // 0 is not returned intentionally to NOT ignore duplicates.
    public int compareTo(CustomeKeyForKhesarat o) {
        int ret = -1;
        ret=this.id.compareTo(o.id);
        // Equal rank so fall back to comparing by name.
        if (ret == 0) {
            ret = this.cover.compareTo(o.cover);
        }
        return ret;
    }
}

