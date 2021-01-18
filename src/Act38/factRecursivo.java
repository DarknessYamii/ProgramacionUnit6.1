package Act38;

import java.util.Scanner;

import Biblioteca.MyMath;

/**
 * Act38 expansion arrays y string Realiza una clase con un método factorial que
 * utilizando la recursividad genere el factorial de un número dado.
 * 
 * @author andre
 *
 */
public class factRecursivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero a factorizar");
		int n = sc.nextInt();
		System.out.println(MyMath.fact(n));
	}

}
