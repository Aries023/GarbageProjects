package AdventOfCode.Day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DivePartTwo {
    public static void main(String[] args) throws FileNotFoundException {
        // basic informations (variables)
        int forward = 0;
        int down = 0;
        int depht = 0;

        // making stream for data (text file)
        String filePath = "src/AdventOfCode/Day02/day2.txt"; // path
        File file = new File(filePath); // path into object file
        Scanner sc = new Scanner(file); // load file into Scanner

        // separate text in every line and take values to right variables
        while (sc.hasNext()){ // loop.. (if there is another line)
            String text = sc.nextLine(); // take line into "text"
            String s = text.replaceAll("\\s[0-9]",""); // split text from number and give it to variable "s"
            int i = Integer.parseInt(text.replaceAll("[^0-9]","")); // split numbers from text and give it to variable "i" (in int)

            // separate value to right variables
            switch (s) {
                case "forward" -> {
                    forward += i;
                    depht += down * i;  // every time you go forward, you are also going to depht
                }
                case "down" -> down += i;
                case "up" -> down -= i; // just negate down
            }
        }
        System.out.println("forward: " + forward);
        System.out.println("down: " + down);
        System.out.println("depht: " + depht);
        System.out.println("Answer part two: " + (depht * forward)); // answer part two
    }
}
