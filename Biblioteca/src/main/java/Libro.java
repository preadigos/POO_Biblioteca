
public class Libro {
	String editorial;
	String titulo;
	Autor autor;
        Boolean estaPrestado;
	
	public Libro(String editorial, String titulo, Autor autor, Boolean estaPrestado) {
		super();
		this.editorial = editorial;
		this.titulo = titulo;
		this.autor = autor;
                this.estaPrestado=estaPrestado;
	}

 
	@Override
	public String toString() {
		return "Libro [editorial=" + editorial + ", titulo=" + titulo + ", autor=" + autor + ", esta Prestado=" + estaPrestado + "]";
	}

}
