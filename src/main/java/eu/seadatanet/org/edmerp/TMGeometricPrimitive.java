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
 * <p>Java class for TM_GeometricPrimitive complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TM_GeometricPrimitive"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{}TM_Period"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TM_GeometricPrimitive", propOrder = {
    "tmPeriod"
})
public class TMGeometricPrimitive {

    @XmlElement(name = "TM_Period")
    protected TMPeriod tmPeriod;

    /**
     * Gets the value of the tmPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TMPeriod }
     *     
     */
    public TMPeriod getTMPeriod() {
        return tmPeriod;
    }

    /**
     * Sets the value of the tmPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPeriod }
     *     
     */
    public void setTMPeriod(TMPeriod value) {
        this.tmPeriod = value;
    }

}