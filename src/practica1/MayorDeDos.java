package practica1;
/**
 * Programa que lee dos valores y da el mayor de los 2.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
import java.util.Scanner;

public class MayorDeDos
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		
		//Configura y muestra mensaje de bienvenida
		System.out.println("Hola, Soy un programa de ordenador que lee 2 números y te da el mayor\n");
		
		//Pide el numero
		System.out.println("Introduce el primer número: ");
		
		int dato = teclado.nextInt();
		
		//Pide el numero 2
		System.out.println("Introduce el segundo número: ");
		
		int dato2 = teclado.nextInt();
		
		if (dato == dato2)System.out.println("Los dos números tienen el mismo valor");
		if (dato > dato2) System.out.println("El mayor es " + dato);
		if (dato < dato2) System.out.println("El mayor es " + dato2);
		}
		
		
	}
