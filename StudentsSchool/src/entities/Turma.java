package entities;

public class Turma {
    private int ano;
    private char turma;

    public Turma(int ano, char turma) {
        this.ano = ano;
        this.turma = turma;
    }

    public char getTurma() {
        return turma;
    }

    public void setTurma(char turma) {
        this.turma = turma;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%d° ano - Turma %c", getAno(), getTurma());
    }
}
