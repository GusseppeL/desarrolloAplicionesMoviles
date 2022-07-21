/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio17 {
    public static void main(String[] args) {
        //entrada
        String palabra = "";
        int longitud = 0;
        String palabraNueva = "";
        //Proceso
        palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        longitud = palabra.length();
        for(int indice = longitud -1; indice >= 0; indice--){
            palabraNueva+=palabra.toUpperCase().charAt(indice);
        }
        if(palabra.toUpperCase().equals(palabraNueva)){
            JOptionPane.showMessageDialog(null,"Es palindroma");
        }else{
            JOptionPane.showMessageDialog(null,"No es palindroma");
        }
    }
    
}
