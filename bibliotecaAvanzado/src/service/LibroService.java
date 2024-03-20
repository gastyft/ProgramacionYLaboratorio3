package service;

import model.Libro;

import java.util.ArrayList;
import java.util.List;

public class LibroService implements ILibro {

    List<Libro> libroList = new ArrayList<>();
    @Override
    public void agregarLibro(String titulo, String autor) {
        Libro libronuevo = new Libro(titulo, autor);
        libroList.add(libronuevo);
    }
@Override
    public void editarLibro(int id,String nuevoTitulo, String nuevoAutor){
        for(Libro libroEditar : libroList){
            if(id == libroEditar.getId()){
                libroEditar.setAutor(nuevoAutor);
                libroEditar.setTitulo(nuevoTitulo);
                break;
            }
        }
    }

    public void borrarLibro(int id){
        for(int i = 0; i < libroList.size(); i++) {
            if(libroList.get(i).getId() == id)
             {
                this.libroList.remove(i);
                break;
            }
        }
    }
    public  void buscarLibro(int id){
        for(Libro libroBuscar :libroList)
        {
            if(libroBuscar.getId()== id){
                System.out.println("Titulo:"+libroBuscar.getTitulo());
                System.out.println("Autor:"+libroBuscar.getAutor());

            }
        }

    }
    public List<Libro> obtenerLibros() {
        return libroList;
    }
}
