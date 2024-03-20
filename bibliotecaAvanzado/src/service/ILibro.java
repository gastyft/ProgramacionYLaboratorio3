package service;

import model.Libro;

import java.util.List;

public interface ILibro {

    public void agregarLibro(String titulo, String autor);

    public void editarLibro(int id,String nuevoTitulo, String nuevoAutor);

    public  void  borrarLibro(int id);

    public  void buscarLibro(int id);

    public List<Libro> obtenerLibros();
}

