/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;

import java.util.Scanner;

public class CuadradoAsteriscos
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		int lado;
		System.out.print("Introduce el lado del cuadrado: ");
		lado = teclado.nextInt();
		System.out.print("\n");

		for (int i = 1; i <= lado; i++) {

			System.out.print("\t*");
			for (int j = 2; j < lado; j++)
				if ((i == 1) || (i == lado))
					System.out.print(" *");
				else
					System.out.print("  ");
			System.out.println(" *");
		
		}
	}
}





