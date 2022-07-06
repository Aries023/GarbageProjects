package AdventOfCode.Day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryDiagnostic {
    /**
     Taking into account only the first char of each row (find the most common value) and put it in the field,
     then take the second char each line.. and the next one and the next one until you get to the end of the line.
     give most common values into line and get binare number (gama rate) and  also the less common values, they reprezent (epsilon rate)

     Multiplying the gamma rate (in decimal) and epsilon rate to find out how much produces the power consumption.
     */

    public static void main(String[] args) throws FileNotFoundException {

        // binari data stream
        String path = "src/AdventOfCode/Day03/day3.txt";
        File file = new File(path);
        Scanner sc = new Scanner(file);

        int[] finalBinar = new int[12]; // there will be final values
        int[] gamaRate = new int[12]; // there will be final values
        int[] epsilonRate = new int[12]; // there will be final values

        // look in all the rows,  all chars to find out the most common values in the horizontal position and put them in the field
        while (sc.hasNext()){
            String text = sc.nextLine();
            for (int a=0; a<12; a++){

                // if char is 1
                if((text.charAt(a))=='1'){
                    finalBinar[a] += 1;

                    // char is 0
                }else {
                    finalBinar[a] -= 1;
                }
            }
        }

        for (int a=0; a<finalBinar.length; a++){
            if (finalBinar[a]>0){
                gamaRate[a]=1;
                epsilonRate[a]=0;
            }else {
                gamaRate[a]=0;
                epsilonRate[a]=1;
            }
        }
        StringBuilder gamaString= new StringBuilder();
        StringBuilder epsilonString= new StringBuilder();

        // take values from array and give it into one line String
        for(int a =0; a<12;a++){
            gamaString.append(gamaRate[a]);
            epsilonString.append(epsilonRate[a]);
        }
        // convert String binary to int decimal..
        int a = Integer.parseInt(gamaString.toString(),2);
        int b = Integer.parseInt(epsilonString.toString(),2);

        System.out.println(gamaString + " in decimal " + a);
        System.out.println(epsilonString + "in decimal " +b);
        System.out.println("answer is: " + (a*b)); // answer
    }
}
