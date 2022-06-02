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
	private int id;

	public ListaLibro() {
		
		Menu menu = new Menu();
		menu.menuLibros();
		
		do {
			System.out.print("Introducir una opcion: ");
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Agregar Libro");
				System.out.println("Ingrese el nombre del libro");
				nombre = scan.next();

				oL.addLibro(nombre);
				break;
			case 2:
				System.out.println("Borrar Libro");
				System.out.println("Ingrese el nombre del libro");
				nombre = scan.next();

				oL.deleteLibro(nombre);
				break;
			case 3:
				oL.mostrarLibro();
				break;
			case 4:
				System.out.println("Buscar Libro");
				System.out.println("Ingrese el nombre del libro");
				nombre = scan.next();
				oL.buscarLibro(nombre);
				break;
			default:
				break;
			}
		} while (opcion != 0);
		
	}
}
