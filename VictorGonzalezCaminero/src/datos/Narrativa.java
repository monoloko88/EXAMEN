package datos;

public class Narrativa extends Libro {
	private String tipo;

	public Narrativa(String nombre, int id) {
		super(nombre, id);
		this.tipo = "Narrativa";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " Tipo: " + tipo;
	}

}
