package edu.ucsd.cse232b.xpath;

import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        if(args.length == 0) {
            System.err.println("No query file provided!");
            System.exit(1);
        }

        String filepath = args[0];  // extra paras would be ignored
        try {
            BufferedReader in = new BufferedReader(new FileReader(filepath));
            StringBuilder query = new StringBuilder();
            String str;
            while ((str = in.readLine()) != null) {
                query.append(str.replaceAll("\r\n|\r|\n", " "));
                query.append(" ");
            }
            Xpath xpath = new Xpath();
            List<Node> result = xpath.evaluate(query.toString());
            System.out.printf("returned results: %d\n", result.size());
            xpath.transform(result);
        } catch (IOException e) {
            System.err.println("Failed to read file: " + filepath);
            System.err.println(e);
            System.exit(2);
        }
    }
}
