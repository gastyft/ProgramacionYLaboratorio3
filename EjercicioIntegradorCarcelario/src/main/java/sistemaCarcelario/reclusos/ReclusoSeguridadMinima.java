package sistemaCarcelario.reclusos;

public class ReclusoSeguridadMinima extends Recluso{

    NivelSeguridad nivelSeguridad;

    public ReclusoSeguridadMinima(String nombres, String apellido) {
        super(nombres, apellido);
        this.nivelSeguridad = NivelSeguridad.MINIMA;
    }

    public NivelSeguridad getNivelSeguridad() {
        return nivelSeguridad;
    }

    public void setNivelSeguridad(NivelSeguridad nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }


}
