package edu.ucsd.cse232b.query;

import edu.ucsd.cse232b.parsers.QueryGrammarParser;
import edu.ucsd.cse232b.xquery.Xquery;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;
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

        Map<String, String> condMap = new HashMap<>();
        condMap.put("$aj", "John");
        condMap.put("$af1", "$af21");
        condMap.put("$al1", "$al21");

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
                <b1>{$b1}</b1>,
                <aj>{$aj}</aj>,
                <a1>{$a1}</a1>,
                <af1>{$af1}</af1>,
                <al1>{$al1}</al1>
                }</tuple>,
                """;

        assertEquals(expectedRes, reWriter.convertToString());
    }

    @Test
    void convertSimpleQuery() {
        QueryGrammarParser.ForXqContext ctxMocked = mock(QueryGrammarParser.ForXqContext.class, RETURNS_DEEP_STUBS);
        String[] varGroup = {"$b", "$a", "$tb", "$ta"};
        String[] forClauseGroup = {"doc(\"input\")/book", "doc(\"input\")/entry", "$b/title", "$a/title"};
        for(int i=0; i<varGroup.length; i++) {
            when(ctxMocked.forClause().VAR().size()).thenReturn(varGroup.length);
            when(ctxMocked.forClause().VAR(i).getText()).thenReturn(varGroup[i]);
            when(ctxMocked.forClause().xq(i).getText()).thenReturn(forClauseGroup[i]);
        }

        when(ctxMocked.whereClause().cond().getText()).thenReturn("$tb eq $ta\n");
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
                <b>{$b}</b>,
                <tb>{$tb}</tb>
                }</tuple>,
                for $a in doc("input")/entry,
                $ta in $a/title
                return <tuple>{
                <a>{$a}</a>,
                <ta>{$ta}</ta>
                }</tuple>,
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

    @Test
    void convertComplicatedQuery() {
        QueryGrammarParser.ForXqContext ctxMocked = mock(QueryGrammarParser.ForXqContext.class, RETURNS_DEEP_STUBS);
        String[] varGroup = {"$b1", "$aj", "$a1", "$af1", "$al1",
                            "$b2", "$a21", "$af21", "$al21", "$a22", "$af22", "$al22",
                            "$b3", "$a3", "$af3", "$al3"};
        String[] forClauseGroup = {"doc(\"input\")/book",
                                "$b1/author/first/text()",
                                "$b1/author",
                                "$a1/first",
                                "$a1/last",
                                "doc(\"input\")/book",
                                "$b2/author",
                                "$a21/first",
                                "$a21/last",
                                "$b2/author",
                                "$a22/first",
                                "$a22/last",
                                "doc(\"input\")/book",
                                "$b3/author",
                                "$a3/first",
                                "$a3/last"};
        for(int i=0; i<varGroup.length; i++) {
            when(ctxMocked.forClause().VAR().size()).thenReturn(varGroup.length);
            when(ctxMocked.forClause().VAR(i).getText()).thenReturn(varGroup[i]);
            when(ctxMocked.forClause().xq(i).getText()).thenReturn(forClauseGroup[i]);
        }

        when(ctxMocked.whereClause().cond().getText()).thenReturn("""
                $aj eq "John" and
                $af1 eq $af21 and $al21 eq $al1 and
                $af22 eq $af3 and $al22 eq $al3
                """);
        when(ctxMocked.returnClause().xq().getText()).thenReturn("<triplet> {$b1, $b2, $b3} </triplet>");

        String expectedRes = """
                for $tuple in join (join (for $b1 in doc("input")/book,
                $aj in $b1/author/first/text(),
                $a1 in $b1/author,
                $af1 in $a1/first,
                $al1 in $a1/last
                where $aj eq "John"
                return <tuple>{
                <b1>{$b1}</b1>,
                <aj>{$aj}</aj>,
                <a1>{$a1}</a1>,
                <af1>{$af1}</af1>,
                <al1>{$al1}</al1>
                }</tuple>,
                for $b2 in doc("input")/book,
                $a21 in $b2/author,
                $af21 in $a21/first,
                $al21 in $a21/last,
                $a22 in $b2/author,
                $af22 in $a22/first,
                $al22 in $a22/last
                return <tuple>{
                <b2>{$b2}</b2>,
                <a21>{$a21}</a21>,
                <af21>{$af21}</af21>,
                <al21>{$al21}</al21>,
                <a22>{$a22}</a22>,
                <af22>{$af22}</af22>,
                <al22>{$al22}</al22>
                }</tuple>,
                [al1,af1], [al21,af21]
                ),
                for $b3 in doc("input")/book,
                $a3 in $b3/author,
                $af3 in $a3/first,
                $al3 in $a3/last
                return <tuple>{
                <b3>{$b3}</b3>,
                <a3>{$a3}</a3>,
                <af3>{$af3}</af3>,
                <al3>{$al3}</al3>
                }</tuple>,
                [af22,al22], [af3,al3]
                )
                return
                <triplet> {$tuple/b1/*, $tuple/b2/*, $tuple/b3/*} </triplet>""";
        assertEquals(expectedRes, ReWriter.convert(ctxMocked));
    }

    @Test
    void convertComplicatedQueryWithRandomOrder() {
        QueryGrammarParser.ForXqContext ctxMocked = mock(QueryGrammarParser.ForXqContext.class, RETURNS_DEEP_STUBS);
        String[] varGroup = {"$b1", "$aj", "$a1", "$af1", "$al1",
                "$b2", "$a21", "$af21", "$al21", "$a22", "$af22", "$al22",
                "$b3", "$a3", "$al3", "$af3"};
        String[] forClauseGroup = {"doc(\"input\")/book",
                "$b1/author/first/text()",
                "$b1/author",
                "$a1/first",
                "$a1/last",
                "doc(\"input\")/book",
                "$b2/author",
                "$a21/first",
                "$a21/last",
                "$b2/author",
                "$a22/first",
                "$a22/last",
                "doc(\"input\")/book",
                "$b3/author",
                "$a3/last",
                "$a3/first"};
        for(int i=0; i<varGroup.length; i++) {
            when(ctxMocked.forClause().VAR().size()).thenReturn(varGroup.length);
            when(ctxMocked.forClause().VAR(i).getText()).thenReturn(varGroup[i]);
            when(ctxMocked.forClause().xq(i).getText()).thenReturn(forClauseGroup[i]);
        }

        when(ctxMocked.whereClause().cond().getText()).thenReturn("""
                $af22 eq $af3 and $al22 eq $al3 and
                $aj eq "John" and
                $al21 eq $al1 and $af1 eq $af21
                """);
        when(ctxMocked.returnClause().xq().getText()).thenReturn("<triplet> {$b1, $b2, $b3} </triplet>");

        String expectedRes = """
                for $tuple in join (join (for $b1 in doc("input")/book,
                $aj in $b1/author/first/text(),
                $a1 in $b1/author,
                $af1 in $a1/first,
                $al1 in $a1/last
                where $aj eq "John"
                return <tuple>{
                <b1>{$b1}</b1>,
                <aj>{$aj}</aj>,
                <a1>{$a1}</a1>,
                <af1>{$af1}</af1>,
                <al1>{$al1}</al1>
                }</tuple>,
                for $b2 in doc("input")/book,
                $a21 in $b2/author,
                $af21 in $a21/first,
                $al21 in $a21/last,
                $a22 in $b2/author,
                $af22 in $a22/first,
                $al22 in $a22/last
                return <tuple>{
                <b2>{$b2}</b2>,
                <a21>{$a21}</a21>,
                <af21>{$af21}</af21>,
                <al21>{$al21}</al21>,
                <a22>{$a22}</a22>,
                <af22>{$af22}</af22>,
                <al22>{$al22}</al22>
                }</tuple>,
                [al1,af1], [al21,af21]
                ),
                for $b3 in doc("input")/book,
                $a3 in $b3/author,
                $al3 in $a3/last,
                $af3 in $a3/first
                return <tuple>{
                <b3>{$b3}</b3>,
                <a3>{$a3}</a3>,
                <al3>{$al3}</al3>,
                <af3>{$af3}</af3>
                }</tuple>,
                [af22,al22], [af3,al3]
                )
                return
                <triplet> {$tuple/b1/*, $tuple/b2/*, $tuple/b3/*} </triplet>""";
        assertEquals(expectedRes, ReWriter.convert(ctxMocked));
    }

    @Test
    void convertComplicatedQueryWithEmptyCond() {
        QueryGrammarParser.ForXqContext ctxMocked = mock(QueryGrammarParser.ForXqContext.class, RETURNS_DEEP_STUBS);
        String[] varGroup = {"$b1", "$aj", "$a1", "$af1", "$al1",
                "$b2", "$a21", "$af21", "$al21", "$a22", "$af22", "$al22",
                "$b3", "$a3", "$af3", "$al3"};
        String[] forClauseGroup = {"doc(\"input\")/book",
                "$b1/author/first/text()",
                "$b1/author",
                "$a1/first",
                "$a1/last",
                "doc(\"input\")/book",
                "$b2/author",
                "$a21/first",
                "$a21/last",
                "$b2/author",
                "$a22/first",
                "$a22/last",
                "doc(\"input\")/book",
                "$b3/author",
                "$a3/first",
                "$a3/last"};
        for(int i=0; i<varGroup.length; i++) {
            when(ctxMocked.forClause().VAR().size()).thenReturn(varGroup.length);
            when(ctxMocked.forClause().VAR(i).getText()).thenReturn(varGroup[i]);
            when(ctxMocked.forClause().xq(i).getText()).thenReturn(forClauseGroup[i]);
        }

        when(ctxMocked.whereClause().cond().getText()).thenReturn("""
                $aj eq "John" and
                $af1 eq $af21 and $al21 eq $al1
                """);
        when(ctxMocked.returnClause().xq().getText()).thenReturn("<triplet> {$b1, $b2, $b3} </triplet>");

        String expectedRes = """
                for $tuple in join (join (for $b1 in doc("input")/book,
                $aj in $b1/author/first/text(),
                $a1 in $b1/author,
                $af1 in $a1/first,
                $al1 in $a1/last
                where $aj eq "John"
                return <tuple>{
                <b1>{$b1}</b1>,
                <aj>{$aj}</aj>,
                <a1>{$a1}</a1>,
                <af1>{$af1}</af1>,
                <al1>{$al1}</al1>
                }</tuple>,
                for $b2 in doc("input")/book,
                $a21 in $b2/author,
                $af21 in $a21/first,
                $al21 in $a21/last,
                $a22 in $b2/author,
                $af22 in $a22/first,
                $al22 in $a22/last
                return <tuple>{
                <b2>{$b2}</b2>,
                <a21>{$a21}</a21>,
                <af21>{$af21}</af21>,
                <al21>{$al21}</al21>,
                <a22>{$a22}</a22>,
                <af22>{$af22}</af22>,
                <al22>{$al22}</al22>
                }</tuple>,
                [al1,af1], [al21,af21]
                ),
                for $b3 in doc("input")/book,
                $a3 in $b3/author,
                $af3 in $a3/first,
                $al3 in $a3/last
                return <tuple>{
                <b3>{$b3}</b3>,
                <a3>{$a3}</a3>,
                <af3>{$af3}</af3>,
                <al3>{$al3}</al3>
                }</tuple>,
                [], []
                )
                return
                <triplet> {$tuple/b1/*, $tuple/b2/*, $tuple/b3/*} </triplet>""";
        assertEquals(expectedRes, ReWriter.convert(ctxMocked));
    }


    @Test
    void joinExecute1() throws Exception {
        String query;
        Xquery xq = new Xquery();

        query = """
                for $s in doc(\"j_caesar.xml\")//SPEAKER,
                    $a in doc(\"j_caesar.xml\")//ACT,
                    $t in $a/TITLE/text(),
                    $s1 in $a//SPEAKER
                where $t = "ACT V" and $s1 eq $s
                return <when>{$a/TITLE/text()}</when>""";
        long t1 = System.currentTimeMillis();
        List<Node> result1 = xq.evaluate(query);
        long t2 = System.currentTimeMillis();
        System.out.printf("returned results: %d\n", result1.size());
//        xq.transform(result1);

        String rewritten = ReWriter.convert((QueryGrammarParser.ForXqContext)xq.parse(query).xq());
        String expected = """
                for $tuple in join (for $s in doc("j_caesar.xml")//SPEAKER
                return <tuple>{
                <s>{$s}</s>
                }</tuple>,
                for $a in doc("j_caesar.xml")//ACT,
                $t in $a/TITLE/text(),
                $s1 in $a//SPEAKER
                where $t eq "ACT V"
                return <tuple>{
                <a>{$a}</a>,
                <t>{$t}</t>,
                <s1>{$s1}</s1>
                }</tuple>,
                [s], [s1]
                )
                return
                <when>{$tuple/a/*/TITLE/text()}</when>""";
        assertEquals(expected, rewritten);
        long t3 = System.currentTimeMillis();
        List<Node> result2 = xq.evaluate(rewritten);
        long t4 = System.currentTimeMillis();

        assertEquals(result1.size(), result2.size());
        System.out.printf("nested loop join time: %d\n", t2 - t1);
        System.out.printf("hash join time: %d\n", t4 - t3);
    }

    @Test
    void joinExecute2() throws Exception {
        String query;
        Xquery xq = new Xquery();

        query = """
                for $s in doc("j_caesar.xml")//SPEAKER, $a in doc("j_caesar.xml")//ACT,         
                    $sp in $a//SPEAKER, $stxt in $s/text()
                where $sp eq $s and $stxt = "CAESAR"
                return <act> { $a/TITLE/text()} </act>""";
        long t1 = System.currentTimeMillis();
        List<Node> result1 = xq.evaluate(query);
        long t2 = System.currentTimeMillis();
        System.out.printf("returned results: %d\n", result1.size());
//        xq.transform(result1);

        String rewritten = ReWriter.convert((QueryGrammarParser.ForXqContext)xq.parse(query).xq());
        String expected = """
                for $tuple in join (for $s in doc("j_caesar.xml")//SPEAKER,
                $stxt in $s/text()
                where $stxt eq "CAESAR"
                return <tuple>{
                <s>{$s}</s>,
                <stxt>{$stxt}</stxt>
                }</tuple>,
                for $a in doc("j_caesar.xml")//ACT,
                $sp in $a//SPEAKER
                return <tuple>{
                <a>{$a}</a>,
                <sp>{$sp}</sp>
                }</tuple>,
                [s], [sp]
                )
                return
                <act>{$tuple/a/*/TITLE/text()}</act>""";
        assertEquals(expected, rewritten);
        long t3 = System.currentTimeMillis();
        List<Node> result2 = xq.evaluate(rewritten);
        long t4 = System.currentTimeMillis();

        assertEquals(result1.size(), result2.size());
        System.out.printf("nested loop join time: %d\n", t2 - t1);
        System.out.printf("hash join time: %d\n", t4 - t3);
    }

    @Test
    void joinExecute3() throws Exception {
        String query;
        Xquery xq = new Xquery();

        query = """
                for $a1 in doc("j_caesar.xml")//PERSONAE,
                $a2 in $a1//PERSONA/text(),
                $a4 in $a1//GRPDESCR,
                $b1 in doc("j_caesar.xml")//PERSONAE,
                $b2 in $b1//PERSONA/text()
                where $a2 eq $b2 and $a2 eq "MARULLUS"
                return <res> {$a2, $a4} </res>""";
        long t1 = System.currentTimeMillis();
        List<Node> result1 = xq.evaluate(query);
        long t2 = System.currentTimeMillis();
        System.out.printf("returned results: %d\n", result1.size());

        String rewritten = ReWriter.convert((QueryGrammarParser.ForXqContext)xq.parse(query).xq());
        String expected = """
                for $tuple in join (for $a1 in doc("j_caesar.xml")//PERSONAE,
                $a2 in $a1//PERSONA/text(),
                $a4 in $a1//GRPDESCR
                where $a2 eq "MARULLUS"
                return <tuple>{
                <a1>{$a1}</a1>,
                <a2>{$a2}</a2>,
                <a4>{$a4}</a4>
                }</tuple>,
                for $b1 in doc("j_caesar.xml")//PERSONAE,
                $b2 in $b1//PERSONA/text()
                return <tuple>{
                <b1>{$b1}</b1>,
                <b2>{$b2}</b2>
                }</tuple>,
                [a2], [b2]
                )
                return
                <res>{$tuple/a2/*,$tuple/a4/*}</res>""";
        assertEquals(expected, rewritten);
        long t3 = System.currentTimeMillis();
        List<Node> result2 = xq.evaluate(rewritten);
        long t4 = System.currentTimeMillis();

        assertEquals(result1.size(), result2.size());
        System.out.printf("nested loop join time: %d\n", t2 - t1);
        System.out.printf("hash join time: %d\n", t4 - t3);
    }

    @Test
    void joinExecute4() throws Exception {
        String query;
        Xquery xq = new Xquery();

        query = """
                for $q1 in doc("j_caesar_M3.xml")//ACT,
                  $q2 in doc("j_caesar_M3.xml")//ACT,
                  $sa in $q1//SCENE,
                  $sb in $q2//SCENE,
                  $spa in $sa//SPEAKER,
                  $spb in $sa//SPEAKER/text(),
                  $spc in $sb//SPEAKER,
                  $spd in $sb//SPEAKER/text(),
                  $spea in $sa//SPEECH,
                  $speb in $sb//SPEECH,
                  $spec in $sa//SPEECH,
                  $sped in $sb//SPEECH
                where $spb="FLAVIUS" and $spd="FLAVIUS" and $sa eq $sb and $spa eq $spc and $speb eq $spec and $spea eq $sped
                return <result>{ <title>{$sa/TITLE/text()}</title>, <speaker>{$spa/*}</speaker> }</result>""";
        long t1 = System.currentTimeMillis();
        List<Node> result1 = xq.evaluate(query);
        long t2 = System.currentTimeMillis();
        System.out.printf("returned results: %d\n", result1.size());

        String rewritten = ReWriter.convert((QueryGrammarParser.ForXqContext)xq.parse(query).xq());
        String expected = """
                for $tuple in join (for $q1 in doc("j_caesar_M3.xml")//ACT,
                $sa in $q1//SCENE,
                $spa in $sa//SPEAKER,
                $spb in $sa//SPEAKER/text(),
                $spea in $sa//SPEECH,
                $spec in $sa//SPEECH
                where $spb eq "FLAVIUS"
                return <tuple>{
                <q1>{$q1}</q1>,
                <sa>{$sa}</sa>,
                <spa>{$spa}</spa>,
                <spb>{$spb}</spb>,
                <spea>{$spea}</spea>,
                <spec>{$spec}</spec>
                }</tuple>,
                for $q2 in doc("j_caesar_M3.xml")//ACT,
                $sb in $q2//SCENE,
                $spc in $sb//SPEAKER,
                $spd in $sb//SPEAKER/text(),
                $speb in $sb//SPEECH,
                $sped in $sb//SPEECH
                where $spd eq "FLAVIUS"
                return <tuple>{
                <q2>{$q2}</q2>,
                <sb>{$sb}</sb>,
                <spc>{$spc}</spc>,
                <spd>{$spd}</spd>,
                <speb>{$speb}</speb>,
                <sped>{$sped}</sped>
                }</tuple>,
                [sa,spa,spea,spec], [sb,spc,sped,speb]
                )
                return
                <result>{<title>{$tuple/sa/*/TITLE/text()}</title>,<speaker>{$tuple/spa/*/*}</speaker>}</result>""";
        assertEquals(expected, rewritten);
        long t3 = System.currentTimeMillis();
        List<Node> result2 = xq.evaluate(rewritten);
        long t4 = System.currentTimeMillis();

        assertEquals(result1.size(), result2.size());
        System.out.printf("nested loop join time: %d\n", t2 - t1);
        System.out.printf("hash join time: %d\n", t4 - t3);
    }

    @Test
    void rewrite1() throws Exception {
        String query;
        Xquery xq = new Xquery();

        query = """
                for $a1 in doc("j_caesar_M3.xml")//ACT,
                $a2 in doc("j_caesar_M3.xml")//ACT,
                $a3 in doc("j_caesar_M3.xml")//ACT,
                $a4 in doc("j_caesar_M3.xml")//ACT,
                $sc1 in $a1//SCENE,
                $sc2 in $a2//SCENE,
                $sc3 in $a3//SCENE,
                $sc4 in $a4//SCENE,
                $sp4 in $sc4//SPEAKER/text(),
                $sp2 in $sc2//SPEAKER/text(),
                $sp1 in $sc1//SPEAKER/text(),
                $sp3 in $sc3//SPEAKER/text()
                where $sp1 = "FLAVIUS" and $sp1 eq $sp2 and $sp2 eq $sp3 and $sp3 eq
                $sp4 and $sc1 eq $sc2 and $sc2 eq $sc3 and $sc3 eq $sc4
                return <result> {
                <speaker>{$sp1}</speaker>,
                <scene>{$sc1/TITLE/text()}</scene>,
                <act1>{$a1/TITLE/text()}</act1>,
                <act2>{$a2/TITLE/text()}</act2>,
                <act3>{$a3/TITLE/text()}</act3>,
                <act4>{$a4/TITLE/text()}</act4>
                }</result>
                """;
//        long t1 = System.currentTimeMillis();
//        List<Node> result1 = xq.evaluate(query);
//        long t2 = System.currentTimeMillis();
//        System.out.printf("returned results: %d\n", result1.size());

        String rewritten = ReWriter.convert((QueryGrammarParser.ForXqContext)xq.parse(query).xq());
        String expected = """
                for $tuple in join (join (join (for $a1 in doc("j_caesar_M3.xml")//ACT,
                $sc1 in $a1//SCENE,
                $sp1 in $sc1//SPEAKER/text()
                where $sp1 = "FLAVIUS"
                return <tuple>{
                <a1>{$a1}</a1>,
                <sc1>{$sc1}</sc1>,
                <sp1>{$sp1}</sp1>
                }</tuple>,
                for $a2 in doc("j_caesar_M3.xml")//ACT,
                $sc2 in $a2//SCENE,
                $sp2 in $sc2//SPEAKER/text()
                return <tuple>{
                <a2>{$a2}</a2>,
                <sc2>{$sc2}</sc2>,
                <sp2>{$sp2}</sp2>
                }</tuple>,
                [sp1,sc1], [sp2,sc2]
                ),
                for $a3 in doc("j_caesar_M3.xml")//ACT,
                $sc3 in $a3//SCENE,
                $sp3 in $sc3//SPEAKER/text()
                return <tuple>{
                <a3>{$a3}</a3>,
                <sc3>{$sc3}</sc3>,
                <sp3>{$sp3}</sp3>
                }</tuple>,
                [sp2,sc2], [sp3,sc3]
                ),
                for $a4 in doc("j_caesar_M3.xml")//ACT,
                $sc4 in $a4//SCENE,
                $sp4 in $sc4//SPEAKER/text()
                return <tuple>{
                <a4>{$a4}</a4>,
                <sc4>{$sc4}</sc4>,
                <sp4>{$sp4}</sp4>
                }</tuple>,
                [sp3,sc3], [sp4,sc4]
                )
                return
                <result>{<speaker>{$tuple/sp1/*}</speaker>,<scene>{$tuple/sc1/*/TITLE/text()}</scene>,<act1>{$tuple/a1/*/TITLE/text()}</act1>,<act2>{$tuple/a2/*/TITLE/text()}</act2>,<act3>{$tuple/a3/*/TITLE/text()}</act3>,<act4>{$tuple/a4/*/TITLE/text()}</act4>}</result>""";
        assertEquals(expected, rewritten);
//        long t3 = System.currentTimeMillis();
//        List<Node> result2 = xq.evaluate(rewritten);
//        long t4 = System.currentTimeMillis();
//
//        assertEquals(result1.size(), result2.size());
//        System.out.printf("nested loop join time: %d\n", t2 - t1);
//        System.out.printf("hash join time: %d\n", t4 - t3);
    }
}