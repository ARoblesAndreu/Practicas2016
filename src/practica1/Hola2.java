package practica1;
/** Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
import java.util.Scanner;

public class Hola2
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		int num ;				// variable numérica
		String nombre = "";		// variable de texto 
		
		//Configura y muestra mensaje de bienvenida
		num = 1 ;
		System.out.println("Hola, Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("Mi número de orden es el " + num + " por ser el primero.");

		//Pide nombre
		System.out.print("\nDíme tu nombre: ");
		
		nombre = teclado.nextLine();
		
		//Muestra mensaje personalizado
		System.out.println("\nBienvenido a Java. \n" + nombre + ", espero que lo pases bien...");
		
	}

}