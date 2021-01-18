package Act31;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Act31 de expansion de arrays y String Modifica el código del ejercicio
 * anterior para que las notas se almacenen en un vector de datos double.
 * 
 * @author andre
 *
 */
public class act30Double {

	public static void main(String[] args) {
		String notas = "Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
		String[] separacion = notas.split(" \n ");
		double[] notasDouble = new double[separacion.length/2];
		for (int i =0 ; i<separacion.length;i+=2) {
			System.out.println("El Alumno "+separacion[i]+ " ha sacado un "+separacion[i+1]);
			notasDouble[(i+1)/2] = Double.parseDouble(separacion[i+1]);
		}
		System.out.println(Arrays.toString(notasDouble));
	}

}


