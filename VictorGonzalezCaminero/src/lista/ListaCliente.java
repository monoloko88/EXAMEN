package lista;

import java.util.Scanner;

import datos.Cliente;
import menu.Menu;
import util.OperacionesClientes;

public class ListaCliente {
	private Scanner scan = new Scanner(System.in);
	private static int opcion = 0;

	private Cliente[] arrayClientes = new Cliente[10];
	private OperacionesClientes oC = new OperacionesClientes(arrayClientes);

	private String nombre;
	private int edad;

	public ListaCliente() {
		Menu menu = new Menu();
		

		do {
			menu.menuCliente();
			System.out.print("Introducir una opcion: ");
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Agregar Cliente");
				System.out.println("Ingrese el nombre del cliente");
				nombre = scan.next();
				System.out.println("Ingrese la edad del cliente");
				edad = scan.nextInt();

				oC.addCliente(nombre, edad);
				break;
			case 2:
				if (arrayClientes[0] != null) {
					System.out.println("Borrar Cliente");
					System.out.println("Ingrese el nombre del cliente");
					nombre = scan.next();

					oC.deleteCliente(nombre);
				} else {
					System.out.println("No hay clientes.");
				}
				break;
			case 3:
				if (arrayClientes[0] != null) {
					oC.mostrarCliente();
				} else {
					System.out.println("No hay clientes.");
				}
				break;
			case 4:
				if (arrayClientes[0] != null) {
					System.out.println("Buscar Cliente");
					System.out.println("Ingrese el nombre del cliente");
					nombre = scan.next();
					oC.buscarCliente(nombre);
				} else {
					System.out.println("No hay clientes.");
				}
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}

}
