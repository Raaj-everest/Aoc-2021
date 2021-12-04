package com.everest.engineerng.day_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();

        Scanner in = new Scanner(new FileReader("/Users/raaj/projects/Advent of code 2021/src/com/everest/engineerng/day_3/input.txt"));
        while (in.hasNextLine()) list.add(in.nextLine());
        in.close();

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            int count0 = 0;
            int count1 = 0;
            int mostCommon;
            for (int k = 0; k < list.size(); k++) {
                String input = list.get(k);
                String[] split = input.split("");
                if (Integer.parseInt(split[i]) == 0) {
                    count0++;
                }
                if (Integer.parseInt(split[i]) == 1) {
                    count1++;
                }
            }
            System.out.println(count0);
            System.out.println(count1);
            if (count0 > count1) {
                mostCommon = 0;
            } else {
                mostCommon = 1;
            }


            System.out.println(mostCommon);
            for (int l = 0; l < list.size(); l++) {
                if (Integer.parseInt(String.valueOf(list.get(l).charAt(i))) == mostCommon) {
                    ans.add(list.get(l));
                }
            }
            System.out.println("hi");
            list = new ArrayList<>(ans);
            ans.clear();
            if (list.size() == 1) {
                break;
            }

        }
        System.out.println(list);
        list.clear();

        in = new Scanner(new FileReader("/Users/raaj/projects/Advent of code 2021/src/com/everest/engineerng/day_3/input.txt"));
        while (in.hasNextLine()) list.add(in.nextLine());
        in.close();

        for (int i = 0; i < 12; i++) {
            int count0 = 0;
            int count1 = 0;
            int mostCommon;
            for (int k = 0; k < list.size(); k++) {
                String input = list.get(k);
                String[] split = input.split("");
                if (Integer.parseInt(split[i]) == 0) {
                    count0++;
                }
                if (Integer.parseInt(split[i]) == 1) {
                    count1++;
                }
            }
            System.out.println(count0);
            System.out.println(count1);
            if (count1 < count0) {
                mostCommon = 1;
            } else {
                mostCommon = 0;
            }
            System.out.println(mostCommon);
            if (list.size() == 1) {
                break;
            }
            for (int l = 0; l < list.size(); l++) {
                if (Integer.parseInt(String.valueOf(list.get(l).charAt(i))) == mostCommon) {
                    ans.add(list.get(l));
                }
            }
            System.out.println("hi");
            list = new ArrayList<>(ans);
            System.out.println(list);
            ans.clear();
            if (list.size() == 1) {
                break;
            }

        }
        System.out.println(list);


    }
}
