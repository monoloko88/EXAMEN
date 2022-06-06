package util;

import java.util.Scanner;

import lista.ListaCliente;
import lista.ListaLibro;
import menu.Menu;

public class App {
	private static ListaLibro listaLibro = new ListaLibro();
	private static ListaCliente listaCliente = new ListaCliente();
	private static Scanner scan = new Scanner(System.in);
	private static int opcion = 0;

	public static void main(String[] args) {

		System.out.println("GESTION DE LA LIBRERIA");

		Menu menu = new Menu();
		do {
			menu.menuInicial();

			System.out.print("Introducir una opcion: ");
			opcion = scan.nextInt();
			System.out.println("----------------------------------------");
			switch (opcion) {
				case 1:
					listaLibro.libros();
					break;
				case 2:
					listaCliente.listaClientes();
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion no valida.");
					break;
			}
		} while (opcion != 0);
		System.out.println("----------------------------------------");
		System.out.println("Muchas Gracias. Adios.");
	}
}
