package Regulars;

public class EmailContr {
    public boolean emailControlerSet (String arg){
        return arg.matches("\\w+@\\w+\\.(sk|cz|com|org)");
    }
}
