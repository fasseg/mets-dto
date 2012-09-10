package eu.scapeproject.dto.mets;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "div", namespace = "http://www.loc.gov/METS/")
public class MetsDiv {
    @XmlAttribute(name = "ID")
    private String id;
    @XmlAttribute(name = "TYPE")
    private String type;
    @XmlAttribute(name = "LABEL")
    private String label;
    @XmlAttribute(name = "DMDID")
    private String dmdId;
    @XmlAttribute(name = "ADMID")
    private String admId;
    @XmlAttribute(name = "ORDER")
    private int order;
    @XmlAttribute(name = "ORDERLABEL")
    private String orderLabel;
    @XmlAttribute(name = "CONTENTIDS")
    private URI contentIds;
    @XmlAttribute(name = "LABEL")
    private String xlinkLabel;
    @XmlElement(name = "fptr", namespace = "http://www.loc.gov/METS/")
    private List<MetsFilePtr> filePointers;
    @XmlElement(name = "div", namespace = "http://www.loc.gov/METS/")
    private List<MetsDiv> subDivs;

    private MetsDiv() {
        super();
    }

    private MetsDiv(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.label = builder.label;
        this.dmdId = builder.dmdId;
        this.admId = builder.admId;
        this.order = builder.order;
        this.orderLabel = builder.orderLabel;
        this.contentIds = builder.contentIds;
        this.xlinkLabel = builder.xlinkLabel;
        this.filePointers = builder.filePointers;
        this.subDivs = builder.subDivs;
    }

    public String getAdmId() {
        return admId;
    }

    public URI getContentIds() {
        return contentIds;
    }

    public String getDmdId() {
        return dmdId;
    }

    public List<MetsFilePtr> getFilePointers() {
        return filePointers;
    }

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public int getOrder() {
        return order;
    }

    public String getOrderLabel() {
        return orderLabel;
    }

    public List<MetsDiv> getSubDivs() {
        return subDivs;
    }

    public String getType() {
        return type;
    }

    public String getXlinkLabel() {
        return xlinkLabel;
    }

    public static class Builder {
        private String id;
        private String type;
        private String label;
        private String dmdId;
        private String admId;
        private int order;
        private String orderLabel;
        private URI contentIds;
        private String xlinkLabel;
        private List<MetsFilePtr> filePointers;
        private List<MetsDiv> subDivs;

        public Builder addFilePointer(MetsFilePtr filePointer) {
            if (this.filePointers == null) {
                this.filePointers = new ArrayList<MetsFilePtr>();
            }
            this.filePointers.add(filePointer);
            return this;
        }

        public Builder addSubDiv(MetsDiv subDiv) {
            if (this.subDivs == null) {
                this.subDivs = new ArrayList<MetsDiv>();
            }
            this.subDivs.add(subDiv);
            return this;
        }

        public Builder admId(String admId) {
            this.admId = admId;
            return this;
        }

        public MetsDiv build() {
            return new MetsDiv(this);
        }

        public Builder contentIds(URI contentIds) {
            this.contentIds = contentIds;
            return this;
        }

        public Builder dmdId(String dmdId) {
            this.dmdId = dmdId;
            return this;
        }

        public Builder filePointers(List<MetsFilePtr> filePointers) {
            this.filePointers = filePointers;
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

        public Builder order(int order) {
            this.order = order;
            return this;
        }

        public Builder orderLabel(String orderLabel) {
            this.orderLabel = orderLabel;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder xlinkLabel(String xlinkLabel) {
            this.xlinkLabel = xlinkLabel;
            return this;
        }
    }
}
