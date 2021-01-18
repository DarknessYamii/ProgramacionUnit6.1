package Act7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Act 7 de la expansion de actividades Leer un array y efectuar una búsqueda
 * dicotómica.
 * 
 * @author andre
 *
 */
public class busquedaBinaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = { 10, 74, 89, 99, 854, 988, 1042, 4251, 5478, 7844 };
		Arrays.sort(array);
		int indiceAlto, indiceBajo, centro;
		System.out.println("Introduzca el valor a buscar(10,74,89,99,854,988,1042,4251,5478,7844)");
		int numBuscado = sc.nextInt();
		indiceAlto = array.length;
		indiceBajo = 0;
		boolean encontrado = false;
		while (!encontrado) {
			centro = (indiceAlto + indiceBajo) / 2;
			if (array[centro] > numBuscado) {
				indiceAlto = centro;
			} else if (array[centro] < numBuscado) {
				indiceBajo = centro;
			} else if (array[centro] == numBuscado) {
				System.out.println(
						"El numero " + numBuscado + " ha sido encontrado y esta en la posicion " + (centro + 1));
				encontrado = true;
			} else {
				System.out.println("El numero no esta en la lista");
				encontrado = true;
			}
		}

	}

}
