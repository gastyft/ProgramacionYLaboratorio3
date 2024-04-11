package org.example.menus;

import org.example.controller.VideoStore;
import org.example.services.FilmService;
import org.example.services.UserService;


import java.util.Scanner;

public class ConsoleMenu extends Menu {


    VideoStore videoStore= new VideoStore();
    private final Scanner scanner;

    public ConsoleMenu(VideoStore videoStore) {
        super(videoStore);

        this.scanner = new Scanner(System.in);
    }


    public void mainMenu() {
        String o = "ESC";
        String menu = """
                What do you like to do?
                ----MAIN MENU----
                1-USER MENU
                2-FILM MENU
                3-RENT FILM
                Type ESC to exit.
                """;

        do {
            try {
                System.out.println(menu);

                o = scanner.nextLine();
                switch (o) {
                    case "1" -> userMenu();
                    case "2" -> filmMenu();
                    case "3" -> rentMenu();
                    default -> System.out.println("Bad option selected. Try again");
                }
            } catch (Exception e) {
                this.scanner.nextLine();
                System.out.println("Error.What did you do? " + e.getLocalizedMessage());
                o = "err";
            }

        } while (!o.equalsIgnoreCase("ESC"));
        System.out.println("Bye. Thanks to use Video Store GastyFt");

    }

    @Override
    protected void userMenu() {
        String o = "ESC";
        String userMenu = """
                USER MENU
                1-CREATE USER
                2-EDIT USER
                3-DELETE USER
                4-SEARCH USER by Name
                5-SHOW USERS LIST
                Type ESC to exit.
                """;

        do {
            try {
                System.out.println(userMenu);
                o=scanner.nextLine();
                switch (o){
                    case "1"-> videoStore.addUser();//addUser();
                    case "2"-> videoStore.editUser();//editUser();
                    case "3"-> videoStore.deleteUser();//deleteUser();
                    case "4" -> videoStore.searchUser();
                    case "5" -> videoStore.showListUser();
                    case "ESC"-> {
                        System.out.println("Returning to main menu");
                        return;
                    }

                    default ->  System.out.println("Bad option selected. Try again");
                }

            } catch (Exception e) {
                System.out.println("ERROR. What did you do?" + e.getLocalizedMessage());
                this.scanner.nextLine();
                o = "err";
            }

        } while (!o.equalsIgnoreCase("ESC"));
    }

    protected void filmMenu() {

    }

    protected void rentMenu() {

    }

}
