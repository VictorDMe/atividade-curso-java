package entities;

public class TurmaMedio extends Turma {

    public TurmaMedio(int ano, char turma) {
        super(ano, turma);
    }

    @Override
    public String toString() {
        return String.format("%d° ano do ensino médio - Turma %c", getAno(), getTurma());
    }
}
