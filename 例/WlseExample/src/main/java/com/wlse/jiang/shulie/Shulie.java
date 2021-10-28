package com.wlse.jiang.shulie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Shulie {
    public static void main(String[]arg) {
        try {
            BufferedReader in = new BufferedReader(
                new FileReader("shulie.in"));
            BufferedWriter out = new BufferedWriter(
                new FileWriter("shulie.out"));

            int n = Integer.parseInt(in.readLine());
            int sum = 0;

            for(int i = 1; i <= n; i++){
                sum += i;
            }
            out.write(sum + "\n"); 

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
