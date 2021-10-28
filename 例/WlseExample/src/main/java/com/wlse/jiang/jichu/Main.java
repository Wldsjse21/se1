package com.wlse.jiang.jichu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {    
	public static void main(String[] arg) {
		try {
            // 初始化输入输出
            BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
    		BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(System.out));

            // 解题
            Example m = new Example();
			m.jieti(in, out);

            // 退出前，清理
			in.close();
			out.close();
		} catch (FileNotFoundException e1) {
		} catch (IOException e) {
		}
	}
}
