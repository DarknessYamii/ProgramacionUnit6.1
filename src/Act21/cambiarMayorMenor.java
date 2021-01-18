package Act21;

import java.util.Arrays;

import Biblioteca.MyArrays;

/**
 * Act21 de la expansion de arrays Dadas dos matrices A y B intercambiar los
 * mínimos de A con los máximos de B.
 * 
 * @author andre
 *
 */
public class cambiarMayorMenor {

	public static void main(String[] args) {
		int A[][] = new int[5][5];
		int B[][] = new int[5][5];
		MyArrays.randomArr(A, 10, 1);
		MyArrays.randomArr(B, 10, 1);
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(B));
		// Posiciones que va a cambiar
//		System.out.println(Arrays.deepToString(MyArrays.linearSearch(B, MyArrays.mayorArray(B))));
//		System.out.println(Arrays.deepToString(MyArrays.linearSearch(A, MyArrays.menorArray(A))));
		System.out.println("El numero ha intercambiar por los menores de A es :" + MyArrays.mayorArray(B));
		System.out.println("El numero ha intercambiar por los mayores de B es :" + MyArrays.menorArray(A));
		MyArrays.swaper(A, B);
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(B));
	}

}
