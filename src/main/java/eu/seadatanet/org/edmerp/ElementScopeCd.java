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
 * <p>Java class for element_ScopeCd complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="element_ScopeCd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}ScopeCd"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "element_ScopeCd", propOrder = {
    "scopeCd"
})
public class ElementScopeCd {

    @XmlElement(name = "ScopeCd", required = true)
    protected ScopeCd scopeCd;

    /**
     * Gets the value of the scopeCd property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeCd }
     *     
     */
    public ScopeCd getScopeCd() {
        return scopeCd;
    }

    /**
     * Sets the value of the scopeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeCd }
     *     
     */
    public void setScopeCd(ScopeCd value) {
        this.scopeCd = value;
    }

}
