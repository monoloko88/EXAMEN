package util;


import datos.Cliente;
import datos.Libro;

public class OperacionesClientes {
	private Cliente[] arrayClientes;
	private Cliente cliente;
	public OperacionesClientes(Cliente[] arrayClientes) {
		this.arrayClientes = arrayClientes;
		
	}

	public void addCliente(String nombre, int edad) {
		cliente = new Cliente(nombre, edad);
		
		for (int i = 0; i < arrayClientes.length; i++) {
			if(arrayClientes[i] == null)
			arrayClientes[i] = cliente;
			System.out.println("Cliente añadido.");
		}
		
	}

	public void deleteCliente(String nombre) {
		for (Cliente cliente : arrayClientes) {
			if(cliente.getNombre().equalsIgnoreCase(nombre)) {
				cliente = null;
				System.out.println("Cliente eliminado.");
			}else {
				System.out.println("Cliente no encontrado.");
			}
		}
	}

	public void mostrarCliente() {
		if (arrayClientes.length > 0) {
			for (Cliente cliente : arrayClientes) {
				System.out.println(cliente);
			}
		} else {
			System.out.println("No hay clientes.");
		}
	}

	public void buscarCliente(String nombre) {
		for (Cliente cliente : arrayClientes) {
			if(cliente.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Cliente encontrado.");
				cliente.toString();
			}else {
				System.out.println("Cliente no encontrado.");
			}
		}
	}

}
