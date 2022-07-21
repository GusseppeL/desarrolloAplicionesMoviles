/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio14 {
    public static void main(String[] args) {
        //Entrada
        String palabra = "";
        int longitud = 0;
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        palabra = JOptionPane.showInputDialog("Ingrese una palabra:");
        longitud = palabra.length();
        for(int indice=0; indice<longitud; indice++){
            //Condicion para contar el numero numero de vocales
            if(palabra.toLowerCase().charAt(indice) == 'a' ||
               palabra.toLowerCase().charAt(indice) == 'e' ||
               palabra.toLowerCase().charAt(indice) == 'i' ||
               palabra.toLowerCase().charAt(indice) == 'o' ||
               palabra.toLowerCase().charAt(indice) == 'u'){
                contadorVocales++;
            }else{
                contadorConsonantes++;
            }
        }
        //Salida
        JOptionPane.showMessageDialog(null, "La cantidad de vocales es: "+contadorVocales
                +"\nLa cantidad de vocales es: "+contadorConsonantes);
    }
    
}

