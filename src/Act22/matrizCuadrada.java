package Act22;

import Biblioteca.MyArrays;

/**
 * Act22 expansion de arrays Dada una matriz cuadrada invertir su diagonal
 * principal.
 * 
 * @author andre
 *
 */
public class matrizCuadrada {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		MyArrays.randomArr(array, 9, 1);
		System.out.println(MyArrays.deepToString(array));
		MyArrays.diagonalInversa(array);
		System.out.println(MyArrays.deepToString(array));
	}

}
