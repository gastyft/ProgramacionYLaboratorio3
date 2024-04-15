package org.example.prestamos;

import org.example.materiales.Materiales;
import org.example.usuarios.Usuario;

public class Prestamos {
    Usuario usuario;
    Materiales materiales;
    private static int autoId=0;
    private  final int id;


    private boolean isDevuelto= false;
    public Prestamos(Usuario usuario, Materiales materiales) {
        this.id=autoId;
        autoId++;
        this.usuario = usuario;
        this.materiales = materiales;

    }

    public int getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Materiales getMateriales() {
        return materiales;
    }

    public void setMateriales(Materiales materiales) {
        this.materiales = materiales;
    }

    public boolean isDevuelto() {
        return isDevuelto;
    }

    public void setDevuelto(boolean devuelto) {
        isDevuelto = devuelto;
    }

    @Override
    public String toString() {
        String devueltoStr = isDevuelto ? "SI" : "NO";
        return "Prestamos\n" +
                "ID: "+ getId()+"\n"+
                "Usuario: " + usuario.getNombre() +"\n"+
                "Materiales: " + materiales.getTitulo()+"\n"+
                "Devuelto: "+ devueltoStr+"\n----------------------------";
    }
}
