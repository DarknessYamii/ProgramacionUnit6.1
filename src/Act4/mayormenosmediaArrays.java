package Act4;

import java.util.Scanner;
/**
 * Act 4 de la expansion de actividades
 * Leer un array de 10 elementos enteros y mostrar el valor del elemento mayor,
 *	menor y la media aritmética.
 * 
 * @author andre
 *
 */
public class mayormenosmediaArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int mayor=-99999,menor=99999,media=0;
		//For para recorrer el array
		System.out.println("Introduzca 10 valores");
		for(int i = 0 ; i<array.length;i++) {
			int num = sc.nextInt();
			array[i] = num;
			media = array[i] + media;
			// Ponemos if para que dentro de este se intercambien los valores de la variable
			// mayor si se cumple la condicion
			if (mayor < array[i]) {
				mayor = array[i];
			}
			// Ponemos if para que dentro de este se intercambien los valores de la variable
			// menor si se cumple la condicion
			if (menor > array[i]) {
				menor = array[i];
			}
		}
		media = media/10;
		System.out.println("El numero mayor es "+mayor);
		System.out.println("El numero menor es "+menor);
		System.out.println("La media de los valores es: "+media);
	}

}
