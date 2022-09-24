package aminParsian.DAO;

import aminParsian.model.*;
import aminParsian.util.BaseDAO;

public class InvoiceCredebitDAO extends BaseDAO{
    public  InvoiceCredebit saveOrUpdate(InvoiceCredebit i)
    {
        super.saveOrUpdate(i);

        return (InvoiceCredebit) super.findById(InvoiceCredebit.class ,currentSession().getIdentifier(i));

    }
}
