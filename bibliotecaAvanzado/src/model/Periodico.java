package model;

public class Periodico extends Item{
    private  int id;
    private String editorial;
    private static int contador =0;
    public Periodico(String editorial) {

        super("null");
        this.editorial = editorial;
        this.id = ++contador;
    }
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
