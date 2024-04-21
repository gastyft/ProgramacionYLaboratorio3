package sistemaCarcelario.reclusos;

import sistemaCarcelario.actividades.Actividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorReclusos {
    List<Recluso> reclusoList;

    public GestorReclusos( ) {

        this.reclusoList = new ArrayList<>();
    }

    public List<Recluso> getReclusoList() {
        return reclusoList;
    }

    public void setReclusoList(List<Recluso> reclusoList) {
        this.reclusoList = reclusoList;
    }
    public  void crearRecluso(){

        Recluso reclusoMinima = new ReclusoSeguridadMinima("El tiernito","Lopez");
        reclusoList.add(reclusoMinima);
        Recluso reclusoMedio = new ReclusoSeguridadMedia("El tijera","Perez");
        reclusoList.add(reclusoMedio);
        Recluso reclusoMaximo = new ReclusoSeguridadAlta("El carnicero","NN");
    }
public void editar(){

}
public void borrarRecluso()
{
    System.out.println("BORRAR El tijera");
    for(Recluso recluso : reclusoList){
        if(recluso.getNombres().equals("El tijera"))
            reclusoList.remove(recluso);

    }
        }
        public void mostrarReclusos(){

            for(Recluso recluso : reclusoList){
                System.out.println( recluso.toString());
            }
        }
}
