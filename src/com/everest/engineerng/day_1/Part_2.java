package com.everest.engineerng.day_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new FileReader("/Users/raaj/projects/aoc day1/src/com/everest/parking/input.txt"));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (in.hasNextLine()) {

            nums.add(in.nextInt());
        }
        int previousSum = (int) (nums.get(0) + nums.get(1) + nums.get(2));
        int depthIncreaseCount = 0;
        for (int i = 3; i < nums.size(); i++) {
            int currentSum = previousSum + (int) (nums.get(i) - nums.get(i - 3));
            if (currentSum > previousSum) {
                depthIncreaseCount++;
            }
            previousSum = currentSum;
        }
        System.out.println(depthIncreaseCount);

    }
}
