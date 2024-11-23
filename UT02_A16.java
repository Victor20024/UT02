/* 16. ActividadUT02. Claves
 Crea un programa que construya una clave a partir de algunas palabras dadas. Se leerán desde teclado tres palabras y dos números. La
 clave deberá mostrarse en mayúsculas.
 La entrada tendrá dos líneas. Una primera con las tres palabras separadas por espacios y al segunda con dos números separados por
 espacios que indican la cantidad de letras que aporta cada palabra a la clave y primera letra de la palabra desde donde coger la información.
 A continuación se muestra un ejemplo:
 Palabras: Alcala Amigo Programacion.
 Números: 2 3
 Resultado esperado: CAIGOG*/

 import java.util.Scanner;
 
 public class UT02_A16{

    public static void main (String[] args){
        
        String sPalabra1, sPalabra2, sPalabra3;
        int iNum1, iNum2;
        int iLargo;
        Scanner entrada = new Scanner(System.in);
        String clave1, clave2, clave3;
        
        System.out.print("Introducir 3 palabras separadas por un espacio: ");
        String sPalabraAux  = entrada.nextLine();
        String [] sPalabras = sPalabraAux.split(" ");
        sPalabra1 = sPalabras[0];
        sPalabra2 = sPalabras[1];
        sPalabra3 = sPalabras[2];

        System.out.print("Introducir 2 número separados por un espacio: ");
        String sNumeroAux  = entrada.nextLine();
        String [] sNumeros = sNumeroAux.split(" ");
        iNum1 = Integer.parseInt(sNumeros[0]);
        iNum2 = Integer.parseInt(sNumeros[1]);

        iLargo = iNum1 + iNum2;
        clave1 = sPalabra1.substring(iNum2 -1, iLargo -1);
        clave2 = sPalabra2.substring(iNum2 -1, iLargo -1);
        clave3 = sPalabra3.substring(iNum2 -1, iLargo -1);

        System.out.println("Los datos introducidos son: " + sPalabra1 + "-" + sPalabra2 + "-" + sPalabra3 + "---" + iNum1 + "-" +iNum2);
        System.out.println("La clave es: " + clave1.toUpperCase() + clave2.toUpperCase() + clave3.toUpperCase());

        entrada.close();

    } //Cierre método main

 } //Cierre clase