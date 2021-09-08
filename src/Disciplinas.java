import java.util.ArrayList;

public class Disciplinas extends Curso {
    private String nomeDisciplina;
    private int nTurmas;
    private String bloco;
    private String horario;

    public Disciplinas(int codCurse, String nome, String areaDeEnsino, String nomeDisciplina, int nTurmas, String bloco, String horario) {
        super(codCurse, nome, areaDeEnsino);
        this.nomeDisciplina = getNomeDisciplina();
        this.nTurmas = nTurmas;
        this.bloco = bloco;
        this.horario = horario;
    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getnTurmas() {
        return nTurmas;
    }

    public void setnTurmas(int nTurmas) {
        this.nTurmas = nTurmas;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
