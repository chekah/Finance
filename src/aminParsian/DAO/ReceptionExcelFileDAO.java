package aminParsian.DAO;


import aminParsian.model.ReceptionExcelFiles;
import aminParsian.util.BaseDAO;

import java.math.BigDecimal;

/**
 * Created by ach on 11/21/2020.
 */
public class ReceptionExcelFileDAO extends BaseDAO {
    public ReceptionExcelFiles findById(BigDecimal id)
    {
        return (ReceptionExcelFiles) super.findById(ReceptionExcelFiles.class,id);
    }

    public  Object saveOrUpdate(ReceptionExcelFiles i) {
        super.saveOrUpdate(i);
        return super.findById(ReceptionExcelFiles.class ,currentSession().getIdentifier(i));
    }
}
