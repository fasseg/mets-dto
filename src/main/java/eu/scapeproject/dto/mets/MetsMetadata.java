package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="mets-metadata",namespace="http::/scapeproject.eu/model")
public abstract class MetsMetadata {
	@XmlAttribute(name="identifier",namespace="http://scapeproject.eu/model")
    protected String id;
	
	protected MetsMetadata(){
		super();
	}
	
	protected MetsMetadata(String id){
		super();
		this.id=id;
	}
	
	public String getId() {
		return id;
	}
	
	protected void setId(String id) {
		this.id = id;
	}
}
