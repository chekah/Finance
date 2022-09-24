package aminParsian.service;

import aminParsian.model.Tab;
import aminParsian.model.TabRelation;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: f-haghighi
 * Date: 1/19/16
 * Time: 6:22 PM
 * To change this template use File | Settings | File Templates.
 */

public interface ITabService {

    public static final String SERVICE_NAME="tabService";

    public Map<Tab, List<TabRelation> > getTabs(BigDecimal Id);
}
