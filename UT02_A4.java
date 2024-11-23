import java.util.Scanner;

public class UT02_A4 {
    public static void main (String[] args){

        Scanner entrada = new Scanner (System.in);
        double iNum1, iNum2, iNum3;

        System.out.println("Introducir los 3 números a comparar: ");
        iNum1 = entrada.nextInt();
        iNum2 = entrada.nextInt();
        iNum3 = entrada.nextInt();

        double resultado = (iNum1 > iNum2 && iNum1 > iNum3)? iNum1: (iNum2 > iNum3)? iNum2: iNum3;
        
        System.out.println("El mayor de los número introducidos es: " +resultado);
        
        entrada.close();
    }
}
