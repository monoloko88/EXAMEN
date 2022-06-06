package lista;

import java.util.Scanner;

import datos.Cliente;
import menu.Menu;
import util.OperacionesClientes;

public class ListaCliente {
	private Scanner scan = new Scanner(System.in);
	private int opcion = 0;

	private String nombre;
	private int edad;

	private Cliente[] arrayClientes = new Cliente[10];
	private OperacionesClientes oC = new OperacionesClientes(arrayClientes);

	public void listaClientes() {
		Menu menu = new Menu();

		do {
			menu.menuCliente();
			System.out.print("Introducir una opcion: ");
			opcion = scan.nextInt();
			scan.nextLine();

			System.out.println("----------------------------------------");
			switch (opcion) {
				case 1:
					if (arrayClientes[arrayClientes.length - 1] == null) {
						System.out.println("Agregar Cliente.");
						System.out.print("Ingrese el nombre del cliente: ");
						nombre = scan.nextLine();
						System.out.print("Ingrese la edad del cliente: ");
						edad = scan.nextInt();

						oC.addCliente(nombre, edad);
					} else {
						System.out.println("No se pueden añadir mas clientes.");
					}
					break;
				case 2:
					if (arrayClientes[0] != null) {
						System.out.println("Borrar Cliente.");
						oC.mostrarCliente();
						System.out.print("Ingrese el nombre del cliente: ");
						nombre = scan.nextLine();

						oC.deleteCliente(nombre);
					} else {
						System.out.println("La base de datos de clientes está vacia.");
					}
					break;
				case 3:
					if (arrayClientes[0] != null) {
						System.out.println("Listar Clientes.");

						oC.mostrarCliente();
					} else {
						System.out.println("La base de datos de clientes está vacia.");
					}
					break;
				case 4:
					if (arrayClientes[0] != null) {
						System.out.println("Buscar Cliente.");
						System.out.print("Ingrese el nombre del cliente: ");
						nombre = scan.nextLine();

						oC.buscarCliente(nombre);
					} else {
						System.out.println("La base de datos de clientes está vacia.");
					}
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion no valida.");
					break;
			}
			System.out.println("----------------------------------------");
		} while (opcion != 0);
	}

}
