package edu.ucsd.cse232b.xpath;

import org.w3c.dom.Node;

import java.util.List;

public class Milestone1Test {

    public static void main(String[] args) throws Exception {
        String query;
        Xpath xpath = new Xpath("");
        List<Node> result = List.of();


        // Test
        // testcase 1
        System.out.println("Test testcase1:");
        query = "doc(\"j_caesar.xml\")//(ACT,PERSONAE)/TITLE/text()/../../TITLE[not((./ACT)and(./ACT))]/.././PERSONA/./..";
        result = xpath.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xpath.transform(result);

        //testcase 2
        System.out.println("Test testcase2:");
        query = "doc(\"j_caesar.xml\")/PLAY/ACT[not(SCENE=ACT)]/TITLE/.";
        result = xpath.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xpath.transform(result);

        //testcase 3
        System.out.println("Test testcase3:");
        query = "doc(\"j_caesar.xml\")/PLAY/(ACT,PERSONAE)/PGROUP[not(PERSONA)or(GRPDESCR)]/../.";
        result = xpath.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xpath.transform(result);

        //testcase 4
        System.out.println("Test testcase4:");
        query = "doc(\"j_caesar.xml\")//(ACT/SCENE/SPEECH)/(SPEAKER)/../.[not (./../TITLE==./LINE) and (./../*/SPEAKER==./SPEAKER)]/../TITLE";
        result = xpath.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xpath.transform(result);

        //testcase 5
        System.out.println("Test testcase5:");
        query = "doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../*/.././TITLE";
        result = xpath.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xpath.transform(result);
    }
}
