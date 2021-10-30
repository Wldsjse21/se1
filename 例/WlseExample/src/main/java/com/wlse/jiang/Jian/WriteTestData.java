package com.wlse.jiang.Jian;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WriteTestData {
	final static int N = 10000;
	final static int Z_Len = 0;

	public static void main(final String args[]){
		try {
			final BufferedWriter out = new BufferedWriter(
					new FileWriter("Calculator.in"));
			
			final Random r = new Random();
			Integer ii = 0;
			ii = Math.abs(r.nextInt()%N);
			out.write(ii.toString());
			out.write(" ");
			ii = Math.abs(r.nextInt()%N);
			out.write(ii.toString());

			out.close();
		} catch (final IOException e) {
		}
	}
}
