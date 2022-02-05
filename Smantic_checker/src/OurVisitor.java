import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.*;
public class OurVisitor extends gBaseVisitor<Void> {
    public static List<String> L = new ArrayList<String>(); //creating new Nodes
    @Override
    public Void visitVar_decl(gParser.Var_declContext ctx) {
       // L.addAll((List<String>)ctx.ID());
        for(TerminalNode s : ctx.ID()) {
            if (s != null){
            L.add(s.toString()); } }
        return visitChildren(ctx);
    }
    @Override
    public Void visitField_decl(gParser.Field_declContext ctx) {
        for(TerminalNode s : ctx.ID()) {
            if (s != null) {
                L.add(s.toString());
            }
        }
            for(TerminalNode i : ctx.Int_literal()){
                long array_length = 0;
                if (i.toString().startsWith("0x")){
                    array_length = Long.parseLong(i.toString().substring(2), 16);}
                else{
                    array_length = Long.parseLong(i.toString(), 10);
                }
                if (array_length <= 0){
                        System.out.println("Error, Arrays length should be greater than 0");
                }

            }


        return visitChildren(ctx); }

    // from statement compare each ID
    @Override
    public Void visitStatement(gParser.StatementContext ctx) {
        if (ctx.ID() != null){
            L.add(ctx.ID().toString()); }
        //check if the ID declared before use
        /*if (ctx.ID() != null){
           if(!(L.contains(ctx.ID().toString()))){
                System.out.println("Undeclared Symbol: " + ctx.ID().toString()); //exceptions in Java
            }
        }*/
        return visitChildren(ctx);
    }
    //omit from the block
    @Override
    public Void visitLocation(gParser.LocationContext ctx) {
        if (ctx.ID() != null){
        if(!(L.contains(ctx.ID().toString()))){
            System.out.println("Undeclared Symbol: " + ctx.ID().toString()); //exceptions in Java
        }
        }

        return visitChildren(ctx);
    }
}