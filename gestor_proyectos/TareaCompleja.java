package gestor_proyectos;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea{
    private List<TareaSimple> tareasSimples;

    public TareaCompleja(String descripcion) {
        super(descripcion);
        this.tareasSimples = new ArrayList<>();
    }

    public void agregarTareaSimple(TareaSimple tarea) {
        tareasSimples.add(tarea);
    }

    @Override
    public int calcularHoras() {
        int totalHoras = 0;
        for (TareaSimple tarea : tareasSimples) {
            totalHoras += tarea.calcularHoras();
        }
        return totalHoras;
    }

}
