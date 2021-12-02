package com.everest.engineerng.day_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        Scanner in = new Scanner(new FileReader("/Users/raaj/projects/aocDay-2/src/com/everest/engineerng/input.txt"));
        int forward = 0;
        int depth = 0;
        int aim = 0;
        while (in.hasNextLine()) {

            String input = in.nextLine();
            String[] split = input.split(" ");
            switch (split[0]) {
                case "forward":
                    forward += Integer.parseInt(split[1]);
                    depth += aim*Integer.parseInt(split[1]);
                    break;
                case "down":
                    aim += Integer.parseInt(split[1]);
                    break;
                case "up":
                    aim -= Integer.parseInt(split[1]);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + split[0]);
            }
        }
        System.out.println(forward);
        System.out.println(depth);
        int answer = forward * depth;
        System.out.println(answer);
    }
}
