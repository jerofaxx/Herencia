package BibliotecaHerencia;
public class Libro {

    protected String titulo;
    protected String autor;
    protected double precio; 

    public Libro(String titulo, String autor, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: $" + precio);
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio>=0) {
            this.precio = precio;  
        }
        else {
            System.out.println("El precio no puede ser negativo.");
        }
    }
}