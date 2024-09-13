package gestor_proyectos;

public class TareaSimple extends Tarea{
	private int duracion;

    public TareaSimple(String descripcion, int duracion) {
        super(descripcion);
        this.duracion = duracion;
    }

    @Override
    public int calcularHoras() {
        return duracion;
    }
}
