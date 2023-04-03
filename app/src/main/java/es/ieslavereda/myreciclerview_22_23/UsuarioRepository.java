package es.ieslavereda.myreciclerview_22_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsuarioRepository {

    private List<Usuario> usuarios;

    private static UsuarioRepository instance;

    private UsuarioRepository() {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Manolo", "Garcia Perez", R.mipmap.ic_actor_foreground));
        usuarios.add(new Usuario("Luis", "Garcia Perez", R.mipmap.ic_albanil_foreground));
        usuarios.add(new Usuario("Carlos", "Garcia Perez", R.mipmap.ic_banquero_foreground));
        usuarios.add(new Usuario("Miguel", "Garcia Perez", R.mipmap.ic_cocinero_foreground));
        usuarios.add(new Usuario("Tomas", "Garcia Perez", R.mipmap.ic_estudiante_foreground));
        usuarios.add(new Usuario("Pedro", "Garcia Perez", R.mipmap.ic_instagramer_foreground));
        usuarios.add(new Usuario("Jose", "Garcia Perez", R.mipmap.ic_pintor_foreground));
        usuarios.add(new Usuario("Juan", "Garcia Perez", R.mipmap.ic_policia_foreground));
        usuarios.add(new Usuario("Manuel", "Garcia Perez",R.mipmap.ic_politico_activo_foreground));
        usuarios.add(new Usuario("Raul", "Garcia Perez", R.mipmap.ic_politico_retirado_foreground));
        usuarios.add(new Usuario("Ruben", "Garcia Perez", R.mipmap.ic_politico_vendedor_foreground));
        usuarios.add(new Usuario("Alejandro","Garcia Perez",R.mipmap.ic_politico_youtuber_foreground));
    }

    public static UsuarioRepository getInstance() {
        if (instance == null)
            instance = new UsuarioRepository();

        return instance;
    }

    public Usuario getUsuario (int index){
        return usuarios.get(index);
    }

    public int getSize(){
        return usuarios.size();
    }

    public void remove(Usuario u){
        usuarios.remove(u);
    }

    public void add(int position,Usuario u){
        usuarios.add(position,u);
    }
    public void add(Usuario u){
        usuarios.add(u);
    }

    public void sort(Comparator c){
        Collections.sort(usuarios,c);
    }
}
