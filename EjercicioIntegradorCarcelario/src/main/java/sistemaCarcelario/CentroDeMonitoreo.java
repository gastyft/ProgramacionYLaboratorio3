package sistemaCarcelario;

import sistemaCarcelario.actividades.Actividad;
import sistemaCarcelario.actividades.ActividadSupervisable;
import sistemaCarcelario.actividades.Actividades;
import sistemaCarcelario.actividades.GestorActividades;
import sistemaCarcelario.personalCarcelario.Carceleros;
import sistemaCarcelario.personalCarcelario.GestorCarceleros;
import sistemaCarcelario.reclusos.GestorReclusos;
import sistemaCarcelario.reclusos.Recluso;
import sistemaCarcelario.reclusos.ReclusoSeguridadMedia;
import sistemaCarcelario.reclusos.ReclusoSeguridadMinima;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CentroDeMonitoreo {
    GestorCarceleros gestorCarceleros;
    GestorReclusos gestorReclusos;

    GestorActividades gestorActividades;

    public CentroDeMonitoreo() {
        this.gestorActividades = new GestorActividades();
        this.gestorCarceleros = new GestorCarceleros();
        this.gestorReclusos = new GestorReclusos();
    }

    public void asignarTarea() {
        for (Recluso recluso : gestorReclusos.getReclusoList()) {
            if (recluso.getNombres().equals("El tijera")) {
                if (recluso.isActividadEnCurso() == false) {
                    System.out.println("INGRESE ACTIVIDAD ");
                    Scanner scanner = new Scanner(System.in);
                    String actividades = "PROGRAMA_REHABILITACION";

                    if (recluso instanceof ReclusoSeguridadMinima rec) {
                        System.out.println("TODAS ACTIVIDADES DISPONIBLES");

                        if (Actividades.PATIO.name() == actividades || Actividades.VISITA_FAMILIAR.name() == actividades || Actividades.TAREA_MANTENIMIENTO.name() == actividades || Actividades.PROGRAMA_REHABILITACION.name() == actividades) {
                            rec.setActividadEnCurso(true);
                            rec.setActividad(Actividades.valueOf(actividades));
                            gestorActividades.crearActividades(recluso, Actividades.valueOf(actividades), gestorCarceleros.getCarcelerosList().get(1));
                        } else {
                            System.out.println("NO ENCONTRADA ");
                        }

                    } else if (recluso instanceof ReclusoSeguridadMedia rec) {
                        if (Actividades.PROGRAMA_REHABILITACION.name() == actividades || Actividades.TAREA_MANTENIMIENTO.name() == actividades) {
                            rec.setActividadEnCurso(true);
                            rec.setActividad(Actividades.valueOf(actividades));
                            gestorActividades.crearActividades(rec, Actividades.valueOf(actividades), gestorCarceleros.getCarcelerosList().get(1));
                            gestorCarceleros.getCarcelerosList().get(1).setDisponibleParaActividad(false);
                        }
                    } else {
                        gestorActividades.crearActividades(recluso, Actividades.valueOf(actividades), gestorCarceleros.getCarcelerosList().get(1));
                    }

                } else System.out.println("Ya tiene actividad asignada");
            }
        }
    }

    public void finalizarTarea() {
        for (Actividad act : gestorActividades.getActividadesList()) {
            if (act.getRecluso().getNombres().equals("El tijera")) {
                if (act instanceof ActividadSupervisable actividadSupervisable) {

                    Recluso recc =gestorReclusos.getReclusoList().get(gestorReclusos.getReclusoList().indexOf(actividadSupervisable.getRecluso()));
                    recc.setActividadEnCurso(false);
                    recc.setActividad(null);
                   Carceleros carcelero = gestorCarceleros.getCarcelerosList().get(gestorCarceleros.getCarcelerosList().indexOf(actividadSupervisable.getCarcelero()));
                carcelero.liberarCarcelero();

                }else {
                    Recluso recc =gestorReclusos.getReclusoList().get(gestorReclusos.getReclusoList().indexOf(act.getRecluso()));
                    recc.setActividadEnCurso(false);
                    recc.setActividad(null);
                }
            }

        }

    }
}
