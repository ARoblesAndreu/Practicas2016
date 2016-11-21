package autoevaluaciónes;

import java.util.Scanner;

public class SegundaAutoevaluación {
	public static void main(String argumentos[]) {
		//Usamos un teclado especifico para los números y otro para la letra T
		Scanner teclado = new Scanner(System.in);
		Scanner tecladonum = new Scanner(System.in);
	
		// Variables
		String tecla = "T";
		String confirmacion;
		String mensaje;
		int contadorValido = 1;
		int valorEntrada;
		boolean continuar = true;
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		mensaje = "Este programa lee numeros desde el 1 al 2147483647. Pulse 0 para terminar:";
		System.out.println(mensaje);

		//bucle do while
		do {
			mensaje = "Introduzca un número: ";
			System.out.println(mensaje);
			
			valorEntrada = tecladonum.nextInt();
			//Comprobamos números negativos
			if (valorEntrada < 0){
				mensaje = "ERROR. Este programa no acepta numeros negativos";
				System.out.println(mensaje);
				continue;}
			//Aseguramos que el programa acepte dos numeros
			if (contadorValido <= 2 && valorEntrada == 0){
				mensaje = "ERROR. Este programa necesita al menos 2 números para funcionar";
				System.out.println(mensaje);
				continue;}
			//Definimos que pulsando cero se sale del programa y para confirmar la salida se pulse T
			if (valorEntrada == 0 && contadorValido > 2){
				mensaje = "Si quiere continuar cerrando el programa, pulse la tecla T";
				System.out.println(mensaje);
				confirmacion = teclado.nextLine();
					if (tecla.equals(confirmacion.toUpperCase())){
						continuar = false;
						continue;
						}else{
						continue;}
						}
			//Comprobamos el mayor y el menor de los dos primeros numeros introducidos
			if (valorEntrada >= 1){

				if (contadorValido == 1) {
					mayor = valorEntrada;
					}
					if (contadorValido == 2) {
						if (valorEntrada > mayor) {
							menor = mayor;
							mayor = valorEntrada;
							} else {
								menor = valorEntrada;
							}
						}
				}
				//Y a partir de esos dos primeros comprobamos los demas introducidos
				mensaje = "El " + contadorValido + "º número es: "+ valorEntrada;
				System.out.println(mensaje);
				contadorValido++;

				if (menor > valorEntrada){
					menor = valorEntrada;}

				if (mayor < valorEntrada){
					mayor = valorEntrada;}
		//Definimos una condición que mientras se mantenga cierta el bucle se sigue ejecutando				
		}while (continuar);
		
		//Si la condición no se cumple el bucle acaba y se ejecuta el codigo fuera del bucle
		mensaje = "El programa ha acabado";
		System.out.println(mensaje);

		mensaje = "El mayor es: " + mayor + "\nEl menor es: " + menor;
		System.out.println(mensaje);
		contadorValido --;
		mensaje = "Se han leido: " + contadorValido + " números validos";
		System.out.println(mensaje);
	}
}			
			
