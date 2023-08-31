import java.util.Scanner;

public class Practico1 {
    public static void main(String args[]) {
        int x = 0;
        int result = 0;
        boolean run = true;
        int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "Ingrese la operacion que desea realizar \n(1)Factorial \n(2)Suma de los primeros n enteros positivos.  \n(3)Potencia \n(4)Conteo regresivo \n(5)Producto  \n(6)Imprimir en orden inverso \n(7)Unos en un n en binario \n(8)Salir \n\n Opcion:");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.print("x=");
                    x = scanner.nextInt();
                    factorial(x);
                    System.out.println("El fatorial del numero ingresado es: " + factorial(x));
                    break;

                case 2:
                    System.out.print("x=");
                    x = scanner.nextInt();
                    System.out.println("Resultado de la suma sucesiva de " + x + " = " + sucesiveAddition(x, result));
                    break;
                case 3:
                    System.out.print("x=");
                    System.out.println("la potencia del numero ingresado es: " + potential(x, 02));
                    break;

                case 4:
                    System.out.print("x=");
                    x = scanner.nextInt();
                    System.out.print("Cuenta regresiva desde " + x + ": ");
                    regresiveCount(x);
                    break;

                case 5:
                    System.out.print("x=");
                    x = scanner.nextInt();
                    System.out.println("la multiplicacion es del numero ingresado es: " + multiplication(x, result));
                    break;

                case 6:
                    System.out.print("Arreglo a la inversa");
                    inverseArray(a, a.length - 1);
                    break;

                case 7:
                    System.out.println("Número de unos en binario es: " + binary(x));
                    break;

                case 8:
                    run = false;
                    break;

                default:
                    System.out.println("Opcion ingresada invalida \n\n\n");
                    break;
            }
            System.out.println("\n\n------------------------------------------------\n\n");
        }

    }

    /*
     * 1. Escribe una función recursiva que calcule el factorial de un número entero
     * positivo n.
     * Por ejemplo, 4! es 1x2x3x4=24.
     */
    public static int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    /*
     * 2. Escribe una función recursiva que calcule la suma de los primeros n
     * enteros
     * positivos. Por ejemplo, n=4 es 1+2+3+4=10.
     */
    public static int sucesiveAddition(int x, int result) {
        if (x > 0) {
            x--;
            result += x;
            sucesiveAddition(x, result);
            System.out.println("x="+x+"result="+result);
        }
        return result;
    }

    /*
     * 3. Escribe una función recursiva que calcule la potencia de un número base
     * elevado a
     * un exponente. Por ejemplo, 2^3=2*2*2=8
     */
    public static int potential(int x, int y) {
        if (y == 1)
            return x;
        else
            return x + potential(x, y - 1);
    }

    /*
     * 4. Escribe una función recursiva que imprima un conteo regresivo desde un
     * número n
     * hasta 1. Por ejemplo, n=4 es 4,3,2,1.
     */
    public static void regresiveCount(int x) {
        if (x >= 1) {
            System.out.print(x + "  ");
            regresiveCount(x - 1);
            x--;

        }
    }

    /*
     * 5. Escriba un método recursivo que calcule el producto de dos números enteros
     * usando sumas sucesivas. Por ejemplo, 2x4=2+2+2+2=8
     */
    public static int multiplication(int x, int y) {
        if (y == 1)
            return x;
        else
            return x + multiplication(x, y - 1);
    }

    /*
     * 6. Escriba un método recursivo que imprima los elementos de un arreglo en
     * orden
     * inverso.
     */
    public static void inverseArray(int[] a, int i) {
        if (i >= 0 && i < a.length) {
            System.out.print(a[i] + " ");
            inverseArray(a, i - 1);
        }
    }

    /*
     * 7. Escriba un método recursivo que devuelva el número de unos en la
     * representación
     * binaria de N. Use el hecho de que es igual al número de unos en la
     * representación
     * binaria de N/2, más 1 si N es impar.
     */
    public static int binary(int x) {
        if (x == 0) {
            return 0;
        }
        int unos = binary(x / 2);
        return unos + (x % 2);
    }

}