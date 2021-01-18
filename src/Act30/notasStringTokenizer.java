package Act30;

import java.util.StringTokenizer;

/**
 * Act30 expansion arrays y string Tenemos una cadena ‘notas’ con los nombres y
 * las notas de 5 de los alumnos de clase. El contenido de la cadena es el
 * siguiente: “Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n
 * 6.3” El formato es “nombre \n nota \n...” Realiza un programa que muestre por
 * pantalla por cada alumno lo siguiente: El alumno X ha sacado la nota Y. Usar
 * StringTokenizer
 * 
 * @author andre
 *
 */
public class notasStringTokenizer {

	public static void main(String[] args) {

		String notas = "Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
		StringTokenizer str = new StringTokenizer(notas, "\n");
		while (str.hasMoreTokens()) {
			System.out.println("El Alumno " + str.nextToken() + "ha sacado un" + str.nextToken());

		}

	}

}
