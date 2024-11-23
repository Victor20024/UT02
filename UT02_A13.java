/* 13. ActividadUT02. Segundos totales
 Dado por teclado un número de horas, minutos y segundos, mostrar el número de segundos totales por pantalla. */

import java.util.Scanner;

 public class UT02_A13{

    public static void main (String[] args){

        double dHoras, dMin, dSeg, dSegTot;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce las horas, los minutos y los segundos (separados por un espacio): ");
        String sDatos = entrada.nextLine();
        String [] sDatos2 = sDatos.split (" ");
            dHoras = Double.parseDouble(sDatos2[0]);
            dMin   = Double.parseDouble(sDatos2[1]);
            dSeg   = Double.parseDouble(sDatos2[2]);

        dSegTot = (dHoras * Math.pow(60, 2)) + (dMin * 60) + dSeg;

        System.out.printf("El número de segundos totales es: %s", dSegTot);

        entrada.close();

    }

 }