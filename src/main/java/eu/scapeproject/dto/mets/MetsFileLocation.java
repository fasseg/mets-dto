package eu.scapeproject.dto.mets;

import java.net.URI;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FLocat", namespace = "http://www.loc.gov/METS/")
public class MetsFileLocation {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "LOCTYPE")
    private String locType;
    @XmlAttribute(name = "USE")
    private String use;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    private URI href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    private URI role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    private URI arcRole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    private String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    private String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    private String actuate;

    private MetsFileLocation() {
        super();
    }

    private MetsFileLocation(Builder builder) {
        this.id = builder.id;
        this.locType = builder.locType;
        this.use = builder.use;
        this.href = builder.href;
        this.role = builder.role;
        this.arcRole = builder.arcRole;
        this.title = builder.title;
        this.show = builder.show;
        this.actuate = builder.actuate;
    }

    public String getActuate() {
        return actuate;
    }

    public URI getArcRole() {
        return arcRole;
    }

    public URI getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public String getLocType() {
        return locType;
    }

    public URI getRole() {
        return role;
    }

    public String getShow() {
        return show;
    }

    public String getTitle() {
        return title;
    }

    public String getUse() {
        return use;
    }

    public static class Builder {
        private final String id;
        private String locType;
        private String use;
        private URI href;
        private URI role;
        private URI arcRole;
        private String title;
        private String show;
        private String actuate;

        
        public Builder(String id) {
            super();
            this.id = id;
        }

        public Builder actuate(String actuate) {
            this.actuate = actuate;
            return this;
        }

        public Builder arcRole(URI arcRole) {
            this.arcRole = arcRole;
            return this;
        }

        public MetsFileLocation build() {
            return new MetsFileLocation(this);
        }

        public Builder href(URI href) {
            this.href = href;
            return this;
        }

        public Builder locType(String locType) {
            this.locType = locType;
            return this;
        }

        public Builder role(URI role) {
            this.role = role;
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

        public Builder use(String use) {
            this.use = use;
            return this;
        }
    }
}
