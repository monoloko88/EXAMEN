package datos;

public class Narrativa extends Libro {
	private String autor;
	
	public Narrativa(String nombre, int id, String autor) {
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
