package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Usuario> usuarioList;

    private List<Prestamo> prestamoList;

    private  List<Reservado> reservadoList;

    private  List<Item> itemList;
    public Biblioteca() {

        this.usuarioList = new ArrayList<>();
        this.prestamoList = new ArrayList<>();
        this.reservadoList = new ArrayList<>();
        this.itemList = new ArrayList<>();
    }
/*
    public Libro buscarLibros(int id) {
        Libro libro = this.libroList.get(id);
        return libro;

    }

    public Usuario buscarUsuarios(int id) {
        Usuario usuario = this.usuarioList.get(id);
        return usuario;

    }
    */

    public List<Prestamo> getPrestamoList() {
        return prestamoList;
    }

    public void setPrestamoList(List<Prestamo> prestamoList) {
        this.prestamoList = prestamoList;
    }

    public List<Reservado> getReservadoList() {
        return reservadoList;
    }

    public void setReservadoList(List<Reservado> reservadoList) {
        this.reservadoList = reservadoList;
    }


    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }



    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}