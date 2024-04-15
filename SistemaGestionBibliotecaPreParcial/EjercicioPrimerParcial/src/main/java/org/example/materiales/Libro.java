package org.example.materiales;

public class Libro extends Materiales {

private String autor;

    public Libro(String titulo, String autor, int cant) {
        super(titulo,cant);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro: "+ super.toString() +
                "autor: " + autor +"\n------------------------------------";

    }

}
