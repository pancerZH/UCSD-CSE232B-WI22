package edu.ucsd.cse232b.xpath;

import org.w3c.dom.Node;

import java.util.List;

public class Milestone1 {

    /*
    * For demo presentation
    * */
    public static void main(String[] args) throws Exception {
        String query;
        Xpath xpath = new Xpath();
        List<Node> result = List.of();


        // Demo
        // testcase 1
        System.out.println("Demo testcase1:");
        query = "doc(\"j_caesar.xml\")//PERSONA";
        result = xpath.evaluate(query);
        xpath.transform(result);

        // testcase 2
        System.out.println("Demo testcase2:");
        query = "doc(\"j_caesar.xml\")//SCENE[SPEECH/SPEAKER/text()=\"CAESAR\"]";
        result = xpath.evaluate(query);
        xpath.transform(result);

        // testcase 3
        System.out.println("Demo testcase3:");
        query = "doc(\"j_caesar.xml\")//ACT[SCENE[SPEECH/SPEAKER/text()=\"CAESAR\" and SPEECH/SPEAKER/text()=\"BRUTUS\"]]";
        result = xpath.evaluate(query);
        xpath.transform(result);

        // testcase 4
        System.out.println("Demo testcase4:");
        query = "doc(\"j_caesar.xml\")//ACT[SCENE[SPEECH/SPEAKER/text()=\"CAESAR\"] [SPEECH/SPEAKER/text()=\"BRUTUS\"]]";
        result = xpath.evaluate(query);
        xpath.transform(result);

        // testcase 5
        System.out.println("Demo testcase5:");
        query = "doc(\"j_caesar.xml\")//ACT[not .//SPEAKER/text()=\"CAESAR\"]";
        result = xpath.evaluate(query);
        xpath.transform(result);

        // Extra testcases

        // testcase 6
        System.out.println("Demo testcase6:");
        query = "doc(\"j_caesar.xml\")//(ACT,PERSONAE)/TITLE";
        result = xpath.evaluate(query);
        xpath.transform(result);

        // testcase 7
        System.out.println("Demo testcase7:");
        query = "doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../TITLE";
        result = xpath.evaluate(query);
        xpath.transform(result);

        // testcase 8
        System.out.println("Demo testcase8:");
        query = "doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../*/.././TITLE";
        result = xpath.evaluate(query);
        xpath.transform(result);

        // testcase 9
        System.out.println("Demo testcase9:");
        query = "doc(\"j_caesar.xml\")//ACT[(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE/text()";
        result = xpath.evaluate(query);
        xpath.transform(result);

        System.out.println();

        // testcase 10
        System.out.println("Demo testcase10:");
        query = "doc(\"j_caesar.xml\")//ACT[not((./TITLE)==(./TITLE))]/*/SPEECH/../TITLE";
        result = xpath.evaluate(query);
        xpath.transform(result);
    }
}
