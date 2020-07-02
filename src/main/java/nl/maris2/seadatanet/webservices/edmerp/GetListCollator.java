
package nl.maris2.seadatanet.webservices.edmerp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collator_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "collatorId"
})
@XmlRootElement(name = "get_list_collator")
public class GetListCollator {

    @XmlElement(name = "collator_id")
    protected int collatorId;

    /**
     * Gets the value of the collatorId property.
     * 
     */
    public int getCollatorId() {
        return collatorId;
    }

    /**
     * Sets the value of the collatorId property.
     * 
     */
    public void setCollatorId(int value) {
        this.collatorId = value;
    }

}
