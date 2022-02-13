package edu.ucsd.cse232b.xquery;

import org.w3c.dom.Node;

import java.util.List;

public class Milestone2ExtraTest {
    public static void main(String[] args) throws Exception {
//        1. 不用传 document node?
//        2. let, where clause optional
//        3. 不用 mapStack?
        String query;
        Xquery xq = new Xquery();
        List<Node> result = List.of();


        // Test
        // testcase 1
        System.out.println("Test testcase1:");
        query = "<acts>" +
                "{ for $a in doc(\"j_caesar.xml\")//ACT" +
                "where empty ( for $sp in $a/SCENE/SPEECH/SPEAKER" +
                "where $sp/text() = \"CASCA\"" +
                "return <speaker> {$sp/text()}</speaker>)" +
                "return <act>{$a/TITLE/text()}</act>" +
                "}" +
                "</acts>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        //testcase 2
        System.out.println("Test testcase2:");
        query = "<result>{ for $a in (for $s in doc(\"j_caesar.xml\")//ACT" +
                "return $s)," +
                "$sc in (for $t in $a/SCENE" +
                "return $t)," +
                "$sp in (for $d in $sc/SPEECH" +
                "return $d)" +
                "where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\"" +
                "return <who>{$sp/SPEAKER/text()}</who>," +
                "<when>{" +
                "<act>{$a/TITLE/text()}</act>," +
                "<scene>{$sc/TITLE/text()}</scene>" +
                "}</when>" +
                "}" +
                "</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        // testcase 3
        System.out.println("Test testcase3:");
        query = "<result>{" +
                "for $a in doc(\"j_caesar.xml\")//PERSONAE, $b in $a/PERSONA" +
                "where ($b/text() = \"JULIUS CAESAR\") or ($b/text()= \"Another Poet\")" +
                "return $b" +
                "}" +
                "</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        // testcase 4
        System.out.println("Test testcase4:");
        query = "<result>{" +
                "for $a in doc(\"j_caesar.xml\")//PERSONAE, $b in $a/PERSONA" +
                "where not (($b/text() = \"JULIUS CAESAR\") or ($b/text() = \"Another Poet\") )" +
                "return $b" +
                "}" +
                "</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);
    }
}
