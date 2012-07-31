package eu.scapeproject.dto.mets;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dmdSec")
@XmlAccessorType(XmlAccessType.FIELD)
public class MetsDMDSec {
	@XmlAttribute(name = "ID")
	private String id;
	@XmlAttribute(name = "GROUPID")
	private String groupId;
	@XmlAttribute(name = "ADMID")
	private String admId;
	@XmlAttribute(name = "CREATED")
	private Date created;
	@XmlAttribute(name = "STATUS")
	private String status;
	@XmlElement(name = "mdWrap", namespace = "http://www.loc.gov/METS/")
	private MetsMDWrap metadataWrapper;
	@XmlElement(name = "mdRef", namespace = "http://www.loc.gov/METS/")
	private MetsMDRef metadataReference;

	private MetsDMDSec() {
		super();
	}

	private MetsDMDSec(Builder builder) {
		this.id = builder.id;
		this.groupId = builder.groupId;
		this.admId = builder.admId;
		this.created = builder.created;
		this.status = builder.status;
		this.metadataWrapper = builder.metadataWrapper;
		this.metadataReference = builder.mdRef;
	}

	public String getAdmId() {
		return admId;
	}

	public Date getCreated() {
		return created;
	}

	public String getGroupId() {
		return groupId;
	}

	public String getId() {
		return id;
	}

	public MetsMDRef getMetadataReference() {
		return metadataReference;
	}

	public MetsMDWrap getMetadataWrapper() {
		return metadataWrapper;
	}

	public String getStatus() {
		return status;
	}

	public static class Builder {
		private final String id;
		private String groupId;
		private String admId;
		private Date created;
		private String status;
		private MetsMDWrap metadataWrapper;
		private MetsMDRef mdRef;

		public Builder(String id) {
			this.id = id;
		}

		public Builder admId(String admId) {
			this.admId = admId;
			return this;
		}

		public MetsDMDSec build() {
			return new MetsDMDSec(this);
		}

		public Builder created(Date created) {
			this.created = created;
			return this;
		}

		public Builder groupId(String groupId) {
			this.groupId = groupId;
			return this;
		}

		public Builder mdRef(MetsMDRef mdRef) {
			this.mdRef = mdRef;
			return this;
		}

		public Builder metadataWrapper(MetsMDWrap metadataWrapper) {
			this.metadataWrapper = metadataWrapper;
			return this;
		}

		public Builder status(String status) {
			this.status = status;
			return this;
		}
	}
}
