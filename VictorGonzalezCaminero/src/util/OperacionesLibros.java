package util;

import java.util.ArrayList;
import java.util.Iterator;

import datos.Libro;
import datos.Narrativa;
import datos.Poesia;

public class OperacionesLibros {
	private ArrayList<Libro> arrayListLibros;
	private Libro libro;

	public OperacionesLibros(ArrayList<Libro> arrayListLibros) {
		this.arrayListLibros = arrayListLibros;
	}

	public void addLibro(String nombre) {
		int id = 0;
		for (Libro libro : arrayListLibros) {
			id = libro.getId() + 1;
			System.out.println(id);
		}

		arrayListLibros.add(new Libro(nombre, id));
		System.out.println("Libro añadido.");

	}

	public void deleteLibro(String nombre) {
		Iterator it = arrayListLibros.iterator();

		while (it.hasNext()) {
			libro = (Libro) it.next();
			if (libro.getNombre().equalsIgnoreCase(nombre)) {
				it.remove();
				System.out.println("Libro eliminado.");
			}
		}
	}

	public void mostrarLibro() {
		if (arrayListLibros.size() > 0) {
			for (Libro libro : arrayListLibros) {
				System.out.println(libro);
			}
		} else {
			System.out.println("No hay libros.");
		}
	}

	public void buscarLibro(String nombre) {
		if (arrayListLibros.size() > 0) {
			for (Libro libro : arrayListLibros) {
				if (libro.getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("Libro encontrado.");
					System.out.println(libro);
					break;
				} else {
					System.out.println("Libro no encontrado.");
					break;
				}
			}
		} else {
			System.out.println("No hay libros.");
		}
	}

	public void addLibro(String nombre, boolean nP) {
		int id = 0;
		for (Libro libro : arrayListLibros) {
			id = libro.getId() + 1;
			System.out.println(id);
		}
		if (nP) {
			arrayListLibros.add(new Narrativa(nombre, id));
		}else {
			arrayListLibros.add(new Poesia(nombre, id));
		}

		System.out.println("Libro añadido.");
	}

}
