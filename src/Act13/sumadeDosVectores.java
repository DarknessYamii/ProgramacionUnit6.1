package Act13;

import java.util.Arrays;
import java.util.Random;

/**
 * Act13 de expansion de Arrays Dado dos vectores A y B de 15 elementos cada
 * uno, obtener un vector C donde la posición i se almacene la suma de A[i]+B[i]
 * y mostrar el mayor de los C[i].
 * 
 * @author andre
 *
 */
public class sumadeDosVectores {

	public static void main(String[] args) {
		int mayor=-9999,i;
		int A[] = new int[15];
		int B[] = new int[15];
		int C[] = new int[15];
		Random r = new Random();
		for(i=0;i<A.length;i++) {
			A[i] = r.nextInt(10);
		}
		for(i=0;i<B.length;i++) {
			B[i] = r.nextInt(10);
		}
		for(i=0;i<C.length;i++) {
			C[i] = A[i]+B[i];
			if(mayor<C[i]) {
				mayor=C[i];
			}
		}
		System.out.println(Arrays.toString(C));
		System.out.println("El mayor es "+mayor);
	}

}
