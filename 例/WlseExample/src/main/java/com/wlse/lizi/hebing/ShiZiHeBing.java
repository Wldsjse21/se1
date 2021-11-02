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

		final int DaShu = 0x3f3f3f3f;
		// 石子堆数		
		int duiShu = Integer.parseInt(in.readLine());
		int shiZiShu[] = new int[duiShu + 1];
		String[] duRu = in.readLine().split(" ");
		for(int i=0;i<duiShu;i++)
			shiZiShu[i] = Integer.parseInt(duRu[i]);

		// 运算

        // 算出前面石子的总数
        int[] shiZiHe = new int[duiShu + 1];
        for (int i = 1; i <= duiShu; i++)
            shiZiHe[i] = shiZiHe[i-1] + shiZiShu[i-1];

        // 使用矩阵运算，求得最小和最大得分
		int zuiXiao[][] = new int[duiShu + 1][duiShu + 1];
		int zuiDa[][] = new int[duiShu + 1][duiShu + 1];
		// 分段点，长度
        for (int chang = 2; chang <= duiShu; chang++)
			// 行
            for (int i = 1; i <= duiShu - chang + 1; i++) {
				// 列
				int j = chang + i - 1;
                zuiXiao[i][j] = DaShu;
				// 动态变量
                for (int k = i; k < j; k++) {
                    zuiXiao[i][j] = Math.min(zuiXiao[i][j], zuiXiao[i][k] + zuiXiao[k+1][j] + shiZiHe[j] - shiZiHe[i-1]);
                    zuiDa[i][j] = Math.max(zuiDa[i][j], zuiDa[i][k] + zuiDa[k+1][j] + shiZiHe[j]-shiZiHe[i-1]);
				}
			}

		// 输出
		Integer xiaoShu = zuiXiao[1][duiShu];
		out.write(xiaoShu.toString() + "\n");
		Integer daShu = zuiDa[1][duiShu];
		out.write(daShu.toString() + '\n');
	}

	public static void main(String[] arg) {
		Main.main(arg);
	}
}
