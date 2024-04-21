package sistemaCarcelario.actividades;

import sistemaCarcelario.personalCarcelario.Carceleros;
import sistemaCarcelario.reclusos.Recluso;
import java.util.ArrayList;
import java.util.List;

public class GestorActividades {
    List<Actividad> actividadesList;

    public GestorActividades() {
        this.actividadesList = new ArrayList<>();
    }

    public List<Actividad> getActividadesList() {
        return actividadesList;
    }

    public void setActividadesList(List<Actividad> actividadesList) {
        this.actividadesList = actividadesList;
    }

    public void crearActividades(Recluso recluso, Actividades actividadAsignar, Carceleros carcelero) {
        if (actividadAsignar.equals(Actividades.PATIO) ||
                actividadAsignar.equals(Actividades.VISITA_FAMILIAR) ||
                actividadAsignar.equals(Actividades.TAREA_MANTENIMIENTO)) {
            Actividad actividad = new Actividad(recluso, actividadAsignar, 2);
            actividadesList.add(actividad);
        } else {
            Actividad actividad = new ActividadSupervisable(recluso, actividadAsignar, 2, carcelero);
            actividadesList.add(actividad);
        }
    }
    public void mostrarActividades(){
        for (Actividad actividad : actividadesList){
            System.out.println(actividad.toString());
        }

    }
}
