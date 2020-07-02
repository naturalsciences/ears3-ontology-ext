/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.seadatanet.org.edmerp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thomas
 */
@XmlRootElement(name = "MetadataList")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetadataList {

    @XmlElementWrapper(name = "MetadataList")
    private List<Metadata> metadata = new ArrayList<Metadata>();;

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

}
