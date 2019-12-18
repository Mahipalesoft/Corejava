import java.util.*;
import java.io.*;

public class Readfromkeyboard {
	
	public static void main(String [] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(ir);
		System.out.println("Enter your name");
		String  name =br.readLine();
		System.out.println(name);
	}

}
