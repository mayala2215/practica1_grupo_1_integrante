/*
*
*@Author: mayala
*/

public class Funciones {

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.replaceAll("\\s", "").toLowerCase();

        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double potenciaAlCubo(double numero) {
        return Math.pow(numero, 3);
    }

    public static double raizCubica(double numero) {
        return Math.cbrt(numero);
    }

    public static int multiplicar(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }

    public static double dividir(double dividendo, double divisor) {

        double resultado = dividendo / divisor;
        return resultado;

    }

}
