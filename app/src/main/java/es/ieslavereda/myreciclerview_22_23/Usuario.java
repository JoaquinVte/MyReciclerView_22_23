package es.ieslavereda.myreciclerview_22_23;

import java.io.Serializable;
import java.util.Comparator;

public class Usuario implements Serializable {

    public static final Comparator<Usuario> SORT_BY_NAME = (u, u1) -> u.nombre.compareToIgnoreCase(u1.nombre);

    public static final Comparator<Usuario> SORT_BY_JOB = (u1, u2) -> {
        Profesion p1, p2;
        p1 = ProfesionRepository.getInstance().getProfesionByImage(u1.getIdProfesion());
        p2 = ProfesionRepository.getInstance().getProfesionByImage(u2.getIdProfesion());
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    };

    private String nombre;
    private String apellidos;
    private int idProfesion;

    public Usuario(String nombre, String apellidos, int idProfesion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idProfesion = idProfesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }
}
