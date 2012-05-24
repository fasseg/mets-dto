package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="altRecordID", namespace = "http://www.loc.gov/METS/")
public class MetsAlternativeIdentifer {
    @XmlAttribute(name="TYPE")
    private String type;
    @XmlValue
    private String value;
    
    @SuppressWarnings("unused")
    private MetsAlternativeIdentifer(){
        super();
    }
    
    public MetsAlternativeIdentifer(String type, String value) {
        super();
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
