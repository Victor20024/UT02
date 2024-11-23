/* 8. ActividadUT02. Probabilidad de aprobar
 Crea un programa que muestre de forma aleatoria la nota obtenida por un alumno en un examen. Dicha nota estará comprendida entre 0 y
 10 y deberás mostrar por pantalla su valor entero.
 Nota: investiga el método random de la clase Math. */

public class UT02_A8 {

    public static void main (String[] args){

    double notas = Math.ceil(Math.random()*10);
    
    System.out.println(notas);
    }

}
