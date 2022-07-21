/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio15 {
    public static void main(String[] args) {
        //entrada
        int numero = 0;
        int opcion = 0;
        //proceso
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de opciones"
                + "\n 1.- Generar secuencia ascendente"
                + "\n 2.- Generar secuencia descendente"
                + "\nDigite una de las opciones:"));
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        
        switch (opcion) {
            case 1:
                for(int indice = numero + 1;indice <= 10;indice++){
                    JOptionPane.showMessageDialog(null, "* "+indice);
                }
                break;
            case 2: 
                for(int indice = numero - 1;indice >= 0;indice--){
                    JOptionPane.showMessageDialog(null, "* "+indice);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Digite correctamente las opciones que se visualizan.");
                break;
        }
    }
    
}
