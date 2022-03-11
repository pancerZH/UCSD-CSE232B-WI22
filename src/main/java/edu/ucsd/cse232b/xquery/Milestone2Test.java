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

//        //testcase 2
//        System.out.println("Test testcase2:");
//        query = "<result>{\n" +
//                "for $s in doc(\"j_caesar.xml\")//SPEAKER\n" +
//                "return <speaks>{<who>{$s/text()}</who>,\n" +
//                "for $a in doc(\"j_caesar.xml\")//ACT\n" +
//                "where some $s1 in $a//SPEAKER satisfies $s1 eq $s\n" +
//                "return <when>{$a/TITLE/text()}</when>}\n" +
//                "</speaks>\n" +
//                "}</result>";
//        result = xq.evaluate(query);
//        System.out.printf("returned results: %d\n", result.size());
//        xq.transform(result);

//        System.out.println("Test testcase2:");
//        query = """
//                for $tuple in join (for $s in doc("j_caesar.xml")//SPEAKER
//                return <tuple>{
//                <s>{$s}</s>
//                }</tuple>,
//                for $a in doc("j_caesar.xml")//ACT,
//                $t in $a/TITLE/text(),
//                $s1 in $a//SPEAKER
//                where $t eq "ACT V"
//                return <tuple>{
//                <a>{$a}</a>,
//                <t>{$t}</t>,
//                <s1>{$s1}</s1>
//                }</tuple>,
//                [s], [s1]
//                )
//                return
//                <when>{$tuple/a/*/TITLE/text()}</when>""";
//        result = xq.evaluate(query);
//        System.out.printf("returned results: %d\n", result.size());
//        xq.transform(result);

        System.out.println("Test testcase3:");
        query = """
                for $act in doc("j_caesar.xml")//ACT,
                    $title in $act/SCENE/TITLE,
                    $speaker1 in $act//SPEAKER/text(),
                    $speaker2 in $act//SPEAKER/text(),
                    $pg in doc("j_caesar.xml")//PGROUP,
                    $persona1 in $pg/PERSONA/text(),
                    $persona2 in $pg/PERSONA/text()
                where $speaker1 eq $persona1 and $speaker2 eq $persona2
                return
                    <tuple>{
                        <scene>{$title/text()}</scene>,
                        <persona1>{$persona1}</persona1>,
                        <persona2>{$persona2}</persona2>
                    }</tuple>""";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        System.out.println("Test testcase4:");
        query = """
                for $tuple in
                 join(
                for  $a1 in doc("j_caesar.xml")//ACT/..//ACT,
                      $sc1 in $a1//SCENE,
                      $sp1 in $sc1//SPEAKER/text(),
                      $sl1 in $sc1//LINE
                            where $sp1 = "FLAVIUS"
                return <tuple> {<sl1>{$sl1}</sl1>,<sc1>{$sc1}</sc1>} </tuple>,
                for
                    $a2 in doc("j_caesar.xml")//ACT/..//ACT,
                    $sc2 in $a2//SCENE,
                                $sp2 in $sc2//SPEAKER,
                                $sl2 in $sc2//LINE
                return <tuple> {<sl2>{$sl2}</sl2>,<sc2>{$sc2}</sc2>} </tuple>,
                [sl1, sc1], [sl2, sc2])
                return <result>{<title>{$tuple/sc1/*/TITLE/text()}</title>}</result>""";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        System.out.println("Test testcase5:");
        query = """
                for $a in doc("j_caesar.xml")//ACT,
                    $b in doc("j_caesar.xml")//ACT,
                    $sa in $a//SCENE,
                    $sb in $b//SCENE,
                    $spa in $sa//SPEAKER,
                    $spb in $sb//SPEAKER/text(),
                    $spc in $sb//SPEAKER
                where $spb="FLAVIUS" and $sa eq $sb and $spa eq $spc
                return <result>{ <title>{$sa/TITLE/text()}</title> }</result>""";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);
    }
}
