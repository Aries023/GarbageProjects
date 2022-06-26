package Regulars;

public class EmailContr {

    // this method control if is email in correct secvence
    public boolean emailControlerSet (String arg){
        return arg.matches("\\w+@\\w+\\.(sk|cz|com|org)");
    }

    // control if password got one or more numbers, uppercase char and if password length is more them 8 chars
    public boolean emailPasswordCont(String arg){
        return arg.matches(".*\\d.*") && arg.matches(".*[A-Z].*") && arg.length()>=7;
    }

    // control if its image and if its in correct format
    public boolean imageContr(String arg){
        return arg.matches("\\w+\\.(jpg|png|jpeg|bmp)");
    }

    // control if its date in correct format dd/mm/yyyy
    public boolean dateContr(String arg){
        return arg.matches("([1-2][0-9]|3[01]|0?[1-9])/(0?[1-9]|1[0-2])/\\d{4}");
    }
}
