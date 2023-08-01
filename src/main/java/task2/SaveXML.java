package task2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class SaveXML {
    public static void createXml(String file){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();

            Element rootElement = doc.createElement("cities");
            doc.appendChild(rootElement);

            Element region1 = doc.createElement("region");
            rootElement.appendChild(region1);

            Element city1 = doc.createElement("city");
            city1.setTextContent("Kiev");
            city1.setAttribute("size", "big");
            region1.appendChild(city1);

            Element street1 = doc.createElement("street");
            street1.setTextContent("Strajesko");
            region1.appendChild(street1);

            Element house1 = doc.createElement("house");
            house1.setTextContent("1");
            region1.appendChild(house1);


            Element region2 = doc.createElement("region");
            rootElement.appendChild(region2);

            Element city2 = doc.createElement("city");
            city2.setTextContent("Lviv");
            city2.setAttribute("size", "big");
            region2.appendChild(city2);

            Element street2 = doc.createElement("street");
            street2.setTextContent("Shevchenko");
            region2.appendChild(street2);

            Element house2 = doc.createElement("house");
            house2.setTextContent("7");
            region2.appendChild(house2);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File(file));

            t.transform(source, sr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}