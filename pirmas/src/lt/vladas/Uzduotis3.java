package lt.vladas;

import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uzduotis3 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		out.println("Iveskite Pirma Skaitmeni");
		int sk1 = Integer.parseInt(input.readLine());
		out.println("Iveskite Antra Skaitmeni");
		int sk2 = Integer.parseInt(input.readLine());
		
		System.out.println("Rezultatas" + ": " + funkcija(sk1,sk2));
		

	}

	public static int funkcija(int a, int b) {
		if (a > b)
			return a;
		else
			return b;

	}

}
