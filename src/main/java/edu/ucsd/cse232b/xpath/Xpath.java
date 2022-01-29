package edu.ucsd.cse232b.xpath;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import edu.ucsd.cse232b.expression.AbsolutePath;
import edu.ucsd.cse232b.expression.Expression;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import edu.ucsd.cse232b.parsers.ExpressionGrammarLexer;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

public class Xpath {
    public Xpath() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        this.documentBuilder = dbf.newDocumentBuilder();
    }

    public List<Node> evaluate(String path) throws Exception {
        final ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(CharStreams.fromString(path));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final ExpressionGrammarParser parser = new ExpressionGrammarParser(tokens);
        final ParserRuleContext tree = parser.ap();
        final ExpressionBuilder expBuild = new ExpressionBuilder();
        final Expression rootExp =expBuild.visit(tree);

        AbsolutePath apExp = (AbsolutePath)rootExp;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(apExp.getDoc());
        Document doc = documentBuilder.parse(is);

        List<Node> inputNodes = new ArrayList<>();
        inputNodes.add(doc);

        return apExp.evaluate(inputNodes);
    }

    public void transform(List<Node> result) throws Exception{
        TransformerFactory tfFactory = TransformerFactory.newInstance();
        Transformer tf = tfFactory.newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        for (Node n: result) {
            if(n instanceof Attr) {
                n = ((Attr) n).getOwnerElement();
            }
            tf.transform(new DOMSource(n), new StreamResult(
                    new PrintStream(System.out)));
        }
    }

    final private DocumentBuilder documentBuilder;
}
