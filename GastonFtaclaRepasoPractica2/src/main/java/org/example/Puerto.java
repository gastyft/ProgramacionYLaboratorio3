package org.example;

import org.example.Pescados.Pescados;
import org.example.barcos.Barcos;
import org.example.barcos.Corbeta;
import org.example.barcos.LanchitaAmarilla;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    List<Barcos> barcosList;
    List<Pescados> pescadosList;

    public Puerto() {
        this.barcosList = new ArrayList<>();
        this.pescadosList = new ArrayList<>();
    }
    public void crearBarcosYPescados(){

        Barcos barco1 = new LanchitaAmarilla("Mar del Plata 2","Toyota",1996,150,"P135AVI");
        barcosList.add(barco1);
        Barcos barco2 = new Corbeta("Graciela","Japonesa",2000,500,"P682VFH",30);
        barcosList.add(barco2);
        Barcos barco3 = new LanchitaAmarilla("PEPE","Taiwan",1987,150,"L1234DRG");
        barcosList.add(barco3);
        Pescados pescado = new Pescados("Merluza",11);
        pescadosList.add(pescado);
    }
    public  void mostrarBarcos(){
        for( Barcos barcos: barcosList){
            System.out.println(barcos.toString());
        }
    }
        public void aPescar(){
            for(Barcos barco : barcosList){
                barco.pescar(barco);
            }
        }
        public void ventasTotales(){
        int sumaCorb=0;
        int sumaLanch=0;
        for(Barcos barco : barcosList){
            if(barco instanceof Corbeta corbeta){
            sumaCorb += corbeta.vender(barco,pescadosList.getFirst());
            }
            else{
            LanchitaAmarilla lanch = (LanchitaAmarilla) barco;
            sumaLanch+= lanch.vender(barco,pescadosList.getFirst());
                System.out.println(sumaLanch);
            }
        }
            System.out.println("VENTA DE CORBETAS: "+ sumaCorb);
            System.out.println("VENTA DE LANCHITAS: "+sumaLanch);
            System.out.println("VENTAS TOTALES: "+(sumaCorb+sumaLanch));
        }

    //devolver pesca de cada barco y una que sume la de todos los barcos desde la lista llamando a cada funcion dependiendo del barco y sumarlo

}
