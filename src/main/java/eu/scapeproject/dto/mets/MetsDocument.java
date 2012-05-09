package eu.scapeproject.dto.mets;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mets", namespace = "http://www.loc.gov/METS/")
@XmlType(namespace = "http://www.loc.gov/METS/")
public class MetsDocument {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "objid")
    private String objId;
    @XmlAttribute(name = "label")
    private String label;
    @XmlAttribute(name = "type")
    private String type;
    @XmlAttribute(name = "profile")
    private String profile;
    @XmlElement(name = "metsHdr", namespace = "http://www.loc.gov/METS/")
    private List<MetsHeader> headers;
    @XmlElement(name = "dmdSec", namespace = "http://www.loc.gov/METS/")
    private MetsDMDSec dmdSec;
    @XmlElement(name = "amdSec", namespace = "http://www.loc.gov/METS/")
    private List<MetsAMDSec> amdSecs;
    @XmlElement(name = "fileSec", namespace = "http://www.loc.gov/METS/")
    private List<MetsFileSec> fileSecs;
    @XmlElement(name = "structMap", namespace = "http://www.loc.gov/METS/")
    private List<MetsStructMap> structMaps;
    @XmlElement(name = "structLink", namespace = "http://www.loc.gov/METS/")
    private List<MetsStructLink> structLinks;

    private MetsDocument() {
        super();
    }

    private MetsDocument(Builder builder) {
        this.id = builder.id;
        this.objId = builder.objId;
        this.label = builder.label;
        this.type = builder.type;
        this.profile = builder.profile;
        this.headers = builder.headers;
        this.dmdSec = builder.dmdSec;
        this.amdSecs = builder.amdSecs;
        this.fileSecs = builder.fileSecs;
        this.structMaps = builder.structMaps;
        this.structLinks = builder.structLinks;
    }

    public List<MetsAMDSec> getAmdSecs() {
        return amdSecs;
    }

    public MetsDMDSec getDmdSec() {
        return dmdSec;
    }

    public List<MetsFileSec> getFileSecs() {
        return fileSecs;
    }

    public List<MetsHeader> getHeaders() {
        return headers;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getObjId() {
        return objId;
    }

    public String getProfile() {
        return profile;
    }

    public List<MetsStructMap> getStructMaps() {
        return structMaps;
    }

    public String getType() {
        return type;
    }

    public static class Builder {
        private String id;
        private String objId;
        private String label;
        private String type;
        private String profile;
        private List<MetsHeader> headers;
        private MetsDMDSec dmdSec;
        private List<MetsAMDSec> amdSecs;
        private List<MetsFileSec> fileSecs;
        private List<MetsStructMap> structMaps;
        private List<MetsStructLink> structLinks;

        public Builder amdSecs(List<MetsAMDSec> amdSecs) {
            this.amdSecs = amdSecs;
            return this;
        }

        public MetsDocument build() {
            return new MetsDocument(this);
        }

        public Builder dmdSec(MetsDMDSec dmdSec) {
            this.dmdSec = dmdSec;
            return this;
        }

        public Builder fileSecs(List<MetsFileSec> fileSecs) {
            this.fileSecs = fileSecs;
            return this;
        }

        public Builder headers(List<MetsHeader> headers) {
            this.headers = headers;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder objId(String objId) {
            this.objId = objId;
            return this;
        }

        public Builder profile(String profile) {
            this.profile = profile;
            return this;
        }

        public Builder structLinks(List<MetsStructLink> structLinks) {
            this.structLinks = structLinks;
            return this;
        }

        public Builder structMaps(List<MetsStructMap> structMaps) {
            this.structMaps = structMaps;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }
    }
}
