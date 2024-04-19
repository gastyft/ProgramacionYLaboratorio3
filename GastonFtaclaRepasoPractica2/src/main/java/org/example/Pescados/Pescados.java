package org.example.Pescados;

public class Pescados {
    private final int id;
    private static int autoId=0;
    private String nombre;
    private  int precioXKilo;

    public Pescados(String nombre, int precioXKilo) {
        this.nombre = nombre;
        this.precioXKilo = precioXKilo;
        this.id=autoId;
        autoId++;
    }

    public int getId() {
        return id;
    }

    public static void setAutoId(int autoId) {
        Pescados.autoId = autoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecioXKilo() {
        return precioXKilo;
    }
    public void setPrecioXKilo(int precioXKilo) {
        this.precioXKilo = precioXKilo;
    }
}
