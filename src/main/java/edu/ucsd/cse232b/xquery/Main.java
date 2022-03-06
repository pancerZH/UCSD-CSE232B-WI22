package edu.ucsd.cse232b.xquery;

import edu.ucsd.cse232b.parsers.QueryGrammarParser;
import edu.ucsd.cse232b.query.ReWriter;
import org.apache.commons.cli.*;
import org.w3c.dom.Node;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        CommandLine commandLine;
        Option option_r = Option.builder("r")
                .hasArg(false)
                .required(false)
                .desc("join rewriter")
                .longOpt("rewrite")
                .build();
        Option option_p = Option.builder("p")
                .hasArg(true)
                .required(true)
                .desc("input query file")
                .longOpt("file path")
                .build();
        Options options = new Options();
        options.addOption(option_r);
        options.addOption(option_p);
        CommandLineParser parser = new DefaultParser();
        commandLine = parser.parse(options, args);
        String filepath = commandLine.getOptionValue("p");  // extra paras would be ignored
        BufferedReader in = new BufferedReader(new FileReader(filepath));
        StringBuilder query = new StringBuilder();
        String str;
        while ((str = in.readLine()) != null) {
            query.append(str.replaceAll("\r\n|\r|\n", " "));
            query.append(" ");
        }
        Xquery xq = new Xquery();

        if (commandLine.hasOption("r")) {
            String rewritten = ReWriter.convert((QueryGrammarParser.ForXqContext)xq.parse(query.toString()).xq());
            BufferedWriter output = null;
            File file = new File("./rewriteOutput.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            output = new BufferedWriter(new FileWriter(file));
            output.write(rewritten);
            output.close();
            System.out.print("output rewritten result in rewriteOutput.txt");
        } else {
            try {
                long t1 = System.currentTimeMillis();
                List<Node> result = xq.evaluate(query.toString());
                long t2 = System.currentTimeMillis();
                System.out.printf("returned results: %d\n", result.size());
                System.out.printf("Query execution time: %d ms\n", t2 - t1);
                xq.transform(result);
            } catch (IOException e) {
                System.err.println("Failed to read file: " + filepath);
                System.err.println(e);
                System.exit(2);
            }
        }
    }
}
