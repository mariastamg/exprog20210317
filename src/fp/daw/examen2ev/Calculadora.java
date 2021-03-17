package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Throwable;

public class Calculadora {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		in.readLine();
		System.out.println("calculadora >");
		while (!(linea = in.readLine()).equalsIgnoreCase("fin")) {
			calcular(linea);
			System.out.println("calculadora > ");
		}
	}

	static void calcular(String linea) throws ArithmeticException {
		Scanner s = new Scanner(linea);
		char[] resultadoNum;
		resultadoNum = linea.toCharArray();
		for (int i = 0; i < resultadoNum.length; i++) {
			char operando1, operador, operando2, espacio1, espacio2;
			operando1 = resultadoNum[0];
			espacio1 = resultadoNum[1];
			operador = resultadoNum[2];
			espacio2 = resultadoNum[3];
			operando2 = resultadoNum[4];
			

		}

	}
}
			

		
		
		
	
	




