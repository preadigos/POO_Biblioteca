
import java.util.ArrayList;

public class Bibliotecario {

    String nombre;
    Biblioteca biblioteca;

    public Bibliotecario(String nombre, Biblioteca biblioteca) {
        //super();
        this.nombre = nombre;
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Bibliotecario [nombre=" + nombre + ", biblioteca=" + biblioteca + "]";
    }

    void mostrarInventario() {
        biblioteca.mostrarInventario();
    }

    void recibirLibros(ArrayList<Libro> cl) {
        biblioteca.InventarioLibros.addAll(cl);
    }
    
    public Boolean estaLibro(Libro libro){
        return biblioteca.InventarioLibros.contains(libro);
    }

    public void prestarLibro(Libro libro){
        if (this.estaLibro(libro) && (!libro.estaPrestado)){
            libro.estaPrestado=true;
        }
    }
    
}
