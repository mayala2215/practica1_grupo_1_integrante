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

}
