package edu.ucsd.cse232b.xpath;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

public class MyResolver implements EntityResolver {

    public InputSource resolveEntity(String publicId, String systemId) throws SAXException, IOException {
        if (systemId.contains("play.dtd")) {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream myDtdRes = classloader.getResourceAsStream("play.dtd");
            return new InputSource(myDtdRes);
        } else {
            return null;
        }
    }
}
