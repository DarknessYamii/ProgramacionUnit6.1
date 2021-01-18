package Act23;

import java.util.Arrays;

import Biblioteca.MyArrays;

/**
 * Act23 de expansion de arrays Realiza un programa que a partir de dos arrays
 * determine si uno está contenido en el otro.
 * 
 * @author andre
 *
 */
public class contenciondeArrays {

	public static void main(String[] args) {
		int A[] = new int[20];
		int B[] = new int[2];
		MyArrays.randomArr(A, 9, 1);
		MyArrays.randomArr(B, 9, 1);
		System.out.println("Array mayor: " + Arrays.toString(A));
		System.out.println("Array menor: " + Arrays.toString(B));
		System.out.println("Contiene array mayor, a array menor(" + Arrays.toString(B) + "): ");
		System.out.println(MyArrays.contenido(A, B));
	}

}
