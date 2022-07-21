package app;

public class ejercicio4 {

    public static void main(String[] args) {
        int numero1 = 4;
        int numero2 = 8;
        int residuo1 = 0;
        int residuo2 = 0;

        residuo1 = numero1 % 2;
        residuo2 = numero2 % 2;

        if (residuo1 == 0 && residuo2 == 0) {
            System.out.println("Los numeros son pares");
        } else {
            System.out.println("Los no numeros son pares");
        }
    }
}