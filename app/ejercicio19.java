/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio19 {
    public static void main(String[] args) {
        //entrada
        int numero = 0;
        int antecesores = 0;
        int contadorDivisibles = 0;
        //proceso
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        antecesores = numero - 1;
        while(antecesores>1){
            if(numero % antecesores == 0){
                contadorDivisibles++;
            }
            antecesores--;
        }
        
        if(contadorDivisibles == 0){
            JOptionPane.showMessageDialog(null, "El numero es primo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero NO es primo");
        }
        
    }
    
}
