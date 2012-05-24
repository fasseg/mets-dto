package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "agent", namespace = "http://www.loc.gov/METS/")
public class MetsAgent {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "ROLE")
    private String role;
    @XmlAttribute(name = "OTHERROLE")
    private String otherRole;
    @XmlAttribute(name = "TYPE")
    private String type;
    @XmlAttribute(name = "OTHERTYPE")
    private String otherType;
    @XmlElement(name = "name", namespace = "http://www.loc.gov/METS/")
    private String name;
    @XmlElement(name = "note", namespace = "http://www.loc.gov/METS/")
    private String note;

    private MetsAgent() {
        super();
    }

    private MetsAgent(Builder builder) {
        this.id = builder.id;
        this.role = builder.role;
        this.otherRole = builder.otherRole;
        this.type = builder.type;
        this.otherType = builder.otherType;
        this.name = builder.name;
        this.note = builder.note;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public String getOtherRole() {
        return otherRole;
    }

    public String getOtherType() {
        return otherType;
    }

    public String getRole() {
        return role;
    }

    public String getType() {
        return type;
    }

    public static class Builder {
        private String id;
        private String role;
        private String otherRole;
        private String type;
        private String otherType;
        private String name;
        private String note;

        public MetsAgent build() {
            return new MetsAgent(this);
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder note(String note) {
            this.note = note;
            return this;
        }

        public Builder otherRole(String otherRole) {
            this.otherRole = otherRole;
            return this;
        }

        public Builder otherType(String otherType) {
            this.otherType = otherType;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }
    }
}
