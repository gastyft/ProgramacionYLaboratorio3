package com.practicaGeneracidad;

import com.practicaGeneracidad.documento.Documento;
import com.practicaGeneracidad.gestores.GestorPractica;
import com.practicaGeneracidad.producto.Producto;
import com.practicaGeneracidad.usuario.Usuario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        GestorPractica<Documento,Integer,String> documentoGestorPractica = new GestorPractica<>();
        //CLAVE INTEGER ID Y  VALOR TITULO
        GestorPractica<Producto,Integer,String> productoGestorPractica = new GestorPractica<>();
        ///CLAVE ID Y VALOR NOMBRE
        GestorPractica<Usuario,String,String> usuarioGestorPractica = new GestorPractica<>();
        //CLAVE EMAIL Y VALOR CONTRASENIA
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese email");
        String email= scanner.nextLine();
    while(!validarEmail(email)) {
        System.out.println("Ingrese email");
        email= scanner.nextLine();
        }

 */
        Usuario user = new Usuario("Gasty", "gastyft@gmail.com","Pepee");
    Documento doc =new Documento("Sin Documentos","Sin contenido","SIn autor");
    Producto prod = new Producto("Auto",233232,"Sport");

    documentoGestorPractica.agregar(doc.getId(),doc.getTitulo());
    usuarioGestorPractica.agregar(user.getContrasenia(),user.getEmail());
    productoGestorPractica.agregar(prod.getId(),prod.getNombre());

        System.out.println(documentoGestorPractica.obtenerTodos(0,"Sin Documentos"));
        System.out.println(usuarioGestorPractica.obtenerTodos("Pepee","gastyft@gmail.com"));
        System.out.println(productoGestorPractica.obtenerTodos(0,"Auto"));

    }
    public static boolean validarEmail(String email) { // FUNCION EN GESTOR
        // Expresión regular para validar direcciones de correo electrónico
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}