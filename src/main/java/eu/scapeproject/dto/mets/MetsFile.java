package eu.scapeproject.dto.mets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "file", namespace = "http://www.loc.gov/METS/")
public class MetsFile {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "MIMETYPE")
    private String mimeType;
    @XmlAttribute(name = "SEQ")
    private int seq;
    @XmlAttribute(name = "SIZE")
    private int size;
    @XmlAttribute(name = "CREATED")
    private Date created;
    @XmlAttribute(name = "CHECKSUM")
    private String checkSum;
    @XmlAttribute(name = "CHECKSUMTYPE")
    private String checksumType;
    @XmlAttribute(name = "OWNERID")
    private String ownerId;
    @XmlAttribute(name = "ADMID")
    private String admId;
    @XmlAttribute(name = "DMDID")
    private String dmdId;
    @XmlAttribute(name = "GROUPID")
    private String groupId;
    @XmlAttribute(name = "USE")
    private String use;
    @XmlElement(name = "FLocat", namespace = "http://www.loc.gov/METS/")
    private List<MetsFileLocation> fileLocations;
    @XmlElement(name = "stream", namespace = "http://www.loc.gov/METS/")
    private List<MetsStream> streams;

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
        this.fileLocations = builder.fileLocations;
        this.streams = builder.streams;
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

    public List<MetsFileLocation> getFileLocations() {
        return fileLocations;
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

    public List<MetsStream> getStreams() {
        return streams;
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
        private List<MetsStream> streams;

        public Builder(String id) {
            this.id = id;
        }

        public Builder addFileLocation(MetsFileLocation location) {
            if (this.fileLocations == null) {
                this.fileLocations = new ArrayList<MetsFileLocation>();
            }
            this.fileLocations.add(location);
            return this;
        }

        public Builder addStream(MetsStream stream) {
            if (this.streams == null) {
                this.streams = new ArrayList<MetsStream>();
            }
            this.streams.add(stream);
            return this;
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

        public Builder fileLocations(List<MetsFileLocation> fileLocations) {
            this.fileLocations = fileLocations;
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

        public Builder streams(List<MetsStream> streams) {
            this.streams = streams;
            return this;
        }

        public Builder use(String use) {
            this.use = use;
            return this;
        }
    }
}
