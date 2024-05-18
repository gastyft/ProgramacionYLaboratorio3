package com.practicaGeneracidad.documento;

public class Documento {
    private static  int autoId=0 ;
    private  final int id;
    private String titulo;
    private String contenido;
    private String autor;

    public Documento(String titulo, String contenido, String autor) {
        this.id=autoId++;
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nDocumento" +
                "\nid= " + id +
                "\ntitulo: " + titulo+
                "\ncontenido: " + contenido +
                "\nautor: " + autor;
    }
}
