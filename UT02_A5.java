import java.util.Scanner;

public class UT02_A5 {

    public static void main (String[] arg) {

        int iNum1, iNum2, iNum3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introducir 3 números: ");
        iNum1 = entrada.nextInt();
        iNum2 = entrada.nextInt();
        iNum3 = entrada.nextInt();

        double media = (iNum1 + iNum2 + iNum3) / 3;
        
        System.out.println(" La media de los valores introducidos es: " + media);

        entrada.close();
    }


}

