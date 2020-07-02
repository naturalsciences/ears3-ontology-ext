/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.eurofleets.ears3;

//import eu.eurofleets.ears.registry.external.ExternalConceptCopyAssistant;
//import eu.eurofleets.ears.registry.external.ExternalServiceHelper;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author thomas
 */
public abstract class ExternalConceptService {

    protected int size;
    protected ExternalConceptCopyAssistant copyAssistant;

    public abstract Collection<? extends AbstractConcept> getExternalConcepts();

    public abstract Map<String, ? extends AbstractConcept> getConvertedInternalConcepts() throws Exception;

    public int getSize() {
        return size;
    }

    public ExternalConceptCopyAssistant getCopyAssistant() {
        return copyAssistant;
    }

}
