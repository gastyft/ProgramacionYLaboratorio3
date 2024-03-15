public class Libro {

        private String titulo;
        private String autor;
        private boolean disponible;
        private  int id;
        //constructor
        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
            this.disponible = true;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public boolean isDisponible() {
            return disponible;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }

    }



