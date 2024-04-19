package org.example.barcos;

import org.example.Pescados.Pescados;

import java.util.Scanner;

public class LanchitaAmarilla extends Barcos {

    private int capacidadDePescaXHora;

    public LanchitaAmarilla(String nombre, String marca, int modelo, int capacidadCombustible, String Patente) {

        super(nombre, marca, modelo, capacidadCombustible, Patente);
        this.capacidadDePescaXHora = 20;
    }

    public int getCapacidadDePescaXHora() {
        return capacidadDePescaXHora;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de barco: LanchitaAmarilla" +
                "\ncapacidadDePescaXHora " + capacidadDePescaXHora;
    }

    @Override
    public Barcos pescar(Barcos barco) { //PREGUNTAR SI PASO EL PADRE DE LA LSITA O LA SUBCLASE o CASTEAR DENTRO

        LanchitaAmarilla lanch = (LanchitaAmarilla) barco;
        lanch.setCantidadPescada(lanch.capacidadDePescaXHora * 8);
        return barco;
    }

    @Override
    public int vender(Barcos barco, Pescados pescado) {
       int venta = barco.getCantidadPescada()*pescado.getPrecioXKilo();
            return venta;

    }
}
