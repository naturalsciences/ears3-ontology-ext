
package wsimport.uk.ac.nerc.vocab.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="concept" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectionURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="conceptType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "concept",
    "collectionURI",
    "conceptType",
    "status"
})
@XmlRootElement(name = "VerifyConcept")
public class VerifyConcept {

    @XmlElement(required = true)
    protected String concept;
    @XmlElement(required = true)
    protected String collectionURI;
    @XmlElement(required = true)
    protected String conceptType;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the concept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConcept() {
        return concept;
    }

    /**
     * Sets the value of the concept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConcept(String value) {
        this.concept = value;
    }

    /**
     * Gets the value of the collectionURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionURI() {
        return collectionURI;
    }

    /**
     * Sets the value of the collectionURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionURI(String value) {
        this.collectionURI = value;
    }

    /**
     * Gets the value of the conceptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptType() {
        return conceptType;
    }

    /**
     * Sets the value of the conceptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptType(String value) {
        this.conceptType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
