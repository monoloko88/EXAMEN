package datos;

public class Cliente {
	
	//ATRIBUTOS
	private String nombre;
	private int edad;
	
	//CONSTRUCTOR DE LA CLASE
	public Cliente(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	//M�TODOS DE ACCESO
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//M�TODO TOSTRING
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
