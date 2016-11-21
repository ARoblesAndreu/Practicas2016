/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica1;

import java.util.Scanner;

public class MayorDeTres
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		//Configura y muestra mensaje de bienvenida
		System.out.println("Hola, Soy un programa de ordenador que lee 3 números y te da el mayor\n");
		
		//Pide el numero
		System.out.println("Introduce el primer número: ");
		
		int dato = teclado.nextInt();
		
		//Pide el numero 2
		System.out.println("Introduce el segundo número: ");
		
		int dato2 = teclado.nextInt();
		
		//Pide el numero 3
		System.out.println("Introduce el tercer número: ");
		
		int dato3 = teclado.nextInt();
		
		if (dato == dato2 && dato == dato3) System.out.println("Los tres números tienen el mismo valor");
		if (dato > dato2 && dato > dato3)  System.out.println("El mayor es " + dato);
		if (dato2 > dato && dato2 > dato3) System.out.println("El mayor es " + dato2);
		if (dato3 > dato && dato3 > dato2) System.out.println("El mayor es " + dato3);
 		}
		
		
	}

