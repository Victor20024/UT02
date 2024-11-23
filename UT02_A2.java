/*2. ActividadUT02-2. Suma de enteros
Crear un programa que pida dos números enteros (primero uno y luego otro) y muestre a continuación “la suma de <n1> y <n2> es <n1+n2>”*/

import java.util.Scanner; //importamos el paquete necesario para poder usar la clase Scanner
public class UT02_A2  // método principal que inicia la aplicación
{
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in ); // clase Scanner para petición de datos
		int n1; //definimos primera variable numérica
		int n2; //definimos segunda variable numérica

		System.out.print( "Introducir primer número: " );
		n1 = entrada.nextInt(); // pedimos el primer número al usuario
		System.out.print( "Introducir segundo número: " );
		n2 = entrada.nextInt(); // pedimos el segundo número al usuario

		int resultado = n1 + n2; //variable que almacena el resultado pedido por el ejercicio

		System.out.println("La suma de " +n1+ " y " +n2+ " es: " +resultado ); // salida por pantalla

		entrada.close();
	} // Fin de la funcion main
}  // Fin de la clase


