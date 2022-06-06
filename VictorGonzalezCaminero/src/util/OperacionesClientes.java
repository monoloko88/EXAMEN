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
			if (arrayClientes[i] != null) {
				if (arrayClientes[i].getNombre().equals(nombre)) {
					for (int j = i; j < arrayClientes.length - 1; j++) {
						arrayClientes[j] = arrayClientes[j + 1];
					}
					arrayClientes[arrayClientes.length - 1] = null;
					i--;
					deleted = true;
					System.out.println("Cliente borrado.");
				}

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
		boolean found = false;
		for (Cliente cliente : arrayClientes) {
			if (cliente != null && cliente.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Cliente encontrado.");
				System.out.println(cliente.toString());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Cliente no encontrado.");
		}
	}
}
