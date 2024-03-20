package model;

public class Usuario{


        private String nombre;
        private  int id;
    private static int contador = 0 ;

        public Usuario(String nombre, int id) {
            this.nombre = nombre;
            this.id = contador++;

        }

        public String getNombre() {
            return nombre;
        }

        public int getId() {
            return id;
        }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }
}


