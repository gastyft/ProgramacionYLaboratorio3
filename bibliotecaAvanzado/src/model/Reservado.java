package model;

public class Reservado {
    Usuario usuario;
    Item item;

    public Usuario getUsuario() {
        return usuario;
    }

    public Reservado(Usuario usuario, Item item) {
        this.usuario = usuario;
        this.item = item;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
