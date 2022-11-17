
package Model;

public class Ringue {
  private String nome;
  private String local;
  private String tamanho;
  private String terreno;

    public Ringue(String nome, String local, String tamanho, String terreno) {
        this.nome = nome;
        this.local = local;
        this.tamanho = tamanho;
        this.terreno = terreno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    
}
