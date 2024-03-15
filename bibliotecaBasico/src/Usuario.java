public class Usuario {


        private String nombre;
        private  int id;
        private static int contador ;

        public Usuario(String nombre, int id) {
            this.nombre = nombre;
            this.id = id;
            this.contador++;
        }

        public String getNombre() {
            return nombre;
        }

        public int getId() {
            return id;
        }
    }


