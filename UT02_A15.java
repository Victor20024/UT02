/*15. ActividadUT02. Repartir cromos
 Crear un programa que haga el reparto de un número de cromos entre un grupo de niños (ambos datos recibidos por teclado), el resultado
 se mostrará por pantalla y deberá tener el siguiente formato:
 "Cada niño ha conseguido <cromos_por_niño> cromos y han sobrado <cromos_que_han_quedado_sin_repartir>.*/

import java.util.Scanner;

 public class UT02_A15{

    public static void main (String[] args){

        int iNumCromos, iNumNiños, iReparto, iNumSobrantes;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introducir número de cromos a repartir y número de niños:");
        iNumCromos = Integer.parseInt(entrada.nextLine());
        iNumNiños  = Integer.parseInt(entrada.nextLine());

        iReparto      = iNumCromos / iNumNiños;
        iNumSobrantes = iNumCromos % iNumNiños;

        System.out.printf("\nCada niño ha conseguido %s cromos y han sobrado %s.", iReparto, iNumSobrantes);

        entrada.close();

    } //Cierre de función main

} //Cierre clase
