package AdventOfCode.Day01;

public class SonarSweep {
    public void howManyIncrements(String arg){

        int increments = 0;  // how many increments
        boolean first = true; // if i found first number ( int b is not inicialized yet)

        int a=0; // last number
        int b; // actual number

        // spilit String lines and put it into array (pole)
        String [] arrayRay = arg.split("\\n");

        for (String s :arrayRay){
       b = Integer.parseInt(s); // parase String to int, there could be a ERROR!! its not into try/catch

            // if you get first number
       if (first){
           a = b;
           first=false;
       }
       // if actual number is bigest then last, increment ++
       if (a<b)
           ++increments;

       a = b; // actual number become to last number
        }
        System.out.println(increments);
    }
}
