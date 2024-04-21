package sistemaCarcelario.reclusos;

import sistemaCarcelario.actividades.Actividades;

public abstract class Recluso {
    private String nombres;
    private String apellido;
    private final int idRecluso;
    private static int autoRecluso = 1115;
    private Actividades actividad;
    private boolean isActividadEnCurso;

    public Recluso(String nombres, String apellido) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.idRecluso = autoRecluso++;
        this.isActividadEnCurso =false;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdRecluso() {
        return idRecluso;
    }

    public Actividades getActividad() {
        return actividad;
    }

    public void setActividad(Actividades actividad) {
        this.actividad = actividad;
    }

    public boolean isActividadEnCurso() {
        return isActividadEnCurso;
    }

    public void setActividadEnCurso(boolean actividadEnCurso) {
        isActividadEnCurso = actividadEnCurso;
    }

    @Override
    public String toString() {
        return "Recluso " +
                "\nnombres='" + nombres +
                "\napellido='" + apellido   +
                "\nidRecluso=" + idRecluso +
                "\nactividadEnCurso=" + actividad+
                "\nESTA EN CURSO " + isActividadEnCurso
                 ;
    }
}
