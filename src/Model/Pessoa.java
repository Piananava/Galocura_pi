
package Model;


public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String sexo;
    private Double altura;
    private String telefone;
    private boolean Funcionario;
    private boolean Treinador;
    private boolean Juiz;

    public Pessoa(String nome, int idade, String endereço, String sexo, Double altura, String telefone, boolean Funcionario, boolean Treinador, boolean Juiz) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereço;
        this.sexo = sexo;
        this.altura = altura;
        this.telefone = telefone;
        this.Funcionario = Funcionario;
        this.Treinador = Treinador;
        this.Juiz = Juiz;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(boolean Funcionario) {
        this.Funcionario = Funcionario;
    }

    public boolean isTreinador() {
        return Treinador;
    }

    public void setTreinador(boolean Treinador) {
        this.Treinador = Treinador;
    }

    public boolean isJuiz() {
        return Juiz;
    }

    public void setJuiz(boolean Juiz) {
        this.Juiz = Juiz;
    }
    
    
}
