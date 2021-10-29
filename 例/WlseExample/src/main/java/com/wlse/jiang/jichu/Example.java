package com.wlse.jiang.jichu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

// 讲解的基础例子
// 包涵封装输入输出（使用系统的输入输出，可以方便地替换成使用文件作为输入输出），测试驱动的演示。

public class Example {
	public void jieti(BufferedReader in, BufferedWriter out) throws IOException {
		int a = 0, b = 0;

		// 输入
		String[] params = in.readLine().split(" ");
		a = Integer.parseInt(params[0]);
		b = Integer.parseInt(params[1]);

		// 运算
		Integer ans = a + b;

		// 输出
		out.write(ans.toString());
	}
}
