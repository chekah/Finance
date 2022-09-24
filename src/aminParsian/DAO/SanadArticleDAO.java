package aminParsian.DAO;

import aminParsian.util.*;
import aminParsian.model.*;
import java.math.*;


public class SanadArticleDAO extends BaseDAO{
    public SanadArticle findById(BigDecimal id){
        return (SanadArticle) super.findById(SanadArticle.class, id);
    }

    public SanadArticle saveOrUpdate(SanadArticle h){
        super.saveOrUpdate(h);
        return (SanadArticle) super.findById(SanadArticle.class, currentSession().getIdentifier(h));
    }
}
