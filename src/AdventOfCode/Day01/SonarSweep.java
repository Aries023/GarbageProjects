package AdventOfCode.Day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SonarSweep {
    public static void main(String[] args) throws FileNotFoundException {

        int a = 0; // last number
        int b; // actual number
        int increments = 0;
        boolean first = true; // if its first time

        // make a path into String fileName
        String fileName = "C:\\Users\\Peter\\IdeaProjects\\GarbageProjects\\src\\AdventOfCode\\Day01\\day1.txt";

        // input path to File object..
        File fileIn = new File(fileName);

        // input File object to Scanner
        Scanner sc = new Scanner(fileIn);

        while (sc.hasNext()){
            b = sc.nextInt(); // every round b take another line number
            // if its first round (a is 0 soo i its take b value becose a = b is not a < b) so its dont take increment first time..
            if (first){
                a = b;
                first= false;
            }
            // if acrual numeber is bigest then last
            if (a<b){
                ++increments; // add increment
            }
            a = b;
        }
        System.out.println(increments);
    }
}
