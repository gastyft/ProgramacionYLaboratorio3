package org.example.usuarios;

public class Estudiante extends Usuario{

    private final int legajo;

    public Estudiante(String nombre, String email, int legajo) {
        super(nombre, email, 7,3);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }



    @Override
    public String toString() {
        return "Estudiante: "+super.toString()+
                "legajo: " + legajo+"\n------------------------------------";
    }

}
