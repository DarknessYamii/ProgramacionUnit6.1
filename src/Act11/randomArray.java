package Act11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Act11 de expansion de arrays Realiza un programa que cree 1000 números
 * aleatorios y muestre los 10 mayores.
 * 
 * @author andre
 *
 */
public class randomArray {

	public static void main(String[] args) {
		int i;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int array[] = new int[1000];
		for (i = 0; i < array.length; i++) {
			array[i] = r.nextInt(1000) + 1;
		}
		Arrays.sort(array);
		System.out.println("Los 10 mayores son: ");
		for (i = 990; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
