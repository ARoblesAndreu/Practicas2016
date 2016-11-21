package practica3;
/** EvaluarDiscriminante.java
  * Fecha: 21/11/2016
  * Autor: Alvaro Robles Andreu
  * Evalua el discriminante de una ecuación de segundo grado usando metodos
  */

import java.util.Scanner;

public class EvaluarDiscriminante {
	static double a;
	static double b;
	static double c;
	static double d;
	static double x1;
	static double x2;
	
	public static void main(String argumentos[]){
	Scanner teclado = new Scanner(System.in);
	
		System.out.println("Introduce el valor a:");
		a = teclado.nextDouble();
		System.out.println("\nIntroduce el valor b:");
		b = teclado.nextDouble();
		System.out.println("\nIntroduce el valor c:");
		c = teclado.nextDouble();
		
			teclado.close();
			
		System.out.println(evaluarDiscriminante());
	}
	public static String evaluarDiscriminante(){	
		//Usamos un teclado especifico para los números y otro para la letra T
			String resultado = "";
		
			if ((a == 0) && (b == 0)) {
			
			resultado += ("\nLa ecuación es degenerada (Trivial si c = 0 ó Absurda si c ≠ 0");
			
			}else{
				if((a == 0) && ( b != 0)){
				
				resultado += ("\nExiste una raíz única (Sol: -c / b): " + -c / b + ".");
		
			}else{
			
			d = Math.pow(b, 2) - 4 * a * c;
		
			if (d < 0) {
			
				resultado += ("\nHay dos raíces complejas de la forma: x + yi y x - yi.");
			
			}else{
			
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b + Math.sqrt(d)) / (2 * a);
		
				resultado += ("\nHay dos raíces reales, x1: " + x1 + " y x2: " + x2 + ".");
				}
			}
		}
			return resultado;
	}
}