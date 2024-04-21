package sistemaCarcelario.personalCarcelario;

import java.util.ArrayList;
import java.util.List;

public class GestorCarceleros {
    List<Carceleros> carcelerosList;

    public GestorCarceleros() {
        this.carcelerosList = new ArrayList<>();
    }

    public List<Carceleros> getCarcelerosList() {
        return carcelerosList;
    }

    public void setCarcelerosList(List<Carceleros> carcelerosList) {
        this.carcelerosList = carcelerosList;
    }

    public void crearCarceleros(){

        Carceleros carceleros = new Carceleros("El milico","Lopez","24445");
        carcelerosList.add(carceleros);
        Carceleros carceleros1 = new Carceleros("Sargento","Garcia","5234");
        carcelerosList.add(carceleros1);
    }
    public void mostrarCarceleros(){
        for(Carceleros carceleros : carcelerosList)
            System.out.println(carceleros.toString());
    }

}
