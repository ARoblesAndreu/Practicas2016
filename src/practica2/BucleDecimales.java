/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;

import java.util.Scanner;
public class BucleDecimales
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		Scanner tecladonum = new Scanner(System.in);
		Scanner tecladodecimal = new Scanner(System.in);
		double num;
		int decimal;
		String mensaje;
		String tecla = "A";
		String confirmacion;
		boolean avanzar = true;
		mensaje = "Este programa lee números con decimales y los redondea a los decimales que indique el usuario. Pulse A para salir";
		System.out.println(mensaje);
		do {
		mensaje = "Introduzca un número con decimales:";
		System.out.println(mensaje);
		num = tecladonum.nextDouble();
		mensaje = "Indique a cuantos decimales quiere redondear:";
		System.out.println(mensaje);
		decimal = tecladodecimal.nextInt();
		num = Math.rint(num * Math.pow(10, decimal)) / Math.pow(10, decimal);
		System.out.println(num);
		mensaje = "Si quiere terminar el programa pulse A";
		System.out.println(mensaje);
		confirmacion = teclado.nextLine();
		if (tecla.equals(confirmacion.toUpperCase())){
			avanzar = false;
			continue;}
		}while(avanzar);
		mensaje = "Fin del programa.\nGracias por usar este programa.\nCreado por Alvaro Robles Andreu.";
		System.out.println(mensaje);
	}
}





