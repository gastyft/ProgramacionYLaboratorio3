package org.example.materiales;

public class Revista extends Materiales {
    private String editorial;
    private int cant;

    public Revista(String titulo, String editorial,int cant) {
        super(titulo,cant);
        this.editorial = editorial;

    }



    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Revista: "+super.toString() +
                "editorial: " + editorial+"\n------------------------------------";
    }
    public boolean isPrestable(){
        if(cant>0){
             return true;
        }
        else
            return false;
    }
}
