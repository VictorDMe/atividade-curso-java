package entities;

public class Students {
    private int matricula;
    private int idade;
    private String nome;
    private Turma turma;

    public Students(int matricula, int idade, String nome, Turma turma) {
        this.matricula = matricula;
        this.idade = idade;
        this.nome = nome;
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return String.format("Estudante: %s %nMatricúla: %d %nIdade: %d %n%s %n%n",
                getNome(), getMatricula(), getIdade(), getTurma().toString());
    }
}
