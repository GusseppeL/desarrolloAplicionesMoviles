/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        //Entrada
        Scanner entrada = new Scanner(System.in);
        String producto = "";
        int cantidad = 0;
        double precio = 0.0;
        double subtotal = 0.0;
        double iva = 0.0;
        double total = 0.0;
        //Proceso        
        System.out.print("Ingrese el nombre del producto: ");
        producto = entrada.next();
        System.out.println("Ingrese la cantidad de productos:");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio del producto:");
        precio = entrada.nextDouble();
        subtotal=cantidad*precio;
        iva=subtotal*0.12;
        total=subtotal+iva;
        //Salida
        System.out.println("Producto: "+producto);
        System.out.println("Subtotal: "+subtotal);
        System.out.println("IVA: "+iva);
        System.out.println("El valor total del producto es: "+total);
    }
    
}
