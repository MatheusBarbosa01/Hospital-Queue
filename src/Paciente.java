public class Paciente {
    public enum Prioridade{
        SEVERO,
        MODERADO,
        LEVE,
        NORMAL;
    }
    private String nome;
    private String cpf;
    private Prioridade prioridade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Paciente(String nome, String cpf, Prioridade prioridade) {
        this.nome = nome;
        this.cpf = cpf;
        this.prioridade = prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;

    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
