
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
 *         &lt;element name="conceptCollection" type="{http://vocab.nerc.ac.uk/types}ConceptCollection"/&gt;
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
    "conceptCollection"
})
@XmlRootElement(name = "GetConceptCollectionResponse")
public class GetConceptCollectionResponse {

    @XmlElement(required = true)
    protected ConceptCollection conceptCollection;

    /**
     * Gets the value of the conceptCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptCollection }
     *     
     */
    public ConceptCollection getConceptCollection() {
        return conceptCollection;
    }

    /**
     * Sets the value of the conceptCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptCollection }
     *     
     */
    public void setConceptCollection(ConceptCollection value) {
        this.conceptCollection = value;
    }

}
