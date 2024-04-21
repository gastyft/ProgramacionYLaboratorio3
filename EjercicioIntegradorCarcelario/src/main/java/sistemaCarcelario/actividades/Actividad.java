package sistemaCarcelario.actividades;

import sistemaCarcelario.reclusos.Recluso;

public class Actividad{ // Asignar actividad supervisor y recluso con algun tiempo
private  Recluso recluso;
private Actividades tipoActividadActividad;
private  int tiempo;

    public Actividad(Recluso recluso, Actividades tipoActividadActividad, int tiempo) {
        this.recluso = recluso;
        this.tipoActividadActividad = tipoActividadActividad;
        this.tiempo = tiempo;
    }

    public Recluso getRecluso() {
        return recluso;
    }

    public void setRecluso(Recluso recluso) {
        this.recluso = recluso;
    }

    public Actividades getTipoActividadActividad() {
        return tipoActividadActividad;
    }

    public void setTipoActividadActividad(Actividades tipoActividadActividad) {
        this.tipoActividadActividad = tipoActividadActividad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Actividad" +
                "\nrecluso=" + recluso +
                "\ntipoActividadActividad=" + tipoActividadActividad +
                "\ntiempo=" + tiempo ;
    }
}
