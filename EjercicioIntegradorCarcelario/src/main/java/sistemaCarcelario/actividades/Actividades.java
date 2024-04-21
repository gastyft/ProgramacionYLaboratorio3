package sistemaCarcelario.actividades;

import sistemaCarcelario.reclusos.NivelSeguridad;

public enum Actividades {
    PATIO("Actividad en el patio" ),
    PROGRAMA_EDUCACION("Programa educativo" ),
    BIBLIOTECA("Consulta en biblioteca" ),
    VISITA_FAMILIAR("Visita familiar" ),
    PROGRAMA_REHABILITACION("Programa de rehabilitación" ),
    TAREA_MANTENIMIENTO("Tarea de mantenimiento");


  private String descrip;
    Actividades(String descrip) {
        this.descrip = descrip;

    }

    public String getDescrip() {
        return descrip;
    }


}
