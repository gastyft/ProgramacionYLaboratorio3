package sistemaCarcelario.actividades;

import sistemaCarcelario.personalCarcelario.Carceleros;
import sistemaCarcelario.reclusos.NivelSeguridad;
import sistemaCarcelario.reclusos.Recluso;

import javax.swing.text.Caret;

public class ActividadSupervisable extends Actividad{

    private Carceleros carcelero;
    public ActividadSupervisable(Recluso recluso, Actividades tipo, int tiempo, Carceleros carcelero) {
        super(recluso, tipo, tiempo);

        this.carcelero =carcelero;
    }

    public Carceleros getCarcelero() {
        return carcelero;
    }

    public void setCarcelero(Carceleros carcelero) {
        this.carcelero = carcelero;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nActividadSupervisable" +
                "carcelero=" + carcelero  ;
    }
}
