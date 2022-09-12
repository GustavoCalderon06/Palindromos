//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Palindromos {


    public static void main(String[] args) {
        imprimirPalabra();
        esPalindromo();


    }
    public static void imprimirPalabra(){
        System.out.println("Ingresa la palabra");
    }


    public static void esPalindromo() {

        if (cadena(ingresar())) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es Palindromo");
        }


    }
    public static boolean cadena(String cadena) {
        boolean valor = true;
        StringBuilder cadena2 = new StringBuilder();

        for(int x = 0; x < cadena.length(); ++x) {
            if (cadena.charAt(x) != ' ') {
                cadena2.append(cadena.charAt(x));
            }
        }

        cadena = cadena2.toString();
        int ind = cadena.length();

        for(int i = 0; i < cadena.length(); ++i) {
            if (!cadena.substring(i, i + 1).equals(cadena.substring(ind - 1, ind))) {
                valor = false;
                break;
            }

            --ind;
        }

        return valor;
    }

    public static String ingresar() {
        return new Scanner(System.in).nextLine();
    }
}
