package practica2;
/** Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
import java.util.Scanner;

public class Iniciales
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		String nombre = "";		// variable de texto
		
		//Pide nombre
		nombre ="    ***    ******       ***"
		    + "\n   *   *   *     *     *   *"
	    	+ "\n  *     *  *     *    *     *"
			+ "\n  *******  ******     *******"
			+ "\n  *     *  *    *     *     *"
			+ "\n  *     *  *     *    *     *"
			+ "\n  *     *  *      *   *     *" ;
				     	
		//Muestra mensaje personalizado
		System.out.println("\n"+ nombre );
		
	}

}