import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private List<Libro> libroList;
    private List<Usuario> usuarioList;


    public Biblioteca() {
        this.libroList = new ArrayList<>();
        this.usuarioList = new ArrayList<>();
    }

    public Libro buscarLibros(int id) {
        Libro libro= this.libroList.get(id);
        return libro;

    }
    public Usuario buscarUsuarios(int id) {
        Usuario usuario= this.usuarioList.get(id);
        return usuario;

    }


    public void agregarLibro(String titulo, String autor){
       Libro libronuevo = new Libro(titulo,autor);
       libroList.add(libronuevo);

    }
    public void agregarUsuario(String nombre,int id){
        Usuario usuarionuevo = new Usuario(nombre,usuarioList.size());  // usuarioList.size() hace autoincremental por defecto
        usuarioList.add(usuarionuevo);

    }
    public List<Libro> getLibroList(){
        return libroList;
    }
public  List<Usuario> getUsuarioList(){
        return usuarioList;
}
}