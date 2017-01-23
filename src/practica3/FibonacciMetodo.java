package practica3;
/** FibonacciMetodo.java
  * Fecha: 21/11/2016
  * Autor: Alvaro Robles Andreu
  * Muestra los terminos de la serie de Fibonacci en el orden leido por teclado usando metodos
  */

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
	        teclado.close();
	    }
	}
	 