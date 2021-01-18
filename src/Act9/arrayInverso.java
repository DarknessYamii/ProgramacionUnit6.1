package Act9;

import java.util.Scanner;

/**
 * Act9 de expansion Arrays Elabore un programa que permita introducir 20
 * elementos de tipo entero en un arreglo, el programa mostrara impreso el
 * arreglo en orden inverso.
 * 
 * @author andre
 *
 */
public class arrayInverso {

	public static void main(String[] args) {
		int array[] = new int[20];
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Introduzca 20 numeros");
		// for para introducir los valores al array
		for (i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// for para empezar desde el ultimo numero del array e ira disminuyendo hasta el
		// primero
		for (i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

}
