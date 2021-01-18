package Act16;

import java.util.Arrays;
import java.util.Scanner;

import Biblioteca.MyArrays;

/**
 * Act16 de las actividades de expansion de arrays Dado dos matrices A y B
 * obtener la suma.
 * 
 * @author andre
 *
 */
public class sumadosmatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[5][2];
		int B[][] = new int[5][2];
		int C[][] = new int[5][2];
		MyArrays.randomArr(A, 10, 1);
		MyArrays.randomArr(B, 10, 1);
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(B));
		System.out.println(Arrays.deepToString(MyArrays.sumaDosMatrices(A, B)));
	}

}
