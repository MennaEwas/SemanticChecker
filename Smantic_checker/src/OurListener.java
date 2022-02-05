import java.util.*;

public class OurListener extends gBaseListener {
    public static Boolean main_found = false;
    @Override
    public void enterMethod_decl(gParser.Method_declContext ctx) {
        if (main_found){System.out.println("Error, method found after main. it couldn't be executed");}
        else{
            if(ctx.type().size() == 0){
                if(ctx.ID().size() == 1){
                    if (Objects.equals(ctx.ID().get(0).toString(), "main")){
                        main_found = true;
                    }
                }
            }
        }

    }


    @Override
    public void exitProgram(gParser.ProgramContext ctx) {
        //check if there is at least one main among the non-type
        if (!(main_found)){
            System.out.println("There is no main in the program"); //exceptions in Java
        } //list of all the IDs in the method_declaration
    }

}
