import java.util.Scanner;

public class UT02_A7{

    public static void main (String[] args){

        int iPer, iArea, iAncho, iLargo;
        Scanner entrada = new Scanner (System.in);

        System.out.println("Introducir la longitud del ancho y largo: ");
        iLargo = entrada.nextInt();
        iAncho = entrada.nextInt();

        iPer = 2 * iLargo + 2 * iAncho;
        iArea = iLargo * iAncho;

        System.out.println("El rectángulo tiene de lados: " +iLargo+ " " +iAncho+ " , el perímetro es de " +iPer+ " y el área es de " + iArea);

        entrada.close();
    }
}