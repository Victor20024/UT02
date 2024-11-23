/*14. ActividadUT02. Horas, minutos y segundos
 Dado un número de segundos por teclado, mostrar el desglose en horas, minutos y segundos*/

import java.util.Scanner;

public class UT02_A14{

    public static void main (String[] args){

        int iSeg, iMin, iHoras, iSegTot;
        Scanner entrada = new Scanner(System.in);

        System.out.print ("Introducir el número total de segundos a calcular: ");
        iSegTot = Integer.parseInt(entrada.nextLine());

        iSeg = iSegTot % 60;
        iMin = iSegTot / 60;
        iHoras = iSegTot / 3600;

        System.out.printf("\nEl número de horas es: %s; el número de minutos es: %s; y el número de segundos: %s", iHoras, iMin, iSeg);

        entrada.close();

    } //Cierre función main

} //Cierre clase

