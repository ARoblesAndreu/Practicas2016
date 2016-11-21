package practica3;
// Multiplo1.java
// Fecha: 14/10/2013
// Autor/a:.......
// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

import java.util.Scanner;
public class FibonacciMetodo 	{
	public static void main(String argumentos[]) {
		fibonacci();}
	public static void fibonacci(){
		 Scanner teclado = new Scanner(System.in);
	        int numero;
	        long fibo1,fibo2;
	        int i;
	        do{
	            System.out.print("Introduce numero mayor que 1: ");
	            numero = teclado.nextInt();
	        }while(numero<=1);
	        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");

	        fibo1=1;
	        fibo2=1;

	        System.out.print(fibo1 + " ");
	        for(i=2;i<=numero;i++){
	             System.out.print(fibo2 + " ");
	             fibo2 = fibo1 + fibo2;
	             fibo1 = fibo2 - fibo1;
	        }
	        System.out.println();
	    }
	}
	 