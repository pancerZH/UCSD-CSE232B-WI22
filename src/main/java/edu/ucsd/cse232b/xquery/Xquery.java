package edu.ucsd.cse232b.xquery;

import edu.ucsd.cse232b.expression.AbsolutePath;
import edu.ucsd.cse232b.parsers.QueryGrammarLexer;
import edu.ucsd.cse232b.parsers.QueryGrammarParser;
import edu.ucsd.cse232b.query.Query;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Xquery {
    public Xquery() throws ParserConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
        this.mockDocument = documentBuilder.newDocument();
    }

    public List<Node> evaluate(String path) throws Exception {
        final QueryGrammarLexer lexer = new QueryGrammarLexer(CharStreams.fromString(path));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final QueryGrammarParser parser = new QueryGrammarParser(tokens);
        final ParserRuleContext tree = parser.xq();
        QueryBuilder qb = new QueryBuilder(this.mockDocument);
        final Query root = qb.visit(tree);
        return root.evaluate(this.mockDocument);
    }

    public void transform(List<Node> result) throws Exception{
        TransformerFactory tfFactory = TransformerFactory.newInstance();
        Transformer tf = tfFactory.newTransformer();
        tf.setOutputProperty(OutputKeys.INDENT, "yes");
        for (Node n: result) {
            if(n instanceof Attr) {
                System.out.println(n.getTextContent());
            } else if (n instanceof Text) {
                System.out.println(n.getTextContent());
            } else {
                tf.transform(new DOMSource(n), new StreamResult(
                        new PrintStream(System.out)));
            }
        }
    }

    final private Document mockDocument;
}
