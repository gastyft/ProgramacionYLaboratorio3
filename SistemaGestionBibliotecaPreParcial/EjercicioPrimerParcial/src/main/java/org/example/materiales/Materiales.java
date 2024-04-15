package org.example.materiales;

public class Materiales  {

    private final int id;
    private  static int autoId=0;
    private String titulo;
    private  int cant;
    Disponibilidad disponibilidad;
    public Materiales(String titulo,int cant) {
        this.titulo = titulo;
        this.id =autoId;
        autoId++;
        this.cant = cant;
        this.disponibilidad=Disponibilidad.DISPONIBLE;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        String disp = (cant > 0) ? Integer.toString(cant) : disponibilidad.toString();
        return "Titulo: " + titulo + '\n'+
                "Cantidad Disponibles: "+disp+"\n";
    }


}
