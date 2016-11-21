package practica2;

/**Esto es un comentario que no afecta al programa
 * Sirve para aclarar que hace este programa
 * 
 * Programa que muestra un mensaje por pantalla
 * Alvaro Robles Andreu 1ÂºDAW 
 */
import java.lang.Math;
import java.util.Scanner;

//Encabezado de la clase principal del programa
public class CapitalFinal {

	// Operaciones que realiza el programa
	public static void main(String argumentos[]) {
		Scanner teclado = new Scanner(System.in);
		double Cf;
		double Ci;
		double r;
		int n;

		System.out.println("Introduzca el Capital Inicial:");
		Ci = teclado.nextDouble();

		System.out.println("Introcuzca el interes anual en tanto por uno:");
		r = teclado.nextDouble();

		System.out.println("Introduzca el número de años:");
		n = teclado.nextInt();

		Cf = Ci * Math.pow(1 + r, n);

		System.out.println("El capital final es: " + Cf);
	}
}
