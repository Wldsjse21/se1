package com.wlse.jiang.shulie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Baoli {
    public static void main(String[]arg) {
        try {
            BufferedReader in = new BufferedReader(
                new FileReader("shulie.in"));
            BufferedWriter out = new BufferedWriter(
                new FileWriter("baoli.out"));

            int n = Integer.parseInt(in.readLine());
            int sum = 0;

            sum = n * (n + 1) / 2;
            out.write(sum + "\n"); 

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
