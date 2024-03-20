package service;

import model.Periodico;

import java.util.List;

public interface IPeriodicos {
    public void agregarPeridico(String editorial);

    public void editarPeriodico(int id,String editorial);

    public  void  borrarPeriodico(int id);

    public  void buscarPeriodico(int id);
    public List<Periodico> obtenerPeriodico();

}
