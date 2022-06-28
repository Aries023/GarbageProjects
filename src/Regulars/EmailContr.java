package Regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailContr {

    Pattern pattern;
    Matcher matcher;

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


    // print all words with starts uppercase char..
    public void upperCase(String arg){
        pattern = Pattern.compile("\\b[A-Z]\\w+\\b");
        matcher = pattern.matcher(arg);

        // did i find a uppercase start word?
        boolean found = false;

        // if there is uppercase start word in text (arg)
        while (matcher.find()){
            System.out.println("i find word: " + matcher.group());  // the word
            found = true;  // yes i find one or more
        }

        //if i dont find a uppercase start word..
        if (!found){
            System.out.println("there is no first uppercase word");
        }
    }

    // this metod will find all numbers in text
    public void numbersInText(String arg){
        pattern = Pattern.compile("\\d+"); // not only one but groups numbers
        matcher = pattern.matcher(arg);

        // is there number?
        boolean found = false;

        // all the time when i find number..
        while (matcher.find()){
            System.out.println("numero: " + matcher.group());
            found = true;
        }
        // if there is no one number
        if (!found){
            System.out.println("there is no one number!");
        }
    }

}
