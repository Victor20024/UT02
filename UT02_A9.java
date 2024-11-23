/*9. ActividadUT02-9. Tipo enumerado Planetas.
Crear un tipo enumerado llamado Planetas que contenga los 8 planetas del Sistema Solar (Mercurio, Venus, Tierra, Marte, Júpiter, Saturno, Urano y Neptuno).
Crea dos variables tipo Planetas que contenta el nombre del primero y del último respectivamente y muestra el texto relativo al nombre del primer planeta, muestra por pantalla:
•	Los nombres de los planetas.
•	La posición que ocupa cada uno en el listado (método ordinal()).
•	Número de planetas existentes(con values() se obtine un array de sus componentes que tiene. Al array podrás aplicar la propiedad length para mostrar su tamaño. */

public class UT02_A9{

    public enum Planetas {Mercurio, Venus, Tierra, Marte, Júpiter, Saturno, Urano, Neptuno};
    
    public static void main(String[] args){
              
        Planetas pPrimP = Planetas.Mercurio;
        Planetas pUltiP = Planetas.Neptuno;

        System.out.println("El primer planeta es: " +pPrimP);
        System.out.println("El último planeta es: " +pUltiP);

        System.out.println("La posición del primer planeta es: " + pUltiP.ordinal());
        System.out.println("La posición del primer planeta es: " + pUltiP.ordinal());

        System.out.println("El número de planetas es " + Planetas.values().length);

    }

}