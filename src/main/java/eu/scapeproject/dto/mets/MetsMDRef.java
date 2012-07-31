package eu.scapeproject.dto.mets;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="mdRef",namespace="http://www.loc.gov/METS/")
public class MetsMDRef {
    @XmlAttribute(name = "id")
	private String id;
    @XmlAttribute(name = "mimeType")
	private String mimeType;
    @XmlAttribute(name = "label")
	private String label;
    @XmlAttribute(name = "xptr")
	private String xptr;
    @XmlAttribute(name = "locType")
	private String locType;
    @XmlAttribute(name = "otherLocType")
	private String otherLocType;
    @XmlAttribute(name = "mdType")
	private String mdType;
    @XmlAttribute(name = "mdTypeVersion")
	private String mdTypeVersion;
    @XmlAttribute(name = "otherMdType")
	private String otherMdType;
    @XmlAttribute(name = "size")
	private long size;
    @XmlAttribute(name = "created")
	private Date created;
    @XmlAttribute(name = "checksum")
	private String checksum;
    @XmlAttribute(name = "checksumType")
	private String checksumType;
    @XmlAttribute(name = "href")
	private String href;

	private MetsMDRef() {
		super();
	}

	private MetsMDRef(Builder b) {
		this.id = b.id;
		this.mimeType = b.mimeType;
		this.label = b.label;
		this.xptr = b.xptr;
		this.locType = b.locType;
		this.otherLocType = b.otherLocType;
		this.mdType = b.mdType;
		this.mdTypeVersion = b.mdTypeVersion;
		this.otherMdType = b.otherMdType;
		this.size = b.size;
		this.created = b.created;
		this.checksum = b.checksum;
		this.checksumType = b.checksumType;
		this.href = b.href;
	}

	public String getChecksum() {
		return checksum;
	}

	public String getChecksumType() {
		return checksumType;
	}

	public Date getCreated() {
		return created;
	}

	public String getHref() {
		return href;
	}

	public String getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public String getLocType() {
		return locType;
	}

	public String getMdType() {
		return mdType;
	}

	public String getMdTypeVersion() {
		return mdTypeVersion;
	}

	public String getMimeType() {
		return mimeType;
	}

	public String getOtherLocType() {
		return otherLocType;
	}

	public String getOtherMdType() {
		return otherMdType;
	}

	public long getSize() {
		return size;
	}

	public String getXptr() {
		return xptr;
	}

	public static class Builder {
		private String id;
		private String mimeType;
		private String label;
		private String xptr;
		private String locType;
		private String otherLocType;
		private String mdType;
		private String mdTypeVersion;
		private String otherMdType;
		private long size;
		private Date created;
		private String checksum;
		private String checksumType;
		private String href;

		public Builder() {
			super();
		}

		public MetsMDRef build() {
			return new MetsMDRef(this);
		}

		public Builder checksum(String checksum) {
			this.checksum = checksum;
			return this;
		}

		public Builder checksumType(String checksumType) {
			this.checksumType = checksumType;
			return this;
		}

		public Builder created(Date created) {
			this.created = created;
			return this;
		}

		public Builder href(String href) {
			this.href = href;
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

		public Builder locType(String locType) {
			this.locType = locType;
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

		public Builder mimeType(String mimeType) {
			this.mimeType = mimeType;
			return this;
		}

		public Builder otherLocType(String otherLocType) {
			this.otherLocType = otherLocType;
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

		public Builder xptr(String xptr) {
			this.xptr = xptr;
			return this;
		}
	}

}
