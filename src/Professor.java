
import java.util.ArrayList;
import java.util.Date;

public class Professor extends Pessoas{
    private int codProfessor;
    private Date dataContrato;
    private String titulacao;
    private ArrayList<Disciplinas> materias;

    public Professor(int idPessoa, String nome, Date nascimento, String fone, String cpf, String email, int codProfessor, Date dataContrato, String titulacao) {
        super(idPessoa, nome, nascimento, fone, cpf, email);
        this.codProfessor = codProfessor;
        this.dataContrato = dataContrato;
        this.titulacao = titulacao;
    }

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public ArrayList<Disciplinas> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Disciplinas> materias) {
        this.materias = materias;
    }
}
