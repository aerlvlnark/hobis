package lt.vladas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uzduotis2 {

	static int a;
	static int b;
	
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
		a = Integer.parseInt(input.readLine());
		b = Integer.parseInt(input.readLine());
		
		
		funkcija();
		
		// spausdinti a ir b 
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void funkcija() {
		
		int c = a;
		a = b;
		b = c;
	
	}

}
