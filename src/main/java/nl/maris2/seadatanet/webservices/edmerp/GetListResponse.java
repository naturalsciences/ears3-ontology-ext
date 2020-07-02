
package nl.maris2.seadatanet.webservices.edmerp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="get_listResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getListResult"
})
@XmlRootElement(name = "get_listResponse", namespace = "https://edmerp.seadatanet.org/webservices/edmerp/")
public class GetListResponse {

    @XmlElement(name = "get_listResult", namespace = "https://edmerp.seadatanet.org/webservices/edmerp/")
    protected String getListResult;

    /**
     * Gets the value of the getListResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetListResult() {
        return getListResult;
    }

    /**
     * Sets the value of the getListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetListResult(String value) {
        this.getListResult = value;
    }

}
