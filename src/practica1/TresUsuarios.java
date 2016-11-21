/** Programa que pregunta el nombre, los apellidos, el NIF y el Codigo Postal de tres usuarios
 *  Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica1;

import java.util.Scanner;

public class TresUsuarios
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		String nombre = "";		// variable de texto 
		String apellidos = ""; // variable edad
		String nif = "";
		String postal = "";
		String nombre2 = "";
		String apellidos2 = "";
		String nif2 = "";
		String postal2 = "";
		String nombre3 = "";
		String apellidos3 = "";
		String nif3 = "";
		String postal3 = "";
		
		//Configura y muestra mensaje de bienvenida
		System.out.println("Hola, usuario1 ");
		System.out.println("Dime tu nombre y edad");

		//Pide nombre
		System.out.print("\nNombre Usuario1: ");
		
		nombre = teclado.nextLine();
		
		//Pide edad
		System.out.print("\nApellidos Usuario1: ");
		
		 apellidos = teclado.nextLine();
		 
		 System.out.print("\nNIF Usuario1: ");
			
		 nif = teclado.nextLine();
		 
		 System.out.print("\nCodigo Postal Usuario1: ");
			
		 postal = teclado.nextLine();
		
		//Pide nombre2
		System.out.println("\nNombre Usuario2: ");
		
		nombre2 = teclado.nextLine();
		
		//Pide edad2
		System.out.println("\nApellidos Usuario2: ");
		
		apellidos2 = teclado.nextLine();
		
		System.out.print("\nNIF Usuario2: ");
		
		 nif2 = teclado.nextLine();
		 
		 System.out.print("\nCodigo Postal Usuario2: ");
			
		 postal2 = teclado.nextLine();
		 
		 System.out.println("\nNombre Usuario3: ");
			
		 nombre3= teclado.nextLine();
		 
		 System.out.print("\nApellidos Usuario3: ");
			
		 apellidos3 = teclado.nextLine();
		 
		 System.out.print("\nNIF Usuario3: ");
			
		 nif3 = teclado.nextLine();
		 
		 System.out.print("\nCodigo Postal Usuario3: ");
			
		 postal3 = teclado.nextLine();
		 
		
		//Muestra mensaje personalizado
		System.out.println("El Usuario1 se llama " + nombre + " y se apellida " + apellidos + ". Posee el NIF " + nif + " Y su Codigo Postal es " + postal);
		
		System.out.println("El Usuario1 se llama " + nombre2 + " y se apellida " + apellidos2 + ". Posee el NIF " + nif2 + " Y su Codigo Postal es " + postal2);
		
		System.out.println("El Usuario1 se llama " + nombre3 + " y se apellida " + apellidos3 + ". Posee el NIF " + nif3 + " Y su Codigo Postal es " + postal3);
	}

}