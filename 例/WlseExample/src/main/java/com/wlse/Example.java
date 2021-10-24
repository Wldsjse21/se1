package com.wlse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example {
	public static void main(String[] arg) {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(System.out));
		int a = 0, b = 0;

		try {
			String[] params = in.readLine().split(" ");
			a = Integer.parseInt(params[0]);
			b = Integer.parseInt(params[1]);
			Integer ans = a + b;
			out.write(ans.toString());
		} catch (IOException e) {
		}
	}
}
