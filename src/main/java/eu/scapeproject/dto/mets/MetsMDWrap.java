package eu.scapeproject.dto.mets;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mdWrap", namespace = "http://www.loc.gov/METS/")
public class MetsMDWrap {
    @XmlElement(name = "xmlData", namespace = "http://www.loc.gov/METS/")
    private Object xmlData;

    public Object getData() {
        return xmlData;
    }

    @SuppressWarnings("unused")
    private MetsMDWrap() {
        super();
    }

    public MetsMDWrap(Object xmlData) {
        super();
        this.xmlData = xmlData;
    }

}
