
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
 *         &lt;element name="verifyConcept" type="{http://vocab.nerc.ac.uk/types}VerifyConceptRet"/&gt;
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
    "verifyConcept"
})
@XmlRootElement(name = "VerifyConceptResponse")
public class VerifyConceptResponse {

    @XmlElement(required = true)
    protected VerifyConceptRet verifyConcept;

    /**
     * Gets the value of the verifyConcept property.
     * 
     * @return
     *     possible object is
     *     {@link VerifyConceptRet }
     *     
     */
    public VerifyConceptRet getVerifyConcept() {
        return verifyConcept;
    }

    /**
     * Sets the value of the verifyConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyConceptRet }
     *     
     */
    public void setVerifyConcept(VerifyConceptRet value) {
        this.verifyConcept = value;
    }

}
