//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.01.18 at 05:01:34 PM CET 
//


package eu.seadatanet.org.edmerp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Metadata complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Metadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}mdFileID"/&gt;
 *         &lt;element ref="{}mdLang"/&gt;
 *         &lt;element ref="{}mdChar"/&gt;
 *         &lt;element ref="{}mdHrLv"/&gt;
 *         &lt;element ref="{}mdHrLvName"/&gt;
 *         &lt;element ref="{}mdContact"/&gt;
 *         &lt;element ref="{}mdDateSt"/&gt;
 *         &lt;element ref="{}mdExtInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{}dataIdInfo"/&gt;
 *         &lt;element ref="{}distInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{}porCatInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Metadata", propOrder = {
    "mdFileID",
    "mdLang",
    "mdChar",
    "mdHrLv",
    "mdHrLvName",
    "mdContact",
    "mdDateSt",
    "mdExtInfo",
    "dataIdInfo",
    "distInfo",
    "porCatInfo"
})
public class Metadata {

    @XmlElement(required = true)
    protected String mdFileID;
    @XmlElement(required = true)
    protected ElementLanguageCode mdLang;
    @XmlElement(required = true)
    protected ElementCharSetCd mdChar;
    @XmlElement(required = true)
    protected ElementScopeCd mdHrLv;
    @XmlElement(required = true)
    protected ElementName mdHrLvName;
    @XmlElement(required = true)
    protected RespParty mdContact;
    @XmlElement(required = true)
    protected String mdDateSt;
    protected MdExtInfo mdExtInfo;
    @XmlElement(required = true)
    protected DataIdent dataIdInfo;
    protected Distrib distInfo;
    protected PortCatRef porCatInfo;

    /**
     * Gets the value of the mdFileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdFileID() {
        return mdFileID;
    }

    /**
     * Sets the value of the mdFileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdFileID(String value) {
        this.mdFileID = value;
    }

    /**
     * Gets the value of the mdLang property.
     * 
     * @return
     *     possible object is
     *     {@link ElementLanguageCode }
     *     
     */
    public ElementLanguageCode getMdLang() {
        return mdLang;
    }

    /**
     * Sets the value of the mdLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementLanguageCode }
     *     
     */
    public void setMdLang(ElementLanguageCode value) {
        this.mdLang = value;
    }

    /**
     * Gets the value of the mdChar property.
     * 
     * @return
     *     possible object is
     *     {@link ElementCharSetCd }
     *     
     */
    public ElementCharSetCd getMdChar() {
        return mdChar;
    }

    /**
     * Sets the value of the mdChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementCharSetCd }
     *     
     */
    public void setMdChar(ElementCharSetCd value) {
        this.mdChar = value;
    }

    /**
     * Gets the value of the mdHrLv property.
     * 
     * @return
     *     possible object is
     *     {@link ElementScopeCd }
     *     
     */
    public ElementScopeCd getMdHrLv() {
        return mdHrLv;
    }

    /**
     * Sets the value of the mdHrLv property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementScopeCd }
     *     
     */
    public void setMdHrLv(ElementScopeCd value) {
        this.mdHrLv = value;
    }

    /**
     * Gets the value of the mdHrLvName property.
     * 
     * @return
     *     possible object is
     *     {@link ElementName }
     *     
     */
    public ElementName getMdHrLvName() {
        return mdHrLvName;
    }

    /**
     * Sets the value of the mdHrLvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementName }
     *     
     */
    public void setMdHrLvName(ElementName value) {
        this.mdHrLvName = value;
    }

    /**
     * Gets the value of the mdContact property.
     * 
     * @return
     *     possible object is
     *     {@link RespParty }
     *     
     */
    public RespParty getMdContact() {
        return mdContact;
    }

    /**
     * Sets the value of the mdContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespParty }
     *     
     */
    public void setMdContact(RespParty value) {
        this.mdContact = value;
    }

    /**
     * Gets the value of the mdDateSt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdDateSt() {
        return mdDateSt;
    }

    /**
     * Sets the value of the mdDateSt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdDateSt(String value) {
        this.mdDateSt = value;
    }

    /**
     * Gets the value of the mdExtInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MdExtInfo }
     *     
     */
    public MdExtInfo getMdExtInfo() {
        return mdExtInfo;
    }

    /**
     * Sets the value of the mdExtInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MdExtInfo }
     *     
     */
    public void setMdExtInfo(MdExtInfo value) {
        this.mdExtInfo = value;
    }

    /**
     * Gets the value of the dataIdInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DataIdent }
     *     
     */
    public DataIdent getDataIdInfo() {
        return dataIdInfo;
    }

    /**
     * Sets the value of the dataIdInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataIdent }
     *     
     */
    public void setDataIdInfo(DataIdent value) {
        this.dataIdInfo = value;
    }

    /**
     * Gets the value of the distInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Distrib }
     *     
     */
    public Distrib getDistInfo() {
        return distInfo;
    }

    /**
     * Sets the value of the distInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distrib }
     *     
     */
    public void setDistInfo(Distrib value) {
        this.distInfo = value;
    }

    /**
     * Gets the value of the porCatInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PortCatRef }
     *     
     */
    public PortCatRef getPorCatInfo() {
        return porCatInfo;
    }

    /**
     * Sets the value of the porCatInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortCatRef }
     *     
     */
    public void setPorCatInfo(PortCatRef value) {
        this.porCatInfo = value;
    }

}