//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.01.18 at 05:01:34 PM CET 
//


package eu.seadatanet.org.edmerp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Citation_lit complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Citation_lit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resTitle" type="{}element_resTitle_lit"/&gt;
 *         &lt;element ref="{}resAltTitle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}aggrInfo" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{}resRefDate" minOccurs="0"/&gt;
 *         &lt;element ref="{}resEd" minOccurs="0"/&gt;
 *         &lt;element ref="{}citId" minOccurs="0"/&gt;
 *         &lt;element name="citRespParty" type="{}citRespParty_lit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Citation_lit", propOrder = {
    "resTitle",
    "resAltTitle",
    "aggrInfo",
    "resRefDate",
    "resEd",
    "citId",
    "citRespParty"
})
public class CitationLit {

    @XmlElement(required = true)
    protected String resTitle;
    protected List<ResAltTitle> resAltTitle;
    protected List<AggrInfo> aggrInfo;
    protected DateRef resRefDate;
    protected String resEd;
    @XmlSchemaType(name = "string")
    protected ElementCitId citId;
    protected List<CitRespPartyLit> citRespParty;

    /**
     * Gets the value of the resTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResTitle() {
        return resTitle;
    }

    /**
     * Sets the value of the resTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResTitle(String value) {
        this.resTitle = value;
    }

    /**
     * Gets the value of the resAltTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resAltTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResAltTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResAltTitle }
     * 
     * 
     */
    public List<ResAltTitle> getResAltTitle() {
        if (resAltTitle == null) {
            resAltTitle = new ArrayList<ResAltTitle>();
        }
        return this.resAltTitle;
    }

    /**
     * Gets the value of the aggrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggrInfo }
     * 
     * 
     */
    public List<AggrInfo> getAggrInfo() {
        if (aggrInfo == null) {
            aggrInfo = new ArrayList<AggrInfo>();
        }
        return this.aggrInfo;
    }

    /**
     * Gets the value of the resRefDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateRef }
     *     
     */
    public DateRef getResRefDate() {
        return resRefDate;
    }

    /**
     * Sets the value of the resRefDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRef }
     *     
     */
    public void setResRefDate(DateRef value) {
        this.resRefDate = value;
    }

    /**
     * Gets the value of the resEd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResEd() {
        return resEd;
    }

    /**
     * Sets the value of the resEd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResEd(String value) {
        this.resEd = value;
    }

    /**
     * Gets the value of the citId property.
     * 
     * @return
     *     possible object is
     *     {@link ElementCitId }
     *     
     */
    public ElementCitId getCitId() {
        return citId;
    }

    /**
     * Sets the value of the citId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementCitId }
     *     
     */
    public void setCitId(ElementCitId value) {
        this.citId = value;
    }

    /**
     * Gets the value of the citRespParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citRespParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitRespParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitRespPartyLit }
     * 
     * 
     */
    public List<CitRespPartyLit> getCitRespParty() {
        if (citRespParty == null) {
            citRespParty = new ArrayList<CitRespPartyLit>();
        }
        return this.citRespParty;
    }

}
