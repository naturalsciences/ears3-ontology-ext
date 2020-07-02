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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Keywords complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Keywords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}keyword" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{}keyTyp" minOccurs="0"/&gt;
 *         &lt;element ref="{}thesaName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Keywords", propOrder = {
    "keyword",
    "keyTyp",
    "thesaName"
})
public class Keywords {

    @XmlElement(required = true)
    protected List<Keyword> keyword;
    protected ElementKeyTypCd keyTyp;
    protected Citation thesaName;

    /**
     * Gets the value of the keyword property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Keyword }
     * 
     * 
     */
    public List<Keyword> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<Keyword>();
        }
        return this.keyword;
    }

    /**
     * Gets the value of the keyTyp property.
     * 
     * @return
     *     possible object is
     *     {@link ElementKeyTypCd }
     *     
     */
    public ElementKeyTypCd getKeyTyp() {
        return keyTyp;
    }

    /**
     * Sets the value of the keyTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementKeyTypCd }
     *     
     */
    public void setKeyTyp(ElementKeyTypCd value) {
        this.keyTyp = value;
    }

    /**
     * Gets the value of the thesaName property.
     * 
     * @return
     *     possible object is
     *     {@link Citation }
     *     
     */
    public Citation getThesaName() {
        return thesaName;
    }

    /**
     * Sets the value of the thesaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Citation }
     *     
     */
    public void setThesaName(Citation value) {
        this.thesaName = value;
    }

}
