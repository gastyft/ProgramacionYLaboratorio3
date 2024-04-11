package org.example.model;

import java.time.LocalDate;
import java.util.List;

public class Rent {
    private static int autoId = 0;
    private final int id;
    private Film film;
    private User user;
    private LocalDate rent;
    private LocalDate returning;

    public Rent(Film film, User user, LocalDate rent, LocalDate returning) {

        if (film.getCopies() > 0) {
            this.id = autoId;
            autoId++;
            this.film = film;
            this.user = user;
            this.rent = rent;
            this.returning = returning;
        } else {
            throw new IllegalArgumentException("No copies available for the film");
            // Busque que no se puede manejar errores en constructores pero que IllegalArgument se puede
        }


    }

    public int getId() {
        return id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getRent() {
        return rent;
    }

    public void setRent(LocalDate rent) {
        this.rent = rent;
    }

    public LocalDate getReturning() {
        return returning;
    }

    public void setReturning(LocalDate returning) {
        this.returning = returning;
    }
}