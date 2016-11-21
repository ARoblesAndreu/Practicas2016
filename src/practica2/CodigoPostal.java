/**
 * Hola2.java
 * Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Incluye configuración de entrada fácil por teclado y la utiliza para dar un mensaje personalizado.
 * ajp - 2013.09.19
 */

package practica2;
import java.util.Scanner;
import java.util.Scanner;
public class CodigoPostal
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner teclado = new Scanner(System.in);
		
		
		// Le asignamos valores a las variables númericas
		String nombre = "";
	    String calle = "";
	    String ciudad = "";
	    String pais = "";
	    String Postalcode = "";
		
		// muestra mensaje personalizado
	    nombre = "Alvaro Robles Andreu";
	    calle = "Avd.Constitución";
	    ciudad = "Murcia";
	    pais = "España";
	    Postalcode = "30110";
		System.out.println("Hola, me llamo " 
		+ nombre + " Vivo en la calle " + calle + "\nEn la ciudad " + ciudad + 
		" Que esta en el pais " + pais + " Y mi número postal es: " + Postalcode );
		
	}

}