/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;

import java.util.Scanner;

public class BucleN
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		int mayor = 0;
		int menor = Integer.MAX_VALUE;
		String tecla = "S";
		String confirmación;
		int i = 1;

		do { 
			String mensaje = "Introduzca el " +i+ "º numero: ";
			System.out.println(mensaje);
			int dato = teclado.nextInt();
			if (i == 1) {
				mayor = dato;
				}
				if (i == 2) {
					if (dato > mayor) {
						menor = mayor;
						mayor = dato;
						} else {
							menor = dato;
						}
					}
				String mensaje2 = "El "+i+"º número es: "+dato;
				System.out.println(mensaje2);
				i++;
			if (menor > dato){
				menor = dato;}

			if (mayor < dato){
				mayor = dato;}
			System.out.println("Si desea continuar pulse la tecla S");
			confirmación = teclado.next();
		}
		while(tecla.equals(confirmación.toUpperCase()));
			System.out.println("El mayor es: "+mayor);
			System.out.println("El menor es: "+menor);
	}
}





