package practica3;
/** FibonacciConAsertos.java
  * Fecha: 21/11/2016
  * Autor: Alvaro Robles Andreu
  * Calcula el número de Fibonnaci para un número leido por teclado usando metodos y asertos
  */
import java.util.Scanner;


public class FibonacciConAsertos {
    final static int LIMITE_INFERIOR = 0;
    final static int LIMITE_SUPERIOR = 161;
    
    public static void main(String[] args) {        
        System.out.println("Número de Fibonacci del término (n).");
        System.out.print("Introduce n = ");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();


        if (numero >= LIMITE_INFERIOR && numero <= LIMITE_SUPERIOR) {
            System.out.println(fibonacci(numero) 
            + "\nEs el número de Fibonacci para n = " + numero);
        }
        else {
            System.out.println("Fuera de rango,"
+"sólo se admiten valores entre: " 
+ LIMITE_INFERIOR + " y " + LIMITE_SUPERIOR);
        }
        teclado.close();
    }


    /**
     * Calcula el término n de la sucesión de Fibonacci.
     * @param n
     * @return el término n
     */
    private static long fibonacci(int n) {


        assert n >= LIMITE_INFERIOR: "Número negativo";
        assert n <= LIMITE_SUPERIOR: "No calculable";
        
        long terminoActual = n;
        long terminoMenos1 = 1;
        long terminoMenos2 = 0;


        for (int i = 1; i < n; i++) {
            terminoActual = terminoMenos1 + terminoMenos2;
            terminoMenos2 = terminoMenos1;
            terminoMenos1 = terminoActual;
        }
        return terminoActual;
    } 


} //class