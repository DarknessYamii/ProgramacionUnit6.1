package Act26;

import java.util.Scanner;

import Biblioteca.MyString;

/**
 * Act26 expansion de Arrays String Leer una cadena y encriptarla empleando el
 * método Cesar, que consiste en desplazar cada carácter 3 posiciones.
 * 
 * @author andre
 *
 */
public class metodoCesar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba algo");
		String str = sc.nextLine();
		System.out.println(MyString.caesarMethod(str, 3));
		// Con estas 3 lineas podrias modificar el salto de posiciones manualmente
//		System.out.println("Introduzca cuantas posiciones desea desplazar");
//		int offset = sc.nextInt();
//		System.out.println(MyString.caesarMethod(str, offset));

	}

}
