package Boletines.Boletin15;

public class Multimedia {


    private String titulo;
    private String autor;
    private String formato;
    private int duracion;



    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }



    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
    }



}