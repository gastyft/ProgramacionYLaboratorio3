package service;

import model.Usuario;

public interface IBiblioteca {

    public void reservarItem(String titulo, Usuario usuario);

    public  void prestarItem(String titulo, Usuario usuario);



}
