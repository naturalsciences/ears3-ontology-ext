
package nl.maris2.seadatanet.webservices.edmerp;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.maris2.seadatanet.webservices.edmerp package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.maris2.seadatanet.webservices.edmerp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDetail }
     * 
     */
    public GetDetail createGetDetail() {
        return new GetDetail();
    }

    /**
     * Create an instance of {@link GetDetailResponse }
     * 
     */
    public GetDetailResponse createGetDetailResponse() {
        return new GetDetailResponse();
    }

    /**
     * Create an instance of {@link GetList }
     * 
     */
    public GetList createGetList() {
        return new GetList();
    }

    /**
     * Create an instance of {@link GetListResponse }
     * 
     */
    public GetListResponse createGetListResponse() {
        return new GetListResponse();
    }

    /**
     * Create an instance of {@link GetSimpleList }
     * 
     */
    public GetSimpleList createGetSimpleList() {
        return new GetSimpleList();
    }

    /**
     * Create an instance of {@link GetSimpleListResponse }
     * 
     */
    public GetSimpleListResponse createGetSimpleListResponse() {
        return new GetSimpleListResponse();
    }

    /**
     * Create an instance of {@link GetListCollator }
     * 
     */
    public GetListCollator createGetListCollator() {
        return new GetListCollator();
    }

    /**
     * Create an instance of {@link GetListCollatorResponse }
     * 
     */
    public GetListCollatorResponse createGetListCollatorResponse() {
        return new GetListCollatorResponse();
    }

}
