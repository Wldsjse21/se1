package com.wlse.lizi.hebing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/*
石子合并<1>
时间限制：1秒        内存限制：128M
题目描述
     有N堆石子排成一排(n<=100),现要将石子有次序地合并成一堆，
	 规定每次只能选相邻的两堆合并成一堆，并将新的一堆的石子数，
	 记为该次合并的得分，编一程序，输入为堆数n及每堆石子数(<=200)；

（1）选择一种合并石子的方案，使得做n-1次合并，得分的总和最少

（2）选择一种合并石子的方案，使得做n-1次合并，得分的总和最多

输入描述
第一行为石子堆数n
第二行为每堆石子数，每两个数之间用一空格分隔。

输出描述
第一行为合并得分的最小值

第二行为合并得分的最大值

样例
输入
4
4 5 9 4
输出
44
54

3
4 5 9 
*/

public class ShiZiHeBing {
	public void jieti(BufferedReader in, BufferedWriter out) throws IOException {
		// 输入
		final int Num = 20;
		final int N = 0x3f3f3f3f;
		int a[] = new int[Num + 1];
		// 石子堆数		
		int n = Integer.parseInt(in.readLine());
		String[] params = in.readLine().split(" ");
		for(int i=0;i<n;i++)
			a[i] = Integer.parseInt(params[i]);

		// 运算

        // 算出石子总数
        int[] sum = new int[Num + 1];
        for (int i = 1; i < Num; i++)
            sum[i] = sum[i-1] + a[i-1];

        // 使用矩阵运算，求得最小和最大得分
		int f1[][] = new int[Num + 1][Num + 1];
		int f[][] = new int[Num + 1][Num + 1];
        for (int len = 2; len <= n; len++)
            for (int i = 1; i < n - len + 2; i++) {
				int j = len + i - 1;
                f1[i][j] = N;
                for (int k = i; k < j; k++) {
                    f1[i][j] = Math.min(f1[i][j], f1[i][k] + f1[k+1][j] + sum[j] - sum[i-1]);
                    f[i][j] = Math.max(f[i][j], f[i][k] + f[k+1][j] + sum[j]-sum[i-1]);
				}
			}

		// 输出
		Integer ii = f1[1][n];
		out.write(ii.toString() + "\n");
		ii = f[1][n];
		out.write(ii.toString() + '\n');
	}
}
