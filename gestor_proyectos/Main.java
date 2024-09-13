package gestor_proyectos;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		GestorProyectos gestor = new GestorProyectos();
		
		Proyecto proyecto1 = new Proyecto("Proyecto Prueba", LocalDate.now());
		
		// Tareas asignadas al proyecto 1
		TareaSimple tarea1 = new TareaSimple("Diseño de interfaz", 5);
        TareaSimple tarea2 = new TareaSimple("Implementación backend", 10);
        
        proyecto1.agregarTarea(tarea1);
        proyecto1.agregarTarea(tarea2);
        
        TareaCompleja tareaCompleja = new TareaCompleja("Desarrollo completo");
        tareaCompleja.agregarTareaSimple(tarea1);
        tareaCompleja.agregarTareaSimple(tarea2);
        proyecto1.agregarTarea(tareaCompleja);
        
        gestor.agregarProyecto(proyecto1);
        
        Proyecto proyecto = gestor.obtenerProyecto("Proyecto Prueba");

        System.out.println("Horas totales del proyecto" + proyecto1.getNombre() + ": " + proyecto.calcularHorasTotales());
        
	}

}
