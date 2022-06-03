package util;

import datos.Cliente;

public class OperacionesClientes {
	private Cliente[] arrayClientes;

	public OperacionesClientes(Cliente[] arrayClientes) {
		this.arrayClientes = arrayClientes;
	}

	public void addCliente(String nombre, int edad) {
		Cliente cliente1 = new Cliente(nombre, edad);
		boolean added = false;

		for (int i = 0; i < arrayClientes.length; i++) {
			if (arrayClientes[i] == null) {
				arrayClientes[i] = cliente1;
				added = true;
				System.out.println("Cliente añadido.");
				break;
			}
		}

		if (!added) {
			System.out.println("No se pueden añadir mas clientes.");
		}
	}

	public void deleteCliente(String nombre) {
		boolean deleted = false;

		for (int i = 0; i < arrayClientes.length; i++) {
			if (arrayClientes[i].getNombre().equalsIgnoreCase(nombre)) {
				arrayClientes[i] = null;
				deleted = true;

				System.out.println("Cliente eliminado.");
				break;
			}
		}

		if (!deleted) {
			System.out.println("Cliente no encontrado.");
		}
	}

	public void mostrarCliente() {
		for (Cliente cliente : arrayClientes) {
			if (cliente != null) {
				System.out.println(cliente.toString());
			}
		}
	}

	public void buscarCliente(String nombre) {
		for (Cliente cliente : arrayClientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Cliente encontrado.");
				System.out.println(cliente.toString());
				break;
			} else {
				System.out.println("Cliente no encontrado.");
				break;
			}
		}
	}
}
