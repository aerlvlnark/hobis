package lt.vladas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Skaiciai {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.println( "Iveskite" ); 
//	 	String l = input.readLine();
//	 	System.out.println( "Jus ivedete:" + l );
	 	String skStr= input.readLine();
	 	int sk = Integer.parseInt( skStr );
	 	System.out.println( "Ivestas skaicius " + sk);
		
	}

}
