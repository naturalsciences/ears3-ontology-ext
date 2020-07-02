
package wsimport.uk.ac.nerc.vocab.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConceptScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptScheme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schemeTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="schemeAltTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="schemeDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="schemeCreator" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="schemePublisher" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="schemeVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="topConcept" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="members" type="{http://vocab.nerc.ac.uk/types}collectionMembers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptScheme", propOrder = {
    "error",
    "schemeTitle",
    "schemeAltTitle",
    "schemeURI",
    "schemeDescription",
    "schemeCreator",
    "schemePublisher",
    "schemeVersion",
    "modified",
    "topConcept",
    "members"
})
public class ConceptScheme {

    protected String error;
    @XmlElement(required = true)
    protected String schemeTitle;
    @XmlElement(required = true)
    protected String schemeAltTitle;
    @XmlElement(required = true)
    protected String schemeURI;
    @XmlElement(required = true)
    protected String schemeDescription;
    protected List<String> schemeCreator;
    @XmlElement(required = true)
    protected String schemePublisher;
    protected int schemeVersion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    @XmlElement(required = true)
    protected List<String> topConcept;
    protected CollectionMembers members;
    @XmlAttribute(name = "uri")
    protected String uri;

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
     * Gets the value of the schemeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeTitle() {
        return schemeTitle;
    }

    /**
     * Sets the value of the schemeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeTitle(String value) {
        this.schemeTitle = value;
    }

    /**
     * Gets the value of the schemeAltTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeAltTitle() {
        return schemeAltTitle;
    }

    /**
     * Sets the value of the schemeAltTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeAltTitle(String value) {
        this.schemeAltTitle = value;
    }

    /**
     * Gets the value of the schemeURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeURI() {
        return schemeURI;
    }

    /**
     * Sets the value of the schemeURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeURI(String value) {
        this.schemeURI = value;
    }

    /**
     * Gets the value of the schemeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeDescription() {
        return schemeDescription;
    }

    /**
     * Sets the value of the schemeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeDescription(String value) {
        this.schemeDescription = value;
    }

    /**
     * Gets the value of the schemeCreator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schemeCreator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchemeCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSchemeCreator() {
        if (schemeCreator == null) {
            schemeCreator = new ArrayList();
        }
        return this.schemeCreator;
    }

    /**
     * Gets the value of the schemePublisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemePublisher() {
        return schemePublisher;
    }

    /**
     * Sets the value of the schemePublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemePublisher(String value) {
        this.schemePublisher = value;
    }

    /**
     * Gets the value of the schemeVersion property.
     * 
     */
    public int getSchemeVersion() {
        return schemeVersion;
    }

    /**
     * Sets the value of the schemeVersion property.
     * 
     */
    public void setSchemeVersion(int value) {
        this.schemeVersion = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

    /**
     * Gets the value of the topConcept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topConcept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTopConcept() {
        if (topConcept == null) {
            topConcept = new ArrayList();
        }
        return this.topConcept;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionMembers }
     *     
     */
    public CollectionMembers getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionMembers }
     *     
     */
    public void setMembers(CollectionMembers value) {
        this.members = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
