package edu.ucsd.cse232b.xquery;

import org.w3c.dom.Node;

import java.util.List;

public class Milestone2ExtraTest {
    public static void main(String[] args) throws Exception {
        String query;
        Xquery xq = new Xquery();
        List<Node> result = List.of();


        // Test
        // testcase 1
        System.out.println("Test testcase1:");
        query = "<acts>\n" +
                "{ for $a in doc(\"j_caesar.xml\")//ACT\n" +
                "where empty ( for $sp in $a/SCENE/SPEECH/SPEAKER\n" +
                "where $sp/text() = \"CASCA\"\n" +
                "return <speaker> {$sp/text()}</speaker>)\n" +
                "return <act>{$a/TITLE/text()}</act>\n" +
                "}\n" +
                "</acts>\n";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        //testcase 2
        System.out.println("Test testcase2:");
        query = "<result>{ for $a in (for $s in doc(\"j_caesar.xml\")//ACT\n" +
                "return $s),\n" +
                "$sc in (for $t in $a/SCENE\n" +
                "return $t),\n" +
                "$sp in (for $d in $sc/SPEECH\n" +
                "return $d)\n" +
                "where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\"\n" +
                "return <who>{$sp/SPEAKER/text()}</who>,\n" +
                "<when>{\n" +
                "<act>{$a/TITLE/text()}</act>,\n" +
                "<scene>{$sc/TITLE/text()}</scene>\n" +
                "}</when>\n" +
                "}\n" +
                "</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        // testcase 3
        System.out.println("Test testcase3:");
        query = "<result>{\n" +
                "for $a in doc(\"j_caesar.xml\")//PERSONAE, $b in $a/PERSONA\n" +
                "where ($b/text() = \"JULIUS CAESAR\") or ($b/text()= \"Another Poet\")\n" +
                "return $b\n" +
                "}\n" +
                "</result>\n";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        // testcase 4
        System.out.println("Test testcase4:");
        query = "<result>{\n" +
                "for $a in doc(\"j_caesar.xml\")//PERSONAE, $b in $a/PERSONA\n" +
                "where not (($b/text() = \"JULIUS CAESAR\") or ($b/text() = \"Another Poet\") )\n" +
                "return $b\n" +
                "}\n" +
                "</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);
    }
}
