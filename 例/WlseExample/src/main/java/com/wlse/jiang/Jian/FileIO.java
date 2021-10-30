package com.wlse.jiang.Jian;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.wlse.jiang.jichu.Example;

public class FileIO {    
	public static void main(String[] arg) {
		try {
			BufferedReader in = new BufferedReader(
					new FileReader("Example.in"));
			BufferedWriter out = new BufferedWriter(
					new FileWriter("Example.out"));

            Example m = new Example();
			m.jieti(in, out);

			in.close();
			out.close();
		} catch (FileNotFoundException e1) {
		} catch (IOException e) {
		}
	}
}
