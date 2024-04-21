package sistemaCarcelario;

import sistemaCarcelario.personalCarcelario.Carceleros;
import sistemaCarcelario.reclusos.Recluso;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      CentroDeMonitoreo centroDeMonitoreo = new CentroDeMonitoreo();

      centroDeMonitoreo.gestorCarceleros.crearCarceleros();
      centroDeMonitoreo.gestorCarceleros.mostrarCarceleros();
      centroDeMonitoreo.gestorReclusos.crearRecluso();
      centroDeMonitoreo.gestorReclusos.mostrarReclusos();
  centroDeMonitoreo.asignarTarea();
        System.out.println("--------------------------------\n \n \n --------------------------");
  centroDeMonitoreo.gestorActividades.mostrarActividades();
        centroDeMonitoreo.gestorCarceleros.mostrarCarceleros();
        centroDeMonitoreo.gestorReclusos.mostrarReclusos();
        System.out.println("--------------------------------------------------------------------\n \n");
        centroDeMonitoreo.finalizarTarea();
        centroDeMonitoreo.gestorCarceleros.mostrarCarceleros();
        centroDeMonitoreo.gestorReclusos.mostrarReclusos();
    }
}