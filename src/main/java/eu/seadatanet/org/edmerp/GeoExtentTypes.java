//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-SNAPSHOT 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2017.01.18 at 05:01:34 PM CET 
//


package eu.seadatanet.org.edmerp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoExtentTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoExtentTypes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}GeoExtentTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoExtentTypes", propOrder = {
    "geoExtentTypes"
})
public class GeoExtentTypes {

    @XmlElementRef(name = "GeoExtentTypes", type = JAXBElement.class)
    protected JAXBElement<?> geoExtentTypes;

    /**
     * Gets the value of the geoExtentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeoBndBox }{@code >}
     *     {@link JAXBElement }{@code <}{@link MdIdent }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getGeoExtentTypes() {
        return geoExtentTypes;
    }

    /**
     * Sets the value of the geoExtentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeoBndBox }{@code >}
     *     {@link JAXBElement }{@code <}{@link MdIdent }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setGeoExtentTypes(JAXBElement<?> value) {
        this.geoExtentTypes = value;
    }

}
