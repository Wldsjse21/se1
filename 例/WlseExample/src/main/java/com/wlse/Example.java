package com.wlse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
	public static void main(String[] arg) {
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("Example.in"));
			BufferedWriter out = new BufferedWriter(
					new FileWriter("Example.out"));
			int a = 0, b = 0;

			String[] params = in.readLine().split(" ");
			a = Integer.parseInt(params[0]);
			b = Integer.parseInt(params[1]);
			Integer ans = a + b;
			out.write(ans.toString());

			in.close();
			out.close();
		} catch (FileNotFoundException e1) {
		} catch (IOException e) {
		}
	}
}
