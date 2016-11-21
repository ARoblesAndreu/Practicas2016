/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;
public class MultiplosDe3
{
	public static void main(String argumentos[])
	{
		int i;
		
		
		for (i = 3; i <= 3000; i++)
			if (i % 3 == 0)
				System.out.println("\t" + i);
	}
}



