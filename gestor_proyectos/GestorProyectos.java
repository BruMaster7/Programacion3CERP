package gestor_proyectos;

import java.util.HashMap;

public class GestorProyectos {
    private HashMap<String, Proyecto> proyectos;

    public GestorProyectos() {
        proyectos = new HashMap<>();
    }
    
    public void agregarProyecto(Proyecto proyecto) {
        proyectos.put(proyecto.getNombre(), proyecto);
    }
    
    public Proyecto obtenerProyecto(String nombre) {
        return proyectos.get(nombre);
    }
    
    public void eliminarProyecto(String nombre) {
        proyectos.remove(nombre);
    }
    
    public void mostrarProyectos() {
        for (String nombre : proyectos.keySet()) {
            System.out.println("Proyecto: " + nombre);
        }
    }
    
    
}
