package Ejercicio_Propuesto_1;

public class Libro {
    protected String titulo; protected String autor; protected float precio;
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public float getPrecio() { return precio; }
    public void setPrecio(float precio) { this.precio = precio; }

    public void dataPrint(){
        System.out.println("=====================");
        System.out.println("->   T Í T U L O  <-");
        System.out.println("->    " + titulo + "    <-");
        System.out.println("=====================");
        System.out.println("->    A U T O R   <-");
        System.out.println("->    " + autor + "    <-");
        System.out.println("=====================");
        System.out.println("->   P R E C I O  <-");
        System.out.println("->     " + precio + "     <-");
        System.out.println("=====================");
        System.out.println(" ");
    }
}

class LibrosTexto extends Libro{
    protected String curso;
    public LibrosTexto(String titulo, String autor, float precio, String curso){
        super(titulo, autor);
        this.precio = precio;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void dataPrint(){
        System.out.println("=====================");
        System.out.println("->   T Í T U L O  <-");
        System.out.println("->    " + titulo + "    <-");
        System.out.println("=====================");
        System.out.println("->    A U T O R   <-");
        System.out.println("->    " + autor + "    <-");
        System.out.println("=====================");
        System.out.println("->   P R E C I O  <-");
        System.out.println("->     " + precio + "     <-");
        System.out.println("=====================");
        System.out.println("->    C U R S O   <-");
        System.out.println("->     " + curso + "     <-");
        System.out.println("=====================");
        System.out.println(" ");
    }
}

class LibrosUNC extends LibrosTexto{
    protected String facultad;
    public LibrosUNC(String titulo, String autor, float precio, String curso, String facultad){
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void dataPrint(){
        System.out.println("=====================");
        System.out.println("->   T Í T U L O  <-");
        System.out.println("->    " + titulo + "    <-");
        System.out.println("=====================");
        System.out.println("->    A U T O R   <-");
        System.out.println("->    " + autor + "    <-");
        System.out.println("=====================");
        System.out.println("->   P R E C I O  <-");
        System.out.println("->     " + precio + "     <-");
        System.out.println("=====================");
        System.out.println("->    C U R S O   <-");
        System.out.println("->     " + curso + "     <-");
        System.out.println("=====================");
        System.out.println("-> F A C U L T A D <-");
        System.out.println("->  " + facultad + "  <-");
        System.out.println("=====================");
        System.out.println(" ");
    }
}

class Novelas extends LibrosTexto{
    protected String tipo;
    public Novelas(String titulo, String autor, float precio, String curso, String tipo){
        super(titulo, autor, precio, curso);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void dataPrint(){
        System.out.println("=====================");
        System.out.println("->   T Í T U L O  <-");
        System.out.println("->    " + titulo + "    <-");
        System.out.println("=====================");
        System.out.println("->    A U T O R   <-");
        System.out.println("->    " + autor + "    <-");
        System.out.println("=====================");
        System.out.println("->   P R E C I O  <-");
        System.out.println("->     " + precio + "     <-");
        System.out.println("=====================");
        System.out.println("->    C U R S O   <-");
        System.out.println("->     " + curso + "     <-");
        System.out.println("=====================");
        System.out.println("->     T I P O    <-");
        System.out.println("->    " + tipo + "    <-");
        System.out.println("=====================");
        System.out.println(" ");
    }
}

class TestLibro{
    public static void main(String[] args) {
        LibrosTexto librosTexto_1 = new LibrosTexto("La ciudad de las bestias","Isabel Allende",60,"Primaria");
        LibrosUNC librosUNC_1 = new LibrosUNC("Estadística Descriptiva", "Rufino Moya" , 30, "Semestre I", "Tecnología");
        Novelas novelas_1 = new Novelas("Moby Dick", "Herman Melville", 150, "Secundario", "Ficción");
        librosTexto_1.dataPrint();
        librosUNC_1.dataPrint();
        novelas_1.dataPrint();
    }
}


