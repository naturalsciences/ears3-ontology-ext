
package wsimport.uk.ac.nerc.vocab.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTopConceptsRet complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTopConceptsRet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="topConcepts" type="{http://vocab.nerc.ac.uk/types}collectionMembers"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTopConceptsRet", propOrder = {
    "error",
    "topConcepts"
})
public class GetTopConceptsRet {

    protected String error;
    @XmlElement(required = true)
    protected CollectionMembers topConcepts;

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the topConcepts property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionMembers }
     *     
     */
    public CollectionMembers getTopConcepts() {
        return topConcepts;
    }

    /**
     * Sets the value of the topConcepts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionMembers }
     *     
     */
    public void setTopConcepts(CollectionMembers value) {
        this.topConcepts = value;
    }

}
