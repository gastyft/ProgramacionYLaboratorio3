package service;

import model.Usuario;

import java.util.List;

public interface IUsuario {
    public void agregarUsuario(String nombre);

    public void editarUsuario(int id, String nombre);
    public void eliminarUsuario(int id);
    public void buscarUsuario(int id);
    public List<Usuario> obtenerUsuarios();

}
