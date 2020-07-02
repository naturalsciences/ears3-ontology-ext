package nl.maris2.seadatanet.webservices.edmerp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2020-03-25T18:35:13.809+01:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/", name = "EdmerpSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface EdmerpSoap {

    @WebMethod(operationName = "get_detail", action = "https://edmerp.seadatanet.org/webservices/edmerp/get_detail")
    @RequestWrapper(localName = "get_detail", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/", className = "nl.maris2.seadatanet.webservices.edmerp.GetDetail")
    @ResponseWrapper(localName = "get_detailResponse", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/", className = "nl.maris2.seadatanet.webservices.edmerp.GetDetailResponse")
    @WebResult(name = "get_detailResult", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/")
    public java.lang.String getDetail(
        @WebParam(name = "n_code", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/")
        int nCode
    );

    @WebMethod(operationName = "get_simple_list", action = "https://edmerp.seadatanet.org/webservices/edmerp/get_simple_list")
    @RequestWrapper(localName = "get_simple_list", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/", className = "nl.maris2.seadatanet.webservices.edmerp.GetSimpleList")
    @ResponseWrapper(localName = "get_simple_listResponse", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/", className = "nl.maris2.seadatanet.webservices.edmerp.GetSimpleListResponse")
    @WebResult(name = "get_simple_listResult", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/")
    public java.lang.String getSimpleList();

    @WebMethod(operationName = "get_list_collator", action = "https://edmerp.seadatanet.org/webservices/edmerp/get_list_collator")
    @RequestWrapper(localName = "get_list_collator", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/", className = "nl.maris2.seadatanet.webservices.edmerp.GetListCollator")
    @ResponseWrapper(localName = "get_list_collatorResponse", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/", className = "nl.maris2.seadatanet.webservices.edmerp.GetListCollatorResponse")
    @WebResult(name = "get_list_collatorResult", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/")
    public java.lang.String getListCollator(
        @WebParam(name = "collator_id", targetNamespace = "http://seadatanet.maris2.nl/webservices/edmerp/")
        int collatorId
    );

    @WebMethod(operationName = "get_list", action = "https://edmerp.seadatanet.org/webservices/edmerp/get_list")
    @RequestWrapper(localName = "get_list", targetNamespace = "https://edmerp.seadatanet.org/webservices/edmerp/", className = "nl.maris2.seadatanet.webservices.edmerp.GetList")
    @ResponseWrapper(localName = "get_listResponse", targetNamespace = "https://edmerp.seadatanet.org/webservices/edmerp/", className = "nl.maris2.seadatanet.webservices.edmerp.GetListResponse")
    @WebResult(name = "get_listResult", targetNamespace = "https://edmerp.seadatanet.org/webservices/edmerp/")
    public java.lang.String getList();
}
