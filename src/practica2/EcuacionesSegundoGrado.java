package practica2;

import java.util.Scanner;

public class EcuacionesSegundoGrado {
	public static void main(String argumentos[]) {
		//Usamos un teclado especifico para los números y otro para la letra T
		Scanner teclado = new Scanner(System.in);
		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;
		
		System.out.println("Introduce el valor a:");
		a = teclado.nextDouble();
		System.out.println("\nIntroduce el valor b:");
		b = teclado.nextDouble();
		System.out.println("\nIntroduce el valor c:");
		c = teclado.nextDouble();
		
			teclado.close();
		
			if ((a == 0) && (b == 0)) {
			
			System.out.println("\nLa ecuación es degenerada (Trivial si c = 0 ó Absurda si c ≠ 0");
			
			}else{
				if((a == 0) && ( b != 0)){
				
				System.out.println("\nExiste una raíz única (Sol: -c / b): " + -c / b + ".");
		
			}else{
			
			d = Math.pow(b, 2) - 4 * a * c;
		
			if (d < 0) {
			
				System.out.println("\nHay dos raíces complejas de la forma: x + yi y x - yi.");
			
			}else{
			
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b + Math.sqrt(d)) / (2 * a);
		
				System.out.println("\nHay dos raíces reales, x1: " + x1 + " y x2: " + x2 + ".");
				}
			}
		}
	}
}