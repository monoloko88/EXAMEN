package util;

import java.util.ArrayList;
import java.util.Iterator;

import datos.Libro;
import datos.Narrativa;
import datos.Poesia;

public class OperacionesLibros {
	private ArrayList<Libro> arrayListLibros;

	public OperacionesLibros(ArrayList<Libro> arrayListLibros) {
		this.arrayListLibros = arrayListLibros;
	}

	public void addLibro(String nombre, boolean nP) {
		int id = 0;

		for (int i = 0; i < arrayListLibros.size(); i++) {
			if (i != arrayListLibros.get(i).getId()) {
				id = i;
			} else {
				id = i + 1;
			}
		}

		if (nP) {
			arrayListLibros.add(new Narrativa(nombre, id));
		} else {
			arrayListLibros.add(new Poesia(nombre, id));
		}

		System.out.println("Libro añadido.");
	}

	public void deleteLibro(String nombre) {
		Libro libro = null;
		boolean deleted = false;

		Iterator<Libro> it = arrayListLibros.iterator();

		while (it.hasNext()) {
			libro = (Libro) it.next();
			if (libro.getNombre().equalsIgnoreCase(nombre)) {
				it.remove();
				deleted = true;
				System.out.println("Libro eliminado.");
			}
		}

		if (!deleted) {
			System.out.println("Libro no encontrado.");
		}
	}

	public void mostrarLibro() {
		for (Libro libro : arrayListLibros) {
			System.out.println(libro);
		}
	}

	public void buscarLibro(String nombre) {
		for (Libro libro : arrayListLibros) {
			if (libro.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Libro encontrado.");
				System.out.println(libro.toString());
				break;
			} else {
				System.out.println("Libro no encontrado.");
				break;
			}
		}
	}
}
