package service;

import model.Biblioteca;
import model.Item;
import model.Prestamo;
import model.Reservado;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService implements IBiblioteca {
    UsuarioService usuarioService = new UsuarioService();
    LibroService libroService = new LibroService();
    RevistasService revistasService = new RevistasService();

    PeriodicosService periodicosService = new PeriodicosService();

    List<Prestamo> prestamoList = new ArrayList<>();
    List<Item> itemList = new ArrayList<>();
    List<Reservado> reservadoList = new ArrayList<>();
    Biblioteca biblio = new Biblioteca();

    /* hacer funcion de asociar a prestamos usuarios
    libros o demas productos. Lo mismo con reservados y mostrar las listas de cada uno.
     */

    public void reservarItem(String titulo) {

        for (Item item : biblio.getItemList()) {
            if (titulo == item.getTitulo()) {
                if (item.isReservado() == false && item.isDisponible() == true) {
                    item.setReservado(true);
                    item.setDisponible(false);
                }
                else
                    System.out.println("El item ya esta reservado o no disponible");
            }
            }
        }
    }



