
package wsimport.uk.ac.nerc.vocab.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedConcepts complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedConcepts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="concept" type="{http://vocab.nerc.ac.uk/types}Concept"/&gt;
 *         &lt;element name="narrowMatches" type="{http://vocab.nerc.ac.uk/types}collectionMembers" minOccurs="0"/&gt;
 *         &lt;element name="broadMatches" type="{http://vocab.nerc.ac.uk/types}collectionMembers" minOccurs="0"/&gt;
 *         &lt;element name="related" type="{http://vocab.nerc.ac.uk/types}collectionMembers" minOccurs="0"/&gt;
 *         &lt;element name="sameAs" type="{http://vocab.nerc.ac.uk/types}collectionMembers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedConcepts", propOrder = {
    "error",
    "concept",
    "narrowMatches",
    "broadMatches",
    "related",
    "sameAs"
})
public class RelatedConcepts {

    protected String error;
    @XmlElement(required = true)
    protected Concept concept;
    @XmlElementRef(name = "narrowMatches", type = JAXBElement.class, required = false)
    protected JAXBElement<CollectionMembers> narrowMatches;
    @XmlElementRef(name = "broadMatches", type = JAXBElement.class, required = false)
    protected JAXBElement<CollectionMembers> broadMatches;
    @XmlElementRef(name = "related", type = JAXBElement.class, required = false)
    protected JAXBElement<CollectionMembers> related;
    @XmlElementRef(name = "sameAs", type = JAXBElement.class, required = false)
    protected JAXBElement<CollectionMembers> sameAs;

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
     * Gets the value of the concept property.
     * 
     * @return
     *     possible object is
     *     {@link Concept }
     *     
     */
    public Concept getConcept() {
        return concept;
    }

    /**
     * Sets the value of the concept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Concept }
     *     
     */
    public void setConcept(Concept value) {
        this.concept = value;
    }

    /**
     * Gets the value of the narrowMatches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}
     *     
     */
    public JAXBElement<CollectionMembers> getNarrowMatches() {
        return narrowMatches;
    }

    /**
     * Sets the value of the narrowMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}
     *     
     */
    public void setNarrowMatches(JAXBElement<CollectionMembers> value) {
        this.narrowMatches = value;
    }

    /**
     * Gets the value of the broadMatches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}
     *     
     */
    public JAXBElement<CollectionMembers> getBroadMatches() {
        return broadMatches;
    }

    /**
     * Sets the value of the broadMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}
     *     
     */
    public void setBroadMatches(JAXBElement<CollectionMembers> value) {
        this.broadMatches = value;
    }

    /**
     * Gets the value of the related property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}
     *     
     */
    public JAXBElement<CollectionMembers> getRelated() {
        return related;
    }

    /**
     * Sets the value of the related property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}
     *     
     */
    public void setRelated(JAXBElement<CollectionMembers> value) {
        this.related = value;
    }

    /**
     * Gets the value of the sameAs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}
     *     
     */
    public JAXBElement<CollectionMembers> getSameAs() {
        return sameAs;
    }

    /**
     * Sets the value of the sameAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}
     *     
     */
    public void setSameAs(JAXBElement<CollectionMembers> value) {
        this.sameAs = value;
    }

}
