/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio 13: Conversiones tipo menu
package app;

import javax.swing.JOptionPane;

public class ejercicio13 {
    public static void main(String[] args) {
        //entrada
        char sexo = 'M';
        String numeroEnteroString = "10";
        String numeroDecimalString = "5.5";
        int numeroEnteroConvertido = 0;
        double numeroDecimalConvertido = 0;
        String sexoStringConvertido = "";
        int opcion = 0;
        //proceso
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones"
                + "\n 1.- Convertir String a Entero"
                + "\n 2.- Convertir String a Decimal"
                + "\n 3.- Converitr Char a String"
                + "\nDigite una de las opciones:"));
        
        if(opcion == 1){
            numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
            JOptionPane.showMessageDialog(null, "El numero entero convertido es : "+numeroEnteroConvertido);
        }else if(opcion == 2){
            numeroDecimalConvertido = Double.parseDouble(numeroDecimalString);
            JOptionPane.showMessageDialog(null, "El numero decimal convertido es : "+numeroDecimalConvertido);
        }else if(opcion == 3){
            sexoStringConvertido = String.valueOf(sexo); 
            JOptionPane.showMessageDialog(null, "El char convertido es : "+sexoStringConvertido);
        }else{
            JOptionPane.showMessageDialog(null, "Error: Digite correctamente las opciones que se visualizan.");
        }
        
    }
    
}
