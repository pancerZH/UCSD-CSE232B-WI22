package edu.ucsd.cse232b.xquery;

import org.w3c.dom.Node;

import java.util.List;

public class Milestone2SolvedTest {
    public static void main(String[] args) throws Exception {
        String query;
        Xquery xq = new Xquery();
        List<Node> result = List.of();


        // Test
        // testcase 1
        /*
        Solution for test case 1 :
        <?xml version="1.0" encoding="UTF-8"?><acts>
        <act>ACT I</act>
        </acts>
        */
        System.out.println("Test testcase1:");
        query = "<acts> { for $a in doc(\"j_caesar.xml\")//ACT\n where not empty ( for $sp in $a/SCENE/SPEECH\n where " +
                "($sp/SPEAKER/text() = \"FLAVIUS\" and $sp/../TITLE/text()=\"SCENE I. Rome. A street.\") return " +
                "<speaker> {\n $sp/text() }\n</speaker> ) return <act>{$a/TITLE/text()}</act> }</acts>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        //testcase 2
        /*
        Solution for test case 2 :
        <?xml version="1.0" encoding="UTF-8"?><result>
        <scenes>
        <scene>SCENE II. A public place.</scene>
        <act>ACT I</act>
        </scenes>
        <scenes>
        <scene>SCENE II. CAESAR's house.</scene>
        </scenes>
        <scenes>
        <scene>SCENE I. Rome. Before the Capitol; the Senate sitting above.</scene>
        </scenes>
        </result>
        */
        System.out.println("Test testcase2:");
        query = "<result>{ for $s in doc(\"j_caesar.xml\")//SCENE where $s//SPEAKER/text()=\"CAESAR\" return <scenes> " +
                "{ <scene> {$s/TITLE/text()} </scene>, for $a in doc(\"j_caesar.xml\")//ACT where some $s1 in (for $x in " +
                "$a//SCENE where $x/TITLE/text()=\"SCENE II. A public place.\" return $x) satisfies $s1 eq $s and " +
                "$a/TITLE/text() = \"ACT I\" return <act>{$a/TITLE/text()}</act>}</scenes>}\n</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        // testcase 3
        /*
        Solution for test case 3 :
        <?xml version="1.0" encoding="UTF-8"?><result>
        <who>FLAVIUS</who>
        <when>
        <act>ACT I</act>
        <scene>SCENE I. Rome. A street.</scene>
        </when>
        </result>
        */
        System.out.println("Test testcase3:");
        query = "<result>{ for $a in (for $s in doc(\"j_caesar.xml\")//ACT where $s/TITLE/text()=\"ACT I\" return $s), $sc in " +
                "(for $t in $a/SCENE where $t/TITLE/text()=\"SCENE I. Rome. A street.\" return $t),$sp in (for $d in " +
                "$sc/SPEECH where $d/LINE/text()=\"Upon a labouring day without the sign\" return $d) where " +
                "$sp/SPEAKER/text() = \"FLAVIUS\" return " +
                "<who>{$sp/SPEAKER/text()}</who>,<when>{ <act>{$a/TITLE/text()}</act>, " +
                "<scene>{$sc/TITLE/text()}</scene> }</when> }</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        // testcase 4
        /*
        <?xml version="1.0" encoding="UTF-8"?><result>
        <who>CAESAR</who>
        <when>
        <act>ACT III</act>
        <scene>SCENE I. Rome. Before the Capitol; the Senate sitting above.</scene>
        </when>
        </result>
        */
        System.out.println("Test testcase4:");
        query = "<result>{ for $a in (for $s in doc(\"j_caesar.xml\")//ACT return $s),$sc in (for $t in $a/SCENE return $t), $sp " +
                "in (for $d in $sc/SPEECH return $d) where $sp/LINE/text() = \"Et tu, Brute! Then fall, Caesar.\" return " +
                "<who>{$sp/SPEAKER/text()}</who>,<when>{ <act>{$a/TITLE/text()}</act>, " +
                "<scene>{$sc/TITLE/text()}</scene> }</when> } </result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);

        // testcase 5
        /*
        <?xml version="1.0" encoding="UTF-8"?><result>
        <PERSONA>CINNA, a poet. </PERSONA>
        <PERSONA>CALPURNIA, wife to Caesar.</PERSONA>
        <PERSONA>Senators, Citizens, Guards, Attendants, &amp;c.</PERSONA>
        <PERSONA>ARTEMIDORUS Of Cnidos, a teacher of rhetoric. </PERSONA>
        <PERSONA>PORTIA, wife to Brutus.</PERSONA>
        <PERSONA>PINDARUS, servant to Cassius.</PERSONA>
        <PERSONA>A Soothsayer</PERSONA></result>
        */
        System.out.println("Test testcase5:");
        query = "<result>{ for $a in doc(\"j_caesar.xml\")//PERSONAE, $b in $a/PERSONA where not (($b/text() = \"JULIUS " +
                "CAESAR\") or ($b/text() = \"Another Poet\") ) return $b }</result>";
        result = xq.evaluate(query);
        System.out.printf("returned results: %d\n", result.size());
        xq.transform(result);
    }
}
