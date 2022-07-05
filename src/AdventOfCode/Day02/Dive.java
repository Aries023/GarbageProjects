package AdventOfCode.Day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dive {
    public static void main(String[] args) throws FileNotFoundException {
        // basic informations (variables)
        int forward = 0;
        int down = 0;
        int up = 0;

        // making stream for data
        String filePath = "src/AdventOfCode/Day02/day2.txt"; // path
        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        // separate text in every line and take values to right variables
        while (sc.hasNext()){ // loop..
            String text = sc.nextLine(); // take line
            String s = text.replaceAll("\\s[0-9]",""); // split text from number and give it to variable s
            int i = Integer.parseInt(text.replaceAll("[^0-9]","")); // split numbers from text and give it to variable i

            // separate value to right variables
            switch (s) {
                case "forward" -> forward += i;
                case "down" -> down += i;
                case "up" -> up += i;
            }
        }
        System.out.println("forward: " + forward);
        System.out.println("down: " + down);
        System.out.println("up: " + up);

        int depht = down -up; // if its negative, your submarine is above the sea...

        System.out.println("depht: " + depht);
        System.out.println("Answer part one: " + (depht * forward)); // answer part one
    }
}
