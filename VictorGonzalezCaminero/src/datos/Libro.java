package datos;

public class Libro {

	// ATRIBUTOS
	private String nombre;
	private int id;

	// CONSTRUCTOR DE LA CLASE
	public Libro(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	// M�TODOS DE ACCESO
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// M�TODO TOSTRING
	@Override
	public String toString() {
		return "Libro [nombre= " + nombre + ", id= " + id + "]";
	}

}
