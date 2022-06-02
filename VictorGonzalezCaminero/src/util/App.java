package util;

import java.util.Scanner;

import lista.ListaCliente;
import lista.ListaLibro;
import menu.Menu;

public class App {
	private static Scanner scan = new Scanner(System.in);
	private static int opcion = 0;

	public static void main(String[] args) {

		System.out.println("GESTION DE LA LIBRERIA");

		Menu menu = new Menu();
		do {
		menu.menuInicial();

		
			System.out.print("Introducir una opcion: ");
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				ListaLibro listaLibro = new ListaLibro();
				break;
			case 2:
				ListaCliente listaCliente = new ListaCliente();
				break;

			default:
				break;
			}
		} while (opcion != 0);
		System.out.println("Muchas Gracias. Adios.");
	}

}
