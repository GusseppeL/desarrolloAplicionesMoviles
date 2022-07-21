/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class ejercicio20 {
    public static void main(String[] args) {
        //entrada
        int numero = 0;
        int antecesores = 0;
        int acumuladorDivisibles = 0;
        //proceso
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        antecesores = numero - 1;
        while(antecesores>0){
            if(numero % antecesores == 0){
                acumuladorDivisibles=acumuladorDivisibles+antecesores;
            }
            antecesores--;
        }
        
        if(numero == acumuladorDivisibles){
            JOptionPane.showMessageDialog(null, "El numero es perfecto");
        }else{
            JOptionPane.showMessageDialog(null, "El numero NO es perfecto");
        }
        
    }
    
}
