package org.example.services;

import org.example.model.Film;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface IFilm {

    public void createFilm(String title, Date premiereDate, int duration, String classification, String genre, String description, int copies, String country);

    public void editFilm(String title, Date premiereDate, int duration, String classification, String genre, String description, int copies, String country);

    public  void  deleteFilm(String title);

    public  Film searchFilm(String title);

    public List<Film> obteinListFilm();


}
