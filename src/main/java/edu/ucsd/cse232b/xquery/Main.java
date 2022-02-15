package edu.ucsd.cse232b.xquery;

import edu.ucsd.cse232b.xpath.Xpath;
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
            Xquery xq = new Xquery();
            List<Node> result = xq.evaluate(query.toString());
            System.out.printf("returned results: %d\n", result.size());
            xq.transform(result);
        } catch (IOException e) {
            System.err.println("Failed to read file: " + filepath);
            System.err.println(e);
            System.exit(2);
        }
    }
}
