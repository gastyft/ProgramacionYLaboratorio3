package org.example.controller;


import org.example.model.Film;
import org.example.model.Rent;
import org.example.model.User;
import org.example.services.FilmService;
import org.example.services.RentService;
import org.example.services.UserService;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoStore {
    UserService userService = new UserService();
    FilmService filmService = new FilmService();

    RentService rentService = new RentService();

    ///METODOS CRUD                                     PREGUNTAR copias disponibles
                                //Terminar metodos de RENT y empezar con FILM y acomodar menu
    public void addRent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name of user");
        String name = scanner.nextLine();
        System.out.println("Insert title of the film");
        String title = scanner.nextLine();
        rentService.createRent(filmService.searchFilm(title), userService.searchUser(name), LocalDate.now(), null);
        //Actualizo las copias disponibles de ese film
        filmService.searchFilm(title).setCopies(filmService.searchFilm(title).getCopies() - 1);
    }

    public void finishRent() {
        System.out.println("Insert name to finish");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Insert title to finish");
        String title = scanner.nextLine();
        rentService.finishRent(name, title);
    }

    public void editRent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name to edit");
        String name = scanner.nextLine();
        System.out.println("Insert phone to edit");
        int phone = scanner.nextInt();
        System.out.println("Insert address to edit");
        String address = scanner.nextLine();
        userService.editUser(name, address, phone);
    }

    public void searchRent() {

        System.out.println("Insert title of film");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        System.out.println("Insert name of User");
        String name = scanner.nextLine();
        System.out.println(rentService.searchRent(name,title).toString());
    }

public  void searchListRentsbytitle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert title to search lists of rents of a film");
        for(Rent rents : rentService.ListSearchRent(scanner.nextLine()))
            System.out.println(rents.toString());

}
    public void showListRents(){
        for (Rent rents : rentService.obteinListRent()){
            System.out.println(rents.toString());
        }
    }

    public void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name");
        String name = scanner.nextLine();
        System.out.println("Insert address");
        String address = scanner.nextLine();
        System.out.println("Insert phone");
        int phone = scanner.nextInt();
        userService.createUser(name, address, phone);
    }
    public void deleteUser(){
        System.out.println("Insert name to delete");
        Scanner scanner =new Scanner(System.in);
        userService.deleteUser(scanner.nextLine());
    }
    public void editUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name to edit");
        String name = scanner.nextLine();
        System.out.println("Insert phone to edit");
        int phone = scanner.nextInt();
        System.out.println("Insert address to edit");
        String address = scanner.nextLine();
        userService.editUser(name,address,phone);
    }

    public  void searchUser(){
        System.out.println("Insert name to looking for a user");
        Scanner scanner  = new Scanner(System.in);
        User user1=userService.searchUser(scanner.nextLine());
        System.out.println(user1.toString());
    }
    public void showListUser(){
        for (User user : userService.obteinListUser()){
            System.out.println(user.toString());
        }
    }
}
