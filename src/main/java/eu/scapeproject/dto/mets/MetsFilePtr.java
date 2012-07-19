package eu.scapeproject.dto.mets;

import java.net.URI;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="fptr", namespace = "http://www.loc.gov/METS/")
public class MetsFilePtr {
    @XmlAttribute(name="ID")
    private String id;
    @XmlAttribute(name="FILEID")
    private String fileId;
    @XmlAttribute(name="CONTENTIDS")
    private URI contentids;
    
    private MetsFilePtr(){
        super();
    }

    private MetsFilePtr(Builder builder) {
        this.id = builder.id;
        this.fileId = builder.fileId;
        this.contentids = builder.contentids;
    }

    public URI getContentids() {
        return contentids;
    }

    public String getFileId() {
        return fileId;
    }

    public String getId() {
        return id;
    }

    public static class Builder {
        private String id;
        private String fileId;
        private URI contentids;

        public MetsFilePtr build() {
            return new MetsFilePtr(this);
        }

        public Builder contentids(URI contentids) {
            this.contentids = contentids;
            return this;
        }

        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }
    }
}
