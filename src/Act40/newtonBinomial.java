package Act40;

import java.util.Scanner;

import Biblioteca.MyMath;

/**
 * Act40 de expansion de array String Elabora el triangulo de Pascal
 * 
 * @author andre
 *
 */
public class newtonBinomial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Filas de Pascal: ");
		MyMath.printNewtonBinomial(sc.nextInt());

	}

}
