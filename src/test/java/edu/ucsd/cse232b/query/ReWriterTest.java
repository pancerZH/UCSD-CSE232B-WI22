package edu.ucsd.cse232b.query;

import org.antlr.v4.runtime.misc.Pair;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReWriterTest {

    @org.junit.jupiter.api.Test
    void convertToString() {
        ReWriter reWriter = ReWriter.generateReWriter();
        Map<String, String> forMap = new HashMap<>();
        forMap.put("$b1", "doc(\"input\")/book");
        forMap.put("$aj", "$b1/author/first/text()");
        forMap.put("$a1", "$b1/author");
        forMap.put("$af1", "$a1/first");
        forMap.put("$al1", "$a1/last");

        Map<Pair<String, String>, String> condMap = new HashMap<>();
        condMap.put(new Pair<>("$aj", "John"), "eq");
        condMap.put(new Pair<>("$af1", "$af21"), "eq");
        condMap.put(new Pair<>("$al1", "$al21"), "eq");

        reWriter.setForMap(forMap);
        reWriter.setCondMap(condMap);

        String expectedRes = """
                for $af1 in $a1/first,
                $b1 in doc("input")/book,
                $al1 in $a1/last,
                $a1 in $b1/author,
                $aj in $b1/author/first/text()
                where $aj eq John
                return <tuple>{
                <af1>{$af1}<\\af1>,
                <b1>{$b1}<\\b1>,
                <al1>{$al1}<\\al1>,
                <a1>{$a1}<\\a1>,
                <aj>{$aj}<\\aj>
                }<\\tuple>,
                """;

        assertEquals(expectedRes, reWriter.convertToString());
    }
}