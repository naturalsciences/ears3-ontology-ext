/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.eurofleets.ears3;

import java.util.Map;
import wsimport.uk.ac.nerc.vocab.Vocabv2;
import wsimport.uk.ac.nerc.vocab.Vocabv2_Service;
import wsimport.uk.ac.nerc.vocab.types.Concept;
import wsimport.uk.ac.nerc.vocab.types.ConceptCollection;

/**
 *
 * @author thomas
 */
public class ExternalRetriever {

    private static Vocabv2 BODC_VOCAB;

    private static Vocabv2 getBodcVocab() {
        if (BODC_VOCAB != null) {
            return BODC_VOCAB;
        }
        BODC_VOCAB = new Vocabv2_Service().getVocabv2SOAP();
        return BODC_VOCAB;
    }

    public static ConceptCollection getCollection(String vocabulary) {
        return getBodcVocab().getConceptCollection(vocabulary, "accepted");
    }

    public static Concept getConcept(String uri) {
       return getBodcVocab().getConcept(uri);
    }

}
