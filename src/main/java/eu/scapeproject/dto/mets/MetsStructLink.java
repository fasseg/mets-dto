package eu.scapeproject.dto.mets;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "structLink", namespace = "http://www.loc.gov/METS/")
public class MetsStructLink {
    @XmlAttribute(name = "id", namespace = "http://www.loc.gov/METS/")
    private String id;
    @XmlElement(name = "smLink", namespace = "http://www.loc.gov/METS/")
    private List<MetsStructMapLink> structMapLinks;

    private MetsStructLink() {
        super();
    }

    public MetsStructLink(String id, List<MetsStructMapLink> structMapLinks) {
        super();
        this.id = id;
        this.structMapLinks = structMapLinks;
    }

    public String getId() {
        return id;
    }

    public List<MetsStructMapLink> getStructMapLinks() {
        return structMapLinks;
    }

}
