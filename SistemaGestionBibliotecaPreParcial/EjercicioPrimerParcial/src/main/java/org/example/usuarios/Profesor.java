package org.example.usuarios;

public class Profesor  extends Usuario{


    private final int matricula;

    public Profesor(String nombre, String email, int matricula) {
        super(nombre, email,14,5);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }



    @Override
    public String toString() {
        return "Profesor: "+super.toString()+
                "Matricula: " + matricula+"\n------------------------------------";
    }
}
