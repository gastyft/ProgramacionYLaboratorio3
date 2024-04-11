package org.example.model;

import java.util.Date;

public class Film {
    private  static int autoId=0;
    private final int id;
    private String title;
    private Date premiereDate;
    private int duration;
    private  String classification;
    private String genre;
    private String description;
    private int copies;
    private String country;

    public Film(String title, Date premiereDate, int duration, String classification, String genre, String description, int copies, String country) {
       id=autoId;
       autoId++;
        this.title = title;
        this.premiereDate = premiereDate;
        this.duration = duration;
        this.classification = classification;
        this.genre = genre;
        this.description = description;
        this.copies = copies;
        this.country=country;
          }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(Date premiereDate) {
        this.premiereDate = premiereDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", premiereDate=" + premiereDate +
                ", duration=" + duration +
                ", classification='" + classification + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", copies=" + copies +
                ", country='" + country + '\'' +
                '}';
    }
}
