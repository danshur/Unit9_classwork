import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSomething();
	}
	public static void doSomething() {
	    try {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      String input = br.readLine();
	      while (input != null) {
	        bw.write(input);
	        bw.flush();
	        input = br.readLine();
	      }
	    } catch (IOException io) {
	      io.printStackTrace();
	    }
	  }

}
