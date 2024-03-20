package model;

public class Libro extends Item{


        private String autor;
        private boolean disponible;
        private  int id;
        private static int contador =0;
        //constructor
        public Libro(String titulo, String autor) {
            super(titulo);

            this.autor = autor;
            this.disponible = true;
            this.id = contador++;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



        public String getAutor() {
            return autor;
        }

        public boolean isDisponible() {
            return disponible;
        }


        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }

    }



