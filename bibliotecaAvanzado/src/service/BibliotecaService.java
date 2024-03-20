package service;

import model.Biblioteca;
import model.Prestamo;
import model.Reservado;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService  implements  IBiblioteca {
    UsuarioService usuarioService = new UsuarioService();
    LibroService libroService = new LibroService();
    RevistasService revistasService = new RevistasService();

    PeriodicosService periodicosService = new PeriodicosService();

    List<Prestamo> prestamoList = new ArrayList<>();

    Biblioteca biblio = new Biblioteca();

    /* hacer funcion de agregar usuario , agregar libros, revistas, periodicos, editarlos, borrarlos, buscar, asociar a prestamos usuarios
    libros o demas productos. Lo mismo con reservados y mostrar las listas de cada uno.
     */

    public void reservarItem(Reservado reservado){

    }

    public void prestarItem(Prestamo prestamo){

    }


}
