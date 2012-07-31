package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stream", namespace = "http://www.loc.gov/METS/")
public class MetsStream {
    @XmlAttribute(name = "ID", namespace = "http://www.loc.gov/METS/")
    private String id;
    @XmlAttribute(name = "TYPE", namespace = "http://www.loc.gov/METS/")
    private String type;
    @XmlAttribute(name = "OWNERID", namespace = "http://www.loc.gov/METS/")
    private String ownerId;
    @XmlAttribute(name = "AMDMDID", namespace = "http://www.loc.gov/METS/")
    private String amdMdId;
    @XmlAttribute(name = "DMDID", namespace = "http://www.loc.gov/METS/")
    private String dmdId;

    private MetsStream() {
        super();
    }

    private MetsStream(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.ownerId = builder.ownerId;
        this.amdMdId = builder.amdMdId;
        this.dmdId = builder.dmdId;
    }

    public String getAmdMdId() {
        return amdMdId;
    }

    public String getDmdId() {
        return dmdId;
    }

    public String getId() {
        return id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getType() {
        return type;
    }

    public static class Builder {
        private String id;
        private String type;
        private String ownerId;
        private String amdMdId;
        private String dmdId;

        public Builder amdMdId(String amdMdId) {
            this.amdMdId = amdMdId;
            return this;
        }

        public MetsStream build() {
            return new MetsStream(this);
        }

        public Builder dmdId(String dmdId) {
            this.dmdId = dmdId;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }
    }
}
