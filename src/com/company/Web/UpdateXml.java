package com.company.Web;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by blin on 2015/1/12.
 */
public class UpdateXml {
    public static boolean doc2XmlFile(Document document, String filename) {
        boolean flag = true;
        try {

            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();

            // transformer.setOutputProperty(OutputKeys.ENCODING, "GB2312");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filename));
            transformer.transform(source, result);
        } catch (Exception ex) {
            flag = false;
            ex.printStackTrace();
        }
        return flag;
    }

    public static Document load(String filename) {
        Document document = null;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            document = builder.parse(new File(filename));
            document.normalize();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return document;
    }


    public static void xmlUpdateDemo() {
        Document document = load("message.xml");
        Node root = document.getDocumentElement();

        if (root.hasChildNodes()) {

            NodeList ftpnodes = root.getChildNodes();

            for (int i = 0; i < ftpnodes.getLength(); i++) {
                NodeList ftplist = ftpnodes.item(i).getChildNodes();
                for (int k = 0; k < ftplist.getLength(); k++) {
                    Node subnode = ftplist.item(k);

                    // if (subnode.getNodeType()==Node.ELEMENT_NODE&&subnode.
                    // getNodeName()=="ftp-chn")
                    // {
                    // ftpnodes.item(i).removeChild(subnode);
                    // }

                    if (subnode.getNodeType() == Node.ELEMENT_NODE
                            && subnode.getNodeName() == "status") {
                        subnode.getFirstChild().setNodeValue("9");
                    }
                }

            }
        }

        doc2XmlFile(document, "message.xml");
    }

    public static void main(String args[]) throws Exception {
        UpdateXml.xmlUpdateDemo();
    }

}
