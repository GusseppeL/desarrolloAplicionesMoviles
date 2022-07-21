/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio18 {
    public static void main(String[] args) {
        //entrada
        String celular = "";
        int longitud = 0;
        //Proceso
        celular = JOptionPane.showInputDialog("Ingrese su numero de celular correctamente:");
        longitud = celular.length();
        for(int indice = 0; indice < longitud; indice++){
            //Validar datos
            if(celular.charAt(indice) != '0'&&celular.charAt(indice) != '1'&&
               celular.charAt(indice) != '2'&&celular.charAt(indice) != '3'&&
               celular.charAt(indice) != '4'&&celular.charAt(indice) != '5'&&
               celular.charAt(indice) != '6'&&celular.charAt(indice) != '7'&&
               celular.charAt(indice) != '8'&&celular.charAt(indice) != '9'){
                JOptionPane.showMessageDialog(null,"El numero celular no esta correcto");
                indice=longitud;
            }else{
                if(indice==longitud-1){
                JOptionPane.showMessageDialog(null,"El numero celular esta correcto");
                }
            }
        }
    }
    
}
