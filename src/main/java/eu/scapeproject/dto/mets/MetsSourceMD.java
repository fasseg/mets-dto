package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sourceMD", namespace = "http://www.loc.gov/METS/")
public class MetsSourceMD {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "GROUPID")
    private String groupId;
    @XmlAttribute(name = "ADMID")
    private String admId;
    @XmlElement(name = "mdWrap", namespace = "http://www.loc.gov/METS/")
    private MetsMDWrap metadataWrapper;

    private MetsSourceMD() {
        super();
    }

    private MetsSourceMD(Builder builder) {
        this.id = builder.id;
        this.groupId = builder.groupId;
        this.admId = builder.admId;
        this.metadataWrapper = builder.metadataWrapper;
    }

    public String getAdmId() {
        return admId;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getId() {
        return id;
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

        public MetsSourceMD build() {
            return new MetsSourceMD(this);
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
