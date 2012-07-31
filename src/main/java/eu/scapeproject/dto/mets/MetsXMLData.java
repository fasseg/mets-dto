package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xmlData", namespace = "http://www.loc.gov/METS/")
public class MetsXMLData {
    @XmlElement(name="metadata",namespace="http://www.scapeproject.eu/model")
    private MetsMetadata data;

    @SuppressWarnings("unused")
    private MetsXMLData() {
        super();
    }

    public MetsXMLData(MetsMetadata data) {
        super();
        this.data = data;
    }

    public Object getData() {
        return data;
    }

}
