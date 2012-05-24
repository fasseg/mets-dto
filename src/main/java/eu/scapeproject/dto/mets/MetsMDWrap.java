package eu.scapeproject.dto.mets;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mdWrap", namespace = "http://www.loc.gov/METS/")
public class MetsMDWrap {
    @XmlAttribute(name = "MDTYPE")
    private String mdType;
    @XmlAttribute(name = "LABEL")
    private String label;
    @XmlAttribute(name = "MDTYPEVERSION")
    private String mdTypeVersion;
    @XmlAttribute(name = "OTHERMDTYPE")
    private String otherMdType;
    @XmlAttribute(name = "SIZE")
    private long size;
    @XmlAttribute(name = "CREATED")
    private Date created;
    @XmlAttribute(name = "CHECKSUM")
    private String checksum;
    @XmlAttribute(name = "CHECKSUMTYPE")
    private String checkSumType;
    @XmlElement(name = "xmlData", namespace = "http://www.loc.gov/METS/")
    private MetsXMLData xmlData;

    private MetsMDWrap() {
        super();
    }

    private MetsMDWrap(Builder builder) {
        this.xmlData = builder.xmlData;
        this.mdType = builder.mdType;
        this.label = builder.label;
        this.mdTypeVersion = builder.mdTypeVersion;
        this.otherMdType = builder.otherMdType;
        this.size = builder.size;
        this.created = builder.created;
        this.checksum = builder.checksum;
        this.checkSumType = builder.checkSumType;
    }

    public String getChecksum() {
        return checksum;
    }

    public String getCheckSumType() {
        return checkSumType;
    }

    public Date getCreated() {
        return created;
    }

    public Object getData() {
        return xmlData;
    }

    public String getLabel() {
        return label;
    }

    public String getMdType() {
        return mdType;
    }

    public String getMdTypeVersion() {
        return mdTypeVersion;
    }

    public String getOtherMdType() {
        return otherMdType;
    }

    public long getSize() {
        return size;
    }

    public Object getXmlData() {
        return xmlData;
    }

    public static class Builder {
        private final MetsXMLData xmlData;
        private String mdType;
        private String label;
        private String mdTypeVersion;
        private String otherMdType;
        private long size;
        private Date created;
        private String checksum;
        private String checkSumType;

        public Builder(MetsXMLData xmlData) {
            super();
            this.xmlData = xmlData;
        }

        public MetsMDWrap build() {
            return new MetsMDWrap(this);
        }

        public Builder checksum(String checksum) {
            this.checksum = checksum;
            return this;
        }

        public Builder checkSumType(String checkSumType) {
            this.checkSumType = checkSumType;
            return this;
        }

        public Builder created(Date created) {
            this.created = created;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder mdType(String mdType) {
            this.mdType = mdType;
            return this;
        }

        public Builder mdTypeVersion(String mdTypeVersion) {
            this.mdTypeVersion = mdTypeVersion;
            return this;
        }

        public Builder otherMdType(String otherMdType) {
            this.otherMdType = otherMdType;
            return this;
        }

        public Builder size(long size) {
            this.size = size;
            return this;
        }

    }
}
