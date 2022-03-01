package edu.ucsd.cse232b.query;

import edu.ucsd.cse232b.parsers.QueryGrammarParser;
import org.antlr.v4.runtime.misc.Pair;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ReWriterTest {

    @Test
    void convertToString() {
        ReWriter reWriter = ReWriter.generateReWriter();
        Map<String, String> forMap = new HashMap<>();
        forMap.put("$b1", "doc(\"input\")/book");
        forMap.put("$aj", "$b1/author/first/text()");
        forMap.put("$a1", "$b1/author");
        forMap.put("$af1", "$a1/first");
        forMap.put("$al1", "$a1/last");

        Map<Integer, String> orderMap = new HashMap<>();
        orderMap.put(0, "$b1");
        orderMap.put(1, "$aj");
        orderMap.put(2, "$a1");
        orderMap.put(3, "$af1");
        orderMap.put(4, "$al1");

        Map<Pair<String, String>, String> condMap = new HashMap<>();
        condMap.put(new Pair<>("$aj", "John"), "eq");
        condMap.put(new Pair<>("$af1", "$af21"), "eq");
        condMap.put(new Pair<>("$al1", "$al21"), "eq");

        reWriter.setForMap(forMap, orderMap);
        reWriter.setCondMap(condMap);

        String expectedRes = """
                for $b1 in doc("input")/book,
                $aj in $b1/author/first/text(),
                $a1 in $b1/author,
                $af1 in $a1/first,
                $al1 in $a1/last
                where $aj eq John
                return <tuple>{
                <b1>{$b1}<\\b1>,
                <aj>{$aj}<\\aj>,
                <a1>{$a1}<\\a1>,
                <af1>{$af1}<\\af1>,
                <al1>{$al1}<\\al1>
                }<\\tuple>,
                """;

        assertEquals(expectedRes, reWriter.convertToString());
    }

    @Test
    void convert() {
        QueryGrammarParser.ForXqContext ctxMocked = mock(QueryGrammarParser.ForXqContext.class, RETURNS_DEEP_STUBS);
        String[] varGroup = {"$b", "$a", "$tb", "$ta"};
        String[] forClauseGroup = {"doc(\"input\")/book", "doc(\"input\")/entry", "$b/title", "$a/title"};
        for(int i=0; i<varGroup.length; i++) {
            when(ctxMocked.forClause().VAR().size()).thenReturn(varGroup.length);
            when(ctxMocked.forClause().VAR(i).getText()).thenReturn(varGroup[i]);
            when(ctxMocked.forClause().xq(i).getText()).thenReturn(forClauseGroup[i]);
        }

        when(ctxMocked.whereClause().cond().getText()).thenReturn("where $tb eq $ta\n");
        when(ctxMocked.returnClause().xq().getText()).thenReturn("""
                <book-with-prices>
                { $tb,
                <price-review>{ $a/price }</price-review>,
                <price>{ $b/price }</price> }
                </book-with-prices>""");

        String expectedRes = """
                for $tuple in join (for $b in doc("input")/book,
                $tb in $b/title
                return <tuple>{
                <b>{$b}<\\b>,
                <tb>{$tb}<\\tb>
                }<\\tuple>,
                for $a in doc("input")/entry,
                $ta in $a/title
                return <tuple>{
                <a>{$a}<\\a>,
                <ta>{$ta}<\\ta>
                }<\\tuple>,
                [tb], [ta]
                )
                return
                <book-with-prices>
                { $tuple/tb/*,
                <price-review>{ $tuple/a/*/price }</price-review>,
                <price>{ $tuple/b/*/price }</price> }
                </book-with-prices>""";

        assertEquals(expectedRes, ReWriter.convert(ctxMocked));
    }
}