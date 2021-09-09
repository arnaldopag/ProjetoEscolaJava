import java.util.ArrayList;

public class Disciplinas extends Curso {
    private String nomeDisciplina;
    private int nTurmas;
    private String bloco;
    private String horario;
    private double [] notas = new double[3] ;
    private double media;

    public Disciplinas(int codCurso, String nome, String areaDeEnsino, String nomeDisciplina, int nTurmas, String bloco, String horario, double[] notas, double media) {
        super(codCurso, nome, areaDeEnsino);
        this.nomeDisciplina = nomeDisciplina;
        this.nTurmas = nTurmas;
        this.bloco = bloco;
        this.horario = horario;
        this.notas = notas;
        this.media = media;
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

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
