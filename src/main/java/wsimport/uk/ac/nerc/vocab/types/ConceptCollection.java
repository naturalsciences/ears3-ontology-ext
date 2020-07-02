
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
 * <p>Java class for ConceptCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptCollection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectionURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectionTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectionAltTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collectionCreator" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="collectionComment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="collectionPublisher" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="collectionVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="related" type="{http://vocab.nerc.ac.uk/types}related" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="broadMatch" type="{http://vocab.nerc.ac.uk/types}broadMatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sameAs" type="{http://vocab.nerc.ac.uk/types}sameAs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="narrowMatch" type="{http://vocab.nerc.ac.uk/types}narrowMatch" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ConceptCollection", propOrder = {
    "error",
    "collectionURI",
    "collectionTitle",
    "collectionAltTitle",
    "collectionDescription",
    "collectionCreator",
    "collectionComment",
    "collectionPublisher",
    "collectionVersion",
    "modified",
    "related",
    "broadMatch",
    "sameAs",
    "narrowMatch",
    "members"
})
public class ConceptCollection {

    protected String error;
    protected String collectionURI;
    @XmlElement(required = true)
    protected String collectionTitle;
    protected String collectionAltTitle;
    protected String collectionDescription;
    protected List<String> collectionCreator;
    protected List<String> collectionComment;
    @XmlElement(required = true)
    protected String collectionPublisher;
    protected int collectionVersion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    @XmlElement(nillable = true)
    protected List<Related> related;
    @XmlElement(nillable = true)
    protected List<BroadMatch> broadMatch;
    @XmlElement(nillable = true)
    protected List<SameAs> sameAs;
    @XmlElement(nillable = true)
    protected List<NarrowMatch> narrowMatch;
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
     * Gets the value of the collectionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionTitle() {
        return collectionTitle;
    }

    /**
     * Sets the value of the collectionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionTitle(String value) {
        this.collectionTitle = value;
    }

    /**
     * Gets the value of the collectionAltTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionAltTitle() {
        return collectionAltTitle;
    }

    /**
     * Sets the value of the collectionAltTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionAltTitle(String value) {
        this.collectionAltTitle = value;
    }

    /**
     * Gets the value of the collectionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionDescription() {
        return collectionDescription;
    }

    /**
     * Sets the value of the collectionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionDescription(String value) {
        this.collectionDescription = value;
    }

    /**
     * Gets the value of the collectionCreator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionCreator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCollectionCreator() {
        if (collectionCreator == null) {
            collectionCreator = new ArrayList();
        }
        return this.collectionCreator;
    }

    /**
     * Gets the value of the collectionComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCollectionComment() {
        if (collectionComment == null) {
            collectionComment = new ArrayList();
        }
        return this.collectionComment;
    }

    /**
     * Gets the value of the collectionPublisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionPublisher() {
        return collectionPublisher;
    }

    /**
     * Sets the value of the collectionPublisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionPublisher(String value) {
        this.collectionPublisher = value;
    }

    /**
     * Gets the value of the collectionVersion property.
     * 
     */
    public int getCollectionVersion() {
        return collectionVersion;
    }

    /**
     * Sets the value of the collectionVersion property.
     * 
     */
    public void setCollectionVersion(int value) {
        this.collectionVersion = value;
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
     * Gets the value of the related property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the related property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Related }
     * 
     * 
     */
    public List<Related> getRelated() {
        if (related == null) {
            related = new ArrayList();
        }
        return this.related;
    }

    /**
     * Gets the value of the broadMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the broadMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBroadMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BroadMatch }
     * 
     * 
     */
    public List<BroadMatch> getBroadMatch() {
        if (broadMatch == null) {
            broadMatch = new ArrayList();
        }
        return this.broadMatch;
    }

    /**
     * Gets the value of the sameAs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sameAs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSameAs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SameAs }
     * 
     * 
     */
    public List<SameAs> getSameAs() {
        if (sameAs == null) {
            sameAs = new ArrayList();
        }
        return this.sameAs;
    }

    /**
     * Gets the value of the narrowMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the narrowMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNarrowMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NarrowMatch }
     * 
     * 
     */
    public List<NarrowMatch> getNarrowMatch() {
        if (narrowMatch == null) {
            narrowMatch = new ArrayList();
        }
        return this.narrowMatch;
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
