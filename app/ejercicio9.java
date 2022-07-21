/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
public class ejercicio9 {
    public static void main(String[] args) {
        //Entrada
        boolean edad = true;
        boolean lugarVotacion = true;
        boolean mesa = false;
        //Proceso
        if(edad == true){
            //if-anidacion
            if(lugarVotacion == true){
                //if-anidacion
                if(mesa == true){
                //Salida
                    System.out.println("Cumple con el requisito de edad, su ubicacion esta validada y se encuentra en\n"
                            + "la mesa asignada. Puede continuar con el proceso de elecciones Presidenciales");
                }else {
                    System.out.println("No se encuentra ubicado en la mesa para realizar el proceso electoral");
                }
            }else {
                System.out.println("No se encuentra en el lugar de votacion designado");
            }
        }else {
            System.out.println("No cumples con la edad requerida para realizar el proceso electoral");
        }
    }  
}
