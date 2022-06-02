package util;

import datos.Cliente;
import datos.Libro;

public class OperacionesClientes {
	private Cliente[] arrayClientes;
	private Cliente cliente1;

	public OperacionesClientes(Cliente[] arrayClientes) {
		this.arrayClientes = arrayClientes;

	}

	public void addCliente(String nombre, int edad) {
		cliente1 = new Cliente(nombre, edad);
		
		if(arrayClientes[arrayClientes.length-1] == null) {
			for (Cliente cliente : arrayClientes) {
				if (cliente == null) {
					cliente = cliente1;
					System.out.println("Cliente añadido.");
					break;
				}
			}
		}else {
			System.out.println("No se pueden añadir mas clientes.");
		}
		
	}

	public void deleteCliente(String nombre) {
		for (Cliente cliente : arrayClientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {
				cliente = null;
				System.out.println("Cliente eliminado.");
			} else {
				System.out.println("Cliente no encontrado.");
			}
		}
	}

	public void mostrarCliente() {
		if (arrayClientes[0] != null) {
			for (Cliente cliente : arrayClientes) {
				System.out.println(cliente);
			}
		} else {
			System.out.println("No hay clientes.");
		}
	}

	public void buscarCliente(String nombre) {
		for (Cliente cliente : arrayClientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Cliente encontrado.");
				cliente.toString();
			} else {
				System.out.println("Cliente no encontrado.");
			}
		}
	}

}
