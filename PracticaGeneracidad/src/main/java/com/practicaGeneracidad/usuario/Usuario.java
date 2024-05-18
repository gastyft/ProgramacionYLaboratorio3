package com.practicaGeneracidad.usuario;

import java.util.Objects;

public class Usuario {

    private static int autoId=0;
    private final int id;
    private  String nombre;
    private String email;
    private String contrasenia;

    public Usuario(String nombre, String email, String contrasenia) {
        this.id=autoId++;
        this.nombre = nombre;
        this.email = email.toLowerCase();
        this.contrasenia = contrasenia;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "id=" + id +
                "\nnombre: " + nombre +
                "\nemail: " + email +
                "\ncontrasenia: " + "*".repeat(contrasenia.length());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(getEmail(), usuario.getEmail()) && Objects.equals(getContrasenia(), usuario.getContrasenia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getContrasenia());
    }


}
