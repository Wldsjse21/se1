import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inStr = "";

		try {
			int a = 0;
			int b = 0;
			inStr = in.readLine();
			String[] params = inStr.split(" "); 
			a = Integer.parseInt(params[0]);
			b = Integer.parseInt(params[1]);
	        System.out.print(a + b);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}