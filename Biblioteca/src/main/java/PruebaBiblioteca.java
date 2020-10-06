import java.util.ArrayList;

public class PruebaBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*Autor autor;
      Libro libro;
      
      autor = new Autor("Pablo", "Neruda");
      System.out.println("Imprimiendo autor " + autor.toString());
      
      libro = new Libro("Anagrama", "Empato River en Brasil", autor);
      System.out.println("Ahora imprimo el libro: " + libro.toString());*/
      
		casoTestRecibirLibro();
      
	}

	private static void casoTestRecibirLibro() {
		
		
		// TODO Auto-generated method stub
		
		  Autor autor;
	      Libro libro;
	      
	      autor = new Autor("Pablo", "Neruda");
	      System.out.println("Imprimiendo autor " + autor.toString());
	      
	      libro = new Libro("Anagrama", "Empato River en Brasil", autor, false);
	      System.out.println("Ahora imprimo el libro: " + libro.toString());
	      
	      
	      
	      Biblioteca pineyroBiblioteca;
	      ArrayList<Libro> coleccion = new ArrayList<Libro>();
	      coleccion.add(libro);
	     
	      pineyroBiblioteca = new Biblioteca("PineyroBiblioteca", coleccion);
	      Bibliotecario bob = new Bibliotecario("Bob",pineyroBiblioteca);
		
	      
	      Libro libro2 = new Libro("Anagrama", "Gano River en Brasil", autor, false);
	      
	      Libro libro3 = new Libro("Anagrama", "Gano Racing en Uruguay", autor, false);
	      
	      
	      ArrayList<Libro> cl = new ArrayList<Libro>();
	      cl.add(libro2);
	      cl.add(libro3);
	      bob.recibirLibros(cl);
	      
	      System.out.println("Imprimiendo el inventario");
	      bob.mostrarInventario();
              
              System.out.println("Buscamos el libro: "+libro+" en la biblioteca, ¿Está el libro?");
              System.out.println(bob.estaLibro(libro));
	
              
              Libro libro4= new Libro("Anagrama", "Racing campeon", autor, false);
              System.out.println("Buscamos el libro: "+libro4+" en la biblioteca, ¿Está el libro?");
              System.out.println(bob.estaLibro(libro4));
        
              System.out.println("ahora prestamos el libro: "+libro4 +"y el libro:"+libro);
              bob.prestarLibro(libro4);
              bob.prestarLibro(libro);
              System.out.println("el estado de la biblioteca es el siguiente: "+pineyroBiblioteca);
              System.out.println("Y el estado del libro 4 es: "+libro4);
              
              System.out.println("Esto es una prueba de git");
              System.out.println("Esto es otra prueba");
        }
}
