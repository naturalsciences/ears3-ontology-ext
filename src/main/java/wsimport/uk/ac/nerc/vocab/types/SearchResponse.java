
package wsimport.uk.ac.nerc.vocab.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noOfResults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="noOfMemberCollections" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="results" type="{http://vocab.nerc.ac.uk/types}collectionMembers" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponse", propOrder = {
    "error",
    "query",
    "noOfResults",
    "noOfMemberCollections",
    "results"
})
public class SearchResponse {

    protected String error;
    protected String query;
    protected int noOfResults;
    protected int noOfMemberCollections;
    protected CollectionMembers results;

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
     * Gets the value of the noOfResults property.
     * 
     */
    public int getNoOfResults() {
        return noOfResults;
    }

    /**
     * Sets the value of the noOfResults property.
     * 
     */
    public void setNoOfResults(int value) {
        this.noOfResults = value;
    }

    /**
     * Gets the value of the noOfMemberCollections property.
     * 
     */
    public int getNoOfMemberCollections() {
        return noOfMemberCollections;
    }

    /**
     * Sets the value of the noOfMemberCollections property.
     * 
     */
    public void setNoOfMemberCollections(int value) {
        this.noOfMemberCollections = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionMembers }
     *     
     */
    public CollectionMembers getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionMembers }
     *     
     */
    public void setResults(CollectionMembers value) {
        this.results = value;
    }

}
