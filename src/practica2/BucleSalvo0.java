package practica2;

import java.util.Scanner;

public class BucleSalvo0 {
	public static void main(String argumentos[]) {
		//Usamos un teclado especifico para los números y otro para la letra T
		Scanner teclado = new Scanner(System.in);
	
		// Variables
		String mensaje;
		int valorEntrada = 0;
		int temp;
		int sumaTotal = 0;
		double mediaArit;
		mensaje = "Este programa lee numeros enteros, luego lo suma y saca su media aritmetica. Pulse 0 para terminar:";
		System.out.println(mensaje);

		//bucle do while
		do {

			System.out.print("Introduce un entero: ");
			temp = teclado.nextInt();

			sumaTotal += temp;

			if (temp != 0)
				valorEntrada++;

		} while (temp != 0);

		// Cierra el canal de entrada por teclado.
		teclado.close();

		// Calculo de la media aritmética de los enteros introducidos.
		if (valorEntrada == 0)
			mediaArit = 0;
		else
			mediaArit = (double) sumaTotal / valorEntrada;

		// Se muestra por pantalla el resultado esperado.
		System.out.println("\nLa suma total es: " + sumaTotal + ".");
		System.out.println("El número total de enteros, distintos de cero, es: " + valorEntrada + ".");
		System.out.println("La media aritmética es: " + mediaArit + ".");
	}
}
