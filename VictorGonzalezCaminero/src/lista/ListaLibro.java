package lista;

import java.util.ArrayList;
import java.util.Scanner;

import datos.Libro;
import menu.Menu;
import util.OperacionesLibros;

public class ListaLibro {
	private Scanner scan = new Scanner(System.in);
	private static int opcion = 0;

	private ArrayList<Libro> arrayListLibros = new ArrayList<Libro>();

	private OperacionesLibros oL = new OperacionesLibros(arrayListLibros);

	private String nombre;
	private String narrativaPoesia;
	private boolean nP;

	public ListaLibro() {

		Menu menu = new Menu();
		

		do {
			menu.menuLibros();
			System.out.print("Introducir una opcion: ");
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Agregar Libro");
				System.out.println("Ingrese el nombre del libro");
				nombre = scan.next();
				System.out.println("Elija: Narrativa o Poesia.");
				narrativaPoesia = scan.next();
				if(narrativaPoesia.equalsIgnoreCase("Narrativa")) {
					nP = true;
				}else {
					nP = false;
				}
				oL.addLibro(nombre,nP);
//				oL.addLibro(nombre);
				break;
			case 2:
				if (arrayListLibros.size() > 0) {
					System.out.println("Borrar Libro");
					System.out.println("Ingrese el nombre del libro");
					nombre = scan.next();

					oL.deleteLibro(nombre);
				} else {
					System.out.println("No hay libros.");
				}
				break;
			case 3:
				oL.mostrarLibro();
				break;
			case 4:
				if (arrayListLibros.size() > 0) {
					System.out.println("Buscar Libro");
					System.out.println("Ingrese el nombre del libro");
					nombre = scan.next();
					oL.buscarLibro(nombre);
				} else {
					System.out.println("No hay libros.");
				}
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}
}
