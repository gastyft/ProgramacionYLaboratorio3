package service;

import model.Revista;

import java.util.ArrayList;
import java.util.List;

public class RevistasService implements IRevistas {
    List<Revista> revistaList = new ArrayList<>();
    @Override
    public void agregarRevista( int nroEdicion, String titulo) {
        Revista revistaNuevo = new Revista(nroEdicion,titulo);
        revistaList.add(revistaNuevo);
    }
    @Override
    public void editarRevista(int id,String nuevoTitulo,int nuevoNroEditorial){
        for(Revista revis : revistaList){
            if(id == revis.getId()){
                revis.setNroEdicion(nuevoNroEditorial);
                revis.setTitulo(nuevoTitulo);
                break;
            }
        }
    }

    public void borrarRevista(int id){
        for(int i = 0; i < revistaList.size(); i++) {
            if(revistaList.get(i).getId() == id)
            {
                this.revistaList.remove(i);
                break;
            }
        }
    }
    public  void buscarRevista(int id) {
        for (Revista revis : revistaList) {
            if (revis.getId() == id) {
                System.out.println("Titulo:" + revis.getTitulo());
                System.out.println("nroEdicion:" + revis.getNroEdicion());

            }
        }

    }


    public List<Revista> obtenerRevista() {
        return revistaList;
    }
}
