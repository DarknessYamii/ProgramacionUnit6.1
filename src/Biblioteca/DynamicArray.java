package Biblioteca;

import java.util.Arrays;

public class DynamicArray {

	private int array[];
	private int count;


	public DynamicArray() {
		array = new int[5];
		count = 0;
	}

	public void addArr(int d) {

		if (count >= array.length) {
			array = Arrays.copyOf(array, array.length * 2);
		}
		array[count] = d;
		count++;
	}

	public int[] get() {
		return Arrays.copyOf(array, count);
	}

}