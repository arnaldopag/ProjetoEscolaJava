import java.util.Date;

public class Pessoas {

    private int idPessoa;
    private String nome;
    private Date nascimento;
    private String fone;
    private String cpf;
    private String email;

    public Pessoas(int idPessoa, String nome, Date nascimento, String fone, String cpf, String email) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.nascimento = nascimento;
        this.fone = fone;
        this.cpf = cpf;
        this.email = email;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
