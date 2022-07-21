
package app;


public class ejercicio3 {
    public static void main(String[] args) {
        //Entrada
        int numero1 = 14;
        int residuo = 0;
        residuo = numero1 % 7;
        System.out.println(residuo);
        if (residuo == 0) {
            System.out.println("El numero es multiplo de 7");
        } else {
            System.out.println("El numero no es multiplo de 7");
        }
    }
}
