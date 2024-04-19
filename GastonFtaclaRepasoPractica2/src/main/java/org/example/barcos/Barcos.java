package org.example.barcos;

import org.example.Pescados.Pescados;

public abstract class Barcos {
    private final int id;
    private static int autoId=0;
    private String nombre;

    private String marca;
    private  int modelo;

    private int capacidadCombustible;

    private String Patente;

    private int cantidadPescada;
    public Barcos(String nombre, String marca, int modelo, int capacidadCombustible, String Patente) {
        this.id=autoId;
        autoId++;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCombustible = capacidadCombustible;
        this.Patente = Patente;

    }

    public int getId() {
        return id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Barcos.autoId = autoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String Patente) {
        this.Patente = Patente;
    }

    public int getCantidadPescada() {
        return cantidadPescada;
    }

    public void setCantidadPescada(int cantidadPescada) {
        this.cantidadPescada = cantidadPescada;
    }

    @Override
    public String toString() {
        return "Barcos" +
                "\nid: " + id +
                "\n nombre: " + nombre +
                "\nmarca: " + marca +
                "\nmodelo: " + modelo +
                "\ncapacidadCombustible: " + capacidadCombustible +
                "\nPatente: " + Patente;
    }

    abstract public Barcos pescar(Barcos barco);
    abstract  public int vender(Barcos barco, Pescados pescado);
}

