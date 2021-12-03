package com.everest.engineerng.day_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Part_1 {

        public static void main(String[] args) throws FileNotFoundException {
            // write your code here
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0;i < 12;i++) {
                int count0 =0;
                int count1=0;
                Scanner in = new Scanner(new FileReader("/Users/raaj/projects/Advent of code 2021/src/com/everest/engineerng/day_3/input.txt"));
                while (in.hasNextLine()) {
                    String input = in.nextLine();
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
                if(count0>count1){
                    ans.add(0);
                }else{
                    ans.add(1);
                }

            }
            System.out.println(ans);

        }

}
