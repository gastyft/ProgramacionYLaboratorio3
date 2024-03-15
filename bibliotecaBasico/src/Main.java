import java.util.List;
import java.util.Scanner;

public class Main {
    Biblioteca biblio = new Biblioteca();

    public static void main(String[] args) {

        Main main = new Main();  // PREGUNTAR PORQUE NO ME TOMA FUNCIONALIDAD SIN INSTANCIAR UN MAIN
        main.funcionalidad();

    }

    public Biblioteca agregarLibrosMain() {


        Scanner scanner = new Scanner(System.in);
        String o = "ESC";

        try {
            do {
                System.out.println("Presione enter para continuar cargando libros o tipee ESC para salir");
                o = scanner.nextLine();
                if (o.equalsIgnoreCase("ESC")) break;
                System.out.println("Ingrese titulo ");

                String titulo = scanner.nextLine();
                System.out.println("Ingrese autor");
                String autor = scanner.nextLine();
                biblio.agregarLibro(titulo, autor);

            } while (!o.equalsIgnoreCase("ESC"));
        } catch (Exception ex) {
            throw ex;
        }
       return biblio;

    }

    public Biblioteca agregarUsuariosMain() {
        String o = "ESC";
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("Presione enter para continuar cargando usuarios o tipee ESC para salir");
                o = scanner.nextLine();
                if (o.equalsIgnoreCase("ESC")) break;
                System.out.println("Ingrese nombre usuario  o tipee ESC  para salir");
                String nombre = scanner.nextLine();
                if (o.equalsIgnoreCase("ESC"))
                    break;
                List<Usuario> usuarios = biblio.getUsuarioList();
                int id = usuarios.size();
                int ultimoId = 0;
            /*    if (usuarios.isEmpty())
                    id = 0;
                else{
                    ultimoId = usuarios.get(usuarios.size() - 1).getId(); // OTRA FORMA DE OBTENER EL ULTIMO ID PARA VALOR AUTOINCREMENTAL
                id = ultimoId + 1;
               }   */
                biblio.agregarUsuario(nombre, id);
            } while (!o.equalsIgnoreCase("ESC"));
        } catch (Exception ex) {
            throw ex;
        }

            return biblio;

    }


    public void mostrarLibros() {
        List<Libro> listaLibros = biblio.getLibroList();
        try {
            for (Libro libro : listaLibros) {
                System.out.println("TITULO: " + libro.getTitulo());
                System.out.println("AUTOR: " + libro.getAutor());
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void mostrarUsuarios() {
        List<Usuario> listaUsuarios = biblio.getUsuarioList();
        try {
            for (Usuario usuario : listaUsuarios) {
                System.out.println("Nombre usuario: " + usuario.getNombre());
                System.out.println("Con ID: " + usuario.getId());
            }
        } catch (Exception ex) {
            throw ex;
        }

    }

    public void funcionalidad() {
        Biblioteca biblio = new Biblioteca();
        biblio = agregarLibrosMain();
        biblio = agregarUsuariosMain();
        System.out.println("Presione enter para mostrar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        mostrarLibros();
        mostrarUsuarios();
    }
}


