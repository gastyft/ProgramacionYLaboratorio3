package org.example.barcos;

import org.example.Pescados.Pescados;

public class Corbeta extends Barcos{
    private int cantJaula;
    private static int capacidadDePescaXJaula;

    public Corbeta(String nombre, String marca, int modelo, int capacidadCombustible, String Patente,int cantJaula) {
        super(nombre, marca, modelo, capacidadCombustible, Patente);
        this.cantJaula = cantJaula;
        capacidadDePescaXJaula=10;
    }
    public int getCantJaula() {
        return cantJaula;
    }
    public void setCantJaula(int cantJaula) {
        this.cantJaula = cantJaula;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTipo de barco: Corbeta" +
                "\ncantJaula: " + cantJaula;

    }

    public static int getCapacidadDePescaXJaula() {
        return capacidadDePescaXJaula;
    }

    public static void setCapacidadDePescaXJaula(int capacidadDePescaXJaula) {
        Corbeta.capacidadDePescaXJaula = capacidadDePescaXJaula;
    }

    @Override
    public Barcos pescar(Barcos barco) { // Que no pesque mas de la cantidad de jaulas que tiene el barco


        Corbeta corb =(Corbeta) barco;
        if(corb.getCantJaula()*capacidadDePescaXJaula> 140){
            barco.setCantidadPescada(140);
        }
        else System.out.println("Supera el limite de carga");
        return barco;
    }
    @Override
    public int vender(Barcos barco, Pescados pescado){

        int ventaEnDolares= barco.getCantidadPescada()*pescado.getPrecioXKilo();
       // System.out.println("El barco del tipo Corbeta con nombre "+barco.getNombre() + " vendio "+ventaEnDolares);
            return ventaEnDolares;
    }
}
