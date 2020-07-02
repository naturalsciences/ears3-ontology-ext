/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.eurofleets.ears3;

import java.util.Date;
import java.util.List;

/**
 * An interface that gathers any concept from any vocabulary
 *
 * @author thomas
 */
public interface AbstractConcept {

    public String getDefinitionEn();

    public String getAltLabelEn();

    public String getPrefLabelEn();

    public String getIdentifierString();

    public String getVersionString();

    public Date getModifiedDate();

    public Date getCreationDate();

    public Boolean isIsDeprecated();

    public List<String> broadMatch();
}
