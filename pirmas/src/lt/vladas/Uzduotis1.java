package lt.vladas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uzduotis1 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Iveskite" );
		String pirmas = input.readLine();
		String antras = input.readLine();
		String trecias = input.readLine();
		System.out.println( trecias);
		System.out.println( antras);
		System.out.println( pirmas);
		

	}

}
