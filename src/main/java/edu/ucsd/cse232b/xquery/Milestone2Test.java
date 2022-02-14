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
        query = "<result>{\n" +
                "for $a in doc(\"j_caesar.xml\")//ACT,\n" +
                "$sc in $a//SCENE,\n" +
                "$sp in $sc/SPEECH\n" +
                "where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\"\n" +
                "return <who>{$sp/SPEAKER/text()}</who>,\n" +
                "<when>{<act>{$a/TITLE/text()}</act>,\n" +
                "<scene>{$sc/TITLE/text()}</scene>}\n" +
                "</when>\n" +
                "}</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        //testcase 2
        System.out.println("Test testcase2:");
        query = "<result>{\n" +
                "for $s in doc(\"j_caesar.xml\")//SPEAKER\n" +
                "return <speaks>{<who>{$s/text()}</who>,\n" +
                "for $a in doc(\"j_caesar.xml\")//ACT\n" +
                "where some $s1 in $a//SPEAKER satisfies $s1 eq $s\n" +
                "return <when>{$a/TITLE/text()}</when>}\n" +
                "</speaks>\n" +
                "}</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);
    }
}
