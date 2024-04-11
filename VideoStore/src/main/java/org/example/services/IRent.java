package org.example.services;

import org.example.model.Film;
import org.example.model.Rent;
import org.example.model.User;

import java.time.LocalDate;
import java.util.List;

public interface IRent {
    public void createRent(Film film, User user, LocalDate rent, LocalDate returning);

    void editRent(Film film, User user, LocalDate rent, LocalDate returning);

    void finishRent(String name,String title);
    public List<Rent> ListSearchRent(String Title);
    public Rent searchRent(String name,String title);

    public List<Rent> obteinListRent();
}
