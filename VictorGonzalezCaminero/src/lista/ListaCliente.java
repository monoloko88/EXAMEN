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
		menu.menuCliente();

		do {
			System.out.print("Introducir una opcion: ");
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Agregar Cliente");
				System.out.println("Ingrese el nombre del cliente");
				nombre = scan.next();
				System.out.println("Ingrese la edad del cliente");
				int edad = scan.nextInt();

				oC.addCliente(nombre, edad);
				break;
			case 2:
				System.out.println("Borrar Cliente");
				System.out.println("Ingrese el nombre del cliente");
				nombre = scan.next();

				oC.deleteCliente(nombre);
				break;
			case 3:
				oC.mostrarCliente();
				break;
			case 4:
				System.out.println("Buscar Cliente");
				System.out.println("Ingrese el nombre del cliente");
				nombre = scan.next();
				oC.buscarCliente(nombre);
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}

}
