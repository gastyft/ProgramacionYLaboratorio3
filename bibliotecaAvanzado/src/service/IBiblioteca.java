package service;

import model.Prestamo;
import model.Reservado;

public interface IBiblioteca {

public  void reservarItem(Reservado reservado);

public  void prestarItem(Prestamo prestamo);



}
