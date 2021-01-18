package Act32;

import java.util.Scanner;

import Biblioteca.MyMath;

/**
 * Act32 de expansion de arrays y string Realiza un método esCapicua que tome
 * como parámetro un entero y devuelva true si el número es capicúa y false en
 * caso contrario.
 * 
 * @author andre
 *
 */
public class esCapicua {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (MyMath.esCapicua(n)) {
			System.out.println("El numero " + n + " es Capicua");
			System.out.println(MyMath.esCapicua(n));// Por si necesita mas informacion sobre si es true o false
		} else {
			System.out.println("El numero " + n + " NO es Capicua");
			System.out.println(MyMath.esCapicua(n)); // Por si necesita mas informacion sobre si es true o false
		}

	}

}
