package model;

public class Prestamo {
    private Usuario usuario;
    private Item item;

    public Prestamo(Usuario usuario, Item item) {
        this.usuario = usuario;
        this.item = item;
    }

    public Usuario getUsuario() {
        return usuario;
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

