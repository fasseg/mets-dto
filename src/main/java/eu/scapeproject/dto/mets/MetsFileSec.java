package eu.scapeproject.dto.mets;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fileSec", namespace = "http://www.loc.gov/METS/")
public class MetsFileSec {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlElement(name = "fileGrp", namespace = "http://www.loc.gov/METS/")
    private List<MetsFileGrp> fileGroups;

    @SuppressWarnings("unused")
    private MetsFileSec() {
        super();
    }

    public MetsFileSec(String id, List<MetsFileGrp> fileGroups) {
        super();
        this.id = id;
        this.fileGroups = fileGroups;
    }

    public List<MetsFileGrp> getFileGroups() {
        return fileGroups;
    }

    public String getId() {
        return id;
    }

}
