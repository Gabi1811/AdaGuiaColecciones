package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*El main, realizaremos un lista de contactos, 
		 * en el cual alojaremos números de contactos dados por el usuario.
		Se ingresaran los respectivos números de contactos mediante un bucle, 
		y luego se guardaran en la lista, aplicar la
		lógica respectiva para estos manejos de datos. 
		También se imprimirán o visualizaran en orden por pantalla/ consola
		una vez que el usuario decida que ya no se agreguen mas números a la lista.*/

		Scanner input = new Scanner(System.in);
		List<Integer> listaDeContactos = new ArrayList<Integer>();
		
		System.out.println("Ingrese la cantidad de contactos que a ingresar");
		int cantidad = input.nextInt();
		
		for (Integer i = 0; i < cantidad; i++) {
			System.out.println("Ingrese un numero de telefo: ");
			Integer tel = input.nextInt();
			listaDeContactos.add(tel);
		}

		Collections.sort(listaDeContactos);
		for (Integer tel : listaDeContactos) {
			System.out.println(tel);
		}
		
		
	

}
}

