import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Curso {
    private int codCurso;
    private String nome;
    private String areaDeEnsino;
    private ArrayList<Disciplinas> Materias;

    public Curso(int codCurso, String nome, String areaDeEnsino) {
        this.codCurso = codCurso;
        this.nome = nome;
        this.areaDeEnsino = areaDeEnsino;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDeEnsino() {
        return areaDeEnsino;
    }

    public void setAreaDeEnsino(String areaDeEnsino) {
        this.areaDeEnsino = areaDeEnsino;
    }

    public ArrayList<Disciplinas> getMaterias() {
        return Materias;
    }

    public void setMaterias(ArrayList<Disciplinas> materias) {
        Materias = materias;
    }
}
