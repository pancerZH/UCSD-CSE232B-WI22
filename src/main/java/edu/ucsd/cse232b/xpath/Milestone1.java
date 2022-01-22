package edu.ucsd.cse232b.xpath;

import org.w3c.dom.Node;

import java.util.List;

public class Milestone1 {
    public static void main(String[] args) throws Exception {
//        if(args.length != 1) {
//            throw new Exception("No specified input file");
//        }
//        String queryFile = args[0];

        // Demo
        // testcase 1
        System.out.println("Demo testcase1:");
        String queryPath = "doc(\"country_data.xml\")/data/country/neighbor";
        Xpath xpath = new Xpath("");
        List<Node> result = xpath.evaluate(queryPath);
        xpath.transform(result);


        // testcase 2
        System.out.println("Demo testcase2:");
        queryPath = "doc(\"country_data.xml\")/data//year";
        result = xpath.evaluate(queryPath);
        xpath.transform(result);
    }
}
