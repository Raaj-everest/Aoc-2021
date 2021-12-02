package com.everest.engineerng.day_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.Infinity;


public class Part_1 {

    public static void main(String[] args) throws FileNotFoundException {
        double previousDepth = Infinity;
        double depthIncreaseCount = 0;
        Scanner in = new Scanner(new FileReader("/Users/raaj/projects/aoc day1/src/com/everest/parking/input.txt"));
        while (in.hasNextLine()) {
            double currentDepth=in.nextDouble();
            if (currentDepth > previousDepth) {
                depthIncreaseCount++;
            }
            previousDepth = currentDepth;
            System.out.println(depthIncreaseCount);
        }

    }


}
