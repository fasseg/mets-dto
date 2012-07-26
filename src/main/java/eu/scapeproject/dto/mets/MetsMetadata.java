package eu.scapeproject.dto.mets;

public abstract class MetsMetadata {
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
