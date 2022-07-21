/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

public class leccion {

    public static void main(String[] args) {
        String orden, fecha, cliente, producto, cantidad, precio;
        double precioC, subtotal, iva, total;
        int cantidadC;
        String letras = "[a-zA-Z]+";
        String numeros = "[0-9]+";
        String decimal = "[+-]?[0-9]+\\.?[0-9]*";
        for (int i = 1; i <= 3; i++) {
            orden = JOptionPane.showInputDialog("Ingrese el numero de orden:");
            cliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            producto = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
            fecha = JOptionPane.showInputDialog("Ingrese la fecha del producto:");
            precio = JOptionPane.showInputDialog("Ingrese el precio del producto:");
            cantidad = JOptionPane.showInputDialog("Ingrese la cantidad de productos:");

            if (precio.contains(",")) {
                precio = precio.replace(",", ".");
            }

            if (orden.matches(numeros)) {
                if (cliente.matches(letras)) {
                    if (precio.matches(decimal)) {
                        if (cantidad.matches(numeros)) {
                            precioC = Double.parseDouble(precio);
                            cantidadC = Integer.parseInt(cantidad);
                            subtotal = precioC * cantidadC;
                            iva = subtotal * 0.12;
                            total = subtotal - iva;

                            JOptionPane.showMessageDialog(null, "Numero de orden: " + orden
                                    + "\nNombre del cliente: " + cliente
                                    + "\nNombre del producto: " + producto
                                    + "\nFecha: " + fecha
                                    + "\nPrecio: " + precioC
                                    + "\nCantidad: " + cantidadC
                                    + "\nSubtotal: " + subtotal
                                    + "\nIVA: " + iva
                                    + "\nTotal: " + total);
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: La cantidad solo admite datos numericos.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: El precio solo admite datos numericos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El nombre del cliente solo admite letras.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: La orden solo admite datos numericos.");
            }

        }
    }

}
