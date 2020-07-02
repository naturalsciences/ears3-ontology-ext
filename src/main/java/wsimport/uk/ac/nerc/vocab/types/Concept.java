package wsimport.uk.ac.nerc.vocab.types;

import eu.eurofleets.ears3.AbstractConcept;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Concept complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="Concept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conceptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prefLabel" type="{http://vocab.nerc.ac.uk/types}prefLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="altLabel" type="{http://vocab.nerc.ac.uk/types}altLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="definition" type="{http://vocab.nerc.ac.uk/types}definition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="modified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="memberScheme" type="{http://vocab.nerc.ac.uk/types}memberList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isTopConcept" type="{http://vocab.nerc.ac.uk/types}isTopConcept" minOccurs="0"/&gt;
 *         &lt;element name="isDeprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="memberCollection" type="{http://vocab.nerc.ac.uk/types}memberList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="related" type="{http://vocab.nerc.ac.uk/types}related" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="broadMatch" type="{http://vocab.nerc.ac.uk/types}broadMatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sameAs" type="{http://vocab.nerc.ac.uk/types}sameAs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="narrowMatch" type="{http://vocab.nerc.ac.uk/types}narrowMatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transitiveNarrowerMatch" type="{http://vocab.nerc.ac.uk/types}transitiveNarrowerMatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="transitiveBroaderMatch" type="{http://vocab.nerc.ac.uk/types}transitiveBroaderMatch" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="replaces" type="{http://vocab.nerc.ac.uk/types}replaces" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isReplacedBy" type="{http://vocab.nerc.ac.uk/types}isReplacedBy" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Concept", propOrder = {
    "error",
    "conceptID",
    "prefLabel",
    "altLabel",
    "definition",
    "modified",
    "memberScheme",
    "version",
    "isTopConcept",
    "isDeprecated",
    "memberCollection",
    "identifier",
    "related",
    "broadMatch",
    "sameAs",
    "narrowMatch",
    "transitiveNarrowerMatch",
    "transitiveBroaderMatch",
    "replaces",
    "isReplacedBy"
})
public class Concept implements AbstractConcept {

    protected String error;
    protected String conceptID;
    protected List<PrefLabel> prefLabel;
    @XmlElement(nillable = true)
    protected List<AltLabel> altLabel;
    @XmlElement(nillable = true)
    protected List<Definition> definition;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    protected List<MemberList> memberScheme;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer version;
    protected IsTopConcept isTopConcept;
    protected Boolean isDeprecated;
    protected List<MemberList> memberCollection;
    @XmlElement(required = true, nillable = true)
    protected String identifier;
    @XmlElement(nillable = true)
    protected List<Related> related;
    @XmlElement(nillable = true)
    protected List<BroadMatch> broadMatch;
    @XmlElement(nillable = true)
    protected List<SameAs> sameAs;
    @XmlElement(nillable = true)
    protected List<NarrowMatch> narrowMatch;
    @XmlElement(nillable = true)
    protected List<TransitiveNarrowerMatch> transitiveNarrowerMatch;
    @XmlElement(nillable = true)
    protected List<TransitiveBroaderMatch> transitiveBroaderMatch;
    @XmlElement(nillable = true)
    protected List<Replaces> replaces;
    @XmlElement(nillable = true)
    protected List<IsReplacedBy> isReplacedBy;
    @XmlAttribute(name = "uri")
    protected String uri;

    /**
     * Gets the value of the error property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the conceptID property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getConceptID() {
        return conceptID;
    }

    /**
     * Sets the value of the conceptID property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setConceptID(String value) {
        this.conceptID = value;
    }

    /**
     * Gets the value of the prefLabel property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the prefLabel property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefLabel().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrefLabel }
     *
     *
     */
    public List<PrefLabel> getPrefLabel() {
        if (prefLabel == null) {
            prefLabel = new ArrayList();
        }
        return this.prefLabel;
    }

    /**
     * Gets the value of the altLabel property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the altLabel property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltLabel().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AltLabel }
     *
     *
     */
    public List<AltLabel> getAltLabel() {
        if (altLabel == null) {
            altLabel = new ArrayList();
        }
        return this.altLabel;
    }

    /**
     * Gets the value of the definition property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the definition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefinition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Definition }
     *
     *
     */
    public List<Definition> getDefinition() {
        if (definition == null) {
            definition = new ArrayList();
        }
        return this.definition;
    }

