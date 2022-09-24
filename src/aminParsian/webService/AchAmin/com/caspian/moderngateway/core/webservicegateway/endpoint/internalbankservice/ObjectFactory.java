
package com.caspian.moderngateway.core.webservicegateway.endpoint.internalbankservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.caspian.moderngateway.core.webservicegateway.endpoint.internalbankservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.caspian.moderngateway.core.webservicegateway.endpoint.internalbankservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MenuEntryDto }
     * 
     */
    public MenuEntryDto createMenuEntryDto() {
        return new MenuEntryDto();
    }

    /**
     * Create an instance of {@link ActivityDto }
     * 
     */
    public ActivityDto createActivityDto() {
        return new ActivityDto();
    }

    /**
     * Create an instance of {@link MenuDto }
     * 
     */
    public MenuDto createMenuDto() {
        return new MenuDto();
    }

    /**
     * Create an instance of {@link ChLoginResponseBean }
     * 
     */
    public ChLoginResponseBean createChLoginResponseBean() {
        return new ChLoginResponseBean();
    }

}
