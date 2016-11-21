/**
 * Hola2.java
 * Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Incluye configuración de entrada fácil por teclado y la utiliza para dar un mensaje personalizado.
 * ajp - 2013.09.19
 */

package practica2;
import java.util.Scanner;
import java.util.Scanner;
public class VariablesNumericas
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner teclado = new Scanner(System.in);
		
		int num ;				// variable numérica
		int num2 ;				// variable númerica
		int num3 ;				// variable númerica
		
		// Le asignamos valores a las variables númericas
		num = 1 ;
		num2 = 54;
		num3 = 89;
		
		// muestra mensaje personalizado
		System.out.println("Las tres variables númericas son " 
		+ num + " , " +num2 + " y " + num3);
		
	}

}