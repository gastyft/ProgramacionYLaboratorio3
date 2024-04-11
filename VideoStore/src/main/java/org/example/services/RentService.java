package org.example.services;

import org.example.model.Film;
import org.example.model.Rent;
import org.example.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentService implements IRent{
    List<Rent> rentList = new ArrayList<>();

    @Override
    public void createRent(Film film, User user, LocalDate rent, LocalDate returning) {
        Rent rent1 = new Rent(film, user, rent, returning);
        rentList.add(rent1);
    }

    @Override
    public List<Rent> obteinListRent() {
        return rentList;
    }

    @Override
    public void editRent(Film film, User user, LocalDate rent, LocalDate returning) {

        for (Rent rent1 : rentList) {
            if (rent1.getUser().equals(user)) {
                rent1.setUser(user);
                rent1.setFilm(film);
                rent1.setRent(rent);
                rent1.setReturning(returning);
                return;
            }
        }
    }

    @Override
    public Rent searchRent(String name,String title) {
        Rent rent = null;
        for (Rent rent1 : rentList) {
            if (rent1.getUser().getName().equals(name) && rent1.getFilm().equals(title))
                rent = rent1;
        }
        return rent;
    }
    public List<Rent> ListSearchRent(String Title){
        List<Rent> rentsListsByTitle = new ArrayList<>();
        System.out.println("Insert title");
        Scanner scanner= new Scanner(System.in);
        String title = scanner.nextLine();
        for (Rent rent : rentList) {
            if (rent.getFilm().getTitle().equals(title)) {
                rentsListsByTitle.add(rent);
            }
        }
        return rentsListsByTitle;
    }
    @Override
    public void finishRent(String name,String title) {
        Rent rent = searchRent(name,title);
        rent.setReturning(LocalDate.now());
    }
}