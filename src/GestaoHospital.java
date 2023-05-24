public class GestaoHospital {
    private Fila filaSevero = new Fila();
    private Fila filaModerado = new Fila();
    private Fila filaLeve = new Fila();
    private Fila filaNormal = new Fila();
    private boolean severo = true;
    private boolean leve = false;
    private boolean moderado = false;
    private boolean normal = false;
    private int contador = 1;
    private int contador2 = 1;

    public void adcFila(Paciente paciente) {
        if (paciente.getPrioridade() == Paciente.Prioridade.SEVERO) {
            filaSevero.addFila(paciente);
        } else if (paciente.getPrioridade() == Paciente.Prioridade.MODERADO) {
            filaModerado.addFila(paciente);
        } else if (paciente.getPrioridade() == Paciente.Prioridade.LEVE) {
            filaLeve.addFila(paciente);
        } else if (paciente.getPrioridade() == Paciente.Prioridade.NORMAL) {
            filaNormal.addFila(paciente);
        }
    }

    public void remFila(){
        if(severo && filaSevero != null){
          filaSevero.removeFila();
          contador++;
          if(contador == 3 || contador%3 == 0){
              severo = false;
              normal = true;

          }
          else{
              severo =false;
              moderado =true;
          }
        }else if (moderado && filaModerado != null) {
            filaModerado.removeFila();
            contador2++;
            if (contador2 == 2 || contador2%2 == 0){
                filaSevero.removeFila();
            }
            else {
                moderado =false;
                leve = true;
            }
        } else if (leve && filaLeve != null) {
            filaLeve.removeFila();
            leve = false;
            severo = true;
        }
        else if(normal && filaNormal != null){
            filaNormal.removeFila();
            normal = false;
            severo = true;
        }
    }

    @Override
    public String toString() {
        return "GestaoHospital{" +
                "filaSevero=" + filaSevero +
                ", filaModerado=" + filaModerado +
                ", filaLeve=" + filaLeve +
                ", filaNormal=" + filaNormal +
                '}';
    }
}
