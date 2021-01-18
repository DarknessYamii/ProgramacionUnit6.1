package Act36;

import java.util.Scanner;

import Biblioteca.Array2D;
import Biblioteca.MyAlphabeticSoup;
import Biblioteca.MyString;

/**
 * Crear un programa que realice una sopa de letras. La sopa de letras tendr� un
 * tama�o de matriz 15x15. El programa pedir� 10 palabras, las cuales las ir�
 * escondiendo de forma aleatoria por la matriz (obviamente las palabras siempre
 * tendr�n 15 letras o menos). Una vez escondidas las palabras rellenar� las
 * dem�s casillas de la matriz con letras de forma aleatoria. S�lo se utilizar�n
 * may�sculas. Si el usuario introduce palabras en min�sculas se transformar�n a
 * may�sculas.
 * 
 * @author andre
 *
 */
public class sopaLetra {

	public static void main(String[] args) {
		char Soup[][] = new char[15][15];
		String palabras[] = new String[10];
		Array2D charOcupadas = new Array2D(2);
		Scanner sc = new Scanner(System.in);
		MyString.randomLetras(Soup, 'A', 'Z' + 1);
		System.out.println(MyString.deepToString(Soup));
		System.out.println("Introduce 10 palabras de como maximo 15 letras");
		for (int i = 0; i < palabras.length; i++) {
			do {
				System.out.println("Palabra numero " + (i + 1));
				palabras[i] = sc.nextLine().toUpperCase();
			} while (palabras[i].length() > 15);
		}

		for (String s : palabras) {

			MyAlphabeticSoup.colocarLetras(s, Soup, charOcupadas);

		}

		System.out.println(MyString.deepToString(Soup));

	}

}
