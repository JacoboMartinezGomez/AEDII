//Practica 1
package practica1;

/**
 *
 * @author Jacobo
 */
public class Practica1 {
//1. Implementa un método recursivo que calcule el factorial de un número entero positivo. Por ejemplo 4! = 24.
    public static int factorial(int num) {
        if (num == 1) {
            return num;
        } else {
            return num * factorial(num - 1);
        }
    }
//2. Implementa un método recursivo que calcule el cuadrado de un número n, sabiendo que n2 = (n-1)2 + 2n – 1.
    public static int cuadrado(int num) {
        if (num == 1) {
            return num;
        } else {
            return cuadrado(num - 1) + 2 * num - 1;
        }
    }
//3.Implementa un método recursivo que sume los dígitos que componen un número entero positivo que se pasa como parámetro. Es decir, dado el número 1369, debe devolver el entero 19.
    public static int sumardigitos(int num) {
        if (num == 0) {
            return num;
        } else {
            return sumardigitos(num / 10) + num % 10;
        }

    }
//5. Implementa un método recursivo que invierta una palabra de forma recursiva.
    public static String invertirpalabra(String palabra) {
        if (palabra.length() == 1) {
            return palabra;
        } else {
            return invertirpalabra(palabra.substring(1)) + palabra.charAt(0);
        }
    }
//6. Implementa un metodo recursivo que sumelos elementos de un array de enteros
    public static int sumaArray(int[] numeros, int n) {
        if (numeros.length == 0) {
            return numeros[n];
        } else {
            return numeros[n] + sumaArray(numeros, n - 1);
        }
    }
//7. Implementa un método recursivo que invierta los números de un array de enteros.
    public static void invertirArray(int[] numeros) {
        invertirArray(numeros, numeros.length - 1);
    }
    private static void invertirArray(int[] numeros, int fin) {
        if (fin != 0) {
            int aux = numeros[0];
            for (int i = 1; i <= fin; i++) {
                numeros[i - 1] = numeros[i];
            }
            numeros[fin] = aux;
            invertirArray(numeros, fin - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));

        System.out.println(cuadrado(1));
        System.out.println(cuadrado(2));
        System.out.println(cuadrado(3));
        System.out.println(cuadrado(4));
        System.out.println(cuadrado(5));

        System.out.println(sumardigitos(14));
        System.out.println(sumardigitos(12));
        System.out.println(sumardigitos(343));
        System.out.println(sumardigitos(44567));
        System.out.println(sumardigitos(675));

        System.out.println(invertirpalabra("hola"));
        System.out.println(invertirpalabra("iria"));

        System.out.println("hola".substring(1));
        System.out.println("hola".charAt(0));

        int[] prueba = {1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {

        }
        //System.out.println(sumaArray(prueba, 2));
        invertirArray(prueba);

    }

}
