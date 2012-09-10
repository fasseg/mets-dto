package eu.scapeproject.dto.mets;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "mets", namespace = "http://www.loc.gov/METS/")
@XmlType(namespace = "http://www.loc.gov/METS/")
public class MetsDocument {
	@XmlAttribute(name = "ID")
	private String id;
	@XmlAttribute(name = "OBJID")
	private String objId;
	@XmlAttribute(name = "LABEL")
	private String label;
	@XmlAttribute(name = "TYPE")
	private String type;
	@XmlAttribute(name = "PROFILE")
	private String profile;
	@XmlElement(name = "metsHdr", namespace = "http://www.loc.gov/METS/")
	private List<MetsHeader> headers;
	@XmlElement(name = "dmdSec", namespace = "http://www.loc.gov/METS/")
	private MetsDMDSec dmdSec;
	@XmlElement(name = "amdSec", namespace = "http://www.loc.gov/METS/")
	private List<MetsAMDSec> amdSecs;
	@XmlElement(name = "fileSec", namespace = "http://www.loc.gov/METS/")
	private MetsFileSec fileSec;
	@XmlElement(name = "structMap", namespace = "http://www.loc.gov/METS/")
	private List<MetsStructMap> structMaps;

	private MetsDocument() {
		super();
	}

	private MetsDocument(Builder builder) {
		this.id = builder.id;
		this.objId = builder.objId;
		this.label = builder.label;
		this.type = builder.type;
		this.profile = builder.profile;
		this.headers = builder.headers;
		this.dmdSec = builder.dmdSec;
		this.amdSecs = builder.amdSecs;
		this.fileSec = builder.fileSec;
		this.structMaps = builder.structMaps;
	}

	public List<MetsAMDSec> getAmdSecs() {
		return amdSecs;
	}

	public MetsDMDSec getDmdSec() {
		return dmdSec;
	}

	public MetsFileSec getFileSec() {
		return fileSec;
	}

	public List<MetsHeader> getHeaders() {
		return headers;
	}

	public String getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public String getObjId() {
		return objId;
	}

	public String getProfile() {
		return profile;
	}

	public List<MetsStructMap> getStructMaps() {
		return structMaps;
	}

	public String getType() {
		return type;
	}

	public static class Builder {
		private String id;
		private String objId;
		private String label;
		private String type;
		private String profile;
		private MetsDMDSec dmdSec;
		private List<MetsHeader> headers;
		private List<MetsAMDSec> amdSecs;
		private MetsFileSec fileSec;
		private List<MetsStructMap> structMaps;

		public Builder() {
			super();
		}

		public Builder(MetsDocument doc) {
			// TODO: deep copy
			this.id = doc.id;
			this.objId = doc.objId;
			this.label = doc.label;
			this.type = doc.type;
			this.profile = doc.profile;
			this.dmdSec = doc.dmdSec;
			this.headers = doc.headers;
			this.amdSecs = doc.amdSecs;
			this.fileSec = doc.fileSec;
			this.structMaps = doc.structMaps;
		}

		public Builder addAmdSec(MetsAMDSec amdSec) {
			if (this.amdSecs == null) {
				this.amdSecs = new ArrayList<MetsAMDSec>();
			}
			this.amdSecs.add(amdSec);
			return this;
		}

		public Builder addHeader(MetsHeader header) {
			if (this.headers == null) {
				this.headers = new ArrayList<MetsHeader>();
			}
			this.headers.add(header);
			return this;
		}

		public Builder addstructMap(MetsStructMap structMap) {
			if (this.structMaps == null) {
				this.structMaps = new ArrayList<MetsStructMap>();
			}
			this.structMaps.add(structMap);
			return this;
		}

		public Builder amdSecs(List<MetsAMDSec> amdSecs) {
			this.amdSecs = amdSecs;
			return this;
		}

		public MetsDocument build() {
			return new MetsDocument(this);
		}

		public Builder dmdSec(MetsDMDSec dmdSec) {
			this.dmdSec = dmdSec;
			return this;
		}

		public Builder fileSec(MetsFileSec fileSec) {
			this.fileSec = fileSec;
			return this;
		}

		public Builder headers(List<MetsHeader> headers) {
			this.headers = headers;
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

		public Builder objId(String objId) {
			this.objId = objId;
			return this;
		}

		public Builder profile(String profile) {
			this.profile = profile;
			return this;
		}

		public Builder structMaps(List<MetsStructMap> structMaps) {
			this.structMaps = structMaps;
			return this;
		}

		public Builder type(String type) {
			this.type = type;
			return this;
		}
	}
}
