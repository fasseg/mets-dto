package eu.scapeproject.dto.mets;

import java.net.URI;

public class MetsPtr {
    private String id;
    private String locType;
    private String otherLocType;
    private URI contentIds;
    private URI href;
    private URI role;
    private URI arcRole;
    private String title;
    private String show;
    private String actuate;

    private MetsPtr() {
        super();
    }

    private MetsPtr(Builder builder) {
        this.id = builder.id;
        this.locType = builder.locType;
        this.otherLocType = builder.otherLocType;
        this.contentIds = builder.contentIds;
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

    public URI getContentIds() {
        return contentIds;
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

    public String getOtherLocType() {
        return otherLocType;
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

    public static class Builder {
        private String id;
        private String locType;
        private String otherLocType;
        private URI contentIds;
        private URI href;
        private URI role;
        private URI arcRole;
        private String title;
        private String show;
        private String actuate;

        public Builder actuate(String actuate) {
            this.actuate = actuate;
            return this;
        }

        public Builder arcRole(URI arcRole) {
            this.arcRole = arcRole;
            return this;
        }

        public MetsPtr build() {
            return new MetsPtr(this);
        }

        public Builder contentIds(URI contentIds) {
            this.contentIds = contentIds;
            return this;
        }

        public Builder href(URI href) {
            this.href = href;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder locType(String locType) {
            this.locType = locType;
            return this;
        }

        public Builder otherLocType(String otherLocType) {
            this.otherLocType = otherLocType;
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
    }
}
