import java.util.Scanner;

public class UT02_A6{

    public static void main (String[] args){

        String sNombre;
        int iEdad;
        Scanner entrada = new Scanner (System.in);
        //int mayor;

        System.out.println("Introducir nombre y edad: ");
        sNombre = entrada.nextLine();
        iEdad = entrada.nextInt();

        String mensaje = (iEdad >= 18)? "eres mayor de edad": "eres menor de edad";
        System.out.println(sNombre + ", " +mensaje);
        entrada.close();
    }

}
