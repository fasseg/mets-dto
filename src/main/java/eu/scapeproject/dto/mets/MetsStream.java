package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stream", namespace = "http://www.loc.gov/METS/")
public class MetsStream {
    @XmlAttribute(name = "id", namespace = "http://www.loc.gov/METS/")
    private String id;
    @XmlAttribute(name = "type", namespace = "http://www.loc.gov/METS/")
    private String type;
    @XmlAttribute(name = "ownerid", namespace = "http://www.loc.gov/METS/")
    private String ownerId;
    @XmlAttribute(name = "amdmdid", namespace = "http://www.loc.gov/METS/")
    private String amdMdId;
    @XmlAttribute(name = "dmdid", namespace = "http://www.loc.gov/METS/")
    private String dmdId;

    private MetsStream() {
        super();
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getAmdMdId() {
        return amdMdId;
    }

    public String getDmdId() {
        return dmdId;
    }

    public static class Builder {
        private String id;
        private String type;
        private String ownerId;
        private String amdMdId;
        private String dmdId;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder amdMdId(String amdMdId) {
            this.amdMdId = amdMdId;
            return this;
        }

        public Builder dmdId(String dmdId) {
            this.dmdId = dmdId;
            return this;
        }

        public MetsStream build() {
            return new MetsStream(this);
        }
    }

    private MetsStream(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.ownerId = builder.ownerId;
        this.amdMdId = builder.amdMdId;
        this.dmdId = builder.dmdId;
    }
}
