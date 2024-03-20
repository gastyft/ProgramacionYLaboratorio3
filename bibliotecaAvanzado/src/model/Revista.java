package model;

public class Revista extends Item{

    private int id;
    private int nroEdicion;

    private static int contador=0;
    public Revista(int nroEdicion, String titulo) {
        super(titulo);
        this.nroEdicion = nroEdicion;
        this.id = ++contador;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }


}
