package com.genericsPractica;

import com.genericsPractica.persona.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        int number = 12;
        String str = "Hello World";
        double db = 12.3;
        List<Integer> integerList= new ArrayList<>();
        integerList.add(number);
     //   print(12);
     //   print(str);
     //   print(db);
        Persona persona = new Persona("Gasty",27);
      //  print(persona);
        List<Persona> personaList = new ArrayList<>();
        personaList.add(persona);
        printList(personaList);
        printList(integerList); //Espera una clase o subclase de Persona (No va a funcionar si no extends de Persona)
    }

    public static <T> void print(T thingToPrint) {  //Recibe cualquier clase u objeto porque se declaro en public static <T> void
        //Si queres retornar solamente cambiar void por T
        System.out.println("Soy la clase " + thingToPrint.getClass() + " Con valor " + thingToPrint);
    }
    //Funciona como print pero sin decirle que va a ser generica
    //Por eso en list se le pasa el wildcard(?) que se comporta como generacidad de la funcion anterior
    //Pero sin decirle a la funcion que va a ser generica solamente es public static void
    public static void printList(List<? extends Persona> thingToPrint) { //Espera una clase o subclase de Persona
        System.out.println("Soy la clase " + thingToPrint.getClass() + " Con valor " + thingToPrint);
    }

}