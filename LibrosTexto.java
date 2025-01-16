public class LibrosTexto extends Libro {
    protected String curso;

    public LibrosTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
