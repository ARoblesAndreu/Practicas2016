/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;

import java.util.Scanner;

public class CharBucleN
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);

		char tecla = 'S';
		String confirmacion;
		int i = 1;

		do { 
			String mensaje = "Introduzca el " +i+ "º numero: ";
			System.out.println(mensaje);
			int dato = teclado.nextInt();
			String mensaje2 = "El "+i+"º número es: "+dato;
			System.out.println(mensaje2);
			i++;
			System.out.println("Si desea continuar pulse la tecla S");
			confirmacion = teclado.next();
		}
		while(tecla == confirmacion.toUpperCase().charAt(0));
	}
}





