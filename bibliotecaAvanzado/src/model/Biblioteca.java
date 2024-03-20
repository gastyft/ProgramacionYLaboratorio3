package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libroList;
    private List<Periodico> periodicoList;
    private List<Revista> revistaList;
    private List<Usuario> usuarioList;

    private List<Prestamo> prestamoList;

    private  List<Reservado> reservadoList;

    public Biblioteca() {
        this.libroList = new ArrayList<>();
        this.periodicoList = new ArrayList<>();
        this.revistaList = new ArrayList<>();
        this.usuarioList = new ArrayList<>();
        this.prestamoList = new ArrayList<>();
        this.reservadoList = new ArrayList<>();
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

    public void setLibroList(List<Libro> libroList) {
        this.libroList = libroList;
    }

    public List<Periodico> getPeriodicoList() {
        return periodicoList;
    }

    public void setPeriodicoList(List<Periodico> periodicoList) {
        this.periodicoList = periodicoList;
    }

    public List<Revista> getRevistaList() {
        return revistaList;
    }

    public void setRevistaList(List<Revista> revistaList) {
        this.revistaList = revistaList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<Libro> getLibroList() {
        return libroList;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

}