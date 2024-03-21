import model.Biblioteca;
import model.Item;
import model.Libro;
import model.Usuario;
import service.LibroService;
import service.PeriodicosService;
import service.RevistasService;
import service.UsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    private  UsuarioService usuarioService = new UsuarioService();
    Biblioteca biblio = new Biblioteca(); /// Ver si reemplazo por service de biblioteca
   private LibroService libroService = new LibroService() ;

   private  RevistasService revistasService = new RevistasService();
   private  PeriodicosService periodicosService = new PeriodicosService();


   //MAIN EJECUCION DE CODIGO
    public static void main(String[] args) {


        Main main = new Main();  // PREGUNTAR PORQUE NO ME TOMA FUNCIONALIDAD SIN INSTANCIAR UN MAIN
        main.funcionalidad();

    }

    // PREGUNTAR SOBRE LAS CONTENEDORAS en que package hacerlas y como llamar(nombre) ese package.
    public  void agregarUsuarios() {

        String o = "ESC";
        Scanner scanner = new Scanner(System.in);
        System.out.println("CARGA USUARIOS");
        do {
            System.out.println("Presione cualquier tecla para cargar o tipee ESC para salir");
            o=scanner.nextLine();

            if (o.equalsIgnoreCase("ESC")) {
                break;
            }
            System.out.println("Ingrese nombre de usuario");
            String nombre = scanner.nextLine();
            usuarioService.agregarUsuario(nombre);

        } while (!o.equalsIgnoreCase("ESC"));

        System.out.println("Salio de carga Usuarios");

    }

    public  void agregarLibros(){
        String op = "ESC";
        Scanner scanner = new Scanner(System.in);
        System.out.println("CARGA DE LIBROS");
        do {
            System.out.println("Presione cualquier tecla para continuar o tipee \"ESC\" para salir");
            op=scanner.nextLine();
            if (op.equalsIgnoreCase("ESC")) {
                break;
            }

            System.out.println("Ingrese titulo");
            String titulo= scanner.nextLine();
            System.out.println("Ingrese autor");
            String autor = scanner.nextLine();


            libroService.agregarLibro(titulo,autor);
        } while (!op.equalsIgnoreCase("ESC"));
        System.out.println("Salio de carga Libros");

    }
    public  void agregarPeriodicos(){
        String o = "ESC";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Presione cualquier tecla para continuar o tipee \"ESC\" para salir");
            o=scanner.nextLine();
            if (o.equalsIgnoreCase("ESC")) {
                break;
            }
            System.out.println("Ingrese editorial (String)");
            String editorial= scanner.nextLine();



        periodicosService.agregarPeridico(editorial);

        } while (!o.equalsIgnoreCase("ESC"));

        System.out.println("Salio de carga  Periodicos");
        scanner.close();
    }
    public  void agregarRevistas(){
        String o = "ESC";

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Presione cualquier tecla para continuar o tipee \"ESC\" para salir");
            o=scanner.nextLine();
            if (o.equalsIgnoreCase("ESC")) {
                break;
            }
            System.out.println("Ingrese titulo ");
            String titulo= scanner.nextLine();
            System.out.println("Ingrese autor");
            int nroEdicion = scanner.nextInt();


            revistasService.agregarRevista(nroEdicion,titulo);

        } while (!o.equalsIgnoreCase("ESC"));

        System.out.println("Salio de carga Revistas");
        scanner.close();
    }

    public   void mostrarUsuarios(){
        for(Usuario usuario : usuarioService.obtenerUsuarios())
        {
            System.out.println("Nombre de usuario: "+usuario.getNombre()+ " ID: "+usuario.getId());
        }
    }
    public void mostrarLibros(){
        for(Libro libros : libroService.obtenerLibros())
        {
            System.out.println("Titulo del libro: "+libros.getTitulo()+ "Autor: "+libros.getAutor()+" Con ID: "+ libros.getId());
        }
    }

public void funcionalidad(){  //FALTA SERVICE ITEMS Y FUNCIONES DE RESERVAS Y FUNCIONES CONTENEDORAS DE TODAS LAS CLASES
        agregarUsuarios();
    agregarLibros();
    List<Item> listaItems = new ArrayList<>(libroService.obtenerLibros()); // Obtener la lista de libros del servicio
    biblio.setItemList(listaItems); // Pasar la lista de libros al método setItemList
biblio.setUsuarioList(usuarioService.obtenerUsuarios());
    mostrarUsuarios();
        System.out.println("----------------------------------------------------------------------------------------");
        mostrarLibros();
}






  /*  public Biblioteca agregarLibrosMain() {


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
               }
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
    */
}


