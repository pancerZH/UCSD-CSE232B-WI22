package edu.ucsd.cse232b.xquery;

import org.w3c.dom.Node;

import java.util.List;

public class Milestone2Test {
    public static void main(String[] args) throws Exception {
        String query;
        Xquery xq = new Xquery();
        List<Node> result = List.of();


        // Test
        // testcase 1
        System.out.println("Test testcase1:");
        query = "<result>{" +
                "for $a in document(\"j_caesar.xml\")//ACT," +
                "$sc in $a//SCENE," +
                "$sp in $sc/SPEECH" +
                "where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\"" +
                "return <who>{$sp/SPEAKER/text()}</who>," +
                "<when>{<act>{$a/TITLE/text()}</act>," +
                "<scene>{$sc/TITLE/text()}</scene>}" +
                "<when>" +
                "}</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        //testcase 2
        System.out.println("Test testcase2:");
        query = "<result>{" +
                "for $s in document(\"j_caesar.xml\")//SPEAKER" +
                "return <speaks>{<who>{$s/text()}</who>," +
                "for $a in document(\"j_caesar.xml\")//ACT" +
                "where some $s1 in $a//SPEAKER satisfies $s1 eq $s" +
                "return <when>{$a/TITLE/text()}</when>}" +
                "</speaks>" +
                "}</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);
    }
}
