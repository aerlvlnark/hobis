package lt.vladas;

import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uzduotis4 {

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		out.println("Iveskite Pirma Skaitmeni");
		int sk1 = Integer.parseInt(input.readLine());
		out.println("Iveskite Antra Skaitmeni");
		int sk2 = Integer.parseInt(input.readLine());
		out.println("Iveskite Trecia Skaitmeni");
		int sk3 = Integer.parseInt(input.readLine());
		
		System.out.println("Didziausias Skaitmuo" + ": " + funkcija(sk1,sk2,sk3));
	}

	public static int funkcija(int a, int b, int c) {
		if (a > b)
			if (a > c)
				return a;
			else
				return c;
		else
			return b;
		}
	}