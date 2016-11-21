/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;

import java.util.Scanner;

public class BucleOcho
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		for (int i = 1; i < 9; i++) {
			String mensaje = "Escriba el "+ i +"º número:";
			System.out.println(mensaje);
			suma += teclado.nextInt();
			
		}
		System.out.println("El resultado es: "+suma);
	     	 }
	     
	}



