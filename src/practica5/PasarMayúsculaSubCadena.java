package practica5;

//Encabezado de la clase principal del programa
public class PasarMayúsculaSubCadena {

	// Operaciones que realiza el programa
	public static void main(String argumentos[]) {

		String cadena = "Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer";
		pasarMayusculasSubCadena(cadena);

	}// main

	static void pasarMayusculasSubCadena(String cadena) {

		// ES MAS SENCILLO USAR SPLIT********************************

		int inicio = cadena.indexOf("<mayus>");
		int ultimo = cadena.indexOf("</mayus>");
		StringBuilder completo = new StringBuilder(cadena);
		String subcadenaMayus;
		while (inicio != -1 && ultimo != 1) {
			subcadenaMayus = completo.substring(inicio + 7, ultimo).toUpperCase();
			completo.replace(inicio, ultimo+8, subcadenaMayus);
			inicio = completo.indexOf("<mayus>");
			ultimo = completo.indexOf("</mayus>");
		}
		System.out.println(completo.toString());

	}// pasarMayusculasSubCadena
}// Class
