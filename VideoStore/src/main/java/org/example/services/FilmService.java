package org.example.services;

import org.example.model.Film;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilmService implements IFilm {
    List<Film> filmsList = new ArrayList<>();

   // En contenedora al pedir datos usar validacion de 3 letras y luego aplicarle el upperCase;
    public void createFilm(String title, Date premiereDate, int duration, String classification, String genre, String description, int copies, String country) {
Film film = new Film(title,premiereDate,duration,classification,genre,description,copies,country);
    filmsList.add(film);

    }
public void editFilm(String title, Date premiereDate, int duration, String classification, String genre, String description, int copies, String country){
        for(Film film1 :filmsList){
        if(film1.getTitle().equals(title)) {
        film1.setTitle(title);
        film1.setClassification(classification);
        film1.setCopies(copies);
        film1.setCountry(country);
        film1.setDuration(duration);
        film1.setGenre(genre);
        film1.setPremiereDate(premiereDate);
        film1.setDescription(description);
        return;
        }
        }
    }

    public  void  deleteFilm(String title){
        for (Film film1 : filmsList){
            if(film1.getTitle().equals(title)){
                filmsList.remove(film1);
            }
        }

    }

    public Film searchFilm(String title)
    {
        Film film =null;


       for(Film film1 : filmsList){
            if(film1.getTitle().equals(title)){
           film =film1;
            }
        }


        return  film;
    }
    public List<Film> obteinListFilm(){
        return filmsList;
    }
    public static boolean createThreeLetterString(String input) { //Implementar en contenedora
        // Verificar si la entrada tiene tres letras
        if (input.length() == 3) {
            return true;
        }
        else {
            throw new IllegalArgumentException("La entrada debe tener tres letras.");

        }
    }


}
