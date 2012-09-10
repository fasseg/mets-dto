package eu.scapeproject.dto.mets;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "structMap", namespace = "http://www.loc.gov/METS/")
public class MetsStructMap {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "TYPE")
    private String type;
    @XmlAttribute(name = "LABEL")
    private String label;
    @XmlElement(name = "div", namespace = "http://www.loc.gov/METS/")
    private List<MetsDiv> divisions;

    private MetsStructMap() {
        super();
    }

    private MetsStructMap(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.label = builder.label;
        this.divisions = builder.divisions;
    }

    public List<MetsDiv> getDivisions() {
        return divisions;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public static class Builder {
        private String id;
        private String type;
        private String label;
        private List<MetsDiv> divisions;

        public Builder addDivision(MetsDiv div) {
            if (this.divisions == null) {
                this.divisions = new ArrayList<MetsDiv>();
            }
            this.divisions.add(div);
            return this;
        }

        public MetsStructMap build() {
            return new MetsStructMap(this);
        }

        public Builder divisions(List<MetsDiv> divisions) {
            this.divisions = divisions;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }
    }
}
