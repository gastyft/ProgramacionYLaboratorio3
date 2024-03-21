package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService implements IBiblioteca {
    UsuarioService usuarioService = new UsuarioService();
    LibroService libroService = new LibroService();
    RevistasService revistasService = new RevistasService();

    PeriodicosService periodicosService = new PeriodicosService();

    List<Prestamo> prestamoList = new ArrayList<>();
    List<Reservado> reservadoList = new ArrayList<>();
    List<Item> itemList = new ArrayList<>();

    Biblioteca biblio = new Biblioteca();

    /* hacer funcion de asociar a prestamos usuarios
    libros o demas productos. Lo mismo con reservados y mostrar las listas de cada uno.
     */


    public void reservarItem(String titulo, Usuario usuario) {

        for (Item item : biblio.getItemList()) {
            if (titulo == item.getTitulo()) {
                if (item.isReservado() == false && item.isDisponible() == true) {
                    item.setReservado(true);
                    item.setDisponible(false);
                    Reservado reservado = new Reservado(biblio.getUsuarioList().get(usuario.getId()),item);
                    reservadoList.add(reservado);
                }
                else
                    System.out.println("El item ya esta reservado o no disponible");
            }
            }
        }
    public  void prestarItem(String titulo, Usuario usuario) {
        for (Item item : biblio.getItemList()) {
            if (titulo == item.getTitulo()) {
                if (item.isReservado() == false && item.isDisponible() == true) {
                    item.setReservado(true);
                    item.setDisponible(false);
                    Prestamo prestamo = new Prestamo(biblio.getUsuarioList().get(usuario.getId()), item);
                    prestamoList.add(prestamo);
                } else
                    System.out.println("El item ya esta reservado o no disponible");
            }
        }
    }
    }





