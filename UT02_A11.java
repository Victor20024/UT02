/*11. ActividadUT02-11. Grupos de números.
Realizar un programa que determine de un conjunto de 3 números enteros introducidos por teclado, cuántos son menores que 18, cuántos mayores de 65 y cuántos están comprendidos entre 15 y 65. 
Introduce todos los números en una sola línea por teclado separados por un espacio.

Nota: para hacer este ejercicio será interesante disponer de una estructura de almacenamiento de tipo array que contenga los números. Ver Anexo I: Introducción a los arrays. */

import java.util.Scanner;

public class UT02_A11{

    public static void main(String[] args){
                        
        Scanner miScan = new Scanner(System.in);
        int iNum1, iNum2, iNum3;

        System.out.println("Introducir grupo de 3 números separados por un espacio: ");
        //int [] iNum = new int[3]; //Declaro una array de nombre iNum, de números enteros y le asigno tres campos
        String sValor = miScan.nextLine();
        String [] sNum = sValor.split(" ");

        iNum1 = Integer.parseInt(sNum[0]);
        iNum2 = Integer.parseInt(sNum[1]);
        iNum3 = Integer.parseInt(sNum[2]);

        System.out.println(iNum1 + ", " + iNum2+ ", " + iNum3);

        int [] iMen18= new int[3];
        
        if (iNum1 <= 18) {iNum1 = iMen18 [0];}
        if (iNum2 <= 18) {iNum2 = iMen18 [1];}
        if (iNum3 <= 18) {iNum3 = iMen18 [2];}

        System.out.println(iMen18[0] + "-" + iMen18[1]+ "-" +iMen18[2]);

        miScan.close();
    }
}