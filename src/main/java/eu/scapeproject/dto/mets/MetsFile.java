package eu.scapeproject.dto.mets;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="file", namespace = "http://www.loc.gov/METS/")
public class MetsFile {
    @XmlAttribute(name="id", namespace = "http://www.loc.gov/METS/")
    private String id;
    @XmlAttribute(name="mimetype", namespace = "http://www.loc.gov/METS/")
    private String mimeType;
    @XmlAttribute(name="seq", namespace = "http://www.loc.gov/METS/")
    private int seq;
    @XmlAttribute(name="size", namespace = "http://www.loc.gov/METS/")
    private int size;
    @XmlAttribute(name="created", namespace = "http://www.loc.gov/METS/")
    private Date created;
    @XmlAttribute(name="checksum", namespace = "http://www.loc.gov/METS/")
    private String checkSum;
    @XmlAttribute(name="checksumtype", namespace = "http://www.loc.gov/METS/")
    private String checksumType;
    @XmlAttribute(name="ownerid", namespace = "http://www.loc.gov/METS/")
    private String ownerId;
    @XmlAttribute(name="admid", namespace = "http://www.loc.gov/METS/")
    private String admId;
    @XmlAttribute(name="dmdid", namespace = "http://www.loc.gov/METS/")
    private String dmdId;
    @XmlAttribute(name="groupid", namespace = "http://www.loc.gov/METS/")
    private String groupId;
    @XmlAttribute(name="use", namespace = "http://www.loc.gov/METS/")
    private String use;
    @XmlElement(name="FLocat", namespace = "http://www.loc.gov/METS/")
    private List<MetsFileLocation> fileLocations;
    private MetsFile() {
        super();
    }

    private MetsFile(Builder builder) {
        this.id = builder.id;
        this.mimeType = builder.mimeType;
        this.seq = builder.seq;
        this.size = builder.size;
        this.created = builder.created;
        this.checkSum = builder.checkSum;
        this.checksumType = builder.checksumType;
        this.ownerId = builder.ownerId;
        this.admId = builder.admId;
        this.dmdId = builder.dmdId;
        this.groupId = builder.groupId;
        this.use = builder.use;
        this.fileLocations=builder.fileLocations;
        
    }

    public String getAdmId() {
        return admId;
    }

    public String getCheckSum() {
        return checkSum;
    }

    public String getChecksumType() {
        return checksumType;
    }

    public Date getCreated() {
        return created;
    }

    public String getDmdId() {
        return dmdId;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getId() {
        return id;
    }

    public String getMimeType() {
        return mimeType;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public int getSeq() {
        return seq;
    }

    public int getSize() {
        return size;
    }

    public String getUse() {
        return use;
    }

    public static class Builder {
        private final String id;
        private String mimeType;
        private int seq;
        private int size;
        private Date created;
        private String checkSum;
        private String checksumType;
        private String ownerId;
        private String admId;
        private String dmdId;
        private String groupId;
        private String use;
        private List<MetsFileLocation> fileLocations;

        public Builder(String id) {
            this.id = id;
        }

        public Builder admId(String admId) {
            this.admId = admId;
            return this;
        }

        public MetsFile build() {
            return new MetsFile(this);
        }

        public Builder checkSum(String checkSum) {
            this.checkSum = checkSum;
            return this;
        }

        public Builder checksumType(String checksumType) {
            this.checksumType = checksumType;
            return this;
        }

        public Builder created(Date created) {
            this.created = created;
            return this;
        }

        public Builder dmdId(String dmdId) {
            this.dmdId = dmdId;
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder mimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder seq(int seq) {
            this.seq = seq;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }

        public Builder use(String use) {
            this.use = use;
            return this;
        }
        
        public Builder fileLocations(List<MetsFileLocation> fileLocations){
            this.fileLocations=fileLocations;
            return this;
        }
    }
}
