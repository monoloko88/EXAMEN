package lista;

import java.util.ArrayList;
import java.util.Scanner;

import datos.Libro;
import menu.Menu;
import util.OperacionesLibros;

public class ListaLibro {
	private Scanner scan = new Scanner(System.in);
	private int opcion = 0;

	private String nombre;
	private String narrativaPoesia;
	private boolean nP;

	private ArrayList<Libro> arrayListLibros = new ArrayList<Libro>();
	private OperacionesLibros oL = new OperacionesLibros(arrayListLibros);

	public void libros() {
		Menu menu = new Menu();

		do {
			menu.menuLibros();
			System.out.print("Introducir una opcion: ");
			opcion = scan.nextInt();
			scan.nextLine();

			System.out.println("----------------------------------------");
			switch (opcion) {
				case 1:
					System.out.println("Agregar Libro");
					System.out.print("Ingrese el nombre del libro: ");
					nombre = scan.nextLine();
					System.out.println(
							"Indique la tematica del libro: (N) Narrativa o (P) Poesia. \nSi no indica nada se considerara como Narrativa.");
					narrativaPoesia = scan.nextLine();

					if (narrativaPoesia.length() > 0 && narrativaPoesia.substring(0, 1).equalsIgnoreCase("P")) {
						nP = false;
					} else {
						nP = true;
					}

					oL.addLibro(nombre, nP);
					break;
				case 2:
					if (arrayListLibros.size() > 0) {
						System.out.println("Borrar Libro");
						oL.mostrarLibro();
						System.out.print("Ingrese el nombre o el id del libro que desea eliminar: ");
						nombre = scan.nextLine();

						oL.deleteLibro(nombre);
					} else {
						System.out.println("La base de datos de libros está vacia.");
					}
					break;
				case 3:
					if (arrayListLibros.size() > 0) {
						oL.mostrarLibro();
					} else {
						System.out.println("La base de datos de libros está vacia.");
					}
					break;
				case 4:
					if (arrayListLibros.size() > 0) {
						System.out.println("Buscar Libro");
						System.out.print("Ingrese el nombre del libro: ");
						nombre = scan.nextLine();

						oL.buscarLibro(nombre);
					} else {
						System.out.println("La base de datos de libros está vacia.");
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
