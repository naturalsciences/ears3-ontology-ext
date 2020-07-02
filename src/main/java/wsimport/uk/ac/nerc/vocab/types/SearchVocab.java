
package wsimport.uk.ac.nerc.vocab.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="case_sensitivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="term_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="max_results" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="multilang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uri_list" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "query",
    "caseSensitivity",
    "termType",
    "maxResults",
    "multilang",
    "uriList",
    "status"
})
@XmlRootElement(name = "SearchVocab")
public class SearchVocab {

    @XmlElement(required = true)
    protected String query;
    @XmlElement(name = "case_sensitivity")
    protected String caseSensitivity;
    @XmlElement(name = "term_type")
    protected String termType;
    @XmlElement(name = "max_results")
    protected Integer maxResults;
    protected String multilang;
    @XmlElement(name = "uri_list")
    protected List<String> uriList;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Gets the value of the caseSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseSensitivity() {
        return caseSensitivity;
    }

    /**
     * Sets the value of the caseSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseSensitivity(String value) {
        this.caseSensitivity = value;
    }

    /**
     * Gets the value of the termType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermType() {
        return termType;
    }

    /**
     * Sets the value of the termType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermType(String value) {
        this.termType = value;
    }

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResults(Integer value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the multilang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultilang() {
        return multilang;
    }

    /**
     * Sets the value of the multilang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultilang(String value) {
        this.multilang = value;
    }

    /**
     * Gets the value of the uriList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uriList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUriList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUriList() {
        if (uriList == null) {
            uriList = new ArrayList();
        }
        return this.uriList;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
