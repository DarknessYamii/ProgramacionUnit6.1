package Biblioteca;

import java.util.Arrays;

public class Array2D {

	private int array[][];
	private int count;

	public Array2D(int cols) {
		array = new int[10][cols];
		count = 0;
	}

	public void addMatrix(int[] arr) {

		if (count >= array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
		array[count] = arr;
		count++;
	}

	public int[][] getMatrix() {
		return Arrays.copyOf(array, count);
	}

}
