package sistemaCarcelario.personalCarcelario;

public class Carceleros {


    private String nombres;
    private final int id;
    private static int autoId = 0;
    private String apellido;
    private String legajo;
    private boolean isDisponibleParaActividad;

    public Carceleros(String nombres, String apellido, String legajo) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.legajo = legajo;
        this.id = autoId++;
        this.isDisponibleParaActividad = true;
    }

    public int getId() {
        return id;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Carceleros.autoId = autoId;
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

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public boolean isDisponibleParaActividad() {
        return isDisponibleParaActividad;
    }

    public void setDisponibleParaActividad(boolean disponibleParaActividad) {
        isDisponibleParaActividad = disponibleParaActividad;
    }

    public void supervisar() {
        if (isDisponibleParaActividad == true) {
            System.out.println("Carcelero disponible");
            this.isDisponibleParaActividad = false;
            System.out.println("Supervision asignada");
        } else System.out.println("Carcelero con actividad asignada");
    }


    public void liberarCarcelero() {
        this.isDisponibleParaActividad=true;
        System.out.println("Carcelero liberado");
    }

    @Override
    public String toString() {
        return "Carceleros" +
                "\nnombres='" + nombres +
                "\nid=" + id +
                "\napellido='" + apellido +
                "\nlegajo='" + legajo +
                "\n isDisponibleParaActividad=" + isDisponibleParaActividad ;
    }
}