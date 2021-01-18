package Act35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgendaElectronica {

	public static void main(String[] args) {
		do {
			System.out.println(Contacto.menu());
			Scanner sc = new Scanner(System.in);
			System.out.println("Que desea hacer:");
			int opcion = sc.nextInt();
			sc.nextLine();
			try {
				switch (opcion) {
				case 1:
					System.out.println("Nombre del contacto:");
					String nombre = sc.nextLine();
					System.out.println("Direccion del contacto:");
					String direccion = sc.nextLine();
					System.out.println("Numero de telefono del contacto:");
					int telefono = sc.nextInt();
					new Contacto(nombre, direccion, telefono);
					break;
				case 2:
					System.out.println("ID del contacto a modificar");
					int mod = sc.nextInt();
					System.out.println("Nombre del contacto:");
					sc.nextLine();
					nombre = sc.nextLine();
					System.out.println("Direccion del contacto:");
					direccion = sc.nextLine();
					System.out.println("Numero de telefono del contacto:");
					telefono = sc.nextInt();
					if (Contacto.Modificacion(mod, nombre, direccion, telefono)) {
						System.out.println("Modificacion correcta");
					} else {
						System.out.println("No existe este contacto");
					}
					break;
				case 3:
					System.out.println("ID del contacto a eliminar");
					int eliminar = sc.nextInt();
					if (Contacto.Eliminar(eliminar)) {
						System.out.println("Eliminacion completado");
					} else {
						System.out.println("No existe ese contacto");
					}
					break;
				case 4:
					Contacto.Listado();
					break;
				case 5:
					System.out.println("Fin del programa");
					System.exit(0);
				default:
					System.out.println("Introduzca una opcion valida");
					break;
				}
			} catch (InputMismatchException e) {
				System.err.println("El telefono o la ID o la opcion no pueden contener letras");
			}
		} while (true);
	}
}
