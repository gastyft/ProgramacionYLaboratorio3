package org.example.materiales;

public class DVD extends Materiales{
    private String director;

    public DVD(String titulo, String director, int cant) {
        super(titulo, cant);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "DVD: \n" +super.toString()+
                "Director: " + director+"\n------------------------------------";
    }
}
