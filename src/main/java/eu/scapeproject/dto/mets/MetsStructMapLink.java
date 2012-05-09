package eu.scapeproject.dto.mets;

import java.net.URI;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="smLink", namespace = "http://www.loc.gov/METS/")
public class MetsStructMapLink {
    @XmlAttribute(name="id", namespace = "http://www.loc.gov/METS/")
    private String id;
    @XmlAttribute(name="arcrole", namespace = "http://www.w3.org/1999/xlink")
    private URI arcRole;
    @XmlAttribute(name="title", namespace = "http://www.w3.org/1999/xlink")
    private String title;
    @XmlAttribute(name="show", namespace = "http://www.w3.org/1999/xlink")
    private String show;
    @XmlAttribute(name="actuate", namespace = "http://www.w3.org/1999/xlink")
    private String actuate;
    @XmlAttribute(name="to", namespace = "http://www.w3.org/1999/xlink")
    private String linkTo;
    @XmlAttribute(name="from", namespace = "http://www.w3.org/1999/xlink")
    private String linkFrom;

    private MetsStructMapLink() {
        super();
    }

    private MetsStructMapLink(Builder builder) {
        this.id = builder.id;
        this.arcRole = builder.arcRole;
        this.title = builder.title;
        this.show = builder.show;
        this.actuate = builder.actuate;
        this.linkTo = builder.linkTo;
        this.linkFrom = builder.linkFrom;
    }

    public String getActuate() {
        return actuate;
    }

    public URI getArcRole() {
        return arcRole;
    }

    public String getId() {
        return id;
    }

    public String getLinkFrom() {
        return linkFrom;
    }

    public String getLinkTo() {
        return linkTo;
    }

    public String getShow() {
        return show;
    }

    public String getTitle() {
        return title;
    }

    public static class Builder {
        private String id;
        private URI arcRole;
        private String title;
        private String show;
        private String actuate;
        private String linkTo;
        private String linkFrom;

        public Builder actuate(String actuate) {
            this.actuate = actuate;
            return this;
        }

        public Builder arcRole(URI arcRole) {
            this.arcRole = arcRole;
            return this;
        }

        public MetsStructMapLink build() {
            return new MetsStructMapLink(this);
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder linkFrom(String linkFrom) {
            this.linkFrom = linkFrom;
            return this;
        }

        public Builder linkTo(String linkTo) {
            this.linkTo = linkTo;
            return this;
        }

        public Builder show(String show) {
            this.show = show;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }
    }
}
