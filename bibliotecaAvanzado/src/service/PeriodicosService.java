package service;

import model.Periodico;

import java.util.ArrayList;
import java.util.List;

public class PeriodicosService implements IPeriodicos{
    List<Periodico> periodicoList = new ArrayList<>();
    @Override
    public void agregarPeridico(String editorial){
        Periodico periodicoNuevo = new Periodico(editorial);
        periodicoList.add(periodicoNuevo);
    }

    @Override
    public void editarPeriodico(int id,String editorial){
        for(Periodico periodicoEditar : periodicoList) {
            if (id == periodicoEditar.getId()) {
                periodicoEditar.setEditorial(editorial);
                break;
            }
        }
    }
    @Override
    public void borrarPeriodico(int id){
        for(int i = 0; i < periodicoList.size(); i++) {
            if(periodicoList.get(i).getId() == id)
            {
                this.periodicoList.remove(i);
                break;
            }
        }
    }
    @Override
    public void buscarPeriodico(int id){
        for(Periodico periodicoBuscar :periodicoList)
        {
            if(periodicoBuscar.getId()== id){
                System.out.println("Titulo:"+periodicoBuscar.getEditorial());

            }
        }
    }
    public List<Periodico> obtenerPeriodico() {
        return periodicoList;
    }
}
