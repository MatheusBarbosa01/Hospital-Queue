public class Main {
    public static void main(String[] args) {
    Paciente p1 = new Paciente("m1", "010.568.173-43", Paciente.Prioridade.SEVERO);
    Paciente p2 = new Paciente("m2", "020.568.173-43", Paciente.Prioridade.MODERADO);
    Paciente p3 = new Paciente("m3", "030.568.173-43", Paciente.Prioridade.NORMAL);
    Paciente p4 = new Paciente("m4", "040.568.173-43", Paciente.Prioridade.LEVE);
    Paciente p5 = new Paciente("m5", "050.568.173-43", Paciente.Prioridade.MODERADO);
    Paciente p6 = new Paciente("m6", "060.568.173-43", Paciente.Prioridade.SEVERO);
    Paciente p7 = new Paciente("m7", "070.568.173-43", Paciente.Prioridade.LEVE);
    Paciente p8 = new Paciente("m8", "080.568.173-43", Paciente.Prioridade.SEVERO);
    Paciente p9 = new Paciente("m9", "090.568.173-43", Paciente.Prioridade.NORMAL);
    GestaoHospital fila = new GestaoHospital();
    fila.adcFila(p1);
    fila.adcFila(p2);
    fila.adcFila(p3);
    fila.adcFila(p4);
    fila.adcFila(p5);
    fila.adcFila(p6);
    fila.adcFila(p7);
    fila.adcFila(p8);
    fila.adcFila(p9);
    fila.remFila();
    fila.remFila();
    fila.remFila();
    fila.remFila();
    fila.remFila();
    fila.remFila();
    fila.remFila();



        System.out.println(fila);
    }
}
