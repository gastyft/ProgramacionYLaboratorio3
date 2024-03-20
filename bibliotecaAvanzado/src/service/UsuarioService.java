package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService implements IUsuario {

    List<Usuario> usuarioList = new ArrayList<>();

    @Override
    public void agregarUsuario(String nombre) {
        Usuario usuarionuevo = new Usuario(nombre, usuarioList.size());  // usuarioList.size() hace autoincremental por defecto
        usuarioList.add(usuarionuevo);
    }

    @Override
    public void editarUsuario(int id, String nombre) {
        for (Usuario usuario : usuarioList) {
            if (id == usuario.getId()) {
                usuario.setNombre(nombre);
                break;
            }
        }
    }

    public void eliminarUsuario(int id) {
        for (int i = 0; i < usuarioList.size(); i++) {
            if (usuarioList.get(i).getId() == id) {
                this.usuarioList.remove(i);
                break;

            }
        }
    }

        @Override
        public void buscarUsuario ( int id){
            for (Usuario usuario : usuarioList) {
                if (usuario.getId() == id) {
                    System.out.println("Nombre de Usuario:" + usuario.getNombre());

                }
            }

        }
    public List<Usuario> obtenerUsuarios() {
        return usuarioList;
    }
    }