package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "techMD", namespace = "http://www.loc.gov/METS/")
public class MetsTechMD {
    @XmlAttribute(name = "ID", namespace = "http://www.loc.gov/METS/")
    private String id;
    @XmlAttribute(name = "GROUPID", namespace = "http://www.loc.gov/METS/")
    private String groupId;
    @XmlAttribute(name = "ADMID", namespace = "http://www.loc.gov/METS/")
    private String admId;
    @XmlElement(name = "mdWrap", namespace = "http://www.loc.gov/METS/")
    private MetsMDWrap metadataWrapper;

    private MetsTechMD() {
        super();
    }

    private MetsTechMD(Builder builder) {
        this.id = builder.id;
        this.groupId = builder.groupId;
        this.admId = builder.admId;
        this.metadataWrapper = builder.metadataWrapper;
    }

    public String getId() {
        return id;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getAdmId() {
        return admId;
    }

    public MetsMDWrap getMetadataWrapper() {
        return metadataWrapper;
    }

    public static class Builder {
        private String id;
        private String groupId;
        private String admId;
        private MetsMDWrap metadataWrapper;

        public Builder admId(String admId) {
            this.admId = admId;
            return this;
        }

        public MetsTechMD build() {
            return new MetsTechMD(this);
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder metadataWrapper(MetsMDWrap metadataWrapper) {
            this.metadataWrapper = metadataWrapper;
            return this;
        }
    }
}
