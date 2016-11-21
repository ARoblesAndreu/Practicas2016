/** Programa que pregunta el nombre de un usuario
 *  Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;

import java.util.Scanner;

public class Nombre
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		String nombre = "";		// variable de texto 
		
		//Configura y muestra mensaje de bienvenida
		System.out.println("Hola, usuario ");
		System.out.println("Dime tu nombre: ");
        //Pide nombre
		
		nombre = teclado.nextLine();
	
		//Muestra mensaje personalizado
		System.out.println("El Usuario se llama " + nombre );

	}

}