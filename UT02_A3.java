import java.util.Scanner;

public class UT02_A3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        int n1, n2;

        System.out.println("Introducir primer número: ");
        n1 = entrada.nextInt();
        System.out.println("Introducir segundo número: ");
        n2 = entrada.nextInt();

        int resultado = (n1>n2)?n1:n2;

        System.out.println("El mayor de " +n1+ " y " +n2+ " es " +resultado);

        entrada.close();
    }
}
