/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio16 {
    public static void main(String[] args) {
        //Entrada
        String palabra = "";
        int longitud = 0;
        int indice = 0;
        //Proceso
        palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        longitud = palabra.length();
        do{
            JOptionPane.showMessageDialog(null,palabra.toUpperCase().charAt(indice));
            indice++;
        }while(indice<longitud);
    }
    
}
