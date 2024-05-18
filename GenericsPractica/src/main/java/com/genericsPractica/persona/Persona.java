package com.genericsPractica.persona;

public class Persona {

    private static int autoId=0;
    private final int id;
 private String nombre;
 private int edad;

    public Persona(String nombre, int edad) {
        this.id = autoId++;
        this.nombre = nombre;
        this.edad = edad;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Persona.autoId = autoId;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "id=" + id +
                "\nnombre: " + nombre+
                "\nedad= " + edad;
    }
}

