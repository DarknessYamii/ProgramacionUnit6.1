package Act17;

import java.util.Arrays;

import Biblioteca.MyArrays;

/**
 * Act17 de expansion de arrays Dado una matriz determinar la posición (i, j)
 * del mayor y menor.
 * 
 * @author andre
 *
 */
public class mayorymenorMatriz {

	public static void main(String[] args) {
		int A[][] = new int[5][5];
		MyArrays.randomArr(A, 10, 1);
		System.out.println(MyArrays.deepToString(A));
		System.out.println(
				"Las posiciones del numero mayor: " + MyArrays.mayorArray(A) + " son las siguientes posiciones: "
						+ Arrays.deepToString(MyArrays.linearSearch(A, MyArrays.mayorArray(A))));
		System.out.println(
				"Las posiciones del numero menor: " + MyArrays.menorArray(A) + " son las siguinetes posiciones: "
						+ Arrays.deepToString(MyArrays.linearSearch(A, MyArrays.menorArray(A))));
	}
	/**
	 * 
	 * [[3, 3, 3, 4, 4], [0, 2, 3, 1, 4]] [3,0],[3,2]
	 */

}
