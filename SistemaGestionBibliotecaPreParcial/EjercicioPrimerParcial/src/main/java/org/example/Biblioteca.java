package org.example;

import org.example.materiales.*;
import org.example.prestamos.Prestamos;
import org.example.usuarios.Estudiante;
import org.example.usuarios.Profesor;
import org.example.usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca implements Prestable {
    List<Usuario> usuarioList;
    List<Materiales> materialesList;
    List<Prestamos> prestamosList;
    Scanner scanner1 = new Scanner(System.in);

    public Biblioteca() {  //VER POSIBILIDAD DE AGREGAR UNA LISTA NUEVA DE DEVUELTOS PARA NO PERDER LOS DATOS
        this.usuarioList = new ArrayList<>();
        this.materialesList = new ArrayList<>();
        this.prestamosList = new ArrayList<>();

    }

    public void crearUsuario() {
        try {
            Usuario newProfesor = new Profesor("Juan Perez", "juan@gmail.com", 1245);
            usuarioList.add(newProfesor);
            Usuario newEstudiante = new Estudiante("Lucas Perez", "luquitas12@gmail.com", 4512);
            usuarioList.add(newEstudiante);
        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);
        }
    }

    public void editarUsuario() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese matricula o legajo para editar");
            String nombree = scanner.nextLine();
            for (Usuario usuario : usuarioList) {
                if (usuario.getNombre().equals(nombree)) {
                    System.out.println("Ingrese nuevo nombre");
                    nombree = scanner.nextLine();
                    usuario.setNombre(nombree);
                    System.out.println("Ingrese nuevo email");
                    String email1 = scanner.nextLine();
                    usuario.setEmail(email1);
                }
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);
        }
    }

    public void mostrarUsuarios() {
        try {
            for (Usuario usuario : usuarioList) {
                if (usuario instanceof Profesor profesor) {
                    System.out.println(profesor.toString());
                } else {
                    Estudiante estudiante = (Estudiante) usuario;
                    System.out.println(estudiante.toString());
                }
            }

        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);
        }
    }

    public void consultaPorMatriculaOLegajo() {
        try {
            System.out.println("Ingrese matricula de profesor o legajo estudiantil unico");
            Scanner scanner = new Scanner(System.in);
            int matOLeg = scanner.nextInt();
            for (Usuario usuario : usuarioList) {
                if (usuario instanceof Profesor profesor) {
                    if (profesor.getMatricula() == matOLeg) {
                        System.out.println(profesor.toString());
                    }
                } else {
                    Estudiante estudiante = (Estudiante) usuario;
                    if (estudiante.getLegajo() == matOLeg) {
                        System.out.println(estudiante.toString());
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);
        }
    }

    public void crearMateriales() {
        try {
///HACER MENUS con switch para que el usuario decida que tipo de material agregar y pida datos

            Materiales newDVD = new DVD("Rapidos y furiosos 32", "Nick Fury", 2);
            materialesList.add(newDVD);
            Materiales newLibro = new Libro("Baron Rojo", "Saint Exupery", 1);
            materialesList.add(newLibro);
            Materiales newRevista = new Revista("Salud Digital", "editorial gemini", 3);
            materialesList.add(newRevista);
        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);
        }
    }

    public void mostrarMateriales() {
        try {
            for (Materiales materiales : materialesList) {
                if (materiales instanceof DVD dvd) {
                    System.out.println(dvd.toString());
                }
                if (materiales instanceof Libro libro) {
                    System.out.println(libro.toString());
                } else if (materiales instanceof Revista revista) {
                    System.out.println(revista.toString());
                }
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);
        }
    }

    public Materiales buscarMaterial(String titulo) {

        Materiales materialADevolver = null;
        try {
            for (Materiales material : materialesList) {
                if (material.getTitulo().equals(titulo)) {
                    materialADevolver = material;
                }
            }
            return materialADevolver;
        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);
            return materialADevolver;
        }

    }

    public Usuario buscarUsuario(int matriculaOLegajo) {
        Usuario usuarioADevolver = null;
        try {
            for (Usuario usuario : usuarioList) {
                if (usuario instanceof Profesor) {
                    if (((Profesor) usuario).getMatricula() == matriculaOLegajo) {
                        usuarioADevolver = usuario;
                        break;
                    }
                }  else if (usuario instanceof Estudiante){
                    if (((Estudiante) usuario).getLegajo() == matriculaOLegajo) {
                        usuarioADevolver = usuario;
                       break;
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);

        }
        return usuarioADevolver;
    }

    public void prestar() {
        try {
            mostrarMateriales();
            System.out.println("Elija que material desea prestar. Ingrese Titulo");
            Scanner scanner = new Scanner(System.in);
            String aPrestar = scanner.nextLine();
            Materiales material = buscarMaterial(aPrestar);
            if (material != null) {
                mostrarUsuarios();
                System.out.println("Ingrese matricula o legajo unico");
                int matOLeg = scanner.nextInt();
                Usuario aUsuarioaPrestar = buscarUsuario(matOLeg);
                if (aUsuarioaPrestar != null) {
                    if (material.getCant() > 0 && material.getDisponibilidad() == Disponibilidad.DISPONIBLE && aUsuarioaPrestar.getMateriales() > 0) {  /// SUMAR A LA LISTA DE PRESTAMOS
                        material.setCant(material.getCant() - 1);
                        aUsuarioaPrestar.setMateriales(aUsuarioaPrestar.getMateriales() - 1);
                        Prestamos prestamo = new Prestamos(aUsuarioaPrestar, material);
                        prestamosList.add(prestamo);
                        if (material.getCant() == 0)
                            material.setDisponibilidad(Disponibilidad.EN_PRESTAMOS);
                    } else System.out.println("El material no se encuentra disponible");
                } else System.out.println("Usuario no encontrado");
            } else System.out.println("No se encontro el material a prestar, ");
        } catch (Exception e) {
            System.out.println("Algo salio mal" + e);
        }
    }

    public void mostrarPrestamos() {
        for (Prestamos prestamos : prestamosList) {
            System.out.println(prestamos.toString());
        }
    }

    public Prestamos buscarPrestamosbyID(int id) {
        Prestamos prestamo = null;
        for (Prestamos prestamos : prestamosList) {
            if (prestamos.getId() == id) {
                prestamo = prestamos;
               return prestamo;
            }
        }
        return prestamo;
    }

    public void devolver() {
        mostrarPrestamos();  //SE MUESTRA LA LISTA CON LOS ID ANTES DE REALIZAR UNA DEVOLUCION
        System.out.println(" Ingrese ID a devolver ");
        int id = scanner1.nextInt();

        Prestamos prestamo = buscarPrestamosbyID(id); //SI ENCUENTRA PRESTAMOS => SUMAR 1 a cant de material y +1 a material por usuario
        if(prestamo != null) {
            Usuario usuario = prestamo.getUsuario();  // EDITO USUARIO PARA QUE TENGA UN LIBRO MAS PARA PEDIR
            usuario.setMateriales(usuario.getMateriales()+1);
            usuarioList.set(usuario.getId(), usuario);
            Materiales material = prestamo.getMateriales();
            material.setDisponibilidad(Disponibilidad.DISPONIBLE);
            material.setCant(material.getCant()+1);
            materialesList.set(material.getId(), material);
            prestamo.setDevuelto(true);
            prestamosList.set(prestamo.getId(),prestamo);
        }
        else System.out.println("No se encontro el prestamo solicitado");
    }

    public void iniciar() {
        crearUsuario();
        crearMateriales();
        System.out.println("USUARIOS\n");
        mostrarUsuarios();
        System.out.println("\n\n MATERIALES\n");
        mostrarMateriales();
        //  editarUsuario();
        prestar();
       // mostrarPrestamos();
        System.out.println("\n USUARIOS DESPUES DE PRESTAR");
        mostrarUsuarios();
        System.out.println("\n MATERIALES DEPUES DE PRESTAR");
        mostrarMateriales();
        System.out.println("/ / / // / / / / / / / / / / / / / / / / // / / / / / / / / / / / / \n // / / / / / / / / // / / / / / // / / / / ");
        System.out.println("\nFUNCION DEVOLVER\n");
        devolver();
        System.out.println("\nPRESTAMOS\n");
        mostrarPrestamos();
        System.out.println("\nUSUARIOS\n");
        mostrarUsuarios();
        System.out.println("\nMATERIALES\n");
        mostrarMateriales();


    }

}
