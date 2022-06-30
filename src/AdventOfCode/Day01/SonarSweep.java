package AdventOfCode.Day01;

public class SonarSweep {
    public void howManyIncrements(String arg){
        int increments = 0;
        boolean first = true;
        int a=0;
        int b;
        String [] arrayRay = arg.split("\\n");
        for (String s :arrayRay){
       b = Integer.parseInt(s);
       if (first){
           a = b;
           first=false;
       }
       if (a<b)
           ++increments;
       a = b;
        }
        System.out.println(increments);
    }
}