    /**
     * Gets the value of the modified property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

    /**
     * Gets the value of the memberScheme property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the memberScheme property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberScheme().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberList }
     *
     *
     */
    public List<MemberList> getMemberScheme() {
        if (memberScheme == null) {
            memberScheme = new ArrayList();
        }
        return this.memberScheme;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the isTopConcept property.
     *
     * @return possible object is {@link IsTopConcept }
     *
     */
    public IsTopConcept getIsTopConcept() {
        return isTopConcept;
    }

    /**
     * Sets the value of the isTopConcept property.
     *
     * @param value allowed object is {@link IsTopConcept }
     *
     */
    public void setIsTopConcept(IsTopConcept value) {
        this.isTopConcept = value;
    }

    /**
     * Gets the value of the isDeprecated property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isIsDeprecated() {
        return isDeprecated;
    }

    /**
     * Sets the value of the isDeprecated property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setIsDeprecated(Boolean value) {
        this.isDeprecated = value;
    }

    /**
     * Gets the value of the memberCollection property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the memberCollection property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberCollection().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberList }
     *
     *
     */
    public List<MemberList> getMemberCollection() {
        if (memberCollection == null) {
            memberCollection = new ArrayList();
        }
        return this.memberCollection;
    }

    /**
     * Gets the value of the identifier property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the related property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the related property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelated().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Related }
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
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the broadMatch property.
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
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the sameAs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSameAs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SameAs }
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
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the narrowMatch property.
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
     * Gets the value of the transitiveNarrowerMatch property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the transitiveNarrowerMatch property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitiveNarrowerMatch().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitiveNarrowerMatch }
     *
     *
     */
    public List<TransitiveNarrowerMatch> getTransitiveNarrowerMatch() {
        if (transitiveNarrowerMatch == null) {
            transitiveNarrowerMatch = new ArrayList();
        }
        return this.transitiveNarrowerMatch;
    }

    /**
     * Gets the value of the transitiveBroaderMatch property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the transitiveBroaderMatch property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitiveBroaderMatch().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitiveBroaderMatch }
     *
     *
     */
    public List<TransitiveBroaderMatch> getTransitiveBroaderMatch() {
        if (transitiveBroaderMatch == null) {
            transitiveBroaderMatch = new ArrayList();
        }
        return this.transitiveBroaderMatch;
    }

    /**
     * Gets the value of the replaces property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the replaces property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReplaces().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Replaces }
     *
     *
     */
    public List<Replaces> getReplaces() {
        if (replaces == null) {
            replaces = new ArrayList();
        }
        return this.replaces;
    }

    /**
     * Gets the value of the isReplacedBy property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the isReplacedBy property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsReplacedBy().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsReplacedBy }
     *
     *
     */
    public List<IsReplacedBy> getIsReplacedBy() {
        if (isReplacedBy == null) {
            isReplacedBy = new ArrayList();
        }
        return this.isReplacedBy;
    }

    /**
     * Gets the value of the uri property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUri(String value) {
        this.uri = value;
    }

    @Override
    public String getDefinitionEn() {
        for (Definition lb : this.getDefinition()) {
            if (lb.getLang().equals("en")) {
                return lb.getValue();
            }
        }
        return null;
    }

    @Override
    public String getAltLabelEn() {
        for (AltLabel lb : this.getAltLabel()) {
            if (lb.getLang().equals("en")) {
                return lb.getValue();
            }
        }
        return null;
    }

    @Override
    public String getPrefLabelEn() {
        for (PrefLabel lb : this.getPrefLabel()) {
            if (lb.getLang().equals("en")) {
                return lb.getValue();
            }
        }
        return null;
    }

    @Override
    public String getIdentifierString() {
        return getIdentifier();
    }

    @Override
    public String getVersionString() {
        return this.getVersion().toString();
    }

    @Override
    public Date getModifiedDate() {
        return this.getModified().toGregorianCalendar().getTime();
    }

    @Override
    public Date getCreationDate() {
        return this.getModified().toGregorianCalendar().getTime(); //apparently there is no creation date
    }

    @Override
    public List<String> broadMatch() {
        if (this.broadMatch != null) {
            return this.broadMatch.stream().map(b -> b.getUri()).collect(Collectors.toList());
        } else {
            return new ArrayList<String>();
        }

    }

}
