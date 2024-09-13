package gestor_proyectos;

public abstract class Tarea {
	private String descripcion;
	
	public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract int calcularHoras();
}
