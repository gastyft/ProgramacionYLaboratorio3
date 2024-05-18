package com.practicaGeneracidad.producto;

public class Producto {

    private static int autoId=0;
    private final int id;
    private String nombre;
    private int precio;
    private String categoria;

    public Producto(String nombre, int precio, String categoria) {
        this.id= autoId++;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Producto" +
                "\nnombre: " + nombre +
                "\nprecio: " + precio +
                "\ncategoria: " + categoria;
    }
}
