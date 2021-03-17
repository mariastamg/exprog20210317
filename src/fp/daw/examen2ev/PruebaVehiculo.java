package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaVehiculo {

	static int numDias;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Coche c1 = new Coche("0001", 4);
		Microbus m1 = new Microbus("0002", 18);
		Furgoneta f1 = new Furgoneta("0003", 20);
		Camion k1 = new Camion("0004", 150);

		ArrayList<Vehiculo> vehiculos = new ArrayList();
		vehiculos.add(c1);
		vehiculos.add(m1);
		vehiculos.add(f1);
		vehiculos.add(k1);

		System.out.print("Introduzca el numero de días de alquiler del vehiculo:");
		numDias = sc.nextInt();

		for (Vehiculo v : vehiculos) {
			System.out.println(v.getPrecioAlquiler(numDias));
		}
		

	}

}
