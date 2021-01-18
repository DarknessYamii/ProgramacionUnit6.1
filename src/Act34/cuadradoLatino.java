package Act34;

import java.util.Scanner;

import Biblioteca.MyArrays;
/**
 * Act34 expansion array string
 * Diseñar un programa que muestre un cuadrado latino de N x N.
 * @author andre
 *
 */
public class cuadradoLatino {

	public static void main(String[] args) {
		System.out.println("Cuan grande desea la Matriz Latina");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MyArrays.latinSquare(n);

	}

}
