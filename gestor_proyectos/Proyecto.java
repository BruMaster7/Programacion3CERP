package gestor_proyectos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	private String nombre;
	private LocalDate fechaComienzo;
	private List< Tarea> tareas; 
	
    public Proyecto(String nombre, LocalDate fechaComienzo) {
        this.nombre = nombre;
        this.fechaComienzo = fechaComienzo;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public int calcularHorasTotales() {
        int totalHoras = 0;
        for (Tarea tarea : tareas) {
            totalHoras += tarea.calcularHoras();
        }
        return totalHoras;
    }
    
}
