
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
 *         &lt;element name="conceptScheme" type="{http://vocab.nerc.ac.uk/types}ConceptScheme"/&gt;
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
    "conceptScheme"
})
@XmlRootElement(name = "GetConceptSchemeResponse")
public class GetConceptSchemeResponse {

    @XmlElement(required = true)
    protected ConceptScheme conceptScheme;

    /**
     * Gets the value of the conceptScheme property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptScheme }
     *     
     */
    public ConceptScheme getConceptScheme() {
        return conceptScheme;
    }

    /**
     * Sets the value of the conceptScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptScheme }
     *     
     */
    public void setConceptScheme(ConceptScheme value) {
        this.conceptScheme = value;
    }

}
