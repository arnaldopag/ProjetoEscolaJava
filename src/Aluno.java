import java.util.Date;

public class Aluno extends  Pessoas {

    private int codAluno;
    private int codMatricula;
    private Date matricula;
    private String endereço;

    public Aluno(int idPessoa, String nome, Date nascimento, String fone, String cpf, String email, int idAluno, Date matricula, String endereço) {
        super(idPessoa, nome, nascimento, fone, cpf, email);
        this.codAluno = codAluno;
        this.matricula = matricula;
        this.endereço = endereço;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    public Date getMatricula() {
        return matricula;
    }

    public void setMatricula(Date matricula) {
        this.matricula = matricula;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
