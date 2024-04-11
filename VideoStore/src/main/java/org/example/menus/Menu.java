package org.example.menus;


import org.example.controller.VideoStore;

public abstract class Menu {

      protected  VideoStore videoStore;

    public Menu(VideoStore videoStore) {
        this.videoStore = videoStore;
    }
    public abstract void mainMenu();
    protected abstract void userMenu();
    protected abstract void filmMenu();

    protected  abstract void rentMenu();

}
