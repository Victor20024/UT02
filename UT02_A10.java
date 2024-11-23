/*10. ActividadUT02-10. Potencia de un número.
Realizar un programa que visualice en pantalla la potencia de un una base elevada a un exponente. Ambos datos se pedirán a través de teclado.

Nota: un mismo problema puede resolverse de diferentes formas. Entre las más habituales se encuentran las dos siguientes:

Implementación basada en estructuras repetitivas (bucles) que veremos en el tema siguiente.
Mediante el uso de uno de los métodos que proporciona la clase Math. Investiga en Internet esta alternativa para tu solución. */

import java.util.Scanner;

public class UT02_A10{

    public static void main (String[] args){
    
    int iBase;
    int iExp;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Introducir el valor de la base y el exponente");
    iBase = Integer.parseInt(entrada.nextLine());
    iExp = Integer.parseInt(entrada.nextLine());

    Double potencia = Math.pow(iBase, iExp);

    System.out.printf("\f%d elevado a %d es %f \f", iBase, iExp, potencia);
    System.out.println(iBase+ " elevado a " +iExp+ " es: " +potencia);

    entrada.close();
    }
}