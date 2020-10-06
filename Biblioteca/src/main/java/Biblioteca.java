
import java.util.ArrayList;

public class Biblioteca {

    String nombre;
    ArrayList<Libro> InventarioLibros;

    public Biblioteca(String nombre, ArrayList<Libro> inventarioLibros) {
        super();
        this.nombre = nombre;
        InventarioLibros = inventarioLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", InventarioLibros=" + InventarioLibros + "]";
    }

    public void guardarEnDeposito(ArrayList<Libro> cl) {
        // TODO Auto-generated method stub
        InventarioLibros.addAll(cl);
    }

    public void mostrarInventario() {
        // TODO Auto-generated method stub
        System.out.println(this.InventarioLibros);

    }

}
