package Act29;

import java.util.Scanner;

import Biblioteca.MyString;

/**
 * Act29 expansion array String Verificar si una cadena de texto almacenada en
 * la String nif, es un NIF correcto o no. Si lo es, se mostrará por consola su
 * parte numérica; si no lo es se mostrará el mensaje "NIF no valido". Se tendrá
 * en cuenta lo siguiente:
 * 
 * @author andre
 *
 */
public class isNIF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un NIF (11111111T)");
		String NIF = sc.next();
		if (MyString.esNIF(NIF)) {
			System.out.println("El NIF " + NIF + " es valido");
		} else {
			System.out.println("El NIF " + NIF + " NO es valido");
		}
	}

}
