public class Main {
    public static void main(String[] args) {
        System.out.println("Este programa muestra la tabla de multiplicar del 5");
        int numero = 5;
        int contador = 1;

        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }

    }
}