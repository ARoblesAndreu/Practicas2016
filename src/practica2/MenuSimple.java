/**
 * Programa que lee tres valores y muestra el mayor.
 * Alvaro Robles Andreu 1ºDAW
 */
//Indicamos al programa que queremos usar Scanner
package practica2;

import java.util.Scanner;

public class MenuSimple
{
	public static void main(String argumentos[])
	{
		//La siguiente línea establece un canal de entrada por teclado.
		//Necesita importar el paquete java.util
		//Existe una alternativa de entrada más compleja con BufferedReader
		Scanner teclado = new Scanner(System.in);
		Scanner tecladodatos = new Scanner(System.in);
		int operador;
		
		double dato1;
		double dato2;
		
		double resultado;
		
		do {
		System.out.println("\nMenú Simple - Calculadora.\n");
		System.out.println("Pulse 1 para Sumar.");
		System.out.println("Pulse 2 para Restar.");
		System.out.println("Pulse 3 para Multiplicar.");
		System.out.println("Pulse 4 para Dividir.");
		System.out.println("Pulse 0 para Salir.");
		
		operador = teclado.nextInt();
		
		if ((operador >= 1) && (operador <= 4)){
			System.out.println("\nIntroduce el primer número: ");
			dato1 = tecladodatos.nextDouble();
			System.out.println("Introduce el segundo número: ");
			dato2 = tecladodatos.nextDouble();
				
			switch (operador){
				case 1: resultado = dato1 + dato2;
						break;
				case 2: resultado = dato1 - dato2;
						break;
				case 3: resultado = dato1 * dato2;
						break;
				default: resultado = dato1 / dato2;
			}
			System.out.println("\nEl resultado es: " + resultado + ".");
	}
}
		while(operador != 0);	
	}
}





