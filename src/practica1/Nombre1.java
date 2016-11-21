/** Programa que pregunta la edad y el nombre de dos usuarios
 *  Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica1;

import java.util.Scanner;

public class Nombre1
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		String nombre = "";		// variable de texto 
		String edad = ""; 				// variable edad
		String nombre2 = "";
		String edad2 = "";
		
		//Configura y muestra mensaje de bienvenida
		System.out.println("Hola, usuario1 ");
		System.out.println("Dime tu nombre y edad");

		//Pide nombre
		System.out.print("\nNombre Usuario1: ");
		
		nombre = teclado.nextLine();
		
		//Pide edad
		System.out.print("\nEdad Usuario1: ");
		
		edad = teclado.nextLine();
		
		//Pide nombre2
		System.out.println("\nNombre Usuario2: ");
		
		nombre2 = teclado.nextLine();
		
		//Pide edad2
		System.out.println("\nEdad Usuario2: ");
		
		edad2 = teclado.nextLine();
		
		//Muestra mensaje personalizado
		System.out.println("El Usuario1 se llama " + nombre + " y tiene " + edad + " años");
		
		System.out.println("El Usuario2 se llama " + nombre2 + " y tiene " + edad2 + " años");
	}

}