package com.wlse.shulie;

import java.util.Scanner;

public class Main {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.print(sum + "\n"); 
        sc.close();
    }

}
