package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "xmlData", namespace = "http://www.loc.gov/METS/")
public class MetsXMLData {
    @XmlValue
    private Object data;

    @SuppressWarnings("unused")
    private MetsXMLData() {
        super();
    }

    public Object getData() {
        return data;
    }

    public MetsXMLData(Object data) {
        super();
        this.data = data;
    }

}
