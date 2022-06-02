package datos;

public class Poesia extends Libro {
	private String autor;
	
	public Poesia(String nombre, int id, String autor) {
		super(nombre, id);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
