package Boletines.Boletin14;

import java.util.logging.Logger;


public class publicacion {

    private int codigo;
    private String titulo;
    private int anoPublicacion;

    public publicacion() {
    }

    public publicacion(int codigo, String titulo, int anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
        return "biblioteca{" + "codigo=" + codigo + ", titulo=" + titulo + ", anoPublicacion=" + anoPublicacion + '}';
    }

    public void anoPublicacion(){

    }

    public int getCodigo() {
        return codigo;
    }



    public int getAnoPublicacion() {
        return anoPublicacion;
    }









}