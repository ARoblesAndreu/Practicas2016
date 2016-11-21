package autoevaluaciónes;
/** DiagramaBarras.java
 *Fecha: 20/11/2016
 * Autor: Alvaro Rolbes Andreu
 * Programa que genera barras dependiendo de unos numeros fijos y limites maximos y minimos.
 */

public class DiagramaBarras 	{
	public static void main(String argumentos[]) {
		//Datos de la grafica
		int dato1 = 9;
		int dato2 = -2;
		int dato3 = 4;
		int dato4 = -6;
		int dato6 = -10;
		int dato5 = 0;
		int dato7 = 10;
		int dato8 = -11;
		int dato9 = 11;
		
		//Encadenamos todos los datos de la grafica en un solo String
		String grafica = generarBarraHorizontal(dato1)
				+generarBarraHorizontal(dato2)
				+generarBarraHorizontal(dato3)
				+generarBarraHorizontal(dato4)
				+generarBarraHorizontal(dato5)
				+generarBarraHorizontal(dato6)
				+generarBarraHorizontal(dato7)
				+generarBarraHorizontal(dato8)
				+generarBarraHorizontal(dato9);
		System.out.println(grafica);
		}//Main
	static String generarBarraHorizontal(int dato){
		//Limites de la grafica
		final int LIMITE_INFERIOR = -11;
		final int LIMITE_SUPERIOR = 11;
		//Parametros de la grafica
		final String CARACTER_BASE = "*";
		final String ESPACIOS = " ";
		final String SEPARADOR = "|";
		final String SALTO_LINEA = "\n";
		String barra = "";
		int cantidadEspacios = LIMITE_SUPERIOR -1;
		
		String barrafinal = "  " + dato+ SALTO_LINEA;
		
		if (dato>= LIMITE_SUPERIOR || dato <= LIMITE_INFERIOR){
			String mensaje = dato + " FUERA DE RANGO\n";
			barra += mensaje;
		}else{
			if (dato > 0) {
				barra += generarBloqueCaracteres(cantidadEspacios, ESPACIOS);
				barra += SEPARADOR;
				barra += generarBloqueCaracteres(dato, CARACTER_BASE);
				barra += generarBloqueCaracteres(cantidadEspacios - dato, ESPACIOS);
				barra +=barrafinal;
			}
			if (dato < 0) {

				barra += generarBloqueCaracteres(cantidadEspacios + dato, ESPACIOS);
				barra += generarBloqueCaracteres(-dato, CARACTER_BASE);
				barra += SEPARADOR;
				barra += generarBloqueCaracteres(cantidadEspacios, ESPACIOS);
				barra += barrafinal;
			}
			if (dato == 0) {

				barra += generarBloqueCaracteres(cantidadEspacios, ESPACIOS);
				barra += SEPARADOR;
				barra += generarBloqueCaracteres(cantidadEspacios, ESPACIOS);
				barra += barrafinal;
			}
		}
		return barra;
	}//generarBarraHorinzontal
	static String generarBloqueCaracteres(int cantidad, String caracter){
		String bloque = "";
		for (int contador = 0; contador < cantidad; contador++) {
			bloque += caracter;
		}
		return bloque;
	}//generarBloqueCaracteres
}//class