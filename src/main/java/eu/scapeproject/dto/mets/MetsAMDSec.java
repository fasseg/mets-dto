package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "amdSec", namespace = "http://www.loc.gov/METS/")
public class MetsAMDSec {
    @XmlAttribute(name = "id")
    private String id;
    @XmlElement(name = "techMD", namespace = "http://www.loc.gov/METS/")
    private MetsTechMD technicalMetadata;
    @XmlElement(name = "digiProvMD", namespace = "http://www.loc.gov/METS/")
    private MetsDigiProvMD provenanceMetadata;
    @XmlElement(name = "sourceMD", namespace = "http://www.loc.gov/METS/")
    private MetsSourceMD sourceMetadata;
    @XmlElement(name = "rightsMD", namespace = "http://www.loc.gov/METS/")
    private MetsRightsMD rightsMetadata;

    private MetsAMDSec() {
        super();
    }

    private MetsAMDSec(Builder builder) {
        this.id = builder.id;
        this.technicalMetadata = builder.technicalMetadata;
        this.provenanceMetadata = builder.provenanceMetadata;
        this.sourceMetadata = builder.sourceMetadata;
        this.rightsMetadata = builder.rightsMetadata;
    }

    public String getId() {
        return id;
    }

    public MetsTechMD getTechnicalMetadata() {
        return technicalMetadata;
    }

    public MetsDigiProvMD getProvenanceMetadata() {
        return provenanceMetadata;
    }

    public MetsSourceMD getSourceMetadata() {
        return sourceMetadata;
    }

    public MetsRightsMD getRightsMetadata() {
        return rightsMetadata;
    }

    public static class Builder {
        private String id;
        private MetsTechMD technicalMetadata;
        private MetsDigiProvMD provenanceMetadata;
        private MetsSourceMD sourceMetadata;
        private MetsRightsMD rightsMetadata;

        public MetsAMDSec build() {
            return new MetsAMDSec(this);
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder provenanceMetadata(MetsDigiProvMD provenanceMetadata) {
            this.provenanceMetadata = provenanceMetadata;
            return this;
        }

        public Builder rightsMetadata(MetsRightsMD rightsMetadata) {
            this.rightsMetadata = rightsMetadata;
            return this;
        }

        public Builder sourceMetadata(MetsSourceMD sourceMetadata) {
            this.sourceMetadata = sourceMetadata;
            return this;
        }

        public Builder technicalMetadata(MetsTechMD technicalMetadata) {
            this.technicalMetadata = technicalMetadata;
            return this;
        }
    }
}
