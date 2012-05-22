package eu.scapeproject.dto.mets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "metsHdr", namespace = "http://www.loc.gov/METS/")
public class MetsHeader {
    @XmlAttribute(name = "id")
    private String id;
    @XmlAttribute(name = "admid")
    private String admId;
    @XmlAttribute(name = "createDate")
    private Date createdDate;
    @XmlAttribute(name = "lastmoddate")
    private Date lastModDate;
    @XmlAttribute(name = "recordstatus")
    private String recordStatus;
    @XmlElement(name = "agent", namespace = "http://www.loc.gov/METS/")
    private List<MetsAgent> agents;
    @XmlElement(name = "altRecordId", namespace = "http://www.loc.gov/METS/")
    private List<MetsAlternativeIdentifer> alternativeIdentifiers;

    private MetsHeader() {
        super();
    }

    private MetsHeader(Builder builder) {
        this.id = builder.id;
        this.admId = builder.admId;
        this.createdDate = builder.createdDate;
        this.lastModDate = builder.lastModDate;
        this.recordStatus = builder.recordStatus;
        this.agents = builder.agents;
        this.alternativeIdentifiers = builder.alternativeIdentifiers;
    }

    public String getAdmId() {
        return admId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getId() {
        return id;
    }

    public Date getLastModDate() {
        return lastModDate;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public List<MetsAgent> getAgents() {
        return agents;
    }

    public List<MetsAlternativeIdentifer> getAlternativeIdentifiers() {
        return alternativeIdentifiers;
    }

    public static class Builder {
        private final String id;
        private String admId;
        private Date createdDate;
        private Date lastModDate;
        private String recordStatus;
        private List<MetsAgent> agents;
        private List<MetsAlternativeIdentifer> alternativeIdentifiers;

        public Builder(String id) {
            this.id = id;
        }

        public Builder addAgent(MetsAgent agent) {
            if (this.agents == null) {
                this.agents = new ArrayList<MetsAgent>();
            }
            this.agents.add(agent);
            return this;
        }

        public Builder addAlternativeIdentifier(MetsAlternativeIdentifer id) {
            if (this.alternativeIdentifiers == null) {
                this.alternativeIdentifiers = new ArrayList<MetsAlternativeIdentifer>();
            }
            this.alternativeIdentifiers.add(id);
            return this;
        }

        public Builder agents(List<MetsAgent> agents) {
            this.agents = agents;
            return this;
        }

        public Builder admId(String admId) {
            this.admId = admId;
            return this;
        }

        public MetsHeader build() {
            return new MetsHeader(this);
        }

        public Builder createdDate(Date createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder lastModDate(Date lastModDate) {
            this.lastModDate = lastModDate;
            return this;
        }

        public Builder recordStatus(String recordStatus) {
            this.recordStatus = recordStatus;
            return this;
        }

        public Builder alternativeIdentifiers(List<MetsAlternativeIdentifer> alternativeIdentifiers) {
            this.alternativeIdentifiers = alternativeIdentifiers;
            return this;
        }
    }
}
