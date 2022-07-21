/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

public class ejercicio10 {

    public static void main(String[] args) {
        //entrada
        String empleado = "Gusseppe Lopez";
        String cargo = "Jefe";
        double pagoHora = 20.0;
        int numeroHoras = 160;
        double sueldo = 0.0;
        double iess = 0.0;
        double netoRecibir = 0.0;
        //Proceso
        sueldo = pagoHora * numeroHoras;
        iess = sueldo * 0.095;
        netoRecibir = sueldo - iess;
        //salida
        System.out.println("Empleado: "+empleado);
        System.out.println("Cargo: "+cargo);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Descurnto IESS: "+iess);
        System.out.println("El neto a recibir es: "+netoRecibir);
        
    }
    
}