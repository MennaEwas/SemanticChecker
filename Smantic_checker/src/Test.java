import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Test {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String prop = sc.nextLine();
        CharStream input =  CharStreams.fromString(prop);

        gLexer lexer = new gLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gParser parser = new gParser(tokens);
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);

        //listener
        ParseTreeWalker walker = new ParseTreeWalker();
        OurListener loader = new OurListener();
        walker.walk(loader, tree);

        //System.out.println(loader);

        OurVisitor visitor = new OurVisitor();
        visitor.visit(tree);

        //System.out.println(v);

    }
}
