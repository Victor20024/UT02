/*1. ActividadUT02-1. Saludar
Crear un programa que pida un nombre, después un apellido, y diga "Hola <nombre> <apellido>", y después "Hola <apellido> <nombre>".*/

import java.util.Scanner; //importamos el paquete necesario para poder usar la clase Scanner
public class UT02_A1  // método principal que inicia la aplicación
{
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in ); // clase Scanner para petición de datos
      String nombreString;
      String apellidoString;
      System.out.print( "Introducir nombre: " );
      nombreString = entrada.nextLine(); // pedimos el nombre al usuario
      System.out.print( "Introducir apellido: " );
      apellidoString = entrada.nextLine(); // pedimos el apellido al usuario
      
      System.out.println("Hola: " +apellidoString + " " + nombreString); // salida por pantalla del apellido y nombre al usuario

      entrada.close();
    } // Fin de la funcion main
} // Fin de la clase

