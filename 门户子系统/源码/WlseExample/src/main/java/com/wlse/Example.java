package com.wlse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
	public static void main(String[] arg) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;

		try {
			String[] params = in.readLine().split(" ");
			a = Integer.parseInt(params[0]);
			b = Integer.parseInt(params[1]);
			System.out.print(a + b);
		} catch (NumberFormatException | IOException e) {
		}
	}
}
