package com.everest.engineerng.day_6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Part_1 {
    public static void main(String[] args) throws FileNotFoundException {
        long[] fishes = new long[9];
        Scanner in = new Scanner(new FileReader("/Users/raaj/projects/Advent of code 2021/src/com/everest/engineerng/day_6/input.txt"));
        String[] input = in.nextLine().split(",");
        in.close();
        for (String fish : input) {
            fishes[Integer.parseInt(fish)]++;
        }

        for (int day = 1; day <= 256; day++) {
            long fishOnThatDay = fishes[0];
            System.arraycopy(fishes, 1, fishes, 0, fishes.length - 2 + 1);
            fishes[6] += fishOnThatDay;
            fishes[8] = fishOnThatDay;  //newborn fish
        }

        long count = 0;
        for (long totalFish : fishes) {
            count += totalFish;
        }
        System.out.println(count);
    }

}

