/*Crear una clase Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número
de páginas. Definir 5 instancias y para cada una de ellas informar mediante un método el
número de ISBN, el título y el autor.*/

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    //Constructor
    public Libro(String isbn,String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.isbn = isbn;
    }
    //metodos
    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getAutor() {
        return autor;
    }

    public void infoDelLibro(){
        System.out.println("Titulo: " + titulo+"\nAutor: " + autor+"\nISBN: " + isbn+"\nPaginas: " + paginas);
    }
}
