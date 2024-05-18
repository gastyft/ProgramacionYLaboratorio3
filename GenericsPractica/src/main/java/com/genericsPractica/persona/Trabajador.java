package com.genericsPractica.persona;

public class Trabajador extends Persona{

    private String trabajo;

    public Trabajador(String nombre, int edad, String trabajo) {
        super(nombre, edad);
        this.trabajo = trabajo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTrabajador " +
                "\ntrabajo: " + trabajo;
    }
}
