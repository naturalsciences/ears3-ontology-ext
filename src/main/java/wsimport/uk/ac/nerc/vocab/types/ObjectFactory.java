
package wsimport.uk.ac.nerc.vocab.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nerc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RelatedConceptsNarrowMatches_QNAME = new QName("", "narrowMatches");
    private final static QName _RelatedConceptsBroadMatches_QNAME = new QName("", "broadMatches");
    private final static QName _RelatedConceptsRelated_QNAME = new QName("", "related");
    private final static QName _RelatedConceptsSameAs_QNAME = new QName("", "sameAs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nerc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCollections }
     * 
     */
    public GetCollections createGetCollections() {
        return new GetCollections();
    }

    /**
     * Create an instance of {@link GetCollectionsResponse }
     * 
     */
    public GetCollectionsResponse createGetCollectionsResponse() {
        return new GetCollectionsResponse();
    }

    /**
     * Create an instance of {@link ConceptCollection }
     * 
     */
    public ConceptCollection createConceptCollection() {
        return new ConceptCollection();
    }

    /**
     * Create an instance of {@link GetSchemes }
     * 
     */
    public GetSchemes createGetSchemes() {
        return new GetSchemes();
    }

    /**
     * Create an instance of {@link GetSchemesResponse }
     * 
     */
    public GetSchemesResponse createGetSchemesResponse() {
        return new GetSchemesResponse();
    }

    /**
     * Create an instance of {@link ConceptScheme }
     * 
     */
    public ConceptScheme createConceptScheme() {
        return new ConceptScheme();
    }

    /**
     * Create an instance of {@link GetRelatedConcepts }
     * 
     */
    public GetRelatedConcepts createGetRelatedConcepts() {
        return new GetRelatedConcepts();
    }

    /**
     * Create an instance of {@link GetRelatedConceptsResponse }
     * 
     */
    public GetRelatedConceptsResponse createGetRelatedConceptsResponse() {
        return new GetRelatedConceptsResponse();
    }

    /**
     * Create an instance of {@link RelatedConcepts }
     * 
     */
    public RelatedConcepts createRelatedConcepts() {
        return new RelatedConcepts();
    }

    /**
     * Create an instance of {@link VerifyConcept }
     * 
     */
    public VerifyConcept createVerifyConcept() {
        return new VerifyConcept();
    }

    /**
     * Create an instance of {@link VerifyConceptResponse }
     * 
     */
    public VerifyConceptResponse createVerifyConceptResponse() {
        return new VerifyConceptResponse();
    }

    /**
     * Create an instance of {@link VerifyConceptRet }
     * 
     */
    public VerifyConceptRet createVerifyConceptRet() {
        return new VerifyConceptRet();
    }

    /**
     * Create an instance of {@link SearchVocab }
     * 
     */
    public SearchVocab createSearchVocab() {
        return new SearchVocab();
    }

    /**
     * Create an instance of {@link SearchVocabResponse }
     * 
     */
    public SearchVocabResponse createSearchVocabResponse() {
        return new SearchVocabResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link GetConcept }
     * 
     */
    public GetConcept createGetConcept() {
        return new GetConcept();
    }

    /**
     * Create an instance of {@link GetConceptResponse }
     * 
     */
    public GetConceptResponse createGetConceptResponse() {
        return new GetConceptResponse();
    }

    /**
     * Create an instance of {@link Concept }
     * 
     */
    public Concept createConcept() {
        return new Concept();
    }

    /**
     * Create an instance of {@link GetConceptCollection }
     * 
     */
    public GetConceptCollection createGetConceptCollection() {
        return new GetConceptCollection();
    }

    /**
     * Create an instance of {@link GetConceptCollectionResponse }
     * 
     */
    public GetConceptCollectionResponse createGetConceptCollectionResponse() {
        return new GetConceptCollectionResponse();
    }

    /**
     * Create an instance of {@link GetConceptScheme }
     * 
     */
    public GetConceptScheme createGetConceptScheme() {
        return new GetConceptScheme();
    }

    /**
     * Create an instance of {@link GetConceptSchemeResponse }
     * 
     */
    public GetConceptSchemeResponse createGetConceptSchemeResponse() {
        return new GetConceptSchemeResponse();
    }

    /**
     * Create an instance of {@link GetTopConcepts }
     * 
     */
    public GetTopConcepts createGetTopConcepts() {
        return new GetTopConcepts();
    }

    /**
     * Create an instance of {@link GetTopConceptsResponse }
     * 
     */
    public GetTopConceptsResponse createGetTopConceptsResponse() {
        return new GetTopConceptsResponse();
    }

    /**
     * Create an instance of {@link GetTopConceptsRet }
     * 
     */
    public GetTopConceptsRet createGetTopConceptsRet() {
        return new GetTopConceptsRet();
    }

    /**
     * Create an instance of {@link CollectionMembers }
     * 
     */
    public CollectionMembers createCollectionMembers() {
        return new CollectionMembers();
    }

    /**
     * Create an instance of {@link Replaces }
     * 
     */
    public Replaces createReplaces() {
        return new Replaces();
    }

    /**
     * Create an instance of {@link IsReplacedBy }
     * 
     */
    public IsReplacedBy createIsReplacedBy() {
        return new IsReplacedBy();
    }

    /**
     * Create an instance of {@link SameAs }
     * 
     */
    public SameAs createSameAs() {
        return new SameAs();
    }

    /**
     * Create an instance of {@link NarrowMatch }
     * 
     */
    public NarrowMatch createNarrowMatch() {
        return new NarrowMatch();
    }

    /**
     * Create an instance of {@link TransitiveNarrowerMatch }
     * 
     */
    public TransitiveNarrowerMatch createTransitiveNarrowerMatch() {
        return new TransitiveNarrowerMatch();
    }

    /**
     * Create an instance of {@link TransitiveBroaderMatch }
     * 
     */
    public TransitiveBroaderMatch createTransitiveBroaderMatch() {
        return new TransitiveBroaderMatch();
    }

    /**
     * Create an instance of {@link Related }
     * 
     */
    public Related createRelated() {
        return new Related();
    }

    /**
     * Create an instance of {@link BroadMatch }
     * 
     */
    public BroadMatch createBroadMatch() {
        return new BroadMatch();
    }

    /**
     * Create an instance of {@link IsTopConcept }
     * 
     */
    public IsTopConcept createIsTopConcept() {
        return new IsTopConcept();
    }

    /**
     * Create an instance of {@link MemberList }
     * 
     */
    public MemberList createMemberList() {
        return new MemberList();
    }

    /**
     * Create an instance of {@link PrefLabel }
     * 
     */
    public PrefLabel createPrefLabel() {
        return new PrefLabel();
    }

    /**
     * Create an instance of {@link AltLabel }
     * 
     */
    public AltLabel createAltLabel() {
        return new AltLabel();
    }

    /**
     * Create an instance of {@link Definition }
     * 
     */
    public Definition createDefinition() {
        return new Definition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "narrowMatches", scope = RelatedConcepts.class)
    public JAXBElement<CollectionMembers> createRelatedConceptsNarrowMatches(CollectionMembers value) {
        return new JAXBElement<CollectionMembers>(_RelatedConceptsNarrowMatches_QNAME, CollectionMembers.class, RelatedConcepts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "broadMatches", scope = RelatedConcepts.class)
    public JAXBElement<CollectionMembers> createRelatedConceptsBroadMatches(CollectionMembers value) {
        return new JAXBElement<CollectionMembers>(_RelatedConceptsBroadMatches_QNAME, CollectionMembers.class, RelatedConcepts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "related", scope = RelatedConcepts.class)
    public JAXBElement<CollectionMembers> createRelatedConceptsRelated(CollectionMembers value) {
        return new JAXBElement<CollectionMembers>(_RelatedConceptsRelated_QNAME, CollectionMembers.class, RelatedConcepts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollectionMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sameAs", scope = RelatedConcepts.class)
    public JAXBElement<CollectionMembers> createRelatedConceptsSameAs(CollectionMembers value) {
        return new JAXBElement<CollectionMembers>(_RelatedConceptsSameAs_QNAME, CollectionMembers.class, RelatedConcepts.class, value);
    }

}
