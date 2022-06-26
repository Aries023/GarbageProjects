package Regulars;

public class EmailContr {
    public boolean emailControlerSet (String arg){
        return arg.matches("\\w+@\\w+\\.(sk|cz|com|org)");
    }

    public boolean emailPasswordCont(String arg){
        return arg.matches(".*\\d.*") && arg.matches(".*[A-Z].*") && arg.length()>=7;
    }
}
