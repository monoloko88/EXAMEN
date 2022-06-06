package util;

import java.util.ArrayList;
import java.util.Comparator;
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
		ArrayList<Integer> ids = new ArrayList<Integer>();

		for (int i = 0; i < arrayListLibros.size(); i++) {
			if (arrayListLibros.get(i).getId() > id) {
				id = arrayListLibros.get(i).getId();
			} else {
				id++;
			}
			ids.add(arrayListLibros.get(i).getId());
		}

		for (int i = 0; i < id; i++) {
			if (!ids.contains(i)) {
				id = i;
				break;
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
			if (libro.getNombre().equalsIgnoreCase(nombre) || libro.getId() == Integer.parseInt(nombre)) {
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
		arrayListLibros.sort(Comparator.comparing(Libro::getId));
		for (Libro libro : arrayListLibros) {
			System.out.println(libro);
		}
	}

	public void buscarLibro(String nombre) {
		boolean found = false;
		for (Libro libro : arrayListLibros) {
			if (libro.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Libro encontrado.");
				System.out.println(libro.toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("Libro no encontrado.");
		}
	}
}
