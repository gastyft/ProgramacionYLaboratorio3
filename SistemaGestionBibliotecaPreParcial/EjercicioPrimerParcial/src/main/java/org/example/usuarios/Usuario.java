package org.example.usuarios;

public class Usuario {

    private final int id;
    private static int autoId = 0;
    private String nombre;
    private String email;
    private int dias;

    private int materiales;

    public Usuario(String nombre, String email, int dias, int materiales) {
        this.id = autoId;
        autoId++;
        this.nombre = nombre;
        this.email = email;
        this.dias = dias;
        this.materiales = materiales;
    }

    public int getId() {
        return id;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMateriales() {
        return materiales;
    }

    public void setMateriales(int materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return nombre + '\n' +
                "Email: " + email + '\n' +
                "Dias: " + dias + '\n'+
                "Cantidad de materiales: "+materiales+"\n";
    }



}