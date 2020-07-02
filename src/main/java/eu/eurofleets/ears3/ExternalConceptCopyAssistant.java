/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.eurofleets.ears3;

import eu.eurofleets.ears3.AbstractConcept;
//import be.naturalsciences.bmdc.ontology.entities.AsConcept;
//import be.naturalsciences.bmdc.ontology.entities.IEarsTerm;

/**
 *
 * @author thomas
 */
public interface ExternalConceptCopyAssistant {

    public void copy(AbstractConcept externalConcept, AbstractConcept internalConcept);

    //public void copy(AsConcept<? extends IEarsTerm> externalConcept, AsConcept<? extends IEarsTerm> internalConcept);

}
