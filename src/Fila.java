
import java.util.LinkedList;
public class Fila {
    LinkedList<Paciente> pacientes = new LinkedList<>();
    public void addFila(Paciente paciente){
        pacientes.addFirst(paciente);
        }
    public void removeFila(){
        pacientes.removeLast();
    }

    @Override
    public String toString() {
        return "{" +
                "pacientes=" + pacientes +
                '}';
    }
}
