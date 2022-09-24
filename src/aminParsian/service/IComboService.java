package aminParsian.service;

/**
 * Created with IntelliJ IDEA.
 * User: a-sajadian
 * Date: 2/13/16
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IComboService {
    public static final String SERVICE_NAME = "ComboService";
    public String getList(String searchTerm, int page, String QueryID,String haveWhere,Object sessionName);
}
