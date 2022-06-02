package datos;

public class Poesia extends Libro {
	private String tipo;
	
	public Poesia(String nombre, int id) {
		super(nombre, id);
		this.tipo = "Poesia";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Tipo: " +tipo;
	}

}
