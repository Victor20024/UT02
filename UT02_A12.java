/*12. ActividadUT02-12. Círculo
Realiza un programa que calcule el perímetro y el área de un círculo. La longitud del radio se introducirá por teclado y podrá 
ser un número con decimales.
El resultado se mostrará por pantalla y tendrá el siguiente formato:
"El circulo de radio <radio_circulo> tiene un perimetro = <valor_perímetro> y un area = <valor_área>".
Nota: utiliza la clase Math en la solución del problema. */

import java.util.Scanner;

public class UT02_A12{

    public static void main(String [] args){

    double dRadio, dPeri, dArea;
    Scanner entrada = new Scanner(System.in);
    //double dPI = 3.1416;

    System.out.print("Introducir el valor del radio: ");
    dRadio = Double.parseDouble(entrada.nextLine());
    
    dPeri = Math.PI * 2 * dRadio;
    dArea = Math.PI * Math.pow (dRadio, 2);
    //dArea = Math.PI * (dRadio * dRadio);

     System.out.printf("\nEl circulo de radio %s tiene un perimetro = %s y un area = %s", dRadio, dPeri, dArea);

    //Area = pi * radio al cuadro
    //diámetro = 2 * radio
    //perímetro = pi * diámetro 
    
    entrada.close();
    }
}