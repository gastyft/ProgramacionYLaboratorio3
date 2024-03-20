package service;

import model.Revista;

import java.util.List;

public interface IRevistas {

    public void agregarRevista(int nroEdicion, String titulo);

    public void editarRevista(int id,String nuevoTitulo,int nuevoNroEditorial);

    public  void  borrarRevista(int id);

    public  void buscarRevista(int id);
    public List<Revista> obtenerRevista();

}
