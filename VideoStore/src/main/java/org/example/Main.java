package org.example;

import org.example.controller.VideoStore;
import org.example.menus.ConsoleMenu;

public class Main {
    public static void main(String[] args) {

        ConsoleMenu consoleMenu= new ConsoleMenu(new VideoStore());
        consoleMenu.mainMenu();
    }
}