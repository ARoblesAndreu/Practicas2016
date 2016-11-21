package practica3;
/** Salario.java
 * Fecha: 21/11/2016
 * Autor: Alvaro Robles Andreu
 * Calcula el salario de un trabajador dependiendo de el número de horas usando metodos.
 */

import java.util.Scanner;
public class Salario 	{
	public static void main(String argumentos[]) {
		Scanner tecladonum = new Scanner (System.in);
		int hora;
		String mensaje;
		mensaje = "Porfavor, introduzca el número de horas que ha trabajado:";
		System.out.println(mensaje);
		hora = tecladonum.nextInt();
		calcularSalario(hora);}
	
	public static void calcularSalario (int hora){
		Scanner teclado = new Scanner (System.in);
		int TOPE = 35;
		final int Salmin = 15;
		final int Salextra = 22;
		String tecla = "P";
		boolean seguir = true;
		String mensaje;
		String confirmacion;
		
		do {
		
		if (hora <= 0){
			mensaje = "ERROR. No puede trabajar horas negativas"; 
			System.out.println(mensaje);
			continue;}
		
		if (hora <= TOPE){
			hora *= Salmin;
			}else{			
			hora -= TOPE;
			hora *= Salextra;
			TOPE *= Salmin;
			hora += TOPE;}
		
			mensaje = "Si quiere dejar de introducir datos pulse la tecla P";
			System.out.println(mensaje);
			confirmacion = teclado.nextLine();
				if (tecla.equals(confirmacion.toUpperCase())){
					seguir = false;
					continue;
					}else{
						continue;}
					
		
		}while(seguir);
		System.out.println("Salario: "+hora);
		teclado.close();
	}
}