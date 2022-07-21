package app;

public class ejercicio2 {

    public static void main(String[] args) {
        //Entrada
        int numero1 = 2;
        int residuo = 0;
        residuo = numero1 % 2;
        System.out.println(residuo);
        if (residuo == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
