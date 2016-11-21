/** Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica1;

import java.util.Scanner;

public class ParImpar
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		//Configura y muestra mensaje de bienvenida
		System.out.println("Hola, Soy un modesto programa de ordenador que comprueba si un número es par o impar\n");
		
		//Pide los números
		System.out.println("Dame el número: ");
		
		int dato = teclado.nextInt();
		
		if (dato % 2 == 0){System.out.println( + dato + " Es par");
		}else{ System.out.println( + dato + " Es impar");
		
		}
		
	}

}