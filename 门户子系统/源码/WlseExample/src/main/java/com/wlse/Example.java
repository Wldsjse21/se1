import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main() {
		int sum = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		int b = 0;
		
		try {
			a = new Integer(in.readLine());
			b = new Integer(in.readLine());
		} catch (IOException e) {
		}
		
		System.out.print(a + b);
		return ;
	}
}