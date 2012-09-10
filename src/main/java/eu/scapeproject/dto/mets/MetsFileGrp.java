package eu.scapeproject.dto.mets;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "fielGrp", namespace = "http://www.loc.gov/METS/")
public class MetsFileGrp {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "VERSDATE")
    private Date versDate;
    @XmlAttribute(name = "ADMID")
    private String admId;
    @XmlAttribute(name = "USE")
    private String use;
    @XmlElement(name = "file", namespace = "http://www.loc.gov/METS/")
    private List<MetsFile> files;

    private MetsFileGrp() {
        super();
    }

    private MetsFileGrp(Builder builder) {
        this.id = builder.id;
        this.versDate = builder.versDate;
        this.admId = builder.admId;
        this.use = builder.use;
        this.files = builder.files;
    }

    public String getAdmId() {
        return admId;
    }

    public List<MetsFile> getFiles() {
        return files;
    }

    public String getId() {
        return id;
    }

    public String getUse() {
        return use;
    }

    public Date getVersDate() {
        return versDate;
    }

    public static class Builder {
        private final String id;
        private Date versDate;
        private String admId;
        private String use;
        private List<MetsFile> files;

        public Builder(String id) {
            super();
            this.id = id;
        }

        public Builder addFile(MetsFile file) {
            if (this.files == null) {
                this.files = new ArrayList<MetsFile>();
            }
            this.files.add(file);
            return this;
        }

        public Builder admId(String admId) {
            this.admId = admId;
            return this;
        }

        public MetsFileGrp build() {
            return new MetsFileGrp(this);
        }

        public Builder files(List<MetsFile> files) {
            this.files = files;
            return this;
        }

        public Builder use(String use) {
            this.use = use;
            return this;
        }

        public Builder versDate(Date versDate) {
            this.versDate = versDate;
            return this;
        }
    }
}
