package org.example;

import java.time.LocalDate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       LocalDate fechaHoy = LocalDate.now();
       LocalTime horaActual = LocalTime.now();

        System.out.println("Fecha actual: "+ fechaHoy);
        System.out.println("Hora Actual: "+ horaActual);
        DateTimeFormatter timeFormatter= DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println("Fecha Actual con formato: "+fechaHoy.format(dateFormatter));
        System.out.println("Hora Actual con formato: "+horaActual.format(timeFormatter));
    }
}