package Act24;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Act24 de expansion de arrays y string
 * 
 * @author andre Realiza un programa que cuente el número de vocales que hay en
 *         una cadena de caracteres.
 */
public class contarVocales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		char vocales[] = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println("Introduce letras o frases de forma continua(Sin pulsar Enter=Finalizar");
		char characters[] = sc.nextLine().toCharArray();
		for (int i = 0; i < characters.length; i++) {
			if (Arrays.binarySearch(vocales, characters[i]) >= 0) {
				cont++;
			}
		}
		System.out.println("Total de vocales repetidas :" + cont);

	}

}
