//App que valide el servivio e parquimetro de vehiculos
package app;

public class ejercicio6 {

    public static void main(String[] args) {
        //Entrada 
        String Vehiculo = "Trailer";
        //Proceso
        if ((Vehiculo.equals("AUTO") || Vehiculo.equals("SUV")) || Vehiculo.equals("CAMION"))  {
            // Salida
          System.out.print ("Tiene acceso al parquimetro");
        } else {
          System.out.print ("No acceso al parquimetro");
        }
    }
}
